package example05;

public class Thermometer {

	//��ø �������̽� ����
	interface TemperatureChangable{
		public void OnChangable(); //�߻�޼���
	}
	
	//��ø�������̽��� ���
	TemperatureChangable changable;

	//setter ����
	//�Ű����� Ÿ���� �������̽� Ÿ���� ���Դ�. �̰��� ������ �ǹ��ϴ°ǰ���?
	//��, TemperatureChangabe�������̽��� ������ Ŭ������ ���� �� �ִ�.
	//�������̽� �Ű������� ������
	public void setChangabe(TemperatureChangable changable) {
		this.changable = changable;
	}
	
	
	public void viewTemperature() {
		this.changable.OnChangable();
	}
	
}
