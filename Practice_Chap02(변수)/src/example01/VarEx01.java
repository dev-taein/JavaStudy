package example01;

public class VarEx01 {

	public static void main(String[] args) {
	

		
		char ch = 'A';
		int year = 0; //�⺻�� ����
		int age = 42;
		//�Ʒ��ڵ�� L�� longŸ���� �����ϱ� ���ؼ� ���̻� L,l�� �ٿ���. 8����Ʈ
		long result = 10L;
		//�Ʒ��ڵ�� f�� float�� �����ϱ� ���ؼ� ���̻� F,f�� �ٿ���. 4����Ʈ
		float result2 = 10.1f;
		double d = 9.999;
		
		
		
		//sys�� ġ�ð� ctrl + space�� ������ �ڵ������� ����� ����ȴ�.
		//���ڸ����� ���
		
		System.out.println("ch : " + ch);
		System.out.println("long Ÿ�� ��� : " + result);
		System.out.println(result2);
		System.out.println(d);
		System.out.println(year + age);
		
		
		String str = new String("�ڹ�"); //������ ����
		System.out.println(str + "�� �����մϴ�.");
		System.out.println(str.toString());
		
		//���������Ŭ�����̰ų� toString()�����Ǹ� ���� ����
		//Ŭ������ ���������� ����� �ϰ� �Ǹ�, Ŭ����Ÿ��@16����(�ּ�)
		//���´�.
		Object obj1 = new Object();
		System.out.println(obj1 + "�ڹ�");
	}

}
