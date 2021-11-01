package examp13;

public class ProducerThread extends Thread {
	//������ü ����
	private DataBox dataBox;
	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			String data = "Data" + i;  //�����͸� ����
			this.dataBox.setData(data); //�����͸� ���� ��ü�� �����Ѵ�.
		}
	}

}
