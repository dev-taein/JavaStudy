package example01;

class A{}
class B extends A{}
class C extends A{}

interface I{}
class D implements I{}
class E implements I{}
public class ClassCastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����Ŭ������ ���������� �����ϰ� �ִ� �ν��Ͻ��� Ÿ���� B�̴�
		A a = new B();
		B b = (B)a; //�ٿ� ĳ����
		System.out.println("����Ϸ�");
		
//		A a1 = new B();  //����Ŭ����A�� �ڼ�Ŭ����B�� �����ϰ� �ֱ� ������, �ڼ�Ŭ����C�� �ٿ�ĳ�����ϸ� ���ܰ� �߻��Ѵ�.
//		C c = (C)a1; //�ٿ�ĳ���� // ClassCastException�߻�
//		System.out.println("����Ϸ�");
		
		I i = new D();
		D d = (D)i;
		System.out.println("����Ϸ�");
		
		//�Ȱ��� �������̽� I�� D�� �̹� �����߱� ������ 
		//�ٿ� ĳ�����غ��� ���� ������ DŬ������ ����� ���Ѵ�.
		I i2 = new D();
		E e = (E)i2; // ClassCastException�߻�
		System.out.println("����Ϸ�");

	}

}
