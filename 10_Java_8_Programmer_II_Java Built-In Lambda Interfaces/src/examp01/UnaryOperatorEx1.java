package examp01;

public class UnaryOperatorEx1 {

	public static void main(String[] args) {
//		���� ������ UnaryOperator
		
//		�������̽� ���� ����� ������ �����ϴ�.
//
//		@FunctionalInterface
//		public interface UnaryOperator<T>
//		         extends Function<T, T> {
//		     // Just the identity
//		     // method is defined
//		}
//
//		���� ��� ������ (�޼��� ����)�� ������ �����ϴ�.
//		T -> T
//
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//
//		UnaryOperator<String> uOp = new UnaryOperator<String>() {
//		     @Override
//		public String apply(String t) {
//		         return t.substring(0,2);
//		     }
//		};
//		System.out.println(uOp.apply("Hello"));
//		�׸��� ���� ������ :
		//UnaryOperator<String> uOp = t -> t.substring(0,2);
		//System.out.println(uOp.apply("Hello"));
		
//		�� �������̽��� �������̽��� �⺻ �޼ҵ带 ����մϴ� Function.
//		default <V> Function<V,R> compose(
//		         Function<? super V,? extends T> before)
//		default <V> Function<T,V> andThen(
//		         Function<? super R,? extends V> after)
//
//		�׸����� �������̽��� ���� static�޼��� identity()�� �����մϴ� ( static�޼��尡 ��ӵ��� �ʱ� ������ ) :
//		static <T> UnaryOperator<T> identity()
		
		
//		��, �ٽ� ǥ�� UnaryOperator�׻� �Է� �μ��� ��ȯ�մϴ�.
//
//		�� ������ ������ ���� int, long�� double. �׵��� UnaryOperator.
//		���� ���, ������ �����Դϴ� IntUnaryOperator.
//		@FunctionalInterface
//		public interface IntUnaryOperator {
//		     int applyAsInt(int value);
//		         // Definitions for compose, andThen, and identity
//		}
//
//		���� ������ ����ϴ� ��� :
//		int[] a = {1,2,3,4,5,6,7,8};
//		int sum = sumNumbers(a, t -> t * 2);
//		//...
//		int sumNumbers(int[] a, UnaryOperator<Integer> unary) {
//		         int sum = 0;
//		         for(int i : a) {
//		                 sum += unary.apply(i);
//		         }
//		         return sum;
//		}
//
//		����� ����� ���ִ�:
//		int[] a = {1,2,3,4,5,6,7,8};
//		int sum = sumNumbers(a, t -> t * 2);
//		//...
//		int sumNumbers(int[] a, IntUnaryOperator unary) {
//		         int sum = 0;
//		         for(int i : a) {
//		                 sum += unary.applyAsInt(i);
//		         }
//		         return sum;
//		}
		
		
		
		
		
		
		
	}

}
