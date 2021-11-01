package examp11;

public class YieldEx {

	public static void main(String[] args) throws Exception {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		//3�� ������ ThreadA, ThreadB�� ������ ���鼭 �۾��� �Ѵ�.
		Thread.sleep(3000);
		threadA.work = false; //3�ʵڿ� ThreadA�� work�� false�� �Ǹ鼭 ThreadB�� ��µȴ�.
		
		Thread.sleep(3000);
		threadA.work = true;
		threadB.work = false;   //3�ʵڿ� A�� ���
		
		
		Thread.sleep(3000);
		threadA.stop = true;
		threadB.stop = true;   //3�ʵ� A�� �����ٰ� B�� ���´�
		
		
	}

}
