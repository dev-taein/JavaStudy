package examp01;

public class ThreadClass {

	public static void main(String[] args) {
		//�����带 �����ϴ� ���
//		1�ܰ� Runnable�� ������ �ν��Ͻ� ����
//		2�ܰ� Thread �ν��Ͻ� ����
//		3�ܰ� start �޼ҵ� ȣ��
		
//		Thread ct = Thread.currentThread();
//		String name = ct.getName(); //�������� �̸��� ��ȯ
//		System.out.println(name);
		
		//Runnable void run()
		Runnable task = () -> {//�����尡 �����ϰ� �� ����
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + (n1 + n2));
		};
		
		Thread t = new Thread(task);
		t.start();
		System.out.println("End " + Thread.currentThread().getName());
		
//		������ main�����尡 ���� ����ǰ�, �״��� Thread-0�� ����Ǿ���.
//		������ ���������� �ڵ尡 ���� ��� main�� ���� ����ȰŴ� ������ ���� ���� ������� �𸥴�.
	}

}
