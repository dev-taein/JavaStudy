package examp01;

public class BiFunctionEx1 {

	public static void main(String[] args) {
//		BiFunction
//		�� �������̽��� �ٸ� ������ �� �μ��� ����ϰ� �ٸ� ������ ����� �����ϴ� �Լ��� ��Ÿ���ϴ�.
//
//		�������̽� ���� ����� ������ �����ϴ�.
//		@FunctionalInterface
//		public interface BiFunction<T, U, R> {
//		     R apply(T t, U u); // Other default and static methods
//		     // ...
//		}
//
//		���� ��� ������ (�޼��� ����)�� ������ �����ϴ�.
//		(T, U) -> R
//
//		��� ���� :
//		void round(double d1, double d2, BiFunction<Double, Double, Long> f) {
//		         long result = f.apply(d1, d2);
//		         System.out.println(result);
//		}
//
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//		round(5.4, 3.8, new BiFunction<Double, Double, Long>() {
//		         Long apply(Double d1, Double d2) {
//		                 return Math.round(d1 + d2);
//		         }
//		});
//
//		�׸��� ���� ������ :
//		round(5.4, 3.8, (d1, d2) -> Math.round(d1, d2));
//
//		�� �޸��� �������̽� Function���� �⺻ �޼��尡 �ϳ��� �ֽ��ϴ�.
//		default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after)
//		andThen�Է¿� ȣ���ϴ� �Լ��� ���� �����ϰ� ���������� �μ��� ��Ÿ���� �Լ��� ����� �����ϴ� ������ �Լ��� ��ȯ�մϴ� .
//		�� �������̽����� Function. �װ��� ���� �μ� �� ��ȯ ���� �Ϲ����� ���� �ɸ� ������ int, long�׸��� double��� ��Ģ�Ƿ�, �⺻ ������ ToXXXBiFunction XXX�� ���� ���̴�.
//		���� ���, ������ �����Դϴ� ToIntBiFunction.
//		@FunctionalInterface
//		public interface ToIntBiFunction<T, U> {
//		     int applyAsInt(T t, U u);
//		}
//
//		�� ��ü�մϴ� BiFunction.
	}

}
