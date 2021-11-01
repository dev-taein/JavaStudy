package examp02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class zonedDateTimeClass3 {

	public static void main(String[] args) {
//		��¥�� �ð� ������ ��� ���� ����
//		y,m,d �� �� ��-----h,m,s �ú���----vv�� �ð��� ID�� ����� �ǹ�
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2019, 4, 25, 11, 20), ZoneId.of("Asia/Seoul"));
		
//		����� ���� ������ java.time.format.DateTimeFormatter �ν��Ͻ��� ��´�.
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-m-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-mm-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-mm-d, HH:mm:ss VV");
		
//		LocalDate, LocalTime, LocalDateTime, ZonedDateTime�� ��� �����ϴ� format �޼ҵ� ȣ���Ѵ�.
		System.out.println(date.format(fm1));
		System.out.println(date.format(fm2));
		System.out.println(date.format(fm3));
		
	}

}
