package examp01;
//���� ���
public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		//daemon����(����, start()ȣ�� ���� ������ �ؾ��Ѵ�.
		//autoSaveThread�� main������� �������� ���谡 �ȴ�
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		
		//main������� 5�� ���� �����ϸ�, daemon�������� autoSaveThread�� ����ǰ�, main�����尡 ����Ǹ� �� �̻� autoSaveThread�� ������ �ȵȴ�.
		//�������� �����̱⶧���� main�����尡 ����Ǹ� autoSaveThread�� ����ȴ�
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("main������ �����");
	}	

}
