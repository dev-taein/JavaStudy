package examp01;

public class ConsumerEx1 {

	public static void main(String[] args) {
//		Consumer �Һ��� = �Ű����� �ְ� ���ϰ��� ����.
		
//		@FunctionalInterface
//		public interface Consumer<T> {
//		     void accept(T t);
//		     // And a default method
//		     // ...
//		}
		
//		������ T�� T -> void
		
		
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//		Consumer<String> consumeStr = new Consumer<String>() {
//		     @Override
//		     public void accept(String t) {
//		         System.out.println(t);
//		     }
//		};
//		consumeStr.accept("Hi");
//
//		�׸��� ���� ������ :
//		Consumer<String> consumeStr = t -> System.out.println(t);
//		consumeStr.accept("Hi");
//
//		�� �������̽����� ������ ���� �⺻ ����� �ֽ��ϴ�.
//		default Consumer<T> andThen(Consumer<? super T> after)
		
		
//		Consumer<String> first = t ->
//        System.out.println("First:" + t);
//        Consumer<String> second = t ->
//        System.out.println("Second:" + t);
//		first.andThen(second).accept("Hi");
//		
//		����� ������ �����ϴ�.
//		
//		First: Hi
//		Second: Hi
		
		
		
//		������ �����Դϴ� IntConsumer.
//		@FunctionalInterface
//		public interface IntConsumer {
//		     void accept(int value);
//		     default IntConsumer andThen(IntConsumer after) {
//		         // ...
//		     }
//		}
//
//		���� ������ ����ϴ� ��� :
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, t -> System.out.println(t));
//		//...
//		void printList(int[] a, Consumer<Integer> c) {
//		     for(int i : a) {
//		         c.accept(i);
//		     }
//		}
//
//		����� ����� ���ִ�:
//
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, t -> System.out.println(t));
//		//...
//		void printList(int[] a, IntConsumer c) {
//		     for(int i : a) {
//		         c.accept(i);
//		     }
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
