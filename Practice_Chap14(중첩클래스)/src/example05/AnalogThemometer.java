package example05;

public class AnalogThemometer implements Thermometer.TemperatureChangable {
	int temperture = 100;
	@Override
	public void OnChangable() {
		System.out.println("�Ƴ��α� �µ����Դϴ�.");
		System.out.println(this.temperture + "�� �Դϴ�.");
	}
}
