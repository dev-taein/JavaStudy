package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		// byte b2 = b1 + 2; //�����÷ο�
		byte b2 = (byte)(b1 + 2); // ����ĳ����
		System.out.println(b1);
		System.out.println("���� ĳ���� �� : " + b2); //-128 -> -127
		
		int i1 = b1; //�ڵ�ĳ���� (����ȯ �ڵ带 ������ ����)
		System.out.println("�ڵ� ĳ���� �� : " + i1);

		byte b3 = 127;
		int i2 = 400;
		b3 = (byte)i2; //ū ����Ʈ -> ��������Ʈ (������ �ս� �Ͼ��)
		System.out.println(b3);
		
		//������ �Ǽ����� ĳ���� (�����ϴ� ����� Ʋ���� ������
		//�ݵ�� ������ �ս��� �ְ� �ƿ﷯ ��������� ĳ���� �ڵ尡 ������)
		int i3 = 100;
		float f1 = (float)i3;
		System.out.println("����->�Ǽ� : " + f1);
		
		float f2 = 10.55f;
		int i4 = (int)f2;
		System.out.println("�Ǽ�->���� : " + i4);
		
		char ch = 'a'; //����o ���ڿ�x
		int i5 = ch;
		//���ڰ��� ����Ÿ������ �ٲٰ� �Ǹ�,
		//�ƽ�Ű�ڵ� ������ �ٲ������ ����� �ȴ�.
		System.out.println("����->���� : " + i5);
		
		//�ִ�Ÿ�� + "" = ���ڿ��� ��.
		int i6 = 100;
		String str = "�ڹ�" + i6;
		System.out.println(str);
	}

}
