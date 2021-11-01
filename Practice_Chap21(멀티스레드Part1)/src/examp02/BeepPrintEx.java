package examp02;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()�޼ҵ�� JVM�� �����Ѵ�.
	public static void main(String[] args) {
		//���� �����ϴ� ��Ƽ������ ��� 3����
		//��� 1 --> ������ü ����
		Runnable runnable = new Beep(); //������ü ����
		Thread thread = new Thread(runnable);
		thread.start();
		
		//������� �ѹ� start()�� �� �����ϰ� ����, ������� �ȵȴ�.
		//������� �ϰ��� �Ѵٸ� �Ʒ��� ���� �ν��Ͻ��� �Ѱ� �� �������Ѵ�.
//		thread = new Thread(runnable);
//		thread.start();
		
		
		/*��� 2 --> �͸� ���� ��ü
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					System.out.println("Beep�� �����ϴ� ������ �� :" + Thread.currentThread().getName());
					toolkit.beep();
					try {
						Thread.sleep(500); //500=0.5��
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread.start();
		 */
		
		/* ��� 3 --> ���ٽ�(�Լ��� �������̽�)������ ����(�ڵ� ����, ������) ---- �Լ��� �������̽��� �������̽��� �߻�޼��尡 ���� �Ѱ��� �ִ� ���� ���Ѵ�.
		Thread thread = new Thread( ()->  {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				System.out.println("Beep�� �����ϴ� ������ �� :" + Thread.currentThread().getName());
				toolkit.beep();
				try {
					Thread.sleep(500); //500=0.5��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		*/
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				System.out.println("for���� �����ϴ� �޼ҵ� �� :" + Thread.currentThread().getName());
				System.out.println("�߿�~" );
				toolkit.beep();
				try {
					Thread.sleep(500); //500=0.5��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}
