package Question1_120;

import java.io.ObjectInputStream.GetField;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FExamp112 {

	public static void main(String[] args) {
//		LocalTime now = LocalTime.now();  ������ �̰ǵ�
		LocalTime now1 = LocalTime.of(6, 30);  //����ð� ���� 6�� 30���̶� �̷��� �ٲ�
		
		long timeToBreakfast=0;
		LocalTime office_sart = LocalTime.of(7, 30);
		if(office_sart.isAfter(now1)) { //office_sart�ð��� now���� ���� �ð����� ��--- office_sart(7��30��)�� now(6��30��)���� �����̹Ƿ� true
			timeToBreakfast = now1.until(office_sart, ChronoUnit.MINUTES); //office_sart�ð�(minute)�� now1(minute)�� �ð��̶� ���ؼ�
		} else {
			timeToBreakfast = now1.until(office_sart, ChronoUnit.HOURS);  //isBefore�̸� �ð����� 1�� ���
		}
		System.out.println(timeToBreakfast);  //�� : C. 60
	}

}
//Assume that the value of now is 6:30 in the morning.
//������ ���� ���� 6�� 30 ���̶�� �����մϴ�.

//startDateTime�� endDateTime ���� ���� ��¥ ���� ��
//startDateTime.isBefore(endDateTime);    

//���� ��¥���� ��
//startDateTime.isEqual(endDateTime); 

//startDateTime�� endDateTime ���� ���� ��¥���� ��
//startDateTime.isAfter(endDateTime);
