package example05;

public class Bus implements Vehiclable {
	
	
	private int speed; //�ӵ�
	
	
	@Override
	public void run() {
		System.out.println("������ " + this.speed + "Km�ӵ��� �޸��ϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}

	@Override
	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("�ӵ��� �����ϸ��� ������.... �ڷ� �����?");
			return;
		}
		this.speed = speed;
		
	}
	
}
