package example08;

public class SoundEx {

	public static void main(String[] args) {
		//�͸� ���� ��ü( �̸� ���� ) �ٺ��� �������̽��̴�. ---- UI�̺�Ʈ ó���� ������ ��ü ��������� ���δ�.
		Soundable soundable = new Soundable() { //Ÿ��(�ٺ�)�� �������̽��̱� ������  �͸�����ü�� �ȴ�.
			//���������� Ŭ�����ϱ� ������� ���� �� �� �ֽ��ϴ� .(����� ����)
			//������ �ܺο����� ���� �Ұ��� . ��? �ٺ��� �հ�?
			int a = 10;
			public void method() {
				System.out.println("�͸� ���� ��ü �޼���");
			}
		
			@Override
			public void sound() {
				String str = "����";
				System.out.println("ù ��° �͸� ���� ��ü :  " + str );
				System.out.println(str + "�� ���� ����ϴ�.");
				System.out.println(str + "�� ���������� �����մϴ�.");
				this.method();
				System.out.println(this.a);
			}
		};
		
		soundable.sound();
		
		
		System.out.println();
		
		
		
		
		
		Soundable soundable1 = new Soundable() { //Ÿ��(�ٺ�)�� �������̽��̱� ������  �͸�����ü�� �ȴ�.
			//���������� Ŭ�����ϱ� ������� ���� �� �� �ֽ��ϴ� .(����� ����)
			//������ �ܺο����� ���� �Ұ��� . ��? �ٺ��� �հ�?
			int a = 20;
			public void method() {
				System.out.println("�͸� ���� ��ü �޼���");
			}
		
			@Override
			public void sound() {
				String str = "��׸�";
				System.out.println("�� ��° �͸� ���� ��ü :  " + str );
				System.out.println(str + "�� ���� ����ϴ�.");
				System.out.println(str + "�� ���������� �����մϴ�.");
				this.method();
				System.out.println(this.a);
			}
		};
		
		soundable1.sound();
	}

}
