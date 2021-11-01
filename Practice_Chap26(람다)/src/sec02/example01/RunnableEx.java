package sec02.example01;

public class RunnableEx {

	public static void main(String[] args) {

		//�͸�����ü
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		
		System.out.println("---------------------------------------");
		
		//�������� ���ٽ����� ���� �ۼ��Ͽ� Thread�� �Ű������� �ִ� �ڵ�   (���1)
		runnable = () -> {
			for(int i=0; i<5; i++) {
				System.out.println(i);
			}
		};
		thread = new Thread(runnable);
		thread.start();
		
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println("---------------------------------------");
		
		//Thread��ü�� ������ ��, �ٷ� ���ٽ��� �ۼ���. (���2) ---------�ַ� �� ����� ����Ѵ�.
		thread = new Thread( () -> {
			for(int i=0; i<5; i++) {      
				System.out.println(i);
			}
		} );
		thread.start();
	}

}
