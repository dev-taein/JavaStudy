package example03;

public class MemberPersonEx {

	public static void main(String[] args) {

		Member member = new Member();
		member.method();
		member.method1();
		System.out.println(A.MAX); //����� Ŭ������.����  ���� ����Ѵ� . ��, �������̽���(A).�����(MAX)�� ����Ѵ�.
		
		//�������̽��� ������ �����̴�. �Ͽ� ������ ������ ����ȴ�.
		A a = new Member(); //�������̽� �ʵ��� ������
		a.method();
		//a.method1(); 	//�ٺ��� A�̹Ƿ�  MemberŬ������ method1()�� ȣ��Ұ�
		
		Person person = new Person();
		person.method();
		person.method1();

		
		a = new Person();
		a.method();
	}

}
