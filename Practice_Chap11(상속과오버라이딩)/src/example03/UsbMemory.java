package example03;

public class UsbMemory extends HddDisk{
	
	//�������
	int capacity;
	int rpm;
	
	//������
	public UsbMemory() {
		
	}
	
	//�Ű������� �ִ� ������
	public UsbMemory(int capacity, int rpm) {
		this.capacity = capacity;
		this.rpm = rpm;
	}
	
	//�����ε�
	public String status(int i) {
		String str = "USB �뷮 : " + i + "\n" + 
					 "USB �ӵ� : " + this.rpm + "(rpm)";
		return str;
	}
	
	
	
	//����Ŭ������ status()�޼��带 �������̵���.
	@Override
	public String status() {
		String str = "USB �뷮 : " + this.capacity + "\n" + 
					 "USB �ӵ� : " + this.rpm + "(rpm)";
		return str;
	}
	
	

}
