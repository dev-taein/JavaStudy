package example02;

public class A {
	
//	B b = new B();
//	C c = new C(); ���⼭�� �����ڸ� ����°� ������ ������ ���� ����ϱ�
//	A.B b = new B();
//	A.C c = new A.C();
	
	public A() {
		System.out.println("--------------------------------------");
		System.out.println("�ܺ� Ŭ���� A�� ������ ȣ��");
		System.out.println("--------------------------------------");
		
		System.out.println();
		
		System.out.println("--------------------------------------");
		B b = new B(); //�̰� ��  �����ұ��?  // �ܺ�Ŭ����(A)�ȿ� ��øŬ����(B)�� �ֱ� ������ //�ν��Ͻ� ��� Ŭ������ �ܺ�Ŭ����A�� ����̴�.
		System.out.println(b.a);
		b.method1();
		System.out.println("--------------------------------------");
		
		System.out.println();
		
		System.out.println("--------------------------------------");
		C c = new C();
		System.out.println(c.a);
		System.out.println(A.C.c);
		c.method1();
		A.C.method2();
		System.out.println("--------------------------------------");
		
		System.out.println();
		
		System.out.println("--------------------------------------");
		this.method(); //���⼭ this�� �ܺ�Ŭ���� A�� �ǹ��Ѵ�.
		System.out.println("--------------------------------------");
//		D d = new D(); //���� Ŭ������ ���� Ŭ�����ε��� �ұ� �ϰ� ������ �ȵȴ�.
		
	}
	
	//�ν��Ͻ� ��� Ŭ����-B
	class B{
		int a = 10;
		//static int cv = 20; //�ν��Ͻ� ��� Ŭ������ �ν��Ͻ��� �����ؾ� ȣ�� �� �� �ֱ� ������ ������� static�� ��� �Ұ���
		public B() {
			System.out.println("B Ŭ������ ������ ȣ��");
		}
		public void method1() {
			System.out.println("B Ŭ������ ��� �޼��� ȣ��");
		}
		//static void method2() {}
	}
	
	//���� ��� Ŭ���� C
	static class C {
		int a = 10;
		static int c = 20;
		
		public C() {
			System.out.println("���� ��� Ŭ���� C�� ������ ȣ��");
		}
		
		public void method1() {
			System.out.println("���� ��� Ŭ���� C�� (�ν��Ͻ�)�޼���1 ȣ��");
		}
		public static void method2() {
			System.out.println("���� ��� Ŭ���� C��  (����)�޼���2 ȣ��");
		}
	}
	
	public void method() {
		//���� Ŭ���� �ȿ��� ����� static ����� ���´�!!!
		class D{
			int a = 1000;
			public D() {
			System.out.println("���� Ŭ���� D�� ������ ȣ��");	// TODO Auto-generated constructor stub
			}
			
			public void lmethod() {
				System.out.println(this.a); //���⼭ this�� Ŭ���� D�̴�.
				System.out.println("���� Ŭ���� D�� ��� �޼��� ȣ��");
			}
		}
		//���� Ŭ������ �޼��� ���ο����� ���� �� ����� �����ϴ�.
		D d = new D();
		d.lmethod();
	}
	
	
	
	
}
