package examp03;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool2 {

	public static void main(String[] args) {
		
//		������ Ǯ ����� ���� 2
		
		Runnable task1 = () -> { //�����忡�� ��ų �۾�
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 + 7));
		};
		Runnable task2 = () -> { //�����忡�� ��ų �۾�
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (7 - 5));
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2); //
		exr.submit(task1); //������ Ǯ�� �۾��� ����
		exr.submit(task2);
		exr.submit( () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 * 7));
		});
		
		exr.shutdown(); //������ Ǯ�� �� �ȿ� �ִ� ������ �Ҹ�
		
		
		
		
//		newSingleThreadExecutor : Ǯ �ȿ� �ϳ��� �����常 �����ϰ� �����Ѵ�.
//		newFixedThreadPool : Ǯ �ȿ� ���ڷ� ���޵� ���� �����带 �����ϰ� �����Ѵ�.
//		newCachedThreadPool : Ǯ ���� �������� ���� �۾��� ���� �°� ���������� �����Ѵ�.
	}

}
