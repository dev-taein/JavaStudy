package example04;

public class Parent {

	int x = 100;
	
	//�Ű������� Ÿ���� Object��� ����
	//��� Ŭ������ �� �Ű������� �޾��ְڴٴ� ���̴�.
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;  //����ȯ (����Object->�ڼ�(Parent)) �ٿ� ĳ����(����ȯ �ڵ带 �������) 
										  //��ĳ���õ� ����ȯ�ڵ带 ���൵ �� (������ ��)
			System.out.println("����Ŭ������ ��� x�� "+ this.x);
		}
		else {
			System.out.println("��Ӱ��迡 ���� ���� Ŭ�����Դϴ�.");
		}
		
	}
	
	public void method() {
		System.out.println("���� �޼��� ȣ��");
	}
}
