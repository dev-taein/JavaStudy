package examp13;

public class WaitNotifyEx {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		
		//�����ڵ忡 ���� notify()�� wait()�� ȣ���ϴµ�, ����ȭ �޼���� �Ǿ� �־
		//�޼��� ����� �Ͼ�鼭 ���� ���ɾ� ���鼭 ����� ���� ����� �ڰ� ������ �Ǵ� ���� �� ����  �ִ�.
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
//		�����尣�� ���� ObjectŬ������ �޼����� notify()�� wait()�� �̿��ϸ� �ȴ�.
//		����ȭ(synchronized) ó���� �� ������ ȣ���ϴ� ���� �ٶ�������.
	}

}
