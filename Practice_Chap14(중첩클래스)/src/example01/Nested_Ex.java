package example01;

public class Nested_Ex {
	
	//�ν��Ͻ� ��� Ŭ����
	class A {
		int iv = 100;
//		int static cv = 200; //static��������� ���Ұ� - ���� : Nested_Ex.A.cv���� ȣ���� �� ������ A�� static Ŭ������ �ƴϱ� ������ �Ұ���
		public A() { //�ν��Ͻ� ��� Ŭ������ ������ ����
			System.out.println("A������ ȣ��");
		}
		public void method1() {
			System.out.println("AŬ������ method1() ȣ��");
		}
		// Nested_Ex.A.method2();���� ȣ���� �� ������ A�� static Ŭ������ �ƴϱ� ������ �Ұ���
//		public static void method2() {
//			System.out.println("AŬ������ method1() ȣ��");
//		}
	}
	
	//���� ��� Ŭ����
	static class B{
		int iv = 100;
		static int cv = 500;  //Nested_Ex.A.cv ���� �����ϱ� ������ ����ȴ�.
		public B() { //Ŭ���� �̱⶧���� ������ �� �� �ִ�.
			System.out.println("B ������ ȣ��");
		}
		// �ܺ� Ŭ����(B)�� staticŬ���� �̹Ƿ� ���𰡴��ϴ�.
		public void method1() {
			System.out.println("BŬ������ method1() ȣ��");
		}
		public static void method2() {
			System.out.println("BŬ������ method2() ȣ��");
		}
	}
	
	//���� Ŭ���� ����� ���(�޼��峻�� �����ϸ�, ������� �뵵�� ���δ�.)
	public void method1() {
		class C {
			int iv = 200;
//			static cv = 700; //���� �޼���ȿ����� static��� ���� �Ұ����ϴ�.
			public C() {  //C�� Ŭ�����̹Ƿ� ������ ȣ�Ⱑ��
				System.out.println("����Ŭ���� C ������ ȣ��");
			}
			public void lmethod() {
				System.out.println("����Ŭ���� C�� method1()ȣ��");
			}
		}
		//���⼭ ��� ����
		//���� Ŭ������ �ش� �޼��� �������� ����� �����ϴ� �Ϳ� �ָ�!!!!
		C c = new C();
		System.out.println(c.iv);
		c.lmethod();
	}
	
	//����Ŭ����2
	//���� Ŭ���� ����� ���(�޼��峻�� �����ϸ�, ������� �뵵�� ���δ�.)
	public void method2() {
		class D {
			int iv = 200;
//			static cv = 700; //���� �޼���ȿ����� static��� ���� �Ұ����ϴ�.
			public D() {  //C�� Ŭ�����̹Ƿ� ������ ȣ�Ⱑ��
				System.out.println("����Ŭ���� D ������ ȣ��");
			}
			public void lmethod() {
				System.out.println("����Ŭ���� D�� method2()ȣ��");
			}
		}
		//���⼭ ��� ����
		//���� Ŭ������ �ش� �޼��� �������� ����� �����ϴ� �Ϳ� �ָ�!!!!
		D d = new D();
		System.out.println(d.iv);
		d.lmethod();
	}
	
	public void method3() {
		class E {
			int iv = 200;
//			static cv = 700; //���� �޼���ȿ����� static��� ���� �Ұ����ϴ�.
			public E() {  //C�� Ŭ�����̹Ƿ� ������ ȣ�Ⱑ��
				System.out.println("����Ŭ���� E ������ ȣ��");
			}
			public void lmethod() {
				System.out.println("����Ŭ���� E�� method3()ȣ��");
			}
		}
		//���⼭ ��� ����
		//���� Ŭ������ �ش� �޼��� �������� ����� �����ϴ� �Ϳ� �ָ�!!!!
		E e = new E();
		System.out.println(e.iv);
		e.lmethod();
	}
	
	

	public static void main(String[] args) {

		Nested_Ex ne = new Nested_Ex();
		//�ν��Ͻ� ���Ŭ����(A)�� �ܺ�Ŭ����(Nested_Ex)�� �ν��Ͻ��� �־�� �����̰����ϴ�. ->Nested_Ex ne = new Nested_Ex();�̰� �ܺ�Ŭ���� �ν��Ͻ���.
		//��, �ν��Ͻ� ��� Ŭ������ ����ϴ� ����� �Ʒ��� ����.
		Nested_Ex.A a = ne.new A();
		System.out.println(a.iv);
		a.method1();
		
		
		System.out.println("---------------------------------");
		
		//���� Ŭ����(B)�� static��� ȣ�� ���      //���� Ŭ������ �ܺ�Ŭ������ �ν��Ͻ��� ��� ���� �����ϴ�.(static�� Ư¡)
		System.out.println(Nested_Ex.B.cv);
		Nested_Ex.B.method2();
		
		//���� Ŭ����(B)�� �ִ� �ν��Ͻ���� ȣ����
		Nested_Ex.B b = new B();
		System.out.println(b.iv);
		b.method1();
		
		System.out.println("---------------------------------");
		
		
		//���� Ŭ���� ȣ��
		ne.method1();
		System.out.println();
		ne.method2();
		
		//��� Ŭ������ ����Ŭ������ �������� ���� �����ΰ�?
		//�����̴�.
		//����Ŭ������ ������ �ٴ´�.
		
		//Ȯ���ϴ� ���  ��� �������� - > Window -> show view -> Navigator 
		// Practice_Chap14(��øŬ����) �ڹ� ������Ʈ ����Ŭ�� -> example01 ����Ŭ���ϸ� ���� ���� ��� ���� �����µ�
		
		//�ܺ� Ŭ������ Nested_Ex.class 
		//���� Ŭ������ Nested_Ex$1C.class, Nested_Ex$1D.class, Nested_Ex$1E.class
		//�ν��Ͻ� ��� Ŭ������ ���� ��� Ŭ������ Nested_Ex$A.class, Nested_Ex$B.class
		
		//�̷� ������ ǥ���Ѵ�.
		

	}

}
