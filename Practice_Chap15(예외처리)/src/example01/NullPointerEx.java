package example01;

public class NullPointerEx {

	public static void main(String[] args) {


		String str = null;
		//�� ���ܴ� ��ü(�ν��Ͻ�)�� ���µ� ��� �ν��Ͻ��� �ִ� toString()ȣ���ϴ�?
		try {
			System.out.println(str.toString());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
