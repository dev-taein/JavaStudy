package examp01;

public class collectEx1 {

	public static void main(String[] args) {
//		collect()  =  ����
//		�� ������� �� ���� ������ �ֽ��ϴ�.
		<R,A> R collect(Collector<? super T,A,R> collector)

		<R> R collect(Supplier<R> supplier,
		              BiConsumer<R,? super T> accumulator,
		              BiConsumer<R,R> combiner)
//		ù ��° ������ Collectors Ŭ������ �̸� ���� �� collect�� ����ϴ� �ݸ� �� ��° ���������� ���� �� collect�� ���� �� �ֽ��ϴ�. 
//		���� ��Ʈ�� (�� : IntStream)������ ������ ������ collect () �� �ֽ��ϴ�.

//		collect ()�� ��Ʈ���� ��ҿ� ���� ���� ������ ���Ҹ� �����մϴ�. 
//		��, Collection �Ǵ� StringBuilder�� ���� ������ ���� ���� ������ ��ü�� ����մϴ�. �ݴ�� reduce ()�� �� ��Ҹ� �����Ͽ� ���ο� ��Ҹ� �����ϰ� ���� �Ұ����� ���Ҹ� ��Ÿ���ϴ�.

//		�׷��� �� ���� �μ��� ����ϴ� reduce () ������ �����ϹǷ� �� ���� �μ��� ����ϴ� �������� �����ϰڽ��ϴ�.

//		������ �� �� �ֵ��� ���� �����̳� (�����)�� ���� ��ü�� ��ȯ�ϰ� �������� ��ȯ�Ǵ� Supplier�� �����ɴϴ�.

//		�� ��° �Ű� ������ �߰� �� container�� ��Ҹ� ����ϴ� ����� �Լ��Դϴ�.

//		�� ��° �Ű� ������ �߰� ����� ���� ����� �����ϴ� ���ձ� �Լ��Դϴ� (���� ��Ʈ������ �۾� �� �� ������).
		
//		�� ���� collect()�� ������ �����մϴ�.
		R result = supplier.get();
		for (T element : stream) {
		    accumulator.accept(result, element);
		} 
		return result;
		
		
		
//		���� ��� ��Ʈ���� ��� ��Ҹ����� "reduce"�ϰų� "collect"�Ϸ��� ���� List�� ���� �� �� �ֽ��ϴ�.

		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           () -> new ArrayList<>(),// container �����
		           (l, i) -> l.add(i), // Adding an element
		           (l1, l2) -> l1.addAll(l2) // ��� ����
		        );
		
//		�μ� ������ �߰��Ͽ� �� ��Ȯ�ϰ� ���� �� �ֽ��ϴ�.
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           () -> new ArrayList<>(),
		           (List<Integer> l, Integer i) -> l.add(i),
		           (List<Integer> l1, List<Integer> l2) -> l1.addAll(l2)
		        );

//		�Ǵ� �޼��� ������ ����� ���� �ֽ��ϴ�.
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           ArrayList::new,
		           ArrayList::add,
		           ArrayList::addAll
		        );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
