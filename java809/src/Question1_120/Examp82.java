package Question1_120;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Examp82 {

	public static void main(String[] args) {
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5")); 
		long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
		System.out.println("Travel time is" + hrs + "hours");
	} //�� : Travel time is4hours

}
/*
ZonedDateTime�� LocalDateTime�� �޸� Ÿ���� �Ǵ� ���� ������ ������ �ִ� Ŭ�����Դϴ�.
public �����ڸ� �������� �ʱ� ������ ��ü�� ������ ���� now()��, of()�� ���� ���� �޼ҵ带 ����ϵ��� ����Ǿ� �ֽ��ϴ�.
ZoneID�� ���ؼ� Ÿ���� ������ �ѱ�� ���ϴ� ������ �ð��� ���� �� �ֽ��ϴ�.




ChronoUnit.HOURS.between(depart, arrive)��  �� �Ű������� �ð����̸� Hours �ð����� ��Ÿ����
������, ZoneId.of("UTC-7"),ZoneId.of("UTC-5") ������ ���� �ð��� �ٸ��� �����Ƿ�
�ð����̴� 6�� ��������
UTC-7-UTC-5 = 2
6-2 = 4HOURS
*/