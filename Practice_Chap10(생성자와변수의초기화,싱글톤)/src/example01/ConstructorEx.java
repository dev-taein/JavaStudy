package example01;

//AŬ������ �ƹ��� �����ڰ� �������� �����Ƿ�,
//�����Ͻÿ� �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� �߰����ش�.
class A {
	int value;
}

class B {
	int value;
//	public B() {	
//	}
	public B(int value) { //�Ű����� ������
		this.value = value;
	}
}

public class ConstructorEx { //public Ŭ������ �� �ϳ��� �����ϴ�

	public static void main(String[] args) {
		
		A a = new A(); //�����Ϸ��� �⺻ �����ڸ� ������ִϱ� �������
		
		//������ ���ܸ� ��� ���
		//1. BŬ������ �⺻�����ڸ� �߰�
		//2. BŬ���� ������ ȣ��� �Ű����� ������ int���� ������ ���ָ� �ȴ�.
//		B b = new B(); 
		B b = new B(100);

	}

}
