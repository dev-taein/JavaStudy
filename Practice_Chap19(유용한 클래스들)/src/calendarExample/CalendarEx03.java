package calendarExample;

import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		
		Calendar today1 = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance(); //����ð�
		//set()��¥�� ����
		today1.set(2015, 7, 15); //�ð��� ����
		//���� ���ϱ�  //1��=24*60*60
		long diff = (today2.getTimeInMillis() - today1.getTimeInMillis()) / 1000;
		long diffDay = diff / (24*60*60); // ���� �� �� ���ϴ°���
		System.out.println("20150715~���� �ð�����  ���� �� : " + diff);
		System.out.println("20150715~���� �ð����� ���� �� �� : " + diffDay);
	}

}
