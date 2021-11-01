package Question201_248;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
CyclicBarrier cb;
public Worker(CyclicBarrier cb) { this.cb = cb; }
public void run () {
try {
cb.await();
System.out.println("Worker��");
} catch (Exception ex) { }
}
}
class Master implements Runnable { //line n1
public void run () {
System.out.println("Master��");
}
}
public class Examp237 {

	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(1, master);//line n2
		Worker worker = new Worker(cb);
		worker.start();
		
//		  CyclicBarrier �� ����ϸ� ���ÿ� ����Ǵ� ������ ���� ���ϴ� �������� ��⸦ �ɾ��ְ� ��� �����尡 ��� ���¿� ������, ��⸦ Ǯ���ִ� ������ �� �� �ִ�. 
		// await�� ȣ���Ѵٸ� ��� �������� wait ���°� ����ȴ�.
//		 public CyclicBarrier(int parties, Runnable barrierAction) {
		
		
//		run methods of both the Worker and Master classes are executed.
//		You have been asked to ensure that the
//		Which modification meets the requirement?
//		��
//		B. Replace line n2, insert CyclicBarrier cb = new CyclicBarrier(1, master);
	}

}
