package Question151_200;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Examp189 {

	public static void main(String[] args) {
											//of(��,  ��, �� , ��, ��, ��, ������, ZoneID.of(����ð�))
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 1, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5")); 
		long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1   //���⼭ �ð����̸� ���� --MINUTES�ϸ� 360�� ����
		System.out.println("Travel time is" + hrs + "hours");
		
		
		//�� : B. Travel time is 6 hours
		
// ���� ���ϴ¹�.....  (1+7)-(9+5)=6		
	}

}
