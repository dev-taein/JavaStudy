package sec01.example01;

public class LamdaEx {

	public static void main(String[] args) {
		
		
		//���ٽ��� �̿��ؼ� �͸� ���� ��ü�� �����ϰ� �ִ�.
		//()�� �Ű������� ����, �Ű������� ������ ()��ȣ�� ���ְ�   {}�ȿ��� �߻�޼����� method()�� �����ΰ� ���� �ϸ�,
		//���⼭ 2���̱� ������ {}�� ���� �� ��������.
		MyInterface myInterface = () -> {  
			String str = "���ٽ����� ���� �͸� ���� ��ü�Դϴ�.";
			System.out.println(str);
		}; 
		myInterface.method();
		
		
		
		//���� �͸� ���� ��ü�� ����� ���̴�.
		MyInterface myInterface2 = new MyInterface() {
			@Override
			public void method() {
				String str = "���ٽ����� ���� �͸� ���� ��ü�Դϴ�.";
				System.out.println(str);
			}
		};
		
		myInterface2.method();
		
		myInterface = () -> {System.out.println("���ٽ����� ���� �͸� ���� ��ü111");};
		myInterface.method();
		
		
		//���๮�� �ϳ��� ��쿡�� {}�� ���� �����ϴ�.
		myInterface = () -> System.out.println("���ٽ����� ���� �͸� ���� ��ü222");
		myInterface.method();
		
		//��� : �͸�����ü�� �����ÿ� �ڵ��� �������� ���ٽ��� ��� �Ҽ��� �ִ�.
		
		
	}

}
