package Question1_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
int id; int price;
public Product(int id, int price) {
this.id = id;
this.price = price;
}
public String toString() { return id + ":" + price; }
}

public class Examp36 {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, 10), new Product (2, 30), new Product (2, 30)));
		Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> { 
		p1.price+=p2.price; return new Product (p1.id, p1.price);}); 
		products.add(p);
		products.stream().parallel()
		.reduce((p1, p2) -> p1.price > p2.price ? p2 : p1)
		.ifPresent(System.out::println);
//		products�� �Ʒ��� ���� �����Ǹ�
//		[1:10, 2:30, 2:30, 4:70] ���⼭ p1�� 1:10�̵ǰ� p2�� 2:30���� 1�ھ�� ���� ó���Ǹ�
//		�� ���� ������ 2:30�� 4:70�� p1�� p2�� �ǰ� ���⼭ ū���� ���������� ���Ƽ� �ٽ� p1�� p2�� �ܴ�.
		//������ �ùٸ� ��
		// �� : 4: 70
		
		
		
		// �Ʒ��� List<Product> products = Arrays.asList������  new ArrayList<>(Arrays.asList �� �Ǿ��
		// �Ʒ��� new ArrayList<>�� �߰��ϰԵǸ� products.add(p);���� ������ �߻����� �ʴ´�
		// �׸��� ���� 4:70�� �ȴ�.       Produce�� price���� ��� ���ϱ� �����̴�. �׸��� ��������  p1�� ���� ũ�ٸ� p1�� ����Ѵ�.
//		List<Product> products = Arrays.asList(new Product(1, 10), new Product (2, 30), new Product (2, 30));
//		Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> { 
//		p1.price+=p2.price; return new Product (p1.id, p1.price);}); 
//		products.add(p);//products.add (p)�� UnsupportedOperationException�� �߻���ŵ�ϴ�.
//		products.stream().parallel()
//		.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
//		.ifPresent(System.out::println);	

			//parallel() ����ó��
	}
}
	//reduce() Stream�� �����͸� ��ȯ���� �ʰ�, ���ϰų� ���� ���� ������ �����Ͽ� �ϳ��� ������ ����ٸ� reduce�� ����� �� �ֽ��ϴ�.


/*
Arrays.asList ��� ArrayList�� ����ϴ� ���. ����� 4:70�Դϴ�.
*/