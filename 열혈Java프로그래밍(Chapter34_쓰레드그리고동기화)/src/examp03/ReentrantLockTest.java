package examp03;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	public static void main(String[] args) {
//		synchronized�� ����ϴ� ReentrantLock
		ReentrantLock criticObj = new ReentrantLock(); //�ڹ���
		void myMethod(int arg) {
			criticObj.lock(); //���� ��ٴ�.
//			..//�ѽ����忡 ���ؼ� �� ���� �Ǵ� ����
			criticObj.unlock(); //���� ����
		}
		
		
		
		
		ReentrantLock criticObj = new ReentrantLock(); //�ڹ���
		void myMethod(int arg) {
			criticObj.lock(); //���� ��ٴ�.
			try { ..//�ѽ����忡 ���ؼ� �� ���� �Ǵ� ����
			
			}finally {
				criticObj.unlock(); //���� ����
			} //unlock ȣ���� �����Ǵ°��� ���� ����
		}
	}

}
