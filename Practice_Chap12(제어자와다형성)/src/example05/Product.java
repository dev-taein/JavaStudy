package example05;

public class Product {

	int price; //��ǰ�� ����
	int bonusPoint; //��ǰ ���Ž� �����ϴ� ���ʽ�
	
	public Product(int price) {
		this.price = price;
		//���ʽ� ������ ��ǰ ������ 10% ����
		this.bonusPoint = (int)(price / 10.0);
	}
}
