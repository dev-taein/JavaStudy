package examp02;

import java.util.Map;
import java.util.Set;

public class ThreadGroupEx {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		//Map�÷����� <Ű, ��> Ű�� ���� ã�ƿ��� �ڷᱸ���� �� ����, �� MAP�� �������̽��̴�.
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();

		//Map�� Ű���� Set�÷��� ���·� �����´�.(Set�� �������̽��̸�, �����ָӴϿ� ���� ������ �ڷᱸ���̴�.)
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) {
			System.out.println("������ �̸� " + thread.getName()
								+((thread.isDaemon() ? "(���󽺷���)" : "(�� ������)")));
			//������ �׷� ����ϱ�
			System.out.println("\t �Ҽ� �׷� " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}

}
