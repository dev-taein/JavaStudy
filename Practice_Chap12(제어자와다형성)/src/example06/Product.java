package example06;
//���� Ŭ����
public class Product {
	
	private int productID;
	private String description;
	private String maker;
	private int price;
	//������
	public Product(int productID, String description, String maker, int price) {
		super();
		this.productID = productID;
		this.description = description;
		this.maker = maker;
		this.price = price;
	}
	//getter
	public int getProductID() {
		return productID;
	}

	public String getDescription() {
		return description;
	}

	public String getMaker() {
		return maker;
	}

	public int getPrice() {
		return price;
	}
	public void showInfo() {
		System.out.println("��ǰ ID >> " + (this.getProductID()+1));
		System.out.println("��ǰ ���� >> " + this.getDescription());
		System.out.println("������  >> " + this.getMaker());
		System.out.println("���� >> " + this.getPrice());
	}
	
	
	
}
