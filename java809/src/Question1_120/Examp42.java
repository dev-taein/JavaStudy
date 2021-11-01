package Question1_120;

import java.util.Arrays;
import java.util.List;

public class Examp42 {
	public static void main(String[] args) {
		//�� �տ� ���ڰ� ���� ������ �ǰ�
		//���� �տ� ���ڰ��� ���ٸ� ���� �����  �ڿ� ���� ������ ������ �ȴ�.
		List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices", "101, Peter, HR"); empDetails.stream()
		.filter(s-> s.contains("1")) //��ü�� 1�� ���ԵǾ� ������ true�� ��ȯ   ,, �� true�� �ƴϸ� ������ ���� �ʴ´�.
		//filter�� �迭�� 1 ���ڿ��� ���ԵǾ� ���� ������ ������� �ʴ´�.. ��, 1�� ����(contains)�Ǿ� �־�� ��½����ش�.
		.sorted()
		.forEach(System.out::println); //line n1
		
		
		/*
		 * 
		 * * ��ü�� ��Ұ� Comparable�� �������� ��, �⺻ �񱳷� �����Ϸ���
1. sorted();  //�ڵ� �������� ����
2. sorted( (a,b) -> a.compareTo(b) ); //a�� �������� ����
3. sorted( Comparator.naturalOrder() );  //�⺻����
 �� ������ �߿��� �ϳ��� ����ϸ� ��.
		 */
//		sorted(Comparator.naturalOrder()) // �⺻ �� ���
//		sorted(Comparaot.reverseOrder()) // ���ݴ� �� ���
		
//		A. 100, Robin, HR 101, Peter, HR
	}
}
