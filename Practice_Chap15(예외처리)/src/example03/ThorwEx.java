package example03;

public class ThorwEx {

	public static void main(String[] args) {
		//Throw - ������ ���� �߻���Ų��.

		try {
			//������ ���ܸ� �߻���Ű�� Ű���尡 throw�̴�.
			throw new Exception("���Ƿ� ���� �߻���Ŵ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���� ����");
	}

}
