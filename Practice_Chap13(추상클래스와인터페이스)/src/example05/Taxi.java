package example05;

public class Taxi implements Vehiclable{

	private int speed; //�ӵ�
	
	
	@Override
	public void run() {
		System.out.println("�ýð� " + this.speed + "Km�ӵ��� �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�ýð� ����ϴ�.");
	}

	@Override
	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("�ӵ��� �����ϸ��� ����! �ڷ� �����?");
			return;
		}
		this.speed = speed;
		
	}
	
	

	
}
