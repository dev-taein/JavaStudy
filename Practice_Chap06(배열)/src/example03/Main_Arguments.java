package example03;

public class Main_Arguments {

	public static void main(String[] ab) {
		//main()�� �Ű������� Ȱ���ϴ� ���
		if(ab.length != 2) {
			System.out.println("���α׷��� ����");
			System.out.println("���̵��Է� �н������Է�");
		}
		String str1 = ab[0];
		String str2 = ab[1];
		String str3 = ab[2];
		
		
		
		System.out.println("���̵� : " + str1);
		System.out.println("�н����� : " + str2);
		
		
		int count = Integer.parseInt(str1);
		int total = count + 500;
		System.out.println("count�� : " + count);
	}

}
