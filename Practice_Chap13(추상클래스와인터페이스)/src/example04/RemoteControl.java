package example04;

public interface RemoteControl {
	
	//��� (static final)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼��� 3�� ���� (abstract)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
