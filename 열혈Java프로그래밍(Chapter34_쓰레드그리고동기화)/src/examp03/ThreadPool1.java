package examp03;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {

	public static void main(String[] args) {
		
//		������ Ǯ ����� ���� 1
		
		Runnable task = () -> { //�����忡�� ��ų �۾�
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};
		
		ExecutorService exr = Executors.newSingleThreadExecutor(); //Ǯ �ȿ� �ϳ��� �����常 �����ϰ� ������
		exr.submit(task); //������ Ǯ�� �۾��� ����
		
		System.out.println("End " + Thread.currentThread().getName());
		exr.shutdown(); //������ Ǯ�� �� �ȿ� �ִ� ������ �Ҹ�
		
		
		
		
//		newSingleThreadExecutor : Ǯ �ȿ� �ϳ��� �����常 �����ϰ� �����Ѵ�.
//		newFixedThreadPool : Ǯ �ȿ� ���ڷ� ���޵� ���� �����带 �����ϰ� �����Ѵ�.
//		newCachedThreadPool : Ǯ ���� �������� ���� �۾��� ���� �°� ���������� �����Ѵ�.
	}

}
