package examp01;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateClass {

	public static void main(String[] args) {
//		������ ��ĥ����? : LocalDateŬ����
//		LocalDate�� �ð� ������ ������ '��¥ ����'�� ǥ���ϱ� ���� Ŭ����
//		Period
		
		//����
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);
		
		//�� ���� ũ��������
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas :"+xmas);
		
		//�� ���� ũ�������� �̺�
		LocalDate eve = xmas.minusDays(1);  //eve��� ���ο� �ν��Ͻ��� �����Ѱ���
		System.out.println("Xmas Eve: "+ eve);
		
//		�ð��� ���� = Duration
//		��¥�� ���� = Period
		
		//ũ������������ ������ ��ĥ?
		Period left = Period.between(today, xmas);
		System.out.println("Xmas���� ������ " + left.getMonths() + "��" + left.getDays() + "��");
	}

}
