package examp01;

public class FilteringEx1 {

	public static void main(String[] args) {
//		Filtering
//		�÷��ǿ��� Ư�� ���ǰ� ��ġ���� �ʴ� ��Ҹ� ���͸� (�Ǵ� ����)�ϴ� ���Դϴ�.
		
//		�Ϲ������� ��ġ�ϴ� ��Ҹ� �ٸ� �÷��ǿ� �����Ͽ��� �۾��� �����մϴ�.
//		List<String> words = ...
//		List<String> nonEmptyWords = new ArrayList<String>();
//		for(String w : words) {
//		    if(w != null && !w.isEmpty()) {
//		        nonEmptyWords.add(w);
//		    }
//		}

//		����
//		�Ǵ� �ݺ��ڸ� ����Ͽ� �÷��� ��ü���� ��ġ���� �ʴ� ��Ҹ� �����մϴ� (�÷����� ���Ÿ� �����ϴ� ��쿡��).
//		List<String> words = new ArrayList<String>();
//		// ... (add some strings)
//		for (Iterator<String> it = words.iterator(); it.hasNext();) {
//		    String w = it.next();
//		    if (w == null || w.isEmpty()) {
//		        it.remove();
//		    }
//		}
		
//		Java 8���� Collection�������̽� �� ���ο� �޼ҵ尡 �ֽ��ϴ�.
//		default boolean removeIf(Predicate<? super E> filter) �־��� ��� �����ϴ� �÷����� ��� ��Ұ� ���ŵ˴ϴ�
//		�̷����ϸ� 	���� ���̳� �޼��� ������ ����Ͽ� �ڵ尡 �� ���� �����ϴ�.
		// Using an anonymous class
		words.removeIf(new Predicate<String>() {
		    public boolean test(String t) {
		        return t == null || t.isEmpty();
		    }
		});
		// Using a lambda expression
		words.removeIf(t -> t == null || t.isEmpty());
		
		
		
//		����		
//		��ġ�ϴ� ��Ҹ� �ٸ� �÷��ǿ� �����ϴ� ��� �������̽� filter�޼��尡 Stream�ֽ��ϴ�.
//		Stream<T> filter(Predicate<? super T> predicate)	�־��� �����ڸ� �����ϴ� ��ҷ� ������ �� ��Ʈ���� ��ȯ�մϴ�.
		
//		�� �޼���� ��Ʈ���� ��ȯ�ϹǷ� �߰� �۾��� ��Ÿ���� �⺻������ ���ϴ� ���� ���� �Ǵ� ��Ÿ �߰� �۾��� ������ �� �ֽ��ϴ�.
		List<String> words = Arrays.asList("hello", null, "");
		words.stream()
		    .filter(t -> t != null) // ["hello", ""]
		    .filter(t -> !t.isEmpty()) // ["hello"]
		    .forEach(System.out::println);
//		������ �ڵ带 ���� �� ����� ������ �����ϴ�.
		hello
		
//		��Ȯ���� ���� �޼��� ������ ����Ͽ� �Ϻ� Ŭ�������� �޼��带 ����ų� ���� �޼��带 ����� ���� �ֽ��ϴ�.
		class StringUtils {
		    public static boolean isNotNullOrEmpty(String s) {
		        return s != null && !s.isEmpty();
		    }
		}
		// ...
		List<String> words = Arrays.asList("hello", null, "");
		// Using an anonymous class
		words.stream()
		    .filter(new Predicate<String> () {
		        public boolean test(String t) {
		            return StringUtils.isNotNullOrEmpty(t);
		        }
		    })
		    .forEach(System.out::println);
		// Using a lambda expression
		words.stream()
		    .filter(t -> StringUtils.isNotNullOrEmpty(t))
		    .forEach(System.out::println);
		// Using a lambda expression
		words.stream()
		    .filter(StringUtils::isNotNullOrEmpty)
		    .forEach(System.out::println);
		
		
//		�ߺ�����
//		Stream�������̽��� ���� distinct�޴��־, ���� ��ҿ� �ߺ� ��� Object.equals(Object)���.
		Stream<T> distinct()
		
//		�ٽ� ��������, �� ��Ʈ���� ��ȯ�ϱ� ������ �̰��� �߰� �۾��Դϴ�. � ��Ұ� �ߺ��Ǵ��� �˾� ���� ���� ����� ���� �˾ƾ��ϹǷ��� �۾��� ���� �����Դϴ�.
//		���� ��� ������ �����ϴ�.
		List<String> words = Arrays.asList("hello", null, "hello");
		words.stream()
		    .filter(t -> t != null) // ["hello", "hello"]
		    .distinct() // ["hello"]
		    .forEach(System.out::println);
//		���� ����� ������ �����ϴ�.
		hello
		
		Ű ����Ʈ
		Java 8 Iterable���� �������̽��� ���� (��ϰ� ����)�� �ݺ��ϴ� �� �ٸ� �ɼ����� �������̽��� ���� �޼ҵ带 �߰��մϴ� .
		default void forEach(Consumer<? super T> action)
		���� ��� :
		List<String> words = Arrays.asList("hello", "world");
		words.forEach(t -> System.out.println(t));
		Stream�������̽����� ����� �ֽ��ϴ� :
		void forEach(Consumer<? super T> action)
		�̰��� �͹̳� �۾��Դϴ�. ���� ��� ������ �����ϴ�.
		Stream<String> words = Stream.of("hello", "world");
		words.forEach(t -> System.out:println(t));
		���� ��Ʈ�� ����� ������ ������ ���� �۾��� ������ �� �ִٴ� ���Դϴ�.
		words.sorted()
		    .limit(2)
		    .forEach(System.out::println);
		�׷��� �͹̳� �۾����� ������ ���� �۾��� ���� �� �� �����ϴ�.
		words.forEach(t -> System.out.println(t.length()));
		words.forEach(System.out::println);
		���͸��� ���� �÷��� ���鿡 ���ο� ����� �ֽ��ϴ�.
		default boolean removeIf(Predicate<? super E> filter)
		�׷��� �־��� ��� �����ϴ� �ݷ����� ��� ��Ұ� ���ŵ˴ϴ�.
		�� Stream�������̽�, �츮���� :
		Stream<T> filter(Predicate<? super T> predicate)
		�־��� �����ڸ� �����ϴ� ��ҷ� ������ �� ��Ʈ���� ��ȯ�մϴ�.
		�� �޼���� ��Ʈ���� ��ȯ�ϱ� ������ �߰� �۾��� ��Ÿ���Ƿ� ���ϴ� ���� ���� �Ǵ� ��Ÿ �߰� �۾��� ������ �� �ֽ��ϴ�.
		List<String> words = Arrays.asList("hello", null, "");
		words.stream()
		    .filter(t -> t != null) // ["hello", ""]
		    .filter(t -> !t.isEmpty()) // ["hello"]
		    .forEach(System.out::println);
		Stream�������̽������־, ���� ��ҿ� �ߺ� ���� ��� ���� Object.equals(Object)���.
		Stream<T> distinct()
		�̰��� �߰� �۾��̸�, � ��Ұ� �ߺ��Ǵ��� Ȯ���ϱ� ���� ����� ���� �˾ƾ��ϹǷ��� �۾��� ���� �����Դϴ�. ���� ��� ������ �����ϴ�.
		List<String> words = Arrays.asList("hello", null, "hello");
		words.stream()
		    .filter(t -> t != null) // ["hello", "hello"]
		    .distinct() // ["hello"]
		    .forEach(System.out::println);
		
		
		
		
		
	}

}
