package examp01;

public class DataSearchEx1 {

	public static void main(String[] args) {
//		Data Search ������ �˻�
//		�̰��� ��� ���� �۾�
//		Find�� �����ϴ� ��� :
//			Optional<T> findAny()
//			Optional<T> findFirst()
//		�׸��� Match�� ������ �޼��� :
//			boolean allMatch(Predicate<? super T> predicate)
//			boolean anyMatch(Predicate<? super T> predicate)
//			boolean noneMatch(Predicate<? super T> predicate)
		
//		findAny () �� findFirst ()
//		findAny()�׸��� findFirst()���������� �Ȱ���, ��Ʈ������ ã�� ù ��° ��Ҹ� ��ȯ�մϴ�.
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		stream.findFirst()
		    .ifPresent(System.out::println); // 1

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		stream2.findAny()
		    .ifPresent(System.out::println); // 1

//		��Ʈ���� ��� ������ ����ִ� ���� ��ȯ�մϴ� Optional.
		Stream<String> stream = Stream.empty();
		System.out.println(
		    stream.findAny().isPresent()
		); // false

//		���� �̷��� �޼��带 �ٸ� ��Ʈ�� �۾��� ���� �� �� �ֽ��ϴ�.
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		stream
		    .filter(i -> i > 4)
		    .findFirst()
		    .ifPresent(System.out::println); // 5
		
//		���� ��� findAny()�ϰ� ���� ��� findFirst()�մϱ�?  findAny()�� ���� ��Ʈ���� ����ϸ� ù��° ��Ҹ� ã�� ����.
//		���� ��Ʈ������ �۾� �� �� ù ��° ��Ҹ� ã�Ⱑ �� ��ƽ��ϴ�. �� ��� findAny()� ��Ұ� ��ȯ�Ǵ��� ���� �Ű� ���� �ʴ´ٸ� ��� �ϴ� ���� �����ϴ� .
		
		
		
		
		
//		anyMatch() ��Ʈ���� ��Ұ� �־��� ����� ��ġ�ϸ� true�� ��ȯ�մϴ�. ( �ϳ��� ��ġ�ϸ� true)
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream.anyMatch(i -> i%3 == 0)
		); // true

//		��Ʈ���� ��� �ְų� ��ġ�ϴ� ��Ұ����� ����� �޼���� false������ ��ȯ�մϴ� .
		IntStream stream = IntStream.empty();
		System.out.println(
		    stream.anyMatch(i -> i%3 == 0)
		); // false

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream2.anyMatch(i -> i%10 == 0)
		); // false

//		allMatch()��Ʈ���� ��� ��Ұ� �־��� ����� ��ġ�ϴ� ��쿡�� true�� �����մϴ� . (��� ��Ұ� ��ġ�ؾ���)
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream.allMatch(i -> i > 0)
		); // true

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream2.allMatch(i -> i%3 == 0)
		); // false

//		��Ʈ���� ��� �������� �޼���� �����ڸ� ������ �ʰ� TRUE �� ��ȯ �մϴ� .
		IntStream stream = IntStream.empty();
		System.out.println(
		    stream.allMatch(i -> i%3 == 0)
		); // true

//		noneMatch()�� �ݴ� �� allMatch()���� true�� ���� NONE ��Ʈ���� ��Ҵ� �־��� ���ǰ� ��ġ���� �ʽ��ϴٴ� :
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream.noneMatch(i -> i > 0)
		); // false

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream2.noneMatch(i -> i%3 == 0)
		); // false

		IntStream stream3 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream3.noneMatch(i -> i > 10)
		); // true

//		��Ʈ���� ��� �������� �޼���� �����ڸ� ������ �ʰ� TRUE �� ��ȯ �մϴ� .
		IntStream stream = IntStream.empty();
		System.out.println(
		    stream.noneMatch(i -> i%3 == 0)
		); // true
		
		
		
//		�� �ڵ带 ����Ͻʽÿ�.
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		boolean b = stream
		                 .filter(i -> {
		                     System.out.println("Filter:" + i);
		                     return i % 2 == 0; })
		                 .allMatch(i -> {
		                     System.out.println("AllMatch:" + i);
		                     return i < 3;
		                 });
		System.out.println(b);

//		����� ��� �� ���̶�� �����Ͻʴϱ�?
//		��� :
		Filter:1
		Filter:2
		AllMatch:2
		Filter:3
		Filter:4
		AllMatch:4
		false
//		�Ϻ� �۾������� ��ü ��Ʈ���� ó�� �� �ʿ䰡 �����ϴ�.
//		��Ʈ�� �۾��� ���������� ������� �ʽ��ϴ�
		
		Ű ����Ʈ
		Stream API���� �� ���� ������ �˻� �۾��� �ֽ��ϴ�. Find�� �����ϴ� ��� :
		Optional<T> findAny()
		Optional<T> findFirst()
		�׸��� Match�� ������ �޼��� :
		boolean allMatch(Predicate<? super T> predicate)
		boolean anyMatch(Predicate<? super T> predicate)
		boolean noneMatch(Predicate<? super T> predicate)
		�� ���� ��� TERMINAL ���� ���� ���� �˴ϴ�.
		findAny()�׸��� findFirst()������ �׵��� ��Ʈ������ �� ���ִ� ù ��° ��Ҹ� ��ȯ, ������ �۾��� ����. ��Ʈ���� ��� ������ �� Optional.
		���� ��Ʈ������ �۾� �� �� ù ��° ��Ҹ� ã�Ⱑ �� ��� �� �������� ��� findAny()� ��Ұ� ��ȯ�Ǵ��� ���� �Ű� ���� �ʴ� ��� ��� �ϴ� ���� �����ϴ� .
		anyMatch()��Ʈ���� ��Ұ� �־��� ����� ��ġ�ϸ� true�� �����մϴ�. ��Ʈ���� ��� �ְų� ��ġ�ϴ� ��Ұ� �������� ��ȯ�մϴ� false.
		allMatch()��Ʈ���� ��� ��Ұ� �־��� ����� ��ġ�ϴ� ��쿡�� true�� �����մϴ� .
		noneMatch()��쿡 true�� ���� NONE ��Ʈ���� ��Ҵ� �־��� ���ǰ� ��ġ���� �ʽ��ϴ�.
		�� �� allMatch()�� ��Ʈ���� ��� ������ noneMatch()��ȯ true�մϴ�.
		�̷��� �۾��� ��� �ܶ��Ǿ� ����� �߰ߵǸ� �򰡰� �����˴ϴ�.
		
	}

}
