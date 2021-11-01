package examp01;

public class BinaryOperatorEx1 {

	public static void main(String[] args) {
//		BinaryOperator
//		�� �������̽��� BiFunction�μ��� ����� ������ ������ �� �������̽� �� ����ȭ�Դϴ� (����� �������̽��� ���⿡�� Ȯ�� ��).
//
//		�������̽� ���� ����� ������ �����ϴ�.
//		@FunctionalInterface
//		public interface BinaryOperator<T>
//		             extends BiFunction<T,T,T> {
//		     // Two static method are defined
//		}
//
//		���� ��� ������ (�޼��� ����)�� ������ �����ϴ�.
//		(T, T) -> T
//
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//		BinaryOperator<String> binOp =  new BinaryOperator<String>() {
//		     @Override
//		     public String apply(String t, String u) {
//		         return t.concat(u);
//		     }
//		};
//		System.out.println(binOp.apply("Hello", " there"));
//
//		�׸��� ���� ������ :
//		BinaryOperator<String> binOp = (t, u) -> t.concat(u);
//		System.out.println(binOp.apply("Hello", " there"));
//
//		�� �������̽��� �������̽��� �⺻ �޼ҵ带 ����մϴ� BiFunction.
//		default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after)
//
//		�׸��� �� ���� ���ο� static����� ���� �մϴ�.
//		static <T> BinaryOperator<T> minBy(
//		                  Comparator<? super T> comparator)
//		static <T> BinaryOperator<T> maxBy(
//		                  Comparator<? super T> comparator)
//
//		�̴� BinaryOperator�����ȿ� ���� �� ��� �� �� �۰ų� ū ���� ��ȯ�ϴ� a �� ��ȯ�մϴ� Comparator.
//		������ ������ ���Դϴ�.
//
//		BinaryOperator<Integer> biOp =
//		             BinaryOperator.maxBy(Comparator.naturalOrder());
//		System.out.println(biOp.apply(28, 8));
//
//		���ôٽ��� �̷��� �޼���� Comparator.
//		Comparator.naturalOrder()��ü�� �ڿ������� ������ Comparator���ϴ¸� ��ȯ�մϴ� Comparable. �װ��� �����ϱ� ���� �츮 apply()�� BinaryOperator. 
//		�翬�� ����� ������ �����ϴ�.
//		28
//
//		int, long���� �⺻ ������ �ֽ��ϴ� double. ���⼭ �� �μ��� ��ȯ ������ ������ �⺻ �����Դϴ�. BinaryOperator�Ǵ� ���� Ȯ����� �ʽ��ϴ� BiFunction.
//		���� ���, ������ �����Դϴ� IntBinaryOperator.
//		@FunctionalInterface
//		public interface IntBinaryOperator {
//		     int applyAsInt(int left, int right);
//		}
//		��� ����� �� �ֽ��ϴ� BinaryOperator.
	}

}
