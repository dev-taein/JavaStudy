package example03;

public class CarEx {

	public static void main(String[] args) {
		Car car = null;
		SportCar sportCar1 = new SportCar();
		SportCar sportCar2 = null;
		PoliceCar policeCar = new PoliceCar();
		
		
		sportCar1.speedUp();
		
		car = sportCar1; //��ĳ����(�ڼ�->����), ������ �� ����� �پ���.
//		car.speedUp(); //���⼭ �����Ͽ��ܰ� �߻� ���� ?  carŬ������ speedUp()�޼��尡 ���⶧���� �����߻�
		
		//�ٿ�ĳ������ ��, �ݵ�� ��������� ����ȯ �ڵ带 �ۼ��ؾ���
		sportCar2 = (SportCar)car; //�ٿ�ĳ����(����->�ڼ�), �����Ҽ� �ִ� ����� �þ��. 
		sportCar2.speedUp();
		
//		sportCar1 = (SportCar)policeCar;  //���� ��Ӱ��谡 �ƴϱ� ������ ����ȯ�� ���� �̷������ ����.
	}

}
