package examp01;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeClass {

	public static void main(String[] args) {
//		2�ð� 10�� �ڿ� � ? : LocalTime Ŭ����
//		LocalTime�� �ð� ������ ��Ÿ���� Ŭ����
		
		//���� �ð�
		LocalTime now = LocalTime.now();
		System.out.println("���� �ð� : " + now);
		
		//2�ð� 10�� �� ȭ�� ��Ƽ ����
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);
		
		//ȭ�� ���� �ð�
		System.out.println("ȭ�� ���� �ð� : " + mt);
		
		//PC���� PC �̿� ���� �ð�
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("PC �̿� ���� �ð� : " + start);
		
		//PC���� PC�̿� ���� �ð�
		LocalTime end = LocalTime.of(17, 31, 19);
		System.out.println("PC�̿� ���� �ð� : " + end);
		
		//PC�̿� �ð� ���
		Duration between = Duration.between(start, end); //�ð� �� ��꿡�� �̰�쿡�� DurationŬ������ ���ȴ�.
		System.out.println("�� PC �̿� �ð� : " + between); //PT3H6M44S���� ����
		
//		�� Instant ���� = Duration
//		��¥ LocalDate ���� = Period
//		�ú��� LocalTime ���� = Duration
	}

}
