package examp01;



// Thread 상속을 통한 방법
class Task extends Thread {
	@Override
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();
		System.out.println(name + " :"+(n1+n2));
		}
}
public class TwoRunnable2 {

	public static void main(String[] args) {
		Task t1 = new Task();
		Task t2 = new Task();
		t1.start();
		t2.start();
		System.out.println("End" + Thread.currentThread().getName());
		
		
		
		
		
		
		
		
	}

}
