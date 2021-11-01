package examp02;

//����ȭ �޼��� ���
//class Counter1 {
//	int count = 0; //�����Ǵ� ����
//	synchronized public void increment() {
//		count++; //ù ��° �����忡 ���� ����
//	}
//	synchronized public void decrement() {
//		count--; //�� �ٸ� �����忡 ���� ����
//	}
//	public int getCount() {return count;}
//}



//����ȭ ��� ���
class Counter1 {
	int count = 0; //�����Ǵ� ����
	public void increment() {
		synchronized(this) { //this = ��(this) �ν��Ͻ�(count)�� ������� ����ȭ �ϰڴ�. = this���� �ٸ� �ν��Ͻ��� �� �� �ִ�. 
							// �ϳ��� ������ ����ȭ�ϸ� �Ǳ⶧���� this�� ����ߵ�.
		count++; //ù ��° �����忡 ���� ����
		}
	}
	synchronized public void decrement() {
		synchronized(this) {
			count--; //�� �ٸ� �����忡 ���� ����
		}
	}
	public int getCount() {return count;}
}



public class ThreadmemoryAccessSyncronized {

	public static Counter1 cnt = new Counter1();
	public static void main(String[] args) throws InterruptedException {

		Runnable task1 = () ->{
			for(int i=0; i<1000; i++)
				cnt.increment(); //�� 1����
		};
		Runnable task2 = () ->{
			for(int i=0; i<1000; i++)
				cnt.decrement(); //�� 1����
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		t1.join(); // t1�� �����ϴ� �������� ���Ḧ ��ٸ�
		t2.join(); // t2�� �����ϴ� �������� ���Ḧ ��ٸ�
		System.out.println(cnt.getCount());
		
		
		
		
		
	}

}
