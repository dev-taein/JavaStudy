package example02;

public class BitOperatorEx {

	public static void main(String[] args) {

		//& | ^ 3���� ��Ʈ �����ڶ�� �Ѵ�
		
		int x = -8;
		int y = -5;
		
		System.out.println("x�� 2������ ��ȯ ���  : " + Integer.toBinaryString(x));
		System.out.println("y�� 2������ ��ȯ ���  : " + Integer.toBinaryString(y));

		//AND������ �Ѵ� 1�϶��� 1�� �ش�
		//OR������ �ϳ��� 1�̸� 1�� �ش�.
		//XOR(exclusive or)��Ÿ������ : ���� �ٸ��� 1�� �ش�.
		System.out.println("x�� y�� ��Ʈ &(AND)������ : " + (x & y));
		System.out.println("x�� y�� ��Ʈ |(OR)������ : " + (x | y));
		System.out.println("x�� y�� ��Ÿ������ ^(XOR)������ : " + (x ^ y));
	}

}
