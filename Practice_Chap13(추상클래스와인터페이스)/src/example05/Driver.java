package example05;
//����Ŭ����
public class Driver {

	//���� �� �ִ°���? -> new Taxi()�̰ų� new Bus()�� ���� �� �� �ִ�.
	//�� 2���� Ŭ������  Vehiclable�������̽��� �����߱� ������ ���� �� �� �ִ�.
	//�������̽� �Ű������� ������
	public void drive(Vehiclable vehiclable) {  //�Ű������� �������̽��� ���´ٴ°��� Vehiclable�� ������ Ŭ�����鸸 ���� �� �ִ�.
 		vehiclable.run();
// 		System.out.println(vehiclable); //�ּ� ���
	}
	public void stop(Vehiclable vehiclable) {
		vehiclable.stop();
	}
	
	//����Ÿ��, �Ű�����Ÿ���� ���� Vehiclable�������̽� Ÿ���̴�.
	//�� ���� �� ����Ÿ�Ե� ����Ŭ������ �;� �ϸ�, �Ű����� Ÿ�Ե� ����
	//����Ŭ������ �;� �Ѵ�.
	public Vehiclable newCar(Vehiclable vehiclable) {
		if(vehiclable instanceof Taxi) {
			System.out.println("���ý�");
			Taxi taxi = (Taxi)vehiclable;
			return taxi;
		}
		else if(vehiclable instanceof Bus) {
			System.out.println("�� ����");
			Bus bus = (Bus)vehiclable;
			return bus;
		}
		return null;
	}
}
