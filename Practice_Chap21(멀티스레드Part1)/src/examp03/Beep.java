package examp03;

import java.awt.Toolkit;

//����� �޾Ƽ� ������ Ŭ������ ����
public class Beep extends Thread{  //Thread�� Runnable�� �����߱⿡ run()����� �����ϴ�
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
