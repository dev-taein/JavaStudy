package example04;

public class CarEx {

	public static void main(String[] args) {


		Car car = new Car(80);
		car.speedup();
		car.speedDown();
		car.stop();
		
		SportCar sportCar = new SportCar(150);
		sportCar.speedup(); //���� Ŭ������ speedUP�� ȣ��  (���)
		sportCar.speedDown();//���� Ŭ������ speedDown�� ȣ��  (���)
		sportCar.stop(); //�ڼ� Ŭ����(sportCar)�� �������̵��� stop()�� ȣ����
	}

}
