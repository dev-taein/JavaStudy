package examp01;

public class FunctionEx1 {

	public static void main(String[] args) {
//		Function = ������ = �ٸ� ������ ����� �����Ѵ�.
//		�������̽� ���� ����� ������ �����ϴ�.
//
//		@FunctionalInterface
//		public interface Function<T, R> {
//		     R apply(T t);
//		     // Other default and static methods
//		     // ...
//		}
//
//		���� ��� ������ (�޼��� ����)�� ������ �����ϴ�.
//		T -> R
		
		
		
		
//		��� ���� :
//			void round(double d, Function<Double, Long> f) {
//			     long result = f.apply(d);
//			     System.out.println(result);
//			}
//
//			������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//			round(5.4, new Function<Double, Long>() {
//			     Long apply(Double d) {
//			         return Math.round(d);
//			     }
//			});
//
//			�׸��� ���� ������ :
//
//			round(5.4, d -> Math.round(d));
//
//			�� �������̽����� ������ ���� �⺻ �޼��嵵 �ֽ��ϴ�.
//
//			default <V> Function<V,R> compose(
//			         Function<? super V,? extends T> before)
//			default <V> Function<T,V> andThen(
//			         Function<? super R,? extends V> after)
//		�� ����� ������ compose�� �Ű� ������ ��Ÿ���� �Լ��� ���� �����ϰ� �� ����� �ٸ� �Լ��� ���� �Է� �������Ѵٴ� ���Դϴ�. 
//		andThen���� �޼��带 ȣ���ϴ� �Լ��� �����ϰ� �� ����� �Ű� ������ ��Ÿ���� �Լ��� �Է����� �۵��մϴ�.
		
//		���� ��� :
//
//			Function<String, String> f1 = s -> {
//			     return s.toUpperCase();
//			};
//			Function<String, String> f2 = s -> {
//			     return s.toLowerCase();
//			};
//			 System.out.println(f1.compose(f2).apply("Compose"));
//			System.out.println(f1.andThen(f2).apply("AndThen"));
//
//			����� ������ �����ϴ�.
//			COMPOSE
//			andthen
//			ù ��° ��� f1�� ���� �� ������ ����Դϴ�.
//			�� ��° ��쿡�� f2�� ���������� ����Ǵ� �Լ��Դϴ�.
//		���� static����� �ֽ��ϴ�.
//
//		static <T> Function<T, T> identity()
//
//		�׻� �Է� �μ��� ��ȯ�ϴ� �Լ��� ��ȯ�մϴ�.
//
//		�⺻ ������ ��� int, long�׿� ���� double������ ���� �������̽����� �� ���� ������ �ֽ��ϴ�.
//
//		�Լ��� ���׸� ������ ��ȯ�ϰ� �⺻ �μ��� ������ ��Ÿ ���� ���� �������̽� �̸��� XXXFunction �Դϴ�. ���� ��� ������  IntFunction�����ϴ�.
//		@FunctionalInterface
//		public interface IntFunction<R> {
//		     R apply(int value);
//		}
//		�Լ��� �⺻ ������ ��ȯ�ϰ� �Ϲ� �μ��� ������ ��Ÿ ���� ���� �������̽��� �̸��� ToXXXFunction �Դϴ�. ���� ��� ������ ToIntFunction�����ϴ�.
//		@FunctionalInterface
//		public interface ToIntFunction<T> {
//		     int applyAsInt(T value);
//		}
//		�Լ��� �⺻ �μ��� ����ϰ� �ٸ� �⺻ ������ ��ȯ ���� ��Ÿ ���� ���� �������̽��� �̸��� XXXToYYYFunction�Դϴ� . ���⼭ XXX �� �μ� �����̰� YYY �� ��ȯ �����Դϴ�. ���� ��� ������  IntToDoubleFunction�����ϴ�.
//		@FunctionalInterface
//		public interface IntToDoubleFunction {
//		     double applyAsDouble(int value);
//		}
//		�̷��� �������̽��� ���Ǹ����� ���̸�, ���� ��� ������Ƽ��� ���� �۾��ϱ����� ���Դϴ�.
//
//		DoubleFunction<R>��ſ� Function<Double, R>
//		ToLongFunction<T>����� Function<T, Long>
//		IntToLongFunction���Function<Integer, Long>
		
		
		
		
		
		
		
		
		
		
	}

}
