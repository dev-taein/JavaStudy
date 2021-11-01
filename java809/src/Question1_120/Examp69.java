package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Examp69 {

	public static void main(String[] args) {
		UnaryOperator<Integer> uo1 = s -> s*2; //line n1
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
		loanValues.stream()
		.filter(lv -> lv >= 1500)
		.map(lv -> uo1.apply(lv))   //line n2  ,, �� ������ ������ line n2���� �߻��Ѵ�.
//		uo1.apply ()�� ������ ��������� map ()������ double�� �����մϴ�.

		.forEach(s -> System.out.print(s + " "));
	}
//	�� : C. A compilation error occurs at line n2.
//	���� UnaryOperator<Double> �̶�� ���� : 4000.0

}



/*
2.7 java.util.function.UnaryOperator<T>
: java.util.function.Function<T,R> ���� Ȯ���� ���ٽ����μ�, <T>������ �Է°��� �޾� <T>������ ��°��� �����Ѵ�.
��)
java.util.function.UnaryOperator<String> uo = (x)->x.toUpperCase();
System.out.println("UnaryOperator test ="+ uo.apply("hello"));
���) UnaryOperator test =HELLO
*/