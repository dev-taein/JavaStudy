package examp02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTimeClass2 {

	public static void main(String[] args) {
//		�ð��븦 �ݿ��� ����
//		[From �ѱ� to ������]
//		�ѱ� ��� ���� �ð� 2017�� 12�� 9�� 14�� 30��
//		�ĸ� ���� ���� �ð� 2017�� 12�� 9�� 17�� 25��
//		���࿡ �ɸ� �ð���?
		
//		�ѱ� ��� �ð� 2017-09-09 14:30
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2017, 12, 9, 14, 30), ZoneId.of("Asia/Seoul"));
		System.out.println("Departure : " + departure);
		
		
//		�ĸ� ���� �ð� 2017-09-09 17:25
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2017, 12, 9, 17, 25), ZoneId.of("Europe/Paris"));
		System.out.println("Arrival : " + arrival);
		
		//���� �ð�
		System.out.println(Duration.between(departure, arrival));
	}

}
