package example02;

public class LengthEx {

	public static void main(String[] args) {
		
		String phoneNum = "01045671234";
		System.out.println("���ڿ��� ���� : " + phoneNum.length());
		
		int length = phoneNum.length();
		
		if(length == 11) {
			System.out.println("�� ��ȣ �ڸ��� �½��ϴ�.");
		}
		else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}

}
