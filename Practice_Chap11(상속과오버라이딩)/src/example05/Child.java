package example05;

public class Child extends Parent{
	int x = 20;
	
	
	public Child() {
//		super(); //����Ŭ������ �⺻ �����ڸ� ȣ��(��������) + �⺻�����ڵ� �������� (��, �Ű����� �����ڸ� ����� �Ұ���)
		super(80); //����Ŭ������ �Ű������� �ִ� �����ڸ� ȣ��, ������ ����� �ϸ� �ȵ�.
		System.out.println("�ڼ�Ŭ������ ������ ȣ��");
	}
	
	
	@Override
	public void show() {
		System.out.println("���� �ν��Ͻ��� x = " + x);
		System.out.println("�ڼ� Ŭ������ this.x = " + this.x);
		System.out.println("���� Ŭ������ super.x = " + super.x);
		//super.show();  //����Ŭ������ show()�޼��带 ȣ�� �Ҽ� �ִ�.
	}
	


}
