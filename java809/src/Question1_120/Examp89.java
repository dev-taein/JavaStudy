package Question1_120;


public class Examp89 {
		public static void doStuff(String s) {
	try {
		if(s==null) {
			throw new NullPointerException();  //���� null�� �ƴϸ� �� ���ܸ� ������ ����
		}
	} finally {
		System.out.println("-finally-");  // finally�� try �������� ���ܰ� �߻��ϴ� �Ͱ� ������� ������ ����Ǵ� �����̴�.
	} System.out.println("-doStuff-");
	}
	public static void main(String[] args) {
		
		
		try {
			doStuff(null);   //doStuff("���ڿ�"); ���ڿ��� ���� -finally--doStuff-
		}catch (NullPointerException npe) {
		System.out.println("-catch-");
		}
	}

}

//���ܸ� ������ �Ǹ� ������ ������ �������� �����

//���� null�� ���ڿ��� �Ǹ� �� : -finally--doStuff-

//�� : C. ""finally- -catch-
