package examp02;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTimeClass {

	public static void main(String[] args) {
//		�ð��븦 �ݿ��� ZonedDateTimeŬ����
		
		//�̰��� ���� ��¥�� �ð�
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);
		
		//������ ��¥�� �ð��� �ĸ�
		ZonedDateTime paris = ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris")); //��¥�� �ð� ������ LocalDateTime�ν��Ͻ��� ��Ƽ� ��ȯ
		System.out.println(paris);
		
		//�̰��� �ĸ��� ����
		Duration diff = Duration.between(here, paris);
		System.out.println(diff);
		
//		2021-02-01T17:31:54.063+09:00[Asia/Seoul] +09:00�� ���� ����(����)�� �ٰŷ��ؼ� ���������� 9�ð� ������
//		2021-02-01T17:31:54.063+01:00[Europe/Paris]
//				PT8H = 8�ð��� �ð���

	}

}
