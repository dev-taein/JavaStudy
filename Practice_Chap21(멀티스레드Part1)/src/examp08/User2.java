package examp08;

public class User2 extends Thread {

	//���� ��ü ����
	private Calcurator calcurator;
	
	public void setCalcurator(Calcurator calcurator) {
		this.calcurator = calcurator;
		this.setName("User2"); //������ �̸��� ����
	}
	@Override
	public void run() {
		this.calcurator.print();
		//���� ��ü�� �ʵ��� memory��� ���� 100���� ����
		this.calcurator.setMemory(50);
		
	}

}
