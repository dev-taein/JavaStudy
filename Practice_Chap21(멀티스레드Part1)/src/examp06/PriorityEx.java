package examp06;

public class PriorityEx {

	public static void main(String[] args) {
		
		//���� �������� �켱���� ����
		Thread thread1 = Thread.currentThread();
		System.out.println(thread1.getName() + " : " + thread1.getPriority());  
	
		for(int i=1; i<=5; i++) {
			Thread thread = new CalcThread("Thread : " + i);
			//Thread 1, 2, 3, 4�� �켱������ ���� ����
			if(i != 5) {
				thread.setPriority(Thread.MIN_PRIORITY);
//				thread.setPriority(1); �Ȱ���
			}  
			//Thread5�� �켱������ 10���� ���� ����
			else { 
				thread.setPriority(Thread.MAX_PRIORITY);
//				thread.setPriority(10); �Ȱ���
			}
			thread.start();
		}
//		�ƹ��� �켱������ 10���� �־��� �ص�, �۾��� ��ġ�� �󵵰� ���� ������
//		������ 100���� ���� �����ٴ� ������ ����.
//		������ �ڹٴ� ��ȯ�Ҵ�(Round-Robin)����� ����ϱ� ������
//		CPU�����췯�� ���¿� ���� �޶�����.
	}

}
