package example02;

public class SubStringEx {

	public static void main(String[] args) {

		String phoneNum = "01012347890";
		
		//subString()���ڿ��� �߶󳻾� �ٽ� String���� ��ȯ
		String str1 = phoneNum.substring(3); //010�� ©���� ���´�.
		System.out.println(str1);
		
		
		String str2 = phoneNum.substring(0, 3); //0���� �����ؼ� 3��° �ε������� => 010�� ���´�. //������ �ε���(3)�� ������
		System.out.println(str2);
		
		
		System.out.println(str1.hashCode());  //str1�� str2�� ���δٸ� �ּ�, �ν��Ͻ��̴�.
		System.out.println(str2.hashCode());

	}

}
