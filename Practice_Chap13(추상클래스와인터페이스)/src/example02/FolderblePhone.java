package example02;

public class FolderblePhone extends Phone{

	public FolderblePhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("������ ���� �������ϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������ ���� �������ϴ�.");
		
	}
	
	public void FoldOn() {
		System.out.println("���� ����� ���˴ϴ�.");
	}
	public void FoldOff() {
		System.out.println("���� ����� �����˴ϴ�.");
	}
	

}
