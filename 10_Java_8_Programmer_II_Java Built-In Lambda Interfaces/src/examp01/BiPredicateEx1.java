package examp01;

public class BiPredicateEx1 {

	public static void main(String[] args) {
//		BiPredicate
//		�� �������̽��� �� ���� �μ��� ����ϴ� ��� ��Ÿ���ϴ�.
		
//		@FunctionalInterface public interface BiPredicate<T, U> {
//		     boolean test(T t, U u);
//		     // Default methods are defined also
//		}
//
//		���� ��� ������ (�޼��� ����)�� ������ �����ϴ�.
//		(T, U) -> boolean
//
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//		BiPredicate<Integer, Integer> divisible =
//		         new BiPredicate<Integer, Integer>() {
//		     @Override
//		     public boolean test(Integer t, Integer u) {
//		         return t % u == 0;
//		     }
//		};
//		boolean result = divisible.test(10, 5);
//
//		�׸��� ���� ������ :
//		BiPredicate<Integer, Integer> divisible =
//		        (t, u) -> t % u == 0;
//		boolean result = divisible.test(10, 5);
		
		
		
//		�� �������̽��� Predicate �������̽��� ������ �⺻ �޼ҵ带 ���������� �� ���� �μ��� ����մϴ�.
//
//		default BiPredicate<T, U> and(
//		         BiPredicate<? super T, ? super U> other)
//		default BiPredicate<T, U> or(
//		         BiPredicate<? super T, ? super U> other)
//		default BiPredicate<T, U> negate()
//
//		�� �������̽����� �⺻ ����(primited)�� �����ϴ�. ,, �� �⺻��Ÿ���� ���Ѵ�. int, long, boolean��
		
		
	}

}
