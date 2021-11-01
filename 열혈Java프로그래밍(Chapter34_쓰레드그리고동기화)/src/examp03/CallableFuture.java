package examp03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * public interface Runnable {  //��ȯ���� ����
		 * void run();
		 * };
		 * 
		 * 
		 * @functionalInterface
		 * public interface Callable<V> {    ��ȯ���� ������
		 * 	V call() throws Exception;
		 * }
		 * 
		 * 
		 */
		
		
		
		
		Callable<Integer> task = () -> {
			int sum =0;
			for(int i=0; i<10; i++)
				sum += i;
			return sum;
		};
		
		ExecutorService exr = Executors.newSingleThreadExecutor();
		Future<Integer> fur = exr.submit(task); //submit(���� ����)�ϸ� Integer������ �޾������(Future)
		
		Integer r = fur.get(); //Future�� ���� ���� get()���� �������� ��ȯ �� ȹ��
		System.out.println("Result : " + r);
		exr.shutdown();
		
		
		
		
		
	}

}
