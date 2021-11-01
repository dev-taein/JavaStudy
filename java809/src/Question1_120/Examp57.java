package Question1_120;

import java.util.concurrent.CyclicBarrier;
//�������� ������ ���� ���ϴ� �������� ��⸦ �ɾ��ְ� CyclicBarrier �������� �Ķ���ͷ� �Ѱ��� �� ��ŭ await()�� ȣ���ϸ� ����ϰ� �ִ� ��������� ��⸦ Ǯ���ִ� ������ �� �� �ֽ��ϴ�.
class Worker extends Thread {
CyclicBarrier cb;
public Worker(CyclicBarrier cb) { this.cb = cb; }
public void run () {
try {
cb.await(); //���
System.out.println("Worker");
} catch (Exception ex) { }
}
}
class Master implements Runnable { //line n1
public void run () {
System.out.println("Master");
}
}
public class Examp57 {
	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(1, master);//line n2  1�� �������� �����̸�, master�� Runnable�������̽��� ����Ѵ�.
		Worker worker = new Worker(cb);
		worker.start();
	}
	
}
//public CyclicBarrier(int parties, Runnable barrierAction) {  //int parties�� awit()�� ȣ���ϱ� ���� �ʿ��� thread�� ��
//    if (parties <= 0) throw new IllegalArgumentException();
//    this.parties = parties;
//    this.count = parties;
//    this.barrierCommand = barrierAction;
//}