package example02;

public class Student {  //Ŭ������ Ʋ -- �ؾ ���(���赵)
	//�������(�ʵ�) = �ν��Ͻ� ����  ,,, �ν��Ͻ�=��ü,,,, �ν��Ͻ�����=��ü����
	String name;
	int age;
	
//	public static String getName() {
//		return this.name;	//this�� static�޼��峪 Ŭ�����ȿ� ����� �� ����.
//	}
	
	//ObjectŬ������ toString()�� �������̵�(������)
	@Override
	public String toString() {
		//String str = "�̸� : " + this.name + " , " + "���� : " + this.age;
		
		//this : Ŭ������ �ּ�(new��� �����ڰ� �ν��Ͻ��� �����ϸ� ��μ� Ȱ��ȭ�� �̷�����.)
		return "�̸� : " + this.name + " , " + "���� : " + this.age;
		//return str;
	}

}
