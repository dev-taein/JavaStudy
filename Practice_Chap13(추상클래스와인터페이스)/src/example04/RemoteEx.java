package example04;

public class RemoteEx {

	public static void main(String[] args) {
		
		//�������̽��� ������ ����, �Ͽ� �ʵ��� �������� ���ȴ�.
		RemoteControl rControl = new Television(); 
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-100);
		rControl.turnOff();
		
		System.out.println();
		
		rControl = new Audio();
		rControl.turnOn();
		rControl.setVolume(20);
		rControl.setVolume(-50);
		rControl.turnOff();
		
		System.out.println();
		
	
		
	}

}
