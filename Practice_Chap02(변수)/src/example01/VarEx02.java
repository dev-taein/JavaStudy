package example01;

public class VarEx02 {

	public static void main(String[] args) {
		
		int number; //4����Ʈ ��ŭ ������ �޸�(����)�� �Ҵ���. ����
		number = 200; //�ʱ�ȭ
		int number2 = 500; //����� ���ÿ� �ʱ�ȭ
		
		double dnum = 10.01;
		
		//���(������ �ʴ� ��)�� ����� ���ÿ� �ʱ�ȭ�� �� ��
		//�ٽ� �� ������� �����Ű�� �ڵ尡 ���� �ȵȴ�.
		final int MAX_NUMBER = 100;
		//MAX_NUMBER = 200;
		
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("��� : " + MAX_NUMBER);
		System.out.println("�Ǽ� : " + dnum);
		
		String str = "�ؾ"; //��������
		System.out.println(str);
		//null�� '����'
		str = null;
		System.out.println(str);
	}

}
