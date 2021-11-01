package examp04;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteSubmitEx {

	public static void main(String[] args) {
		//�ִ� 2���� �����带 ������ ������ Ǯ�� �����ϱ�
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0; i<20; i++) {
			//20���� �۾���ü �����
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					//newFixedThreadPool(), newCachedThreadPool()�� ����������   ThreadPoolExecutor��  ��������� ������
					//����Ÿ�Ժ�ȯ�� �����ϴ�.   //�ٿ� ĳ���� executorService(����)->ThreadPoolExecutor(�ڼ�)
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;  
					
					//���� ������ Ǯ�� �ִ� ������ ������ ��������
					int poolSize = threadPoolExecutor.getPoolSize();
					//�۾����� ��������� ���
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ �� :" + poolSize + "]" + "�۾� ������ �̸� : " + threadName);
					
					
					//�Һη� ���� �߻���Ű��(execute()�� submit()�޼����� ������ ���� ���ؼ� ���� �߻���Ŵ)
					Integer.parseInt("��"); 
					
				}
			};
//			�۾�ť�� runnable��ü�� �ִ� ����, execute()�� �۾� ó�� ���߿� ���ܰ� �߻��ϸ�, �ش� ������ Ǯ���� �����ϰ� ���ο� �����尡 �����ȴ�.
//			submit()�� ���ܰ� �߻��ϴ���, �ش� �����带 ������Ǯ���� �������� �ʰ� ���� ���� �� �� �ִ�, �Ͽ� submit()�� ����ϴ� ���� ����.
//			executorService.execute(runnable);
			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
			//������ Ǯ ����(�۾� ť�� �ִ� ��� �۾��� ������ �� �Ŀ� ���� �Ѵ�.)
			executorService.shutdown();
	}
}
