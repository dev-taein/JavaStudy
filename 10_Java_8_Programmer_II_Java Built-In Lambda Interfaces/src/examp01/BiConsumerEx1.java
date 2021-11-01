package examp01;

public class BiConsumerEx1 {

	public static void main(String[] args) {
//		BiConsumer
//		�� �������̽��� �� ���� �μ��� ����ϰ� ����� ��ȯ���� �ʴ� �Һ��ڸ� ��Ÿ���ϴ�.
//
//		�������̽� ���� ����� ������ �����ϴ�.
//		@FunctionalInterface
//		public interface BiConsumer<T, U> {
//		     void accept(T t, U u);
//		     // andThen default method is defined
//		}
//
//		���� ��� ������ (�޼��� ����)�� ������ �����ϴ�.
//		(T, U) -> void
//
//		������ �͸� Ŭ������ ����ϴ� ���Դϴ�.
//		BiConsumer<String, String> consumeStr =
//		         new BiConsumer<String, String>() {
//		     @Override
//		     public void accept(String t, String u) {
//		         System.out.println(t + " " + u);
//		     }
//		 };
//		consumeStr.accept("Hi", "there");
//
//		�׸��� ���� ������ :
//		BiConsumer<String> consumeStr =
//		            (t, u) -> System.out.println(t + " " + u);
//		consumeStr.accept("Hi", "there");
//
//		�� �������̽����� ������ ���� �⺻ ����� �ֽ��ϴ�.
//		default BiConsumer<T, U> andThen(
//		             BiConsumer<? super T, ? super U> after)
//		�� �޼���� �Һ����� �۾��� �Ű� ������ �۾��� ������� �����ϴ� ������ BiConsumer�� ��ȯ�մϴ�.
//		�Һ����� ���� ���������� �̷��� �޼���� BiConsumer�� �����ϰ� �ڵ带 �� �б� ���� ����� �� �����մϴ�. ���� ��� ������ �����ϴ�.
//		BiConsumer<String, String> first = (t, u) -> System.out.println(t.toUpperCase() + u.toUpperCase());
//		BiConsumer<String, String> second = (t, u) -> System.out.println(t.toLowerCase() + u.toLowerCase());
//		first.andThen(second).accept("Again", " and again");
//
//		����� ������ �����ϴ�.
//		AGAIN AND AGAIN again and again
		
		
		
//		�� ������ ������ ���� int, long�� double. �׵������� Ȯ������ �ʰ� BiConsumer�� ints �� ���ϴ� ��� , 
//		���� ��� �ϳ��� ��ü�� ���� ���� �� ��° �μ��� ����մϴ�. ���� ��� ��Ģ�� ObjXXXConsumer�� ����˴ϴ� . 
//		���⼭ XXX �� �⺻ �����Դϴ�. ���� ���, ������ �����Դϴ� ObjIntConsumer.

//		@FunctionalInterface
//		public interface ObjIntConsumer<T> {
//		     void accept(T t, int value);
//		}
//
//		���� ������ ����ϴ� ��� :
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, (t, i) -> System.out.println(t + i));
//		//...
//		void printList(int[] a, BiConsumer<String, Integer> c) {
//		    for(int i : a) {
//		        c.accept("Number:", i);
//		    }
//		}
//
//		����� ����� ���ִ�:
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, (t, i) -> System.out.println(t + i));
//		//...
//		void printList(int[] a, ObjIntConsumer<String> c) {
//		    for(int i : a) {
//		        c.accept("Number:", i);
//		    }
//		}
	}

}
