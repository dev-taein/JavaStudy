package example02;

public class FolderblePhone extends Phone{

	public FolderblePhone(int serial_No, String owner, String company) {
		super(serial_No, owner, company);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("폴더블 폰이 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("폴더블 폰이 꺼졌습니다.");
		
	}
	
	public void FoldOn() {
		System.out.println("폴드 기능이 사용됩니다.");
	}
	public void FoldOff() {
		System.out.println("폴드 기능이 해제됩니다.");
	}
	

}
