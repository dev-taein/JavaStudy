package examp07;

//������ü
public class Calcurator {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	//�񵿱�ȭ �޼��� -> ������ �ŷڼ��� �����ϱ� ���ؼ��� �ݵ�� ����ȭó���� �ʼ���.
	public void setMemory(int memory) {
		this.memory = memory;
		System.out.println(Thread.currentThread().getName());
		//2�ʰ� �Ͻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	}
	/*
	public void print() {
		System.out.println(Thread.currentThread().getName() + "  " + );
	} */
}
