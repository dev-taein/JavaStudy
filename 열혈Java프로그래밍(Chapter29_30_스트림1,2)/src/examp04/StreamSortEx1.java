package examp04;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSortEx1 {

	public static void main(String[] args) {
//		���� : �߰�����
//		Stream<T> sorted(Comparator<? super T> comparator) //Stream<T>�� �޼ҵ�
//		Stream<T> sorted() //Stream<T>�� �޼ҵ�
//		IntStream<T> sorted() //IntStream<T>�� �޼ҵ�
//		LongStream<T> sorted() //LongStream<T>�� �޼ҵ�
//		DoubleStream<T> sorted() //DoubleStream<T>�� �޼ҵ�
		
		Stream.of("Box" , "Apple", "Robot")
			.sorted() //String �ν��Ͻ��� Comparable<String>�������̽��� ����! �̸� ������� �� ���� (���ĺ���)
			.forEach(s->System.out.println(s+"\t"));
		System.out.println();
		
		Stream.of("Box" , "Apple", "Robot")
		.sorted((s1, s2)->s1.length() - s2.length()) //ComparaTo�޼ҵ忡 ���� ���ٽ�! �̸� ������� �� ���� (���ڿ� ���̰� ª�� ��)
		.forEach(s->System.out.println(s+"\t"));
			
		
		
		IntStream.of(3, 9, 4, 2)
		.sorted() 
		.forEach(s->System.out.print(s+"\t"));
		
		System.out.println();
		
		DoubleStream.of(3.3, 9.2, 4.5, 2.6)
		.sorted() 
		.forEach(s->System.out.print(s+"\t"));
	}

}
