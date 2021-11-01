package Question1_120;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//In 2015, daylight saving time in New York, USA, begins on March 8th at 2:00 AM. As a result, 2:00 AM becomes 3:00 AM.
//2015 �� �̱� ������ �ϱ� ���� �ð� ���� 3 �� 8 �� ���� 2�ÿ� ���۵˴ϴ�. ��������� ���� 2 �ð� ���� 3 �ð��˴ϴ�.
public class Examp97 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/New_York"); //�ð� ������ ����
		ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1, 0), zone); //1:00������ ������� 1�ð� �� �߰�
		//ZonedDateTime = LocalDateTime + Ÿ����/����
		ZonedDateTime dt2 = dt.plusHours(2); //2�ð��� �߰��߱⶧����  difference(����)�� 2�� �ȴ�.
		System.out.println(DateTimeFormatter.ofPattern("H:mm - ").format(dt2)); //2�ÿ��� 2�ð� �� �߰��ؼ� 4�ð�
		System.out.println("difference: " + ChronoUnit.HOURS.between(dt, dt2));
	}

}


//�� : 4:00 - difference: 2


/*
 ZoneID�� ���ؼ� Ÿ���� ������ �ѱ�� ���ϴ� ������ �ð��� ���� �� �ֽ��ϴ�.
ZonedDateTime Ŭ������ Ÿ���� �Ǵ� ���� ������ �ʿ��� ��¥�� �ð� ������ ��Ÿ���� ���ؼ� ���˴ϴ�. 
*/