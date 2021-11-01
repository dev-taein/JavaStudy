package example05;

public class ThermometerEx {

	public static void main(String[] args) {

		Thermometer thermometer = new Thermometer();
		thermometer.setChangabe(new AnalogThemometer());
		thermometer.viewTemperature();
		
		
		thermometer = new Thermometer();
		thermometer.setChangabe(new DigitalThemometer());
		thermometer.viewTemperature();
		
		
		
		//��ø �������̽� �̹Ƿ� �͸��� ��ü�� ��� ���� �ȵȴ�.
//		Thermometer.TemperatureChangable thermometer2 = new Thermometer.TemperatureChangable() {
//			//�͸� ���� ��ü
//			@Override
//			public void OnChangable() {
//				System.out.println("�͸� ���� ��ü�� ����");
//				
//				
//			}
//			
//		};
//		Thermometer t = (Thermometer)thermometer2;
//		t.viewTemperature();
		
	}

}
