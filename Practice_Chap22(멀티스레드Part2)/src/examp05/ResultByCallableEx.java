package examp05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {
	
	
	public static void main(String[] args) {
		
		//������ Ǯ ����
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		//Callable�͸� ���� ��ü�� ����(��, �۾���ü�� ����) --> ���ϰ��� ���� <T>Ÿ��
		System.out.println("[�۾�ó����û]");
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=100000; i++) {
					sum += i;
				}
				return sum;
			}
		};
		//�۾� ť�� �۾���ü�� �ִ´�.
		//Future�� ���׸����� ���� TŸ������ ������ �� ����Ѵ�.
		System.out.println("���ŷ ���� : " + System.currentTimeMillis());
		Future<Integer> future = executorService.submit(callable);
		try {
			int value = future.get();  //��ڽ��� �̷����
			System.out.println("���ŷ �� : " + System.currentTimeMillis());
			System.out.println("[�۾�ó�����] : " + value);
			System.out.println("[�۾�ó���Ϸ�]");
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
		//������ Ǯ ����
		executorService.shutdown();
	}

}
