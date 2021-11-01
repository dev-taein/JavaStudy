package example02;

public class GetBytesEx {

	public static void main(String[] args) throws Exception {

		String str = "�ȳ��ϼ���";
		//getbytes()�޼���
		//���ڵ�(��谡 �˾� ���� ���ϰ� ��ȯ�ϴ� �����̴�)
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1(EUC-KR)�� �޾��� ���� ���� : " + bytes1.length); //EUC-KR �ѱ� 2����Ʈ

		
		byte[] bytes2 = str.getBytes("UTF-8");
		System.out.println("bytes1(UTF-8)�� �޾��� ���� ���� : " + bytes2.length); //UTF-8 �ѱ� 3����Ʈ
		
		//���ڵ�(�ΰ��� �˾ƺ��� ���� ��ȯ�ϴ� �����̴�)
		String str1 = new String(bytes1, "EUC-KR");
		System.out.println("EUC-KR�� ���ڵ��� ���ڿ� : " + str1);
		
		String str2 = new String(bytes2, "UTF-8");
		System.out.println("UTF-8�� ���ڵ��� ���ڿ� : " + str2);
	}

}
