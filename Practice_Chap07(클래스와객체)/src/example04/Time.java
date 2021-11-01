package example04;

public class Time {

	//����������(Access Modifier)�� ����
	//private : ���� Ŭ���� ��(��)������ ������ ������
	//protected : ���� ��Ű��, �ڼ�Ŭ���� ��(��)������ ������ ������
	//default : ���� ��Ű�������� ������ ������
	//public : ������ ������ ������.
	
	//���α׷����� �Ҷ�(���赵�� ���鶧), ��������� �����ϸ� private���������ڷ�
	//�����ְ�(ĸ��ȭ), �� ��������� �ش��ϴ� getter()�� �������ִ� �������
	//������� Ŭ������ �ۼ��ϴ� ����� �ùٸ���.
	private int hour;
	private int minute;
	private int second;
	
	
	
	//Source�� -> Generate getter and setter�� Ŭ�� ��
	//���ϴ� ��������� üũ�� �ϼż� getter, setter�޼��带
	//�ڵ��ϼ��� �ϸ� �ȴ�.
	
	
	
	//getter() : ��������� ���� �о�� �޼���
	//setter() : ��������� ���� �����ϴ� �޼���
	public int getHour() {
		return this.hour;
	}
	public void setHour(int hour) {
		//�ÿ� ���� ����ó�� �ڵ带 �ۼ�
		if(hour < 0 || hour > 23) {
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.hour = hour;
	}
	
	
	public int getMinute() {
		return this.minute;
	}
	public void setMinute(int minute) {
		//�п� ���� ����ó�� �ڵ带 �ۼ�
		if(minute < 0 || minute > 59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.minute = minute;
	}
	
	
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		//�ʿ� ���� ����ó�� �ڵ带 �ۼ�
		if(second < 0 || second > 59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.second = second;
	}
	
	@Override
	public String toString() {
		return this.getHour() + " ��  " + this.minute + " ��  " + this.second + " ��  ";
	}
	
	
	
	//getter()�޼���
//	public int getHour() {
//		return this.hour;
//	}
	
}
