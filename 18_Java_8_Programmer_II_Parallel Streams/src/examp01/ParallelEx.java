package examp01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelEx {

	public static void main(String[] args) {
//		What is a Parallel Stream?
		
//		���ݱ����� ������ ��� �������� �� ��Ұ� �ϳ��� ó���Ǵ� ���� ��Ʈ���� ����߽��ϴ�.
//		�ݴ�� ���� ��Ʈ���� ��Ʈ���� ���� �κ����� �����մϴ�. �� ��ǰ�� �ٸ� �����忡�� ���ÿ� (���ķ�) ó���˴ϴ�.
//		���������� ���� ��Ʈ���� Fork / Join Framework 
//		��, �⺻������ ���� ��Ʈ���� ó���ϴ� �� ����� ���ִ� ������ ���� ��ǻ�� ���μ����� ��� ������ �ھ� ���� �����ϴ�.
//		Fork / Join ������ ��ũ�� ���� ���� ��Ʈ���� ����ϴ� ������ ����ϱⰡ �� ���ٴ� ���Դϴ�.
//		���� ��Ʈ���� ������� parallel () �޼��带 ����Ͻʽÿ�.
		Stream<String> parallelStream =
                Stream.of("a","b","c").parallel();
//		Collection���� ���� ��Ʈ���� �����Ϸ��� parallelStream () �޼��带 ����Ͻʽÿ�.
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> parStream = list.parallelStream();
		
		
		
//		How Parallel Streams work?
		
//		Let's start with the simplest example:
		Stream.of("a","b","c","d","e")
	    .forEach(System.out::print);
//		���� ��Ʈ������ ��� ����� �μ��ϸ� ���� ����� ��µ˴ϴ�. --> abcde
		
		System.out.println();
		
//		However, when using a parallel stream:
		Stream.of("a","b","c","d","e")
	    .parallel()
	    .forEach(System.out::print);
//		���� ��Ʈ���� ���� �� ������ ��� ���� �ٸ���.
		
		System.out.println();
		
//		�� ������ �κп��� ��Ʈ���� �����ϰ� ������ ������ ���� �����忡�� ó���ϱ� �����Դϴ�.
//		���� ���� ��Ʈ���� ó�� ������ �߿����� �ʰ� ���¸� ������ �ʿ䰡���� �۾��� �� �����մϴ� (���� �� �����̰� �������Դϴ�).
//		�� �������� Ȯ���ϴ� ���� findFirst () �� findAny () ����Դϴ�.
//		���� �忡�� findFirst () �޼��尡 ��Ʈ���� ù ��° ��Ҹ� ��ȯ�Ѵٰ� ����߽��ϴ�. 
//		�׷��� ���� ��Ʈ���� ����ϰ� �̰��� ���� �κ����� ���� �� ���� �޼���� � ��Ұ� ù ��° ������� "�˾ƾ�"�մϴ�.
		long start = System.nanoTime();
		String first = Stream.of("a","b","c","d","e")
		    .parallel().findFirst().get();
		double duration = (System.nanoTime() - start) / 1000000;
		System.out.println(
		    first + " found in " + duration + " milliseconds");
//		The output:
//			c found in 0.063169 milliseconds
//		���� ��Ʈ���� ó���ʿ� ���� ���� ��Ʈ���� ���� ��Ʈ������ ������ ó�� �� ���̶�� �ϴ� ���� �ո����Դϴ�. �׷��� findFirst ()���� �� �� �ֵ��� �׻� �׷� ���� �ƴմϴ�.
		
		System.out.println();
//		������ ���� ���� ���� �۾� :
//			Stream<T> distinct()
//			Stream<T> sorted()
//			Stream<T> sorted(Comparator<? super T> comparator)
//			Stream<T> limit(long maxSize)
//			Stream<T> skip(long n)
//		������ ó�� �� ����� ���¸� �����ϰ� ����� �����ϱ� ���� ��ü ��Ʈ���� ���ľ� �� �� �����Ƿ� ���� ��Ʈ���� �������� �ʽ��ϴ�.
//		�׷��� sequential () �޼��带 ����Ͽ� ���� ��Ʈ���� ������ ��Ʈ������ �ٲ� �� �ֽ��ϴ�.
		
//		stream
//		   .parallel()
//		      .filter(..)
//		         .sequential()
//		            .forEach(...);
//		��Ʈ���� isParallel ()�� �������� Ȯ���մϴ�.
//		stream.parallel().isParallel(); // true
		
//		�׸��� ������ ������ ��Ʈ���� ������ �������� ���� ��Ʈ������ �ٲٰų� ������ �������� �ʾҴ��� Ȯ���Ͻʽÿ�.
//		stream
//		   .parallel()
//		      .unordered()
//		         .collect(...);
//		�׷��� ���� ���� ���� �۾��� ���� �� ���� ��Ʈ���� ���� �۾����� ��ȯ�ϸ� ��� ��쿡 ������ ���ǰų� ���� ������ ���� ��ü �۾��� ���ķ� ����� �� �ִٰ� ���� ���ʽÿ�.
		double start2 = System.nanoTime();
		Stream.of("b","d","a","c","e")
		    .sorted()
		    .filter(s -> {
		        System.out.println("Filter:" + s);
		        return !"d".equals(s);
		    })
//		    .parallel()
		    .map(s -> {
		        System.out.println("Map:" + s);
		        return s += s;
		    })
		    .forEach(System.out::println);
		double duration2 = (System.nanoTime() - start2) / 1_000_000;
		System.out.println(duration2 + " milliseconds");
//		��Ʈ���� ���������� ���ĵǰ� ���͸��Ǿ��ٰ� ������ �� ������ ��¿��� �ٸ� ������ ǥ�õ˴ϴ�.
//		Filter:c
//		Map:c
//		cc
//		Filter:a
//		Map:a
//		aa
//		Filter:b
//		Map:b
//		bb
//		Filter:d
//		Filter:e
//		Map:e
//		ee
//		79.470779 milliseconds
		
//		�̰��� ���� ������ ��°� ���Ͻʽÿ� (parallel () �ּ� ��) :
//		Filter:a
//		Map:a
//		aa
//		Filter:b
//		Map:b
//		bb
//		Filter:c
//		Map:c
//		cc
//		Filter:d
//		Filter:e
//		Map:e
//		ee
//		1.554562 milliseconds
		
//		�� ��� ���� ������ �� �� ����Ǿ����ϴ�.
//		�׷��� ������ �߿����� ���� ���� �Ǵ� ���� �� ���� �۾����ִ� ��� ū �������� Ȧ�� ���� ���� ��� ���� ������ �� �� ����˴ϴ�.
		
		System.out.println();		
		double start3 = System.nanoTime();
		long c = IntStream.rangeClosed(0, 1_000_000_000)
		            .parallel()
		            .filter(i -> i % 2 == 0)
		            .count();
		double duration3 = (System.nanoTime() - start3) / 1_000_000;
		System.out.println("Got " + c + " in " + duration3 + " milliseconds");

//		The parallel version output:  //���� ����
//		Got 500000001 in 738.678448 milliseconds
//
//		The sequential version output:  // ��������
//		Got 500000001 in 1275.271882 milliseconds
		
		
		
//		����ϸ� ���� ��Ʈ���� �׻� ���� ��Ʈ������ ������ ���� ���� �ƴմϴ�.
//
//		�̰��� ���� ��Ʈ���� ����� ���������� ó���ϰ� ������ ���� �� �� ���ٴ� ����� �˾ƾ� �� ���� �߿��� �����Դϴ�.
//
//		�׷��� ������ ���� ����� ���� ���� �Ǵ� ���� ��Ʈ���� ����ҽñ⸦ ��� �� �� �ֽ��ϱ�?
//
//		������ �� ���� ��Ģ�Դϴ�.
//
//		���� ������ ������ ��� ���� ó���� ���� ���� ���� ���� ��Ʈ���� ���� �׻� �ּ��� �����Դϴ�.
//		���� ��Ʈ���� ����� ���� ���� ���� (�� : sorted ()) �� ���� ��� (�� : findFirst ()) �۾��� ���Ͻʽÿ�.
//		��� ����� ���� ��� �۾� (������ ������ ��� �۾� ���)�� �Ϲ������� ���� ��Ʈ���� ����Ͽ� �� ���� ������ �����մϴ�.
//		Ȯ������ ���� ��� ������ ��ġ ��ũ�� ������ Ȯ���Ͻʽÿ�.
		
		
		
	}

}
