package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// ������ Ÿ���� ==, !=�� ���ؼ� ���� �� �� �ִ�.
		
		
		//���ͷ��� ���� ���� ���� �ִ���, ���� �޸𸮰���(Heap)�� �ִ���
		//Ȯ���ϰ� �ִٸ� ���� �ּҸ� ������ �ϰ� �ǰ�, ���ٸ� ���ο� ����
		//�ν��Ͻ��� �������ش�.
		String str1 = "����Ƽ��"; //Ŭ����Ÿ���̴� ���������̴�
		String str2 = "����Ƽ��";
		int a = 10; //�⺻�� Ÿ���̴� 
		
		//new������ ���� ������ ���ο� �ν��Ͻ��� �����ȴ�.
		String str3 = new String("����Ƽ��");
				
		//������ Ÿ�Կ��� ���� ==�� �ּҺ񱳸� ���ϰ� ����.
		//���� ���ͳ��� ���� ���� ������ ������
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : " + result);  //true
		
		result = (str1 == str3);
		System.out.println("str1 == str3 : " + result);  //false ����: str3�� new�� ���⶧����
														 //���ο� �ν��Ͻ��� �����ؼ� false
 
		//StringŬ������ equals()�� �ּҿ� ������� ���� ���ٸ�,
		//������ true�� ������
		result = str1.equals(str2); //equals�� ���� 
		System.out.println("str1.equals(str2) : " + result); //true
		
		result = str1.equals(str3);
		System.out.println("str1.equals(str3) : " + result); //true
	}

}
