package example04;

public class Car {

	int speed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int speed) {
		this.speed = speed;
	}
	
	//final(������)�� �޼��� �տ� ������ �ڼտ��� �������̵��� �� ���� ����. private+final=�������̵� �Ұ�
	//�޼��� �տ� final�� ���� ������ �޼����� ��������.
	public final void speedup() {
		this.speed += 10;
		System.out.println("���� " + this.speed + "�ӵ��� �޸��ϴ�.");
	}
	
	public void speedDown() {
		this.speed -= 10;
		System.out.println("���� " + this.speed + "�ӵ��� �޸��ϴ�.");
	}
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
	
}
