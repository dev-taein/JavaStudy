package examp01;

public class OptionalClassEx1 {

	public static void main(String[] args) {
//		OptionalŬ����
//		Null�� 1965�� tony Hoare�� ���ؼ� ALGOL W���� �Ұ��Ǿ����� ��ǻ�� ������ �־��� �Ǽ� �� �ϳ��� ���ֵȴ�.
		
//		����:
//		�� �ڵ�� ���� �߻��� ���ִ� ������ ���� �����ȴٸ� �̹� ���� �˰� ��� ���Դϴ�.
//		String summary = 
//		  book.getChapter(10)
//		          .getSummary().toUpperCase();
//
//		�� �ڵ��� ������ �̷��� �޼ҵ� �� �ϳ��� null������ ��ȯ�ϴ� ��� (�� : å�� 10 ��° ���̾��� ��� NullPointerException) 
//		��Ÿ�ӽ� ���α׷��� ���� �� �� (�ڹٿ��� ���� �Ϲ����� ����)�� �߻��Ѵٴ� ���Դϴ�.
//		�� ���ܸ� �����Ϸ��� ����ؾ��մϱ�?
//		�Ƹ��� ���� ���� ����� null. ���⿡ �� ���� ����� �ֽ��ϴ�.
//				String summary = "";
//				if(book != null) {
//				    Chapter chapter = book.getChapter(10);
//				    if(chapter != null) {
//				        if(chapter.getSummary() != null) {
//				          summary = chapter.getSummary()
//				                        .toUpperCase();
//				        }
//				    }
//				}
//		�� ������ ��ü�� null �� �� �ִ��� �� �� �����Ƿ� ��� ��ü������ ���� Ȯ���մϴ�. �и��� �̰��� �ּ��� �ذ�å�� �ƴմϴ�. �ǿ������� �ʰ� �������� �ջ��ŵ�ϴ�.
		
//		�� ������ �ذ��ϱ� ���� Java 8�� java.util.Optional<T>. �� Ŭ������ �ӹ� �� �������� �� null�� ĸ��ȭ �ϴ� ���Դϴ�.
//		class Chapter {
//		    private String summary;
//		    // Other attributes and methods
//		}
//		OptionalŬ���� �� ����� �� �ֽ��ϴ� .
//		class Chapter {
//		    private Optional<String> summary;
//		    // Other attributes and methods
//		}
		
		
//		������ Ŭ������ �ν��Ͻ��� ����� ����� ���� ���ڽ��ϴ�.
//		�� Optional��ü �� �������� ������ ����Ͻʽÿ�.
//		Optional<String> summary = Optional.empty();
		
//		of�� null�����Ѵ�.
//		Optional<String> summary = Optional.of("A summary");
		
//		ofNullable�� null����Ѵ�.
//		Optional<String> summary = Optional.ofNullable("A summary");
		
//		Optional�� �� �� ���ԵǾ� �ִ��� �˰� �ʹٸ� ������ ���� �� �� �ֽ��ϴ�.
//		if( summary.isPresent() ) {
//		    // Do something
//		}
		
////		�Ǵ� �� ������� ��Ÿ�� :
//			summary.ifPresent(s -> System.out.println(s));  //if(���࿡) ������ �ִٸ� �� ������ �����϶�
			// Or summary.ifPresent(System.out::println);
		
//		Optional�� ���� �������� :
//			String s = summary.get();
//		�׷����� �޼���� �� ���� ���Ե��� ���� java.util.NoSuchElementException��� �� throw Optional�ϹǷ� ifPresent() �޼��� �� ����ϴ� ���� �����ϴ� .
		
//		�Ǵ¿� Optional���� ���� �� ���𰡸� ��ȯ�Ϸ��� ��� ����� ���ִ� �ٸ� �� ���� �޼��尡 �ֽ��ϴ�.
//		String summaryOrDefault = summary.orElse("Default summary");
//		orElse () �޼���� Optional�� ������� �� �μ� (T �����̾���ϸ��� ��� ���ڿ��̾�� ��)�� ��ȯ�մϴ�. �׷��� ������ ĸ��ȭ �� ���� ��ȯ�մϴ�.
		
		
//		String summaryOrDefault =
//		        summary.orElseGet( () -> "Default summary" );
//		orElseGet()�޼���� Supplier<? extends T>�� ��� ���� �� ���� ��ȯ�ϴ� �μ��θ� ����մϴ� Optional. �׷��� ������ ĸ��ȭ �� ���� ��ȯ�մϴ�.
		
//		tring summaryOrException =
//		        summary.orElseThrow( () -> new Exception() );
//		 orElseThrow()�޼���� Supplier<? extends X>�� ����մϴ� ���⼭�� �� ��� X���� �� throw �� ���� �����Դϴ� Optional. �׷��� ������ ĸ��ȭ �� ���� ��ȯ�մϴ�.
		
//		��Ʈ��ó��,�� ������ Optional�⺻ ��ҿ� �۾��� ���� Ŭ���� OptionalInt, OptionalLong�׸��� OptionalDouble����� ����� ���ִ�, 
//		�׷��� OptionalInt����� Optional<Integer>:
//			OptionalInt optionalInt = OptionalInt.of(1);
//			int i = optionalInt.getAsInt();
		
		
//		filter()����� Optional�� ���� ���� �����ϰ�, Optional�� ���� �־��� ��ġ�ϴ� ���. �׷��� ������ �� ���� ��ȯ�˴ϴ�.
		String summaryStr =
		    summary.filter(s -> s.length() > 10).orElse("Short summary");
		
		
//		�� map()����� �Ϲ������� �� �������� �ٸ� �������� ��ȯ�ϴ� �� ���˴ϴ�. ���� ������ ������ ���� �����մϴ� Function< ? super T, ? extends U >. ���� ��� :
		int summaryLength = summary.map(s -> s.length()).orElse(0);

//		flapMap()����� ��� map()������,�� Ÿ���� �μ��� Function<? super T, Optional<U>>��� ���� �����ϴ� ���,
//		�� ��ȯ Optional������ �Լ��� �����Ͽ� �� ���. �׷��� ������ �� Optional.
		
		
		Ű ����Ʈ
		java.util.Optional<T>Ŭ������ ĸ��ȭ �� ���ִ� ��ü�� ��, �ɼ� ���� null.
		�� ���� �޼ҵ�� ǥ�õ˴ϴ� Optional.empty().
		Optionalwith �޼ҵ� �� ��ü�� ���� �� �� of()������ NullPointerException��ü�� �� ��� a �� �߻��մϴ� null.
		�޼��� �� �ƴ� ��� ������ ���� ���� �ν��Ͻ��� ofNullable()��ȯ�մϴ� . �׷��� ������ �� .
		OptionalnullOptional�� ���� �������� Optionalmethod�� ����Ͻʽÿ� get(). 
		�׷��� �� ���� ���Ե��� ���� java.util.NoSuchElementException��� a�� �߻� Optional�ϹǷ� �� �� �� ���� �� ��쿡�� ����Ǵ� �μ��� 
		ifPresent()a �� ����ϴ� �޼��� �� ����ϴ� ���� �����ϴ� .Consumer<T>Optional
		orElse()(��) �� ����� �μ��� �����ݴϴ� Optional���, �׷��� ������ ĸ��ȭ �� ���� ��ȯ�մϴ�.
		�� orElseGet()�޼���°� ��� Supplier���� �� ���� ��ȯ�ϴ� a �� ����մϴ� Optional. �׷��� ������ ĸ��ȭ �� ���� ��ȯ�մϴ�.
		�� orElseThrow()�޼���°� ��� Supplier���� �� ���ܸ� ��ȯ Optional�ϴ¸� ����մϴ�. �׷��� ������ ĸ��ȭ �� ���� ��ȯ�մϴ�.
		
		
	}

}
