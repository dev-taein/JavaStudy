package examp07;

public class User2 extends Thread {

	//���� ��ü ����
	private Calcurator calcurator;
	
	public void setCalcurator(Calcurator calcurator) {
		this.calcurator = calcurator;
		this.setName("User2"); //������ �̸��� ����
	}
	@Override
	public void run() {
		//���� ��ü�� �ʵ��� memory��� ���� 100���� ����
		this.calcurator.setMemory(50);
		System.out.println("User2 �����尡 ����� �� : " + this.calcurator.getMemory());
	}

}
