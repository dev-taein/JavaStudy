package example02;

public class DefaultTypeEx {

	public static void main(String[] args) {

		byte b1 = 127;
		byte b2 = 1;
		char ch = 'A'; //A�� �ƽ�Ű�ڵ� ������ 65
		float f1 = 15.5f;
		double d1 = 10.5;
		//1��° ��� : int������ �޾��ָ� �ȴ�. �ڵ�ĳ���� ���
		//2��° ��� : ���� ĳ���� �ؾ��Ѵ�.
		int i1 = b1 + b2; // byte + byte = int + int = int
		byte b3 = (byte)(b1 + b2);
		int i2 = ch + b2; //65 + 1
		
		//������ + �Ǽ��� --> ǥ�������� ���� ������ ����ȯ �Ǿ� ����ȴ�.
		float f2 = b1 + f1; // float + float = float
		double d2 = f1 +d1; // double + double = double
		System.out.println(i1 + " , " + b3 + " , " + i2);
		System.out.println(f2 + " , " + d2);

	}

}
