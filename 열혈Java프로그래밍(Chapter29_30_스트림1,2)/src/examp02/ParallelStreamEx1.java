package examp02;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ParallelStreamEx1 {

	public static void main(String[] args) {
//		���Ľ�Ʈ������ ����
//		Stream<T> parallel() //Stream<T>�� �޼ҵ�
//		DoubleStream<T> parallel() //DoubleStream�� �޼ҵ�
//		IntStream<T> parallel() //IntStream�� �޼ҵ�
//		LongStream<T> parallel() //LongStream�� �޼ҵ�
		
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		Stream<String> ss = ls.stream(); //��Ʈ�� ����
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		String str = ss.parallel() //���� ��Ʈ�� ����
				.reduce("", lc); //��Ʈ���� �� ��� ""��ȯ
		System.out.println(str);
//		��� --> Complex
		
		
		
//		��Ʈ���� �������� �ʰ� ����� ��� 
//		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
//		
//		BinaryOperator<String> lc = (s1, s2) -> {
//			if(s1.length() > s2.length())
//				return s1;			else
//				return s2;
//		};
//		String str = ls.parallelStream()
//				.reduce("", lc); //��Ʈ���� �� ��� ""��ȯ
//		System.out.println(str);
////		��� --> Complex
	}

}
