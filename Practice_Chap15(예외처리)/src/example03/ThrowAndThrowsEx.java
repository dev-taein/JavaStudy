package example03;

public class ThrowAndThrowsEx {

	public static void main(String[] args) {
		// throw�� thows ȥ�� ��� ���
		
		boolean result = false;
		try {
			result = findClass();
			if(result) {
				System.out.println("Ŭ������ �����մϴ�.");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(); //�����ڿ�, ������ �����ÿ��� ���ų� �ּ�ó��
		} finally {
			System.out.println("���� �����մϴ�.");
		}
		
		
		

	}
	
	public static boolean findClass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.String");
		//Ŭ������ �ִٸ�...
		if(class1 != null)
			return true;
		else 
			return false;
	}

}
