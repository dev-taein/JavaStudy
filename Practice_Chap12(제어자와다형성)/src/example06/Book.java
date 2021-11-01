package example06;
//�ڼ�Ŭ����
public class Book extends Product {
	
	private int iSNB;
	private String title;
	private String author;
	
	public Book(int productID, String description, String maker, int price, int iSBN, String title, String author) {
		super(productID, description, maker, price);
		this.iSNB = iSBN;
		this.title = title;
		this.author = author;
	}

	public int getISBN() {
		return iSNB;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	@Override
	public void showInfo() {
		super.showInfo(); //����Ŭ������ �޼��带 ��������� ȣ��
		System.out.println("����ǥ�ص�����ȣ >>" + this.getISBN());
		System.out.println("å ���� >>" + this.getTitle());
		System.out.println("���� >>" + this.getAuthor());
	}
	
	

}
