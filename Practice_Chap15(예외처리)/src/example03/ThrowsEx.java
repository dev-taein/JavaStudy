package example03;

public class ThrowsEx {
												//public static void main(String[] args) thows Exception { 
	public static void main(String[] args) {    //main �޼��嵵 ���ѱ� �� �ִ�. -> main�� JVM���� ���ܸ� ������.
		//thows ���ܸ� ���ѱ��.  //thow ������ ���� �߻���Ų��.
		
		
		//main���� method1�� ȣ���ϰ� ������ ���⼭ ����ó���� �ؾ��Ѵ�.!!!
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}

	}
	//Throws�� �޼��� ����� ���� �ۼ��� �ϸ�, ȣ���� ������ ���ܸ� �Ǵ�����,
	//ȣ���� ������ ���ܸ� �ݵ�� ó���ؾ��Ѵ�.
	public static void method1() throws Exception {    //method1�� ���ܴ� ��������  ȣ���� �ڵ� main���� �Ѿ��.
		method2();
	}
	
	public static void method2() throws Exception {    // method2�� ���ܴ� method1����  ������
		System.out.println(10/0); //�������(���࿹��)�߻�
	}
}
