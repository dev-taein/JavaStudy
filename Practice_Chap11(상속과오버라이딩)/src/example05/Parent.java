package example05;

//���� Ŭ����
public class Parent {

	int x = 100;
	
//	public Parent() {
//		System.out.println("����Ŭ���� ������ ȣ��");
//	}

	//�Ű������� �ִ� ������
	public Parent(int x) {
		System.out.println("����Ŭ������  �Ű������� �ִ� ������ ȣ��");
		this.x = x;
	}
	
	
	public void show() {
		System.out.println("���� Ŭ������ show()ȣ��");
	}
}


