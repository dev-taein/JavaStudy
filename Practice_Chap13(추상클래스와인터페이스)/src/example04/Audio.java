package example04;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
		
	}



	@Override
	public void setVolume(int volume) {
		//������ 0~10���̿����� ������ ������ ���α׷��� ��
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("Audio ������ �ִ�ġ ���� 10�Դϴ�.");
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println("Audio ������ �ּ�ġ ���� 0�Դϴ�.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� ����� ���� : " + this.volume);
		
	}
	
}
