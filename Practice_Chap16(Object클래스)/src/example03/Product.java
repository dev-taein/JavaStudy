package example03;

import java.util.Arrays;

//Ŭ������ ������ �����ϰ� �Ϸ��� java.lang.cloneable�������̽��� �����ؾ��Ѵ�.
public class Product implements Cloneable{

	private String id;
	private String name;
	private int price;
	private int[] arr;
	
	public Product(String id, String name, int price, int[] arr) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return this.arr;
	}
	@Override
	public String toString() {
		return "��ǰ id : " +  this.getId() + "\n" + "��ǰ �̸� : " + this.getName() + "\n" + "��ǰ ���� : " + this.getPrice()
		 		+ "�迭 �� : " + Arrays.toString(this.arr);
		
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		
//		return super.clone();
//	}
	
	public Product getProduct() {
		Product cloned = null;
		try {
			//���� ������ ���⼭ �Ͼ��.(���������� ������ ����)
			cloned = (Product)this.clone();  //���⼭�� cloned()�� Object�� Ŭ����
		} catch (CloneNotSupportedException e) { e.printStackTrace(); }
		return cloned;
	}
	
	
}
