package example03;

public class InstanceOf {

	public static void main(String[] args) {
		
		//Ctrl + T�� ������ ��Ӱ������� �� �� �ִ� ����Ű�̴�.
		SportCar sportcar = new SportCar();
		
		if(sportcar instanceof SportCar) {
			System.out.println("SportCar�� Ÿ�Ժ�ȯ�� �����մϴ�");
		}
		if(sportcar instanceof Car) { //�����̴ϱ� ����
			System.out.println("Car�� Ÿ�Ժ�ȯ�� �����մϴ�.");
		}
		if(sportcar instanceof Object) { //Object�ְ� �ֻ��� �����̴ϱ� ����
			System.out.println("Object�� Ÿ�Ժ�ȯ�� �����մϴ�.");
		}
		//instanceof�� boolean�� ���� (true �ƴϸ� false�̴�)
		//instanceof�������� ����� true�̶�� ���� ���� ����ȯ�� �����ϴ�
	}

}
