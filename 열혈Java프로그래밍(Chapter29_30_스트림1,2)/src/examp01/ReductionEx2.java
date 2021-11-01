package examp01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionEx2 {

	public static void main(String[] args) {
//		�����ǰ� reduce �޼ҵ� : ���� ����
//		������(Reduction) �����͸� ����ϴ� ����
//		T reduce(T identity, BinaryOperator<T> accumulator) //Stream<T>�� ����
		//BinaryOperator<T> T apply(T t1, T t2)
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		String str = ls.stream()
				.reduce("", lc); //��Ʈ���� �� ��� ""��ȯ
		System.out.println(str);
//		��� --> Complex
//		reduce�� ù��° ���� ���ڸ� ��Ʈ���� ù ��° �����ͷ� �����Կ� ����!
		
		
//		reduce�� ù��° ��ȯ ����("")�� ���� ""��ȯ������
//		������� ������ ��Ʈ������ Box�տ� ���ο� ������ ���� ó���Ѵ�.


	
	
	}

}
