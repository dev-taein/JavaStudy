package examp03;

public class MappingEx1 {

	public static void main(String[] args) {
//		�߰����� 
//		����(Mapping)�� ���� �߰� ����
//		[Stream<T>�� map�ø��� �޼ҵ��] 1:1����
//		������ 3���� ��Ʈ�� 3 5 6�� �ϳ��� String�� 3(int)���� ����, 5�ϳ��� String�� 5(int)�� ����, �̷��� �ϳ��� �ϳ��� 1:1����
		
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper)
//		IntStream mapToInt(ToIntFunction<? super T> mapper)
//		LongStream mapToLong(ToLongFunction<? super T> mapper)   //��ȯ���� Long
//		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) //��ȯ���� Double
		
//		[Stream<T>�� flatMap�ø��� �޼ҵ��] 1:*����
//		�ϳ��� Ÿ���� �������� �����ؼ� 1:*����
		
//		<R> Stream<R> flatMap(Function<T, Stream<R>> mapper)
//		IntStream flatMapToInt(Function<T, IntStream<R>> mapper)
//		LongStream flatMapToLong(Function<T, LongStream<R>> mapper) 
//		DoubleStream flatMapToDouble(Function<T, DoubleStream<R>> mapper) 
//		flatMap�� ������ ���ٽĿ����� '��Ʈ���� �����ϰ� �̸� ��ȯ'
	}

}
