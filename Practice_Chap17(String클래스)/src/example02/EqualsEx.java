package example02;

public class EqualsEx {

	public static void main(String[] args) {

		String str1 = new String("ȫ�浿");
		String str2 = "ȫ�浿"; //���ͷ�Ÿ������ ��Ʈ���� �����ϰ� �ִ�, �Ȱ��� �ν��Ͻ� �����Ѵ�.
		String str3 = "ȫ�浿"; // str2�� str3�� ���� �ν��Ͻ��� �����Ѵ�.

		// ==�� �����ڰ� �ּҺ��ϴ� �������̴�
		if(str1 == str2) {
			System.out.println("���� ������ �ν��Ͻ�");
		}
		else {
			System.out.println("�ٸ� ������ �ν��Ͻ�");
		}
		
		//���� ���ͷ��� ��쿡�� ���� ������ �����Ѵ�.
		if(str2 == str3) {
			System.out.println("���� ������ �ν��Ͻ�");
		}
		else {
			System.out.println("�ٸ� ������ �ν��Ͻ�");
		}
		
		//String�� equals()�� �����̴�(ObjectŬ������ equals()�¿������̵��س���.)
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ���� ���� ���ڿ��Դϴ�.");
		}
		else {
			System.out.println("str1�� str2�� ���� �ٸ� ���ڿ��Դϴ�.");
		}
		
		if(str2.equals(str3)) {
			System.out.println("str2�� str3�� ���� ���� ���ڿ��Դϴ�.");
		}
		else {
			System.out.println("str2�� str3�� ���� �ٸ� ���ڿ��Դϴ�.");
		}
	}	

}
