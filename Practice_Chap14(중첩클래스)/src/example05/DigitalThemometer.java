package example05;

//��ø �������̽��� ������ Ŭ����
public class DigitalThemometer implements Thermometer.TemperatureChangable{
	int temperaure = 50;
	@Override
	public void OnChangable() {
		
		System.out.println("���� �µ����Դϴ�.");
		System.out.println(this.temperaure + "�� �Դϴ�.");
		
	}
}