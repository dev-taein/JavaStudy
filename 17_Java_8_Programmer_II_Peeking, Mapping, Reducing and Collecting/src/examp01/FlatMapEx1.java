package examp01;

public class FlatMapEx1 {

	public static void main(String[] args) {
//		flatMap() ��Ʈ���� ��Ҹ� �ϳ��� (��) ��Ʈ������ "��źȭ"(�Ǵ� ����)�ϴ� �� ���˴ϴ�.
		<R> Stream<R> flatMap(Function<? super T,
		                       ? extends Stream<? extends R>> mapper)

		DoubleStream flatMapToDouble(Function<? super T,
		                       ? extends DoubleStream> mapper)

		IntStream flatMapToInt(Function<? super T,
		                       ? extends IntStream> mapper)

		LongStream flatMapToLong(Function<? super T,
		                       ? extends LongStream> mapper)

//		flatMap()���� ����ϴ� �Լ��� null�� ��ȯ�ϸ� ��� �� ��Ʈ���� ��ȯ�˴ϴ�.
//		�̰��� ��� �۵��ϴ��� ���ô�. ���� ������ִ� ��� :
		List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
		List<Character> eToG = Arrays.asList('e', 'f', 'g');
		Stream<List<Character>> stream = Stream.of(aToD, eToG);

//		�׸��� �츮�� ��� ���ڸ� int ǥ������ ��ȯ�Ϸ����մϴ�. 
//		�츮���ؾ� �� ���� ����� ��Ҹ� �ϳ��� ��Ʈ������ ������ ���� �� ���ڸ� int�� ��ȯ�ϴ� ���Դϴ�. �������� "����"�κ��� flatMap ()���ϴ� ���Դϴ�.
		stream
		    .flatMap(l -> l.stream())
		    .map(c -> (int)c)
		    .forEach(i -> System.out.format("%d ", i));
//		������ �ڵ�� ������ ��� �� �� �ֽ��ϴ�.
		97 98 99 100 101 102 103

//		�̷����ϸ� flatMap ()�� ����Ͽ� Stream <List <T >>�� Stream <T>�� ��ȯ �� �� �ֽ��ϴ�.
		
//		flatMap () ������ peek ()�� ����ϸ� ��Ұ� ó���Ǵ� ����� ��Ȯ�� �� �� �ֽ��ϴ�.
		stream
		    .flatMap(l -> l.stream())
		    .peek(System.out::print)
		    .map(c -> (int)c)
		    .forEach(i -> System.out.format("%d ", i));
//		��¿��� �� �� �ֵ���, ��ȯ �� ��Ʈ�� flatMap()�� ��ġ ��� ��� ��Ʈ���� �ƴ� ���� ��� ��Ʈ������ �۾��ϴ� ��ó�� ������ ������ ���� ���޵˴ϴ�.
//		a97 b98 c99 d100 e101 f102 g103

//		�� ��� ��� map () �� flatMap ()�� ��Ʈ���� ��ȯ�մϴ�. map ()�� Stream <Integer>�� ��ȯ�ϰ� flatMap ()�� Stream <Character>�� ��ȯ�մϴ�.

//		�� ��� ��� map () �� flatMap ()�� Function�� �μ��� ������ �� �� Function���� �ٸ� �Ű� ������ �ֽ��ϴ�. 
//		Function<Character, Integer> and Function<List<Character>, Stream<? extends Character>>�� ���� Ȯ���մϴ�.
	}

}
