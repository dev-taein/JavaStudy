package example02;

public class SmartPhone extends Phone {

	public SmartPhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);

	}

	@Override
	public void turnOn() {
		System.out.println("����Ʈ���� �������ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ���� �������ϴ�.");
		
	}

	//��ü�޼���
	public void internetSearch() {
		System.out.println("���̹��� �����մϴ�.");
	}
	
}
