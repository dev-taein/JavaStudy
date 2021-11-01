package examp11;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					System.out.println("ThreadB�� �۾� ����");
				}
			}
			else {
				//���ǹ��� �ݺ��� �������ؼ� �ٸ� �����忡�� �纸��.
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}
