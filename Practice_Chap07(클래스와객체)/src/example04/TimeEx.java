package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		//t1.hour = 10;
		System.out.println(t1);
		
		
		//�ø� ����
		t1.setHour(10);
		//�и� ����
		t1.setMinute(30);
		//�ʸ� ����
		t1.setSecond(12);
		
		
		System.out.println(t1);
	}

}
