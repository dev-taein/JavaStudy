package examp01;

public class StreammapEx1 {

	public static void main(String[] args) {
//		map()
//		map() ��Ʈ�� ����� �� �Ǵ� ������ ��ȯ�ϴ� �� ���˴ϴ�.
		<R> Stream<R> map(Function<? super T,? extends R> mapper)

		IntStream mapToInt(ToIntFunction<? super T> mapper)

		LongStream mapToLong(ToLongFunction<? super T> mapper)

		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)

//		���ôٽ��� map ()�� T ������ ��Ʈ�� ��Ҹ� ���� R�� ��ȯ�ϴ� Function�� ���Ͽ� �ش� ������ ��Ʈ���� ��ȯ�մϴ�.
		Stream.of('a', 'b', 'c', 'd', 'e')
		    .map(c -> (int)c)
		    .forEach(i -> System.out.format("%d ", i));
//		��� :
		97 98 99 100 101
		
//		�⺻ �������� ��ȯ�ϴ� ������ �ֽ��ϴ�. ���� ��� ������ �����ϴ�.
		IntStream.of(100, 110, 120, 130 ,140)
		    .mapToDouble(i -> i/3.0)
		    .forEach(i -> System.out.format("%.2f ", i));

//		��� :
		33.33 36.67 40.00 43.33 46.67
	}

}
