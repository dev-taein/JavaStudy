package example02;

public class MemberEx {
//	
//	public static void study() {
//		System.out.println("�ڹٰ��θ� �մϴ�.");
//	}
//	public void m1() {
//		System.out.println("�ν��Ͻ� �޼���");
//	}
					//main�޼��尡 �ִ� ���� ȣ��κи� �ڵ��ϴ°�  ���� (�ٸ� �޼���� ���赵(Ŭ����)�κп��� �����.)
	public static void main(String[] args) {
		
		//�Ʒ��� static������̹Ƿ� �ν��Ͻ� ��������, �󸶵��� Ŭ������.�������������
		//������ �����ϴٶ�� ���� �����ְ� �ִ�.
		//static�� static�� ȣ���� �����ϴ�.
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		
//		study(); //static�� ���� Ŭ���� �������� Ŭ�����̸�  �������������� ���ִ°� ����
//		MemberEx.study();
		
		
		

		
		//�ν��Ͻ� ������� ����ϱ� ���ؼ��� �ݵ�� new��� �����ڰ� �����ٰ�
		//�ν��Ͻ��� ������ ����� �����ϴ�.
//		Member m = new Member();
//		m.imethod();
//		m.iv = 999;
//		m.imethod();
//		
//		MemberEx me = new MemberEx();
//		me.m1();

	}

}
