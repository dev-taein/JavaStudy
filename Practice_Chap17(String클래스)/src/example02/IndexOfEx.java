package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		//IndexOf()�� ã�� ���ڿ��� ������ �޾ƿ��� �޼����̸� ã�� ���ڿ��� ������ -1�� ��ȯ�Ѵ�.
		//indexOf�޼���� ã�� ����� �Ҷ�, ���� ���δ�.(���� ��)
		String str = "������ �ڹ� ���� �� �ϱ� �ȳ׿�";
		int index = str.indexOf("����"); //indexOf�� �����ϴ� Ÿ���� int�̹Ƿ� int�� �޾�����Ѵ�.  indexof�� ���콺�� ������ ��� ��ȯ Ÿ���� �� �� �ִ�.
		System.out.println("������ ���� �� ��ȣ : " + index);

		//���ζ�� ���ڿ��� ���ԵǾ� ������..
		if(str.indexOf("����") != -1) {
			System.out.println("���ο� ���õ� �����̱���.");
		}
		else {
			System.out.println("���ο� ���� ���� �����̱���");
		}
	}

}
