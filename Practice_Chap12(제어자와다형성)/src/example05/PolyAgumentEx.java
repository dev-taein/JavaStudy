package example05;

public class PolyAgumentEx {

	public static void main(String[] args) {

		//�ʵ��� ������
		Product p1 = new TV();
		Product p2 = new Computer();
		Product p3 = new Audio();
		
		
		Product[] pArray = new Product[10];
		
		
		Buyer buyer = new Buyer();
		buyer.buy(new TV());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		
		//AppleŬ������ ProductŬ������ �ڼ��� �ƴϱ� ������ �׷���.
//		buyer.buy(new Apple()); // ���⼭ �� ������ ���ܰ� �߻��ϴ°�?
		
		System.out.println("���� ���� �� : " + buyer.money);
		System.out.println("���� ���ʽ� ����Ʈ : " + buyer.bonusPoint + "�� �Դϴ�.");

	}

}
