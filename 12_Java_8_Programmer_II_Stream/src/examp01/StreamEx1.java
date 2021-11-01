package examp01;

import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
//		������ ��
//		�л� ����� �ְ� ������ 90.0�̻��� �л��� �����ϰ� ���� ���� ������������ �����ϴ� ���� �䱸 �����̶�� �����մϴ� .
//		�̸� �����ϴ� �� ���� ����� ������ �����ϴ�.
//		List<Student> studentsScore = new ArrayList<Student>();
//		for(Student s : students) {
//		    if(s.getScore() >= 90.0) {
//		        studentsScore.add(s);
//		    }
//		}
//		Collections.sort(studentsScore, new Comparator<Student>() {
//		    public int compare(Student s1, Student s2) {
//		        return Double.compare(
//		           s1.getScore(), s2.getScore());
//		    }
//		});
//
//		��Ʈ���� ����ϴ� Java 8 ������ ���� �� �ſ� ��Ȳ�մϴ�.
//		List<Student> studentsScore = students
//		        .stream()
//		        .filter(s -> s.getScore() >= 90.0)
//		        .sorted(Comparator.comparing(Student::getScore))
//		        .collect(Collectors.toList());
		
		
		int[] nums = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(nums).count()); // It prints 1!
//		���� 1�� ������ ������
//		int�� ��ü�� �ƴϱ� ������ ��Ʈ���� �����ϱ� ���� ������ �޼��� Stream.of(T t)��
//		 ��Ʈ�� int[]�� ���������� �迭�� �ϳ��� ���޵ǹǷ� ����� �� ����� ��Ʈ��.
		// returns a stream of one element
//		static <T> Stream<T> of(T t)
		// returns a stream whose elements are the specified values
//		static <T> Stream<T> of(T... values)
		
		
//		�ذ��
		Integer[] nums = {1, 2, 3, 4, 5};
		// It prints 5!
		System.out.println(Stream.of(nums).count());
		
		
		int[] nums = {1, 2, 3, 4, 5};
		// It also prints 5!
		System.out.println(Arrays.stream(nums).count());
		
		
		int[] nums = {1, 2, 3, 4, 5};
		// It also prints 5!
		System.out.println(IntStream.of(nums).count());.

//		���� : Stream<T>.of()�� ������Ƽ��(�⺻��Ÿ��) �۾��� ������� ���ʽÿ� .
		
//		������ ��Ʈ���� �����ϴ� �ٸ� ����Դϴ�.
//		static <T> Stream<T> generate(Supplier<T> s)
//		Stream<T> limit(long maxSize) = �ִ���� ����
//		���� ��� :

			Stream<Double> s = Stream.generate(new Supplier<Double>() {
			    public Double get() {
			        return Math.random();
			    }
			}).limit(5);
//		�Ǵ�:
			Stream<Double> s = Stream.generate(() -> Math.random()).limit(5);

//			�ƴϸ� �׳� :
			Stream<Double> s = Stream.generate(Math::random).limit(5);
			
			
			
//			��Ҹ� �����ϴ� 1, 2, 4, 8, 16.
			Stream<Integer> s = Stream.iterate(1, new UnaryOperator<Integer>() {
			    @Override
			    public Integer apply(Integer t) {
			        return t * 2; }
			}).limit(5);

//			�ƴϸ� �׳� :
			Stream<Integer> s = Stream.iterate(1, t -> t * 2).limit(5);
			
			
			
			
			
			
			
//			Stream.Builder<T>�������� ��Ʈ���� ��Ҹ� �߰��ϴ� �޼ҵ尡 �ִ� Ŭ���� (���� ������ ������ ������)�� �ֽ��ϴ�.
			void accept(T t)
			default Stream.Builder<T> add(T t)

//			���� ��� :
			Stream.Builder<String> builder = Stream.<String>builder().add("h").add("e").add("l").add("l");
			builder.accept("o");
			Stream<String> s = builder.build();

//			IntStream�� LongStream����� �����մϴ� :
			static IntStream range(int startInclusive, int endExclusive)
			static IntStream rangeClosed(int startInclusive, int endInclusive)
			static LongStream range(long startInclusive, long endExclusive)
			static LongStream rangeClosed(long startInclusive, long endInclusive)
			// stream of 1, 2, 3
			IntStream s = IntStream.range(1, 4);
			// stream of 1, 2, 3, 4
			IntStream s = IntStream.rangeClosed(1, 4);
			
//			���� Java API���� ��Ʈ���� �����ϴ� ���ο� �޼ҵ尡 �ֽ��ϴ�. ���� ��� :
				IntStream s1 = new Random().ints(5, 1, 10);
//				1 (����)���� 10���� 5���� ���� int��  intStream�� ��ȯ�մϴ� .
				
				
//				���� ǥ���� Stream�߰� �۾��� ��Ÿ���� �������̽� �� �޼��尡 ���Ǿ� �ֽ��ϴ�.
���						����							���
Stream<T> distinct()	���� ����			���� �� ��ҷ� ������ ��Ʈ���� ��ȯ�մϴ�.(�ߺ�����)

Stream<T> filter(Predicate<? super T> predicate)	������	�־��� ���� �ڿ� ��ġ�ϴ� ����� ��Ʈ���� ��ȯ�մϴ�.

<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)	������	
������ ���� ����� �� ��ҿ� �����Ͽ� ���� �� �������� ��Ʈ���� ��ȯ�մϴ�. �� ���� ������ �ֽ��ϴ� int, long�׸��� double

Stream<T> limit(long maxSize)	���� ����	maxSize���� �� �� ���� �ʵ��� �߸� ��Ʈ���� ��ȯ�մϴ� .

<R> Stream<R> map(Function<? super T,? extends R> mapper)	������	������ �Լ����� ��Ʈ���� ��ҿ� ������ ����� ������ ��Ʈ���� �����մϴ�. 
�� ���� ������ �ֽ��ϴ� int, long�׸��� double������.

Stream<T> peek(Consumer<? super T> action)	������	�� ��Ʈ���� ��Ұ��ִ� ��Ʈ���� ��ȯ�Ͽ� �� ��ҿ� ���� ������ �۾��� �����մϴ�.

Stream<T> skip(long n)	���� ����	ó�� n ���� ��Ҹ� ������ ���� ��Ʈ���� ������ ��Ұ��ִ� ��Ʈ���� �����մϴ�.

Stream<T> sorted()	���� ����	����� �ڿ� ������ ���� ���� �� ��Ʈ���� ��ȯ�մϴ�.

Stream<T> sorted(Comparator<? super T> comparator)	���� ����	�����ȿ� ���� ���� �� ��Ʈ���� ��ȯ�մϴ� Comparator.

Stream<T> parallel()	N / A	���� �� ������ ��Ʈ���� ��ȯ�մϴ�.
Stream<T> sequential()	N / A	������ �� �ش� ��Ʈ���� ��ȯ�մϴ�.
Stream<T> unordered()	N / A	������ �������� ���� ������ ��Ʈ���� ��ȯ�մϴ�.


//����
int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
IntStream s = IntStream.of(digits);
long n = s.count();
System.out.println(s.findFirst()); // An exception is thrown


//����
int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
long n = IntStream.of(digits).count();
System.out.println(IntStream.of(digits).findFirst()); // OK
//���: 0


								//���� ǥ���� Stream������ �۾��� ��Ÿ���� �������̽� �� �޼��尡 ���Ǿ� �ֽ��ϴ�.
���																		���
boolean allMatch(Predicate<? super T> predicate)	�� ��Ʈ���� ��� ��Ұ� ������ ����� ��ġ�ϴ��� ���θ� �����մϴ�.
													��Ʈ���� ��� ������ true��ȯ�ǰ� ����� �򰡵��� �ʽ��ϴ�.
													
													
boolean anyMatch(Predicate<? super T> predicate)	�� ��Ʈ���� ��Ұ� ������ ����� ��ġ�ϴ��� ���θ� �����մϴ�.
													��Ʈ���� ��� ������ false��ȯ�ǰ� ����� �򰡵��� �ʽ��ϴ�.
													
													
boolean noneMatch(Predicate<? super T> predicate)	�� ��Ʈ���� ��Ұ� ������ ����� ��ġ���� �ʴ��� ���θ� �����մϴ�.
													��Ʈ���� ��� ������ true��ȯ�ǰ� ����� �򰡵��� �ʽ��ϴ�.
													
Optional<T> findAny()								Optional��Ʈ���� �Ϻ� ��Ҹ� �����ϴ� ��ȯ �մϴ�.

Optional<T> findFirst()								Optional�� ��Ʈ���� ù ��° ��Ҹ� �����ϴ¸� ���� �մϴ�.

<R,A> R collect(Collector<? super T,A,R> collector)	�� ����Ͽ��� ��Ʈ���� ��ҿ� ���� ���� ���� �۾��� �����մϴ� Collector.

long count()	�� ��Ʈ���� ��� ���� �����մϴ�.

void forEach(Consumer<? super T> action)			�� ��Ʈ���� �� ��ҿ� ���� �۾��� �����մϴ�.

void forEachOrdered(Consumer<? super T> action)		��Ʈ���� ���� �� �߻� �������ִ� ��� ��Ʈ���� �߻� �������� ��Ʈ���� �� ��ҿ� ���� �۾��� �����մϴ�.

Optional<T> max(Comparator<? super T> comparator)	�����ȿ� ������ ��Ʈ���� �ִ� ��Ҹ� ��ȯ�մϴ� Comparator.

Optional<T> min(Comparator<? super T> comparator)	�����ȿ� ������ ��Ʈ���� �ּ� ��Ҹ� ��ȯ�մϴ� Comparator.

T reduce(T identity, BinaryOperator<T> accumulator)	������ ID ���� ���� ���� �Լ��� ����Ͽ��� ��Ʈ���� ��Ҹ� ����ϰ� ��� �� ���� ��ȯ�մϴ�.

Object[] toArray()	�� ��Ʈ���� ��Ҹ� �����ϴ� �迭�� �����մϴ�.

<A> A[] toArray(IntFunction<A[]> generator)	������ ������ �Լ��� ����Ͽ� ��ȯ �� �迭�� �Ҵ��Ͽ��� ��Ʈ���� ��Ҹ� �����ϴ� �迭�� ��ȯ�մϴ�.

Iterator<T> iterator()	��Ʈ���� ��ҿ� ���� �ݺ��⸦ ��ȯ�մϴ�.

Spliterator<T> spliterator()	��Ʈ���� ��ҿ� ���� �����ڸ� ��ȯ�մϴ�.




�� ��Ʈ�� ������ ������ ���� ��� ���ڽ��ϴ�.

Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
    .map(str -> str.length())
    .filter(i -> i > 3)
    .limit(2)
    .forEach(System.out::println);

�� ����� ������ �����ϴ�.

���ڿ� ��Ʈ���� �����մϴ�.
�׷� ���� ��Ʈ���� ints �� ��Ʈ������ ��ȯ�մϴ� (�� ���ڿ��� ���̸� ��Ÿ��).
�׷� ���� 3���� ū ���̸� ���͸��մϴ�.
�׷� ���� ��Ʈ���� ó�� �� ��Ҹ� ���
������������ �� ��Ҹ� �μ��մϴ�.

//�� ��Ҹ� �ڼ��ϰ� �����
Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
.map(str -> {
    System.out.println("Mapping: " + str);
    return str.length();
})
.filter(i -> {
    System.out.println("Filtering: " + i);
    return i > 3;
})
.limit(2)
.forEach(System.out::println);

// ���
Mapping: sun
Filtering: 3
Mapping: pool
Filtering: 4
4
Mapping: beach
Filtering: 5
5

.limit(2)�� �ִ� ����� �����Ѵ�, �׷��� filter���� ���ڱ��̰� 3�̻��� pool�� beach�� �ش�ǹǷ� 4�� 5�� ��µȴ�.


// ����������
boolean anyMatch(Predicate<? super T> predicate)
boolean allMatch(Predicate<? super T> predicate)
boolean noneMatch(Predicate<? super T> predicate)
Optional<T> findFirst()
Optional<T> findAny()
//(��ġ�ϴ� ��Ҹ� ã�� ��� ��Ʈ�� ó���� ����� �ʿ䰡 ���� ������)

//������ ��Ʈ���� Ư���Դϴ�.
��Ʈ���� ���ٿ� �Ϻ��ϰ� �۵��մϴ�.
��Ʈ���� ��Ҹ� �������� �ʽ��ϴ�.
��Ʈ���� ������ �� �����ϴ�.
��Ʈ���� ���� �� �� �����ϴ�.
��Ʈ���� ��ҿ� ���� �ε��� �� �׼����� �������� �ʽ��ϴ�.
��Ʈ���� ���� ����ȭ �� �� �ֽ��ϴ�.
��Ʈ�� �۾��� ������ ��� �����˴ϴ�.



��Ʈ���� ����� ������� ���� ������ �ֽ��ϴ�. ���� �α��ִ� ���� ������ �����ϴ�.
//From an existing collection
List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
Stream<String> s1 = words.stream();

//From individual elements
Stream<String> s2 = Stream.of("hello", "hola", "hallo", "ciao");

//From an array
String[] words = {"hello", "hola", "hallo", "ciao"};
Stream<String> s3 = Stream.of(words);
//Stream<T>.of()������Ƽ��� �۾� �� ���� ������� ���ʽÿ� . ��� Arrays.stream�Ǵ��� �⺻ ������ ����Ͻʽÿ� Stream.
int[] nums = {1, 2, 3, 4, 5};
IntStream s1 = Arrays.stream(nums);
IntStream s2 = IntStream.of(nums);
map�Ǵ� filter�׻� �� ��Ʈ���� ��ȯ�ϴ� �߰� �۾� �� ���� �� ���� �� ���� ���� �۾� ���� ������ �����˴ϴ�. ��, �͹̳� �۾��� ȣ�� �� ������ ����˴ϴ�.
count�Ǵ� ���� �͹̳� �۾��� forEach�׻� ��Ʈ���� �ƴ� �ٸ� ���� ��ȯ�մϴ�.
�ܶ� �۾��� ����� ���� �� ������ �߰� �۾��� ó���ǵ����մϴ�.
�̷��� ������� ���� �� �ܶ� �۾����� ���� ��Ʈ���� ��� ��ҿ� ���� ��� �۾��� �������� ������ ����� �߷еǰų� ���� �� ������ ��Ʈ���� ����˴ϴ�.
	}

}
