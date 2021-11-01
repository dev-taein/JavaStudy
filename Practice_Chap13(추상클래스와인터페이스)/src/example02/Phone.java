package example02;
//�߻�Ŭ����
public abstract class Phone {

	private int serial_No;
	private String Company;
	private String owner;

	
	public Phone(int serial_No, String owner, String company) {
		super();
		this.serial_No = serial_No;
		this.owner = owner;
		Company = company;
	}

	public int getSerial_No() {
		return serial_No;
	}

	public String getOwner() {
		return owner;
	}

	public String getCompany() {
		return Company;
	}
	
	//�߻�޼���
	public abstract void turnOn();
	public abstract void turnOff();
	
	
	public void showInfo() {
		System.out.println("�ø��� �ѹ� : " + this.getSerial_No());
		System.out.println("����ȸ�� : " + this.getCompany());
		System.out.println("������ : " + this.getOwner());
	}
}
