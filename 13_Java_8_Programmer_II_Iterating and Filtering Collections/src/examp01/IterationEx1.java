package examp01;

public class IterationEx1 {

	public static void main(String[] args) {
//		�⺻���� �ݺ��� ����
//		List<String> words = ...
//				for(int i = 0; i < words.size(); i++) {
//				    System.out.println(words.get(i));
//				}
//
//				�Ǵ� �ݺ��ڸ� ����Ͽ� :
//
//				List<String> words = ...
//				for(Iterator<String> it = words.iterator(); it.hasNext();) {
//				    System.out.println(it.next());
//				}
//
//				�Ǵ� ���� for-each���� :
//				List<String> words = ...
//				for(String w : words) {
//				    System.out.println(w);
//				}
		
		
//		Java 8���� �����ϴ� for-each ������ ��������� �޼���
//		�̰��� �⺻ �����Դϴ�.
//		for (T t : this) {
//		    action.accept(t);
//		}
//		
//		�̸� ����Ϸ��� �͸� Ŭ������ ������ �� �ֽ��ϴ�.
//		List<String> words = ...
//		words.forEach(new Consumer<String>() {
//		    public void accept(String t) {
//		        System.out.println(t);
//		    }
//		});
		
//		�ش� �͸� Ŭ������ ���� ������ ��ȯ �� �� �ֽ��ϴ�.
//		words.forEach(t -> System.out.println(t));
//		�Ǵ��� Ư�� �������� �޼��� ���� :
//		words.forEach(System.out::println);
		
		
		
		
//		������ ���� �ڵ�� ��ȿ���� �ʽ��ϴ�.
		int max = 0;
		words.forEach(t -> {
		    // The following line won't compile, you can't modify max
		    max = Math.max(max, t.length());
		    System.out.println(t);
		});
		
		
//		For-each�޼���� ��Ʈ���� ��ȯ���� �����Ƿ� ���� �۾��� ��Ÿ���ϴ�.
//		�װ��� ����ϴ� ���� Iterable������ �ٸ��� �ʽ��ϴ� .
		Stream<String> words = ...
				// As an anonymous class
				words.forEach((new Consumer<String>() {
				    public void accept(String t) {
				        System.out.println(t);
				    }
				});
				// As a lamba expression
				words.forEach(t -> System.out.println(t));
				// As a method reference
				words.forEach(System.out::println)
		
		
//				���� ��Ʈ�� ����� ������ ������ ���� �۾��� ������ �� �ִٴ� ���Դϴ�.
				words.sorted()
				    .limit(2)
				    .forEach(System.out::println);
		
//				���� �۾����� ������ ���� �۾��� ���� �� �� �����ϴ�.
				words.forEach(t -> System.out.println(t.length()));
				words.forEach(System.out::println);
				
//				�Ǵ¿� ���� �� ȣ���� System.out.println�ϳ��� ���� ������ �����մϴ� .
				Consumer<String> print = t -> {
				    System.out.println(t.length());
				    System.out.println(t);
				};
				words.forEach(print);
				
//				��ȯ, �ߴ��� ����ϰų� �ݺ��� ��� ���� �� �� �����ϴ�.
//				break and continue�� ���� �ܺο��� ����� �� ���� ������ ������ ������ �����ϰ� 
//				foreach �޼��尡 �⺻������ ������ ���� ���� �� ���� �� �� ��ȯ�� �ǹ̰� �����ϴ�.
				for (T t : this) {
					   // Inside accept, return has no effect
					   action.accept(t);
					}
				
//				����� (���迡�� �ٷ��� �ʾұ� ������) Java 8�� ���� forEach �޼ҵ带 Map �������̽��� �߰��߽��ϴ�. ��
//				���� �ʿ��� Ű�� ���� �����Ƿ��� ���ο� �޼���� BiConsumer�� ����մϴ�.	
				default void forEach(BiConsumer<? super K,? super V> action)

//				�⺻ ������ ������ �����ϴ�.
				for (Map.Entry<K, V> entry : map.entrySet()) {
				    action.accept(entry.getKey(), entry.getValue());
				}
	}

}
