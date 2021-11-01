package examp01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapping2 {
	private String model;
	private int price;
	
	public Mapping2(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public static void main(String[] args) {
//		����2: ���͸� �� ������ ��
		List<Mapping2> ls = new ArrayList<Mapping2>();
		ls.add(new Mapping2("GUN_LR_45", 200));
		ls.add(new Mapping2("TEDDY_BEAR", 350));
		ls.add(new Mapping2("CAR_TRANSFORM_VER_7719", 500));
		
		int sum = ls.stream() // �� �� �� 3���� ��Ʈ���� ����
				.filter(p->p.getPrice() < 500) // ������3���� ��Ʈ�� �� price�� 500�̸��� ���� �ɷ��� => ���� 200�� 350�� ����
				.mapToInt(t->t.getPrice()) // 200�� 350�� int������ ���ε�
				.sum(); // int������ ���ε� 200�� 350�� ���� => �� 1���� ��Ʈ���� ���� 550
		System.out.println("sum = " + sum); //���

		
	}

}
