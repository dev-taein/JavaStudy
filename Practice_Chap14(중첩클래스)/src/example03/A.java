package example03;

public class A {

	//�ν��Ͻ� ��� Ŭ����
	class B {
		public B() {
			System.out.println("�ν��Ͻ����Ŭ���� B������");
		}
	}
	//���� ��� Ŭ����
	static class C{
		public C() {
			System.out.println("�����Ͻ����Ŭ���� C������");		
		}
	}
	
	
	//�ν��Ͻ� ���(�ʵ�)����
	B b = new B();
	C c = new C();
	
	
	//�޼��� �ȿ� �ν��Ͻ� ��� �޼��弱��
	//method1()�� ����� �� ����, �̹� �ܺ�Ŭ���� A��
	//�ν��Ͻ��� ������� ������ ���̴�.
	public void method1() {  
		//�������� ����
		System.out.println("method1 ��");
		B b = new B();
		C c = new C();
	}
	
	//���� ��� ����
	//BŬ������ �ν��Ͻ� ��� Ŭ���� �̱⶧����, static ���̸� �ȵȴ�.
	//static B b1 = new B(); X	static A.B c2 = new B(); X
	static C c1 = new C();  //static�� ���� ���� �ö�
	
	
	//���� �޼��� ����  //static�� static�� ���� �����ϴ�.!!!!!!!!!!
	public static void method2() {
		//�������� ����
		System.out.println("���� method2 ��");
		//B b = new B();  //�ν��Ͻ� ���Ŭ�����̹Ƿ� �ȵȴ�.
		C c = new C(); //�޼��尡 �����޼��� �̹Ƿ� ���� ���ú����� ������ �ص� �����ϴ�
	}
	
	
	///////////���///////////
	// ��ø Ŭ���������� �ν��Ͻ��� �ʵ�, �޼���� �������� ��������������.
	// �����ʵ峪 �����޼���� ����Ŭ���������� ������ �����ϴ�.

	
}
