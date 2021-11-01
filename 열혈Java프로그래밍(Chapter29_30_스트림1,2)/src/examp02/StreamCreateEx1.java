package examp02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreateEx1 {

	public static void main(String[] args) {
//		��Ʈ���� ���� : ��Ʈ�� ������ �ʿ��� �����͸� ���� ����
//		static <T> Stream<T> of(T t)
//		static <T> Stream<T> of(T...values)
		
		Stream.of(11, 22, 33, 44) //�� ���� ������ �̷��� ��Ʈ�� ����
		.forEach(n->System.out.print(n + "\t"));
		System.out.println();
		
		Stream.of("So Simple") // �ϳ��� String�ν��Ͻ��� �̷��� ��Ʈ�� ����
		.forEach(s->System.out.print(s + "\t"));
		System.out.println();
		
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(sl) // �ϳ��� �÷��� �ν��Ͻ��� �̷��� ��Ʈ�� ����
		.forEach(w->System.out.print(w + "\t"));
		System.out.println();
		
//		��Ʈ���� �پ��� of�޼ҵ��
		
//		static DoubleStream of(double...values) //DoubleStream�� �޼ҵ�
//		static DoubleStream of(double t) //DoubleStream�� �޼ҵ�
		
//		static IntStream of(int...values) //IntStream�� �޼ҵ�
//		static IntStream of(int t) //IntStream�� �޼ҵ�
		
//		static LongStream of(long...values) //LongStream�� �޼ҵ�
//		static LongStream of(long t) //LongStream�� �޼ҵ�
		
		
//		static IntStream range(int startInclusive, int endExclusive) //IntStream�� �޼ҵ�,, Inclusive�� �ڽ�����, Exclusive�� �ڽŹ�����
//		range(1,9)�̸� 1���� 8������ ������
//		static IntStream rangeClosed(int startInclusive, int endInclusive) //IntStream�� �޼ҵ�
		
//		static LongStream range(long startInclusive, long endInclusive) //LongStream�� �޼ҵ�
//		static LongStream rangeClosed(long startInclusive, long endInclusive) //LongStream�� �޼ҵ�
	}

}
