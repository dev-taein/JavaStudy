package Question1_120;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable {
private static AtomicInteger count = new AtomicInteger (0);
public  void run () {
int x = count.incrementAndGet(); //incrementAndGet()�� ���� �ڵ����� �����Ѵ�.
System.out.print (x+" ");
}
}
public class Examp21 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());
		Thread [] ta = {thread1, thread2, thread3};
		for (int x= 0; x < 3; x++) {
		ta[x].start();
		}
	}

}

//�� :  The program prints 1 2 3 and the order is unpredictable.
//	1,2,3�� �μ��ϰ� ������ �����Ҽ� ����.


// static�� ������ 1 1 1 �� ����Ѵ�.