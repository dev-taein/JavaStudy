package Question1_120;



class Product3 {
	public double applyDiscount(double price) {
//		assert [Boolean] // ���̸� Pass, �����̸� AssertionError
		assert (price > 0 ); //line n1   
		return price * 0.50;
	}
}
public class FExamp111 {

	public static void main(String[] args) {
		Product3 p = new Product3();
		double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price:" + newPrice);
	}

}
//  �� : New Price: 0.0
 // ������ �������� -ea �ɼ��� �������� �ʾұ� ������ -ea�ɼ��� ���� ���¿��� ����� �����Ѵ�.
// ��, args���� 0���� �ֱ� ������ New Price : 0.0�� ����� ���´�.

//and the command:
//java Product 0
//What is the result?


