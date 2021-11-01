package example01;

public class Card {
	
	//�ν��Ͻ� ���� -- �ݵ�� �ν��Ͻ��� �����ؾ� ���� ����
	private String color;   //ī���� ����
	private String company; //ī�� ȸ��
	
	//static(����,Ŭ����, ����)����  -- new(�ν��Ͻ�)���� Ŭ������.static���������� ���� ����
	static int width = 100; //ī���� ����
	static int height = 50; //ī���� ����
	
	//getter, setter �ν��Ͻ� �޼���
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void show(){
		//���������� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
		//�޼��� �ȿ� static������ ����� ���� ���Ѵ�. ��������
		//static�� Ư���� �ν��Ͻ� ���� ���̵� �󸶵��� ���� �����ؾߵǴµ�
		//���� �ν��Ͻ��� �������� �ƹ��� �𸣱� ������ �̷��� �ڵ带 �ۼ��ϴ� ����
		//�ùٸ� ����� �ƴϴ�.
		//static int i = 10;
		String color = this.color;
		String company = this.company;
		System.out.println(color + ", " + company); 
	}
	
	
	
	
	@Override
	public String toString() {
		//��������(static)�� ���� ����� �ݵ�� Ŭ������.static���������� �����ؾ�
		//�ùٸ� ����̴�.
		return "Card1�� ���� : " + this.getColor()+ ", Card1�� ȸ�� : " + this.getCompany() + 
				", ũ�� : (" + Card.height + " , " + Card.width + ")"; 
	}
}
