package examp13;

public class ConsumerThread extends Thread {
	//������ü ����
	private DataBox dataBox;
	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			String data = this.dataBox.getData(); //�����͸� �Һ�
//			System.out.println("������ ������ : " + data); 
		}
	}

}
