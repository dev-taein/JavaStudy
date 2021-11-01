package calendarExample;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEx {

	public static void main(String[] args) {

		String[] timezone = TimeZone.getAvailableIDs();
		for(String zoneId : timezone) {
			System.out.println("�� ���� : " + zoneId);
		}
		TimeZone tz = TimeZone.getTimeZone("UCT");  // Ÿ�� ���� Africa/Bissau �̰����� �����ؼ� 
		Calendar today = Calendar.getInstance(tz);
		System.out.println(toString(today));
	}
	
	//������ ������ Ÿ������ ���� �ð��� ��¥�� �˷��ش�.
	public static String toString(Calendar date) {
		
		int i = date.get(Calendar.AM_PM);
		String str = "";
		if(i == 0)
			str = "AM";
		else 
			str = "PM";
		
		return date.get(Calendar.YEAR)+"�� " + (date.get(Calendar.MONTH)+1) +
				"�� " + date.get(Calendar.DATE) + "�� " + " " + str + " " + date.get(Calendar.HOUR_OF_DAY) + 
				"�� " + date.get(Calendar.MINUTE) + "�� " + date.get(Calendar.SECOND) + "��";
		
	}

}
