package examp10;

public class StatePrintThread extends Thread{
	
	//�������� ���¸� �˾ƺ��� ���� ����� ����
	private TargetThread targetThread;

	public StatePrintThread(TargetThread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			//�������� ���� ������ �˾Ƴ���.
			//Thread.state�� ������Ŭ������ Enum(������)Ÿ���̴�.
			Thread.State state = targetThread.getState();
			
			System.out.println("Ÿ�ٽ������� ���� : " + state);
			
			
			//�����尡 �����Ǿ����� �����ض�.
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			//���ѷ����� ���� ������ �ڵ�(�����尡 ���� �Ǿ���?)
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
