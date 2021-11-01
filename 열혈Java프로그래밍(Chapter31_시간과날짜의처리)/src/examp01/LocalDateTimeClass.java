package examp01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeClass {

	public static void main(String[] args) {
//		�������κ��� 22�ð� 35�� ���� �ð��� ��¥�� ? : LocalDateTime Ŭ����
//		LocalDate�� ��¥����, LocalTime�� �ð� ������, LocalDateTime�� �ð� ������ ��¥ ������ ���ÿ� ��Ÿ����.
		
		//���� ��¥�� �ð�
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//���� ���̾�� 22�ð� 35�� �� ȭ�� ���� ����
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		
		//���� ���̾�� ȭ�� ���� ��¥�� �ð�
		System.out.println(mt);
		
		System.out.println("---------------------------------------------");
//		�� LocalDateTime �ν��Ͻ� ���� �ð��� ��¥�� ��
		LocalDateTime today = LocalDateTime.of(2020, 4, 25, 11, 20); //���� �ð�
		LocalDateTime flight1 = LocalDateTime.of(2020, 5, 14, 11, 15); //�װ���1�� ��� �ð�
		LocalDateTime flight2 = LocalDateTime.of(2020, 5, 13, 15, 30); //�װ���2�� ��� �ð�
		
		//���� �װ����� �����ϴ� ����
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2))
			myFlight = flight1;
		else
			myFlight = flight2;
		
		//���� �װ����� ���� ž�±��� ���� ��¥ ���
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());//toLocalDate(): ��¥�� ���� ������ LocalDate�ν��Ͻ��� ��Ƽ� ��ȯ
		//���� �װ����� ���� ž�±��� ���� �ð� ���
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());//toLocalTime(): �ð��� ���� ������ LocalDate�ν��Ͻ��� ��Ƽ� ��ȯ
		
		//���� ž�±��� ���� ��¥�� �ð� ���
		System.out.println(day);
		System.out.println(time);
	}

}
