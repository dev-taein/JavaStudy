package examp01;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()�޼ҵ�� JVM�� �����Ѵ�.
	public static void main(String[] args) {
		//���� �������� ������ ���� �����
//		System.out.println(Thread.currentThread().getName()); //main�޼��尡 �����Ű�� �����尡 ������ Ȯ��
		
		
		//��Ŷ�� �ڹٰ� ���� ó���� ���ܳ��� �� ��� �̹����� �Ҹ����� ���� ó���ϱ� ���ؼ� �߻�Ŭ���� �߿��� Gui���õ� �⺻���� �޼������ �����س��� Ŭ����
		//Toolkit�� AWT�߻�Ŭ�����ε�, �� �߿� GUI���õ� �޼����� �����Ǿ��� �ν��Ͻ���
		//getDefaultToolkit()�� ���ؼ� ToolkitŬ������ ������ ����
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //getDefaultToolkit �⺻������ ������� GUI�� �����ִ�.
//		for(int i=0; i<5; i++) {
//			System.out.println("for���� �����ϴ� ������ �̸� :" + Thread.currentThread().getName());
//			toolkit.beep(); //�������� ���
//			//�����尡 �ʹ� ���� �����ϴϱ� 0.5�ʵ��� ����� 5�� ������ �߻��Ѵ�.
//			try {
//				Thread.sleep(500); //500=0.5��
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		
			for(int i=0; i<5; i++) {
				System.out.println("�߿�~");
				toolkit.beep();
				try {
					Thread.sleep(500); //500=0.5��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//			�̱۽����带 ��Ƽ������� �ٲ㼭 ���α׷��� ����� ���� �츮�� �� ���̴�.
		
	}

}
