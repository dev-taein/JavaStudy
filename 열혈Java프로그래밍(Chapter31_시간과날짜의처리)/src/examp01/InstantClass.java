package examp01;

import java.time.Duration;
import java.time.Instant;

public class InstantClass {

	public static void main(String[] args) {
//		�ð��� �󸶳� �ɷ���? : Instant Ŭ����
//		Ÿ�̸Ӷ�� ��������  = Duration
		
		//�ð�=�ð��� ��� �� ����
		//�ð�= � �ð����� � �ð������� ����
		Instant start = Instant.now(); //���� �ð� ������ ����
		System.out.println("���� : " + start.getEpochSecond());
		//��ȯ ���� '1970-01-01 00:00:00'�� �������� ������ �ð��� �� ������ ����� ���
		System.out.println("Time flies like an arrow.");
		Instant end = Instant.now(); //���� �ð� ������ ����
		System.out.println("�� : " + end.getEpochSecond());

		Duration between = Duration.between(start, end); //�� �ð��� �� ���
		//Duration�� �ð� ���� ǥ���ϱ� ���� Ŭ����
		System.out.println("�и� �� ���� �� : " + between.toMillis());

	}

}
