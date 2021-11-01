package examp01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorandComparableEx1 {

	public static void main(String[] args) {
//		Comparator and Comparable(�񱳱� �� �� ����) 
		
//		Comparable�� ComepareTo(�μ���1��) �׸��� compareTo�ڿ� �� ���� ( A, B, C��)
//		Comparator�� Compare(�μ��� 2��), Comparing(�μ���1��)
		
		
		
//		�迭 �Ǵ� �÷����� �����ϱ� ���� Java�� �ſ� ������ �� ���� �������̽��� �����մϴ�.
		java.util.Comparator
		public interface Comparator<T> {
		    int compare(T obj1, T obj2);
		    // Other default and static methods ...
		}
//		
//		
		java.lang.Comparable
		public interface Comparable<T> {
		    int compareTo(T obj);
		}
		
		
		
		
//		Comparable ��ü�� ���� ���
		public class Computer implements Comparable<Computer> {
		    private String brand;
		    private int id;

		    public Computer(String brand, int id) {
		        this.brand = brand;
		        this.id = id;
		    }

		    // Let's compare first by brand and then by id
		    public int compareTo(Computer other) {
		        // Reusing the implementation of String
		        int result = this.brand.compareTo(other.brand);

		        // If the objects are equal, compare by id
		        if(result == 0) {
		            // Let's do the comparison "manually"
		            // instead of using Integer.valueOf(this.id).compareTo(other.id)
		            // or Integer.compare(this.id, other.id)
		            if(this.id > other.id) result = 1;
		            else if( this.id < other.id) result = -1;
		            // else result = 0;
		        }
		        return result;
		    }

		    // equals and compareTo must be consistent
		    // to avoid errors in some cases
		    public boolean equals(Object other) {
		        if (this == other) return true;
		        if (!(other instanceof Computer)) return false;
		        return this.brand.equals(((Computer) other).brand)
		            && this.id == ((Computer) other).id;
		    }

		    public static void main(String[] args) {
		        Computer c1 = new Computer("Lenovo", 1);
		        Computer c2 = new Computer("Apple", 2);
		        Computer c3 = new Computer("Dell", 3);
		        Computer c4 = new Computer("Lenovo", 2);

		        // Some comparisons
		        System.out.println(c1.compareTo(c1)); // c1 == c1
		        System.out.println(c1.compareTo(c2)); // c1 > c2
		        System.out.println(c2.compareTo(c1)); // c2 < c1
		        System.out.println(c1.compareTo(c4)); // c1 < c2
		        System.out.println(c1.equals(c4)); // c1 != c2

		        // Creating a list and sorting it
		        List<Computer> list = Arrays.asList(c1, c2, c3, c4);
		        Collections.sort(list);
		        list.forEach(
		           c -> System.out.format("%s-%d\n",c.brand,c.id)
		        );
		    }
		}
//		�� ���α׷��� �����ϸ� ������ ���� ��µ˴ϴ�.
		0
		11
		-11
		-1
		false
		Apple-2
		Dell-3
		Lenovo-1
		Lenovo-2
		
		
		
//		java.util.Comparator
		
//		���� ����� ������ �����ϴ�.
		int compare(T o1, T o2);
		
//		Computer���� ���� �� Ŭ������ ����Ͽ� Comparator���� ID���� ���� �� ���� �귣�庰�� �����ϴ¸� ���� �� ������ ��ȯ �� ���� ��Ģ�� ������ Comparable's ��
//		�����ϹǷ� ���� compareTo�޼��带 ����� �� �ֽ��ϴ� .
		Comparator<Computer> sortById =
			    new Comparator<Computer>() {
			        public int compare(Computer c1, Computer c2) {
			            int result = Integer.compare(c1.id, c2.id);
			            return result == 0
			                ? c1.brand.compareTo(c2.brand) : result;
			    }
			};

//			���� ������ Integer.compare(x, y)�����ϴ�.
			Integer.valueOf(x).compareTo(Integer.valueOf(y))

//			�� ���Ե� Comparator�Լ� �������̽��̹Ƿ� ���� Ŭ���� ��� ���� ���� ����� �� �ֽ��ϴ�.
			Comparator<Computer> sortById = (c1, c2) -> {
			    int result = Integer.compare(c1.id, c2.id);
			    return result == 0
			       ? c1.brand.compareTo(c2.brand) : result;
			}

//			���� ���� ���� ��Ͽ��� ����� �� :
			List<Computer> list = Arrays.asList(c1, c2, c3, c4);
			Collections.sort(list, sortById);
			list.forEach(
			   c -> System.out.format("%d-%s\n",c.id,c.brand)
			);

//			����� ������ �����ϴ�.
			1-Lenovo
			2-Apple
			2-Lenovo
			3-Dell
		
//			 Comparable��� �������̽��ε� ���ֵ����� Comparable�񱳵Ǵ� ��ü�� ���� ���� �� ������ ���� �ǹǷ� ���� ������ ���� ������� ���� ���Դϴ�.
			
			
			
//			�������̽��� �⺻ �� ���� �޼ҵ尡 ���� �� Java 8������ ������ Comparator���� �ڵ带 �ܼ�ȭ �ϴ� �� ������ �޼ҵ尡 �ֽ��ϴ� .

			Comparator<T>
			   Comparator.comparing(Function<? super T, ? extends U>)
			Comparator<T>
			   Comparator.comparingInt(ToIntFunction<? super T>)
			Comparator<T>
			   Comparator.comparingLong(ToLongFunction<? super T>)
			Comparator<T>
			   Comparator.comparingDouble(ToDoubleFunction<? super T>)
		
//			   Function���� ��ȯ �� ���� ����Ͽ� �����ϴ� �� ���� ��ü�� �Ӽ� ���� ��ȯ �ϴ� (���� ��)�� Comparator����մϴ� comparedTo(�⺻��ҷ� �۾� �� �� ������ Ȯ��).
//			   ���� ��� :
			   Comparator<Computer> sortById =
			             Comparator.comparing(c -> c.id);
//			   �Ǵ�:
			   Comparator<Computer> sortById =
			             Comparator.comparingInt(c -> c.id);
//			   ������ �����ϴ�.
			   Comparator<Computer> sortById = new Comparator<Computer>() {
			       public int compare(Computer c1, Computer c2) {
			           return Integer.valueOf(c1.id)
			                       .compareTo(Integer.valueOf(c2.id));
			       }
			   };
		
//			   �� �ٸ� ������ ����� thenComparing �� ������ ���� Comparators�ϴ� ���Դϴ� (�� static��� �� ��� �� �ƴ� ).
			   Comparator<T>
			       thenComparing(Comparator<? super T>)
			   Comparator<T>
			       thenComparing(Function<? super T, ? extends U>)
			   Comparator<T>
			       thenComparingInt(ToIntFunction<? super T>)
			   Comparator<T>
			       thenComparingLong(ToLongFunction<? super T>)
			   Comparator<T>
			       thenComparingDouble(ToDoubleFunction<? super T>)

//			   �̷����ϸ� Comparator������ ����Ͽ� ID���� ���� �� ���� �귣�庰�� ���� �ϴ� �ڵ带 �ܼ�ȭ �� �� �ֽ��ϴ� .
			   Comparator<Computer> sortByIdThenByBrand =
			           Comparator.comparing((Computer c) -> c.id)
			               .thenComparing(c -> c.brand);

//			   ���������� �⺻ �޼��� reversed()�� Comparator������ ������ �ݴ���ϴ¸� ����ϴ� Comparator.
			   List<Computer> list = Arrays.asList(c1, c2, c3, c4);
			   Collections.sort(list,
			       Comparator.comparing((Computer c) -> c.id).reversed());
			   list.forEach(
			       c -> System.out.format("%d-%s\n",c.id,c.brand));

//			   ��� :
			   3-Dell
			   2-Apple
			   2-Lenovo
			   1-Lenovo
		
		
		
		
//			   ��Ʈ�� ����
//			   ��Ʈ�� ������ �����մϴ�. ���
			   Stream<T> sorted()
//			   �ڿ� ������ ���� ���� �� ��Ұ��ִ� ��Ʈ���� ��ȯ�մϴ�. ���� ��� :
			   List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
			   list.stream()
			       .sorted()
			       .forEach(System.out::println);
//			   ������ �μ��մϴ�.
			   2
			   37
			   38
			   54
			   57
//			   ������ �䱸 ������ ��Ʈ���� ��Ұ� �����Ǿ�� java.lang.Comparable�Ѵٴ� ���Դϴ� (�׷����ϸ� �ڿ������� ������ ���ĵ˴ϴ�). 
//			   �׷��� ������ a ClassCastException�� ���� �� �� �ֽ��ϴ�.
			   
//			   �ٸ� ������ ����Ͽ� �����Ϸ��� ������ ����ϴ��� �޼����� java.util.Comparator������ �ֽ��ϴ� (�� �������� ���� �⺻ ��Ʈ���� ����� �� ���� IntStream).
			   Stream<T> sorted(Comparator<? super T> comparator)
//			   ���� ��� :
			   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .sorted( (s1, s2) -> s2.length() - s1.length() )
			       .forEach(System.out::println);
//			   �Ǵ�:
			   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .sorted( Comparator.comparing(
			                   (String s) -> s.length()).reversed() )
			       .forEach(System.out::println);
//			   �� �� ������ �μ��մϴ�.
			   Collections
			   Operations
			   Stream
			   on
//			   ù ��° �ڵ� ������ ù ��° ���ڿ� ���̰� �� ��° ���̺��� �� ���� ��� ���� ��ȯ�ϰ� �׷��� ������ ���� ���� ��ȯ�Ͽ� ���ڿ��� ������������ �����մϴ�.
//			   �� ��° �ڵ� �� ������ Comparator���ڿ� ���̸� �ڿ� ���� (��������)�� ���� ���� �� ������ �ݴ�� ����ϴ�.
			   
			   
			   
			   
//			   ������ �� ��� ���
//			   Stream�������̽��� ���� ������ �� ��� ����� �����Ѵ� :

			   long count()
			   Optional<T> max(Comparator<? super T> comparator)
			   Optional<T> min(Comparator<? super T> comparator)

//			   �⺻ ������ Stream�������̽��� ��� ������ ���� �޼��尡 �ֽ��ϴ�.
//			   IntStream����
			   OptionalDouble average()
			   long count()
			   OptionalInt max()
			   OptionalInt min()
			   int sum()

//			   LongStream����
			   OptionalDouble average()
			   long count()
			   OptionalLong max()
			   OptionalLong min()
			   long sum()

//			   DoubleStream����
			   OptionalDouble average()
			   long count()
			   OptionalDobule max()
			   OptionalDouble min()
			   double sum()

//			   count() ��Ʈ���� ��� ���� ��ȯ�ϰų� ��Ʈ���� ����ִ� ��� 0�� ��ȯ�մϴ�.
			   List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
			   System.out.println(list.stream().count()); // 5

//			   min()�� ���� �� ��Ʈ���� �ּҰ��� ��ȯ Optional�ϰų� ��Ʈ���� ����ִ� ��� �� ���� ��ȯ�մϴ� .
//			   max()�� ���� �� ��Ʈ���� �ִ� ���� ��ȯ Optional�ϰų� ��Ʈ���� ����ִ� ��� �� ���� ��ȯ�մϴ� .
			   
//			   ������Ƽ�꿡 ���� �̾߱� �� �� �ּҰ� �Ǵ� �ִ� ���� �������� ���� �� �� �ֽ��ϴ�. 
//			   �׷��� �츮�� (��� ������) ��ü�� ���� �̾߱� �� �� �ڹٴ� �װ͵��� ���ϴ� ����� �˾ƾ� � ���� �ִ�� �ּ����� �� �� �ֽ��ϴ�. 
//			   �̰��� Stream�������̽��� Comparatorfor max()�� min()������ �ʿ��� �����Դϴ� .
			   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .min( Comparator.comparing(
			                    (String s) -> s.length())
			       ).ifPresent(System.out::println); // on�� ���
			   

			   
//			   sum() ��Ʈ�����ִ� ����� �հ踦 ��ȯ�ϰų� ��Ʈ���� ����ִ� ��� 0�� ��ȯ�մϴ�.
			   System.out.println(
			       IntStream.of(28,4,91,30).sum()
			   ); // 153

//			   average()�� ���� �� ��Ʈ�� ����� ����� ��ȯ OptionalDouble�ϰų� ��Ʈ���� ����ִ� ��� �� ��Ҹ� ��ȯ�մϴ�  .
			   System.out.println(
			       IntStream.of(28,4,91,30).average()
			   ); // 38.25
		
		
			   java.util.ComparatorANOTHER Ŭ������ ��ü �� �����ϴ� �� ����ϴ� Ŭ������ ���� �����˴ϴ� . 
			   �����Ϸ��� SAME ��ü�� java.lang.Comparable���� �����˴ϴ� .
			   �� �������̽��� �ֿ� �޼���� int. �׵��� ��Ģ�� �ſ� �����մϴ�.
			   ZERO �� ��ȯ �Ǹ� ��ü (�Ǵ� ù ��° �μ�)�� (�� ��°) �μ��� ���� �� �ǹ��մϴ�.
			   �ټ��� ��� GREATER 0���� ��ȯ�Ǹ�, �� ������Ʈ (�Ǵ� ù ��° ����)�� �ǹ� GREATER�� �� (��)���� �μ�.
			   ���� ��� LESS 0���� ��ȯ�Ǹ�, �� ������Ʈ (�Ǵ� ù ��° ����)�� �ǹ� LESS �� (��)���� �μ�.
			   comparing(), thenComparing(),�� reversed()�� ����� ����� �ֽ��ϴ� Comparator�ڹ� 8�� �߰� �� �������̽�.
			   �������̽� �� sorted()�޼��� Stream�� �ڿ� ������ ���� ���� �� ��Ұ��ִ� ��Ʈ���� ��ȯ�մϴ�. �� Comparator�μ��� ������ ���� �ֽ��ϴ� .
			   count() ��Ʈ���� ��� ���� ��ȯ�ϰų� ��Ʈ���� ����ִ� ��� 0�� ��ȯ�մϴ�.
			   min()�� ���� �� ��Ʈ���� �ּҰ��� ��ȯ Optional�ϰų� ��Ʈ���� ����ִ� ��� �� ���� ��ȯ�մϴ� .
			   max()�� ���� �� ��Ʈ���� �ִ� ���� ��ȯ Optional�ϰų� ��Ʈ���� ����ִ� ��� �� ���� ��ȯ�մϴ� .
			   sum() ��Ʈ���� ��� �հ踦 ��ȯ�ϰų� ��Ʈ���� ��� ������ 0�� ��ȯ�մϴ�.
			   average()a�� ���� �� ��Ʈ�� ����� ����� ��ȯ OptionalDouble�ϰų� ��Ʈ���� ����ִ� ��� �� ��Ҹ� ��ȯ�մϴ� .
			   
			   
			   
			   
//			   ��������
			   List<String> strings =
	            Arrays.asList( "Stream","Operations","on","Collections");
	        strings.stream()
	            .sorted(
	                 Comparator.comparing(
	                     (String s1, String s2) ->
	                             s1.length() - s2.length()
	                 )
	            )
	            .forEach(System.out::print);
//			   �� static�޼��� Comparator.comparing�¸� ��Ÿ���� �μ��� �ϳ��ִ� ���� ���� ����մϴ� Function. �� ���� �μ��� ����Ϸ��� BiFunction.


	}

}
