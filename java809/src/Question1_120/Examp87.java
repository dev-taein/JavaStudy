package Question1_120;

import java.util.Arrays;
import java.util.List;

class Product1{
	String name;
	int qty;
	@Override
	public String toString() {
		return name;
	}
	public Product1(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	public static class ProductFilter{  //static ���� public�� �ٿ������
		public boolean isAvailable(Product1 p ) { //line n1
//		public static boolean isAvailable(Product1 p ) { //�̰� ����
			return p.qty>=10;
		}
	}
}
public class Examp87 {

	public static void main(String[] args) {
		List<Product1> products = Arrays.asList(new Product1("MotherBoard", 5), new Product1("Speaker", 20));
		products.stream().filter(Product1.ProductFilter::isAvailable)// line n2
		.forEach(p -> System.out.println(p)); 
	}

}
//��  : B. Replace line n1 with: public static booleanisAvailable (Product p) {