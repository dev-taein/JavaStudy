package example02;

import example02.A.C;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		A a = new A();
	
		//MainŬ�������� �ܺ� Ŭ���� A���� �ּҰ� Ʋ�� = ������ ��ü
		System.out.println("�Ʒ��� ���� �ٸ� �ּҷ� ȣ���ϴ� ���̴�");
		System.out.println("--------------------------------------");
		
		
		//�ν��Ͻ� ��� Ŭ���� B�� �ݵ�� �ܺ� Ŭ���� A�� �ν��Ͻ��� �־�� ���������ϴ�!!!!
		A.B b = a.new B();
		b.method1();
		
		System.out.println();
		
		//���� ��� Ŭ������ C�� �ܺ� Ŭ���� A�� �ν��Ͻ��� �ִ� ���� ��� ���� ���� �����ϴ�
		//�� ���� ��� Ŭ������ �ν��Ͻ������ �ִٸ� new�����ڸ� ������ ����� ����Ѵ�. -> A.C c = new A.C();
		A.C.method2();
		System.out.println(A.C.c);
		A.C c = new A.C();
		System.out.println(c.a);
		c.method1();
		
		System.out.println();
		
		//���� ��� �޼��� ȣ��
		//�ܺ� Ŭ���� A�� �ν��Ͻ��� �����ϸ� �󸶵� ���ø޼��带 ȣ���ϰ�, ���� Ŭ������ �����Ͽ� ����� �� �ִ�
		//-> A a = new A(); �ܺ�Ŭ����A�� ���� ��� �޼��� method()�� ������� �����̴�.
		a.method();
	}

}
