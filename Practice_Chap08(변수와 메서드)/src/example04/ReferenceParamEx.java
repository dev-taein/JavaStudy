package example04;

public class ReferenceParamEx {
	
	public static void main(String[] args) {
		//�������Ű�����
		//Call by reference
				
		A a = new A();
		a.data = 77;
		System.out.println("�޼��� ȣ���� main()���� ��  : " + a.data);
		//�������� "�ð谡 �����"��� ����� ���¶� ���� �а� ������ �� �� �ִ�.
		//Call by reference(�ּҿ� ���� ȣ��) - read+write
		ReferenceParamEx.dataChange(a);
		System.out.println("dataChange()�޼��� ȣ�� �� " + a.data);
	}
	//int[], double[], String --> ������������ ȣ��
		public static void dataChange(A a) {
		//a��� �ּҰ��� �Ű������� �Ѿ� �Ա� ������ �ּҸ� �����Ѵ�.
		//a��� �ּҸ� ������ �ϰ� �Ǹ� ȣ���� ������ ������ ������ �޴´�.
		a.data = 44;
		System.out.println("dataChange()�޼��� ���� �� : " + a.data);
		return;
	}
}
