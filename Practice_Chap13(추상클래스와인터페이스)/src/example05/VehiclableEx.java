package example05;

public class VehiclableEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		bus.setSpeed(-50);
		bus.setSpeed(80);
		//���� ���� ��������(�ּ�)�� �ѱ�� ��
		driver.drive(bus);
		driver.stop(bus);
		
		
		System.out.println();
		
		
		taxi.setSpeed(-70);
		taxi.setSpeed(120);
		//���� ���� ��������(�ּ�)�� �ѱ�� ��
		driver.drive(taxi);
		driver.stop(taxi);
		
		System.out.println();
		
		
		//�̷��� ���� �Ű������� �����Ͽ� �ѱ�� ���
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		//���⼭ ������ ���ܰ� �߻��ϴ� ������ ?
//		driver.drive(new AICar()); //  Vehiclable�������̽��� �������� �ʾұ� �����̴�.
		
		
		System.out.println();
		
		//����Ÿ������ �޴� �Ű����� Ȱ��
		Vehiclable vehiclable = driver.newCar(new Taxi());
		vehiclable.setSpeed(60);
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();
		
		vehiclable = driver.newCar(new Bus());
		vehiclable.setSpeed(12);
		vehiclable.run();
		vehiclable.stop();

	}

}
