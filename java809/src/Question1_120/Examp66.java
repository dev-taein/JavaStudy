package Question1_120;

import java.time.LocalDate;
import java.time.Month;

public class Examp66 {

	public static void main(String[] args) {
		LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
		LocalDate nextYear = valentinesDay.plusYears(1);
		nextYear.plusDays(15); //line n1  
//		System.out.println(nextYear.plusDays(15));// ��¹��� �־�� 15���� �÷��� �ȴ�. 2016-02-29
//		System.out.println(nextYear.plusDays(16)); //2016���� 2�� 29�ϱ��� �ۿ� �����Ƿ� plusDays(16)�� �ָ�  3�� 1���� �ȴ�. 2016-03-01
		// ��¹��� �����Ƿ� �ƹ��� ������ ���� �ʴ´�.
		System.out.println(nextYear);
		
		
	}

}
//�� :  A. 2016-02-14

// 183����