package examp05;

public class ThreadB extends Thread {
	public ThreadB() {
		this.setName("ThreadB"); //setName�� �������� �̸��� �����ϰ� �ִ�.
	}
	
	@Override
	public void run() {
		System.out.println("[���� �������� ������] : " + this.getName());
		for(int i=0; i<5; i++) {
			System.out.println(this.getName() + "�� ����� ���� : " + i);
			//�������� �̸��� ��� 2���� ���
			//1��° (���� �޼��� �̿�)
			//Thread.currentThread().getName()
			//2����(�ν��Ͻ� �޼��� �̿�)
			//this.getName() -- ���θ޼��忡���� ����� �� ����.
		}
		
	}
}
