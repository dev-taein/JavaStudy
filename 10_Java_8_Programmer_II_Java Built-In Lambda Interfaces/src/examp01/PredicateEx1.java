package examp01;

public class PredicateEx1 {

	public static void main(String[] args) {
//		Predicate����� �������̽���
//		�� �Ǵ� ������ �� ���ִ� ��ɹ��Դϴ�.
//		@FunctionalInterface
//		public interface Predicate<T> {
//		    boolean test(T t);  
//		    // Other default and static methods
//		    // ...
//		}
//		������ T��  T -> boolean�� ���Ѵ�.
		
		
		
		
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//
//		Predicate<String> startsWithA = new Predicate<String>() {
//		    @Override
//		    public boolean test(String t) {
//		        return t.startsWith("A");
//		    }
//		};
//		boolean result = startsWithA.test("Arthur");
//
//		�׸��� ���� ������ :
//
//		Predicate<String> startsWithA = t -> t.startsWith("A");
//		boolean result = startsWithA.test("Arthur");
//
//		�� �������̽����� ������ ���� �⺻ �޼��嵵 �ֽ��ϴ�.
//
//		default Predicate<T> and(Predicate<? super T> other)
//		default Predicate<T> or(Predicate<? super T> other)
//		default Predicate<T> negate()
//		�� AND �� OR �� �� ���� �� ��Ÿ���� ���� �� �����մϴ�.
		
//		 static����� �ֽ��ϴ�.
//		 static <T> Predicate<T> isEqual(Object targetRef)
//		Predicate�� �μ����� ���� ������ �� �׽�Ʈ �ϴ¸� ��ȯ�մϴ� Objects.equals(Object, Object)
		
//		���� ���, ������ �����Դϴ� IntPredicate.
//
//		@FunctionalInterface
//		public interface IntPredicate {
//		    boolean test(int value);
//		    // And the default methods: and, or, negate
//		}
//
//		���� ������ ����ϴ� ��� :
//
//		Predicate<Integer> even = t -> t % 2 == 1;
//		boolean result = even.test(5);
//
//		����� ����� ���ִ�:
//
//		IntPredicate even = t -> t % 2 == 1;
//		boolean result = even.test(5);
		
		
		
		
		
		
		
		
		
		
		
	}

}
