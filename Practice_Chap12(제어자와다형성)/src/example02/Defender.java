package example02;

//�ڼ� Ŭ����
public class Defender extends Player {

	private int def;

	public Defender(String name, int age, int backNumber, int speed, int def) {
		super(name, age, backNumber, speed); //Player�� ������
		this.def = def;
	}
	
	public int getDef() {
		return this.def;
	}
	
	@Override
	public void info() {
		super.info(); //Player�� info�� ȣ��
		System.out.println("��� Ƚ�� : " + this.getDef());
	}
}
