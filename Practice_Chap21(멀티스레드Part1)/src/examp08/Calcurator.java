package examp08;

//������ü
public class Calcurator {
	private int memory;
	int value = 100;
	public int getMemory() {
		return this.memory;
	}
	
	//����ȭ �޼���
	public synchronized void setMemory(int memory) {
		this.memory = memory;
//		System.out.println(Thread.currentThread().getName());
		//2�ʰ� �Ͻ�����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ " : " + this.getMemory());
	}
	//�񵿱�ȭ �޼����̹Ƿ� � ������� �󸶵��� ������ �����ϴ�. 
	public void print() {
		System.out.println(Thread.currentThread().getName() + "  " + "Value �� : " + this.value);
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	} 
}
