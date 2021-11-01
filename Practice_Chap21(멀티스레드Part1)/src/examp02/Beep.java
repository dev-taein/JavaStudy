package examp02;

import java.awt.Toolkit;

//Runnable�������̽��� ���� ���� �ϰ� �ֵ�.
public class Beep implements Runnable {
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
	
}
