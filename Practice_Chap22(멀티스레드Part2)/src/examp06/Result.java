package examp06;

//������ü
public class Result {
	private int accumValue;
	
	//������ü�̱� ������, �������� �ŷڼ��� ���ؼ� ���� �����尡 ������ �� �����Ƿ� 
	//�ݵ�� ����ȭ�� �ʼ����̴�. synchronized
	public synchronized void addValue(int value) {
		this.accumValue += value;
	}
	public synchronized int getValue() {
		return this.accumValue;
	}
}
