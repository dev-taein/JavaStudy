package examp13;

//���� ��ü
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() ����");
		notify(); //wait()�� ���� BLOCKED�� ��������� ������ ���·� �����
		
		try {
			wait(); //������ �ܴ�.  �ٸ� �����忡�� notify(),notifyAll()ȣ�� �ؾ߸� �����.
		} catch (InterruptedException e) {}
	}

	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() ����");
		notify(); 
		
		try {
			wait(); 
		} catch (InterruptedException e) {}
	}

	
}
