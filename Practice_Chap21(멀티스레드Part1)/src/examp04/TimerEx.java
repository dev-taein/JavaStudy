package examp04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception {  //sleep�� try catch�ص� �ǰ� thorws Exception�ص� �ǰ� ����
		
		Thread thread = new TimerThread();
		thread.start();
		
		String input = JOptionPane.showInputDialog("10�� �ȿ� ���� �Է��Ͻÿ� : ");
		if(input != null) {
			System.out.println("�Է� �� : " + input);
			System.exit(0);
		} else {
		Thread.sleep(10000); //10�� ���     
		System.out.println("�Է����� ���߽��ϴ�. ��!~");  //��ҹ�ư�� ������ null�� �ƴ϶� �� ������ ������ �ȴ�.
		System.exit(0);
		}
	}

}
