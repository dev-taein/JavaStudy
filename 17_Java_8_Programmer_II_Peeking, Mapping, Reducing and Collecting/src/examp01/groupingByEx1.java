package examp01;

public class groupingByEx1 {

	public static void main(String[] args) {
//		groupingBy()
//		Collectors Ŭ������ SQL GROUP BY ��Ÿ���� �������� ��Ʈ���� ��Ҹ� ������� �׷�ȭ�ϴ� �� ���� �Լ��� �����մϴ�.
//		ù ��° ����� groupingBy ()�̸� �� ���� ������ �ֽ��ϴ�. �̰��� ù ��°�Դϴ�.
//		groupingBy(Function<? super T,? extends K> classifier)
//		T ������ ��Ҹ� �з��ϰ� ������� �׷�ȭ �� �� Ű (���� K)�� �Լ� ��ȯ ���� �ʿ� ����� ��ȯ�ϴ� �Լ��� ����մϴ�.
//		���� ���, ���ڰ� ���� ���� (10, 20 ��)���� ���� ��Ʈ���� �׷�ȭ�Ϸ��� ������ ���� �� �� �ֽ��ϴ�.
		Map<Integer, List<Integer>> map =
				   Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
				      .collect( groupingBy (i -> i/10 * 10 ) );
//		�� �ڵ带 ���� ��� (for ���� ���)�� ���ϴ� ���� ��Ʈ���� ���� ���ݰԵ˴ϴ�.
		List<Integer> stream =
			    Arrays.asList(2,34,54,23,33,20,59,11,19,37);
			Map<Integer, List<Integer>> map = new HashMap<>();  //�ؽ��� ���ľ��ϰ� null���

			for(Integer i : stream) {
			    int key = i/10 * 10;
			    List<Integer> list = map.get(key);

			    if(list == null) {
			        list = new ArrayList<>();
			        map.put(key, list);
			    }
			    list.add(i);
			}
//		���
		{0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}	
			
		
//		�� ��° ������ downstream collector�� additional �μ��� ����մϴ�. 
		groupingBy(Function<? super T,? extends K> classifier,
		           Collector<? super T,A,D> downstream)
		
		
//		downstream collector�� �ٸ� collector�� ����� ����Ǵ� collector�Դϴ�.
//		���� ���, ���⿡�� ��� collector�� ����Ͽ� ���� ������ �� �׷쿡�ִ� ��Ҹ� ����� �� �ֽ��ϴ�.
		Map<Integer, Long> map =
	    Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
	        .collect(
	            groupingBy(i -> i/10 * 10,
	                       counting()
	            )
	        );
//		(Map�� �� ������ �ٿ� ��Ʈ�� ������ counting ()���� ��ȯ �� ������ �ݿ��ϵ��� ��� ����Ǵ��� Ȯ���Ͻʽÿ�.)
//		��� :
		{0=1, 50=2, 20=2, 10=2, 30=3}
		
		
//		�ٸ� groupingBy ()�� ����Ͽ� �� ��° ������ ��Ҹ� �з� �� ���� �ֽ��ϴ�. ���� ��� ���� ��� ��Ҹ� ¦�� �Ǵ� Ȧ���� �߰��� �з� �� �� �ֽ��ϴ�.
		Map<Integer, Map<String, List<Integer>>> map =
				   Stream.of(2,34,54,23,33,20,59,11,19,37)
				       .collect(groupingBy(i -> i/10 * 10,
				                  groupingBy(i ->
				                               i%2 == 0 ? "EVEN" : "ODD")
				                )
				       );
		
		//��� :
		{
		    0 = {EVEN=[2]},
		   50 = {EVEN=[54], ODD=[59]},
		   20 = {EVEN=[20], ODD=[23]},
		   10 = {ODD=[11, 19]},
		   30 = {EVEN=[34], ODD=[33, 37]}
		}
//		ù ��° groupingBy ()�� Integer�� ��ȯ�ϱ� ������ ���� ���� ���� Ű�� Integer�Դϴ�.
//
//		���� ���� ���� �� ������ �ٿ� ��Ʈ�� ������ groupingBy ()���� ��ȯ �� ������ �ݿ��ϵ��� (again) ����Ǿ����ϴ�.
//
//		�� ��� ���ڿ��� ��ȯ�ǹǷ� �̰��� �� ��° ���� ���� Ű �����̵ǰ� ���� ��Ʈ������ �۾��ϱ� ������ ���� ������ List <Integer>�Դϴ�.
//
//		�� ������ ����� ���� �ñ� �� ���Դϴ�. ����� �����ϴ� ����� �ֽ��ϱ�?
//
//		��, TreeMap�� �ֹ� �� Map�� ������ �����Դϴ�. �������� groupingBy ()�� �� ��° ������ ��� ���� ������ ������ ���ִ� Supplier �μ��� �߰��մϴ�.	
		groupingBy(Function<? super T,? extends K> classifier,
		           Supplier<M> mapFactory,
		           Collector<? super T,A,D> downstream)
		
//		�̷����ϸ� ���� �ν��Ͻ��� �����մϴ� TreeMap
		Map<Integer, Map<String, List<Integer>>> map =
	    Stream.of(2,34,54,23,33,20,59,11,19,37)
	       .collect( groupingBy(i -> i/10 * 10,
	                 TreeMap::new,
	                 groupingBy(i -> i%2 == 0 ? "EVEN" : "ODD")
	               )
	       );
//		���
		{
		    0 = {EVEN=[2]},
		   10 = {ODD=[11, 19]},
		   20 = {EVEN=[20], ODD=[23]},
		   30 = {EVEN=[34], ODD=[33, 37]},
		   50 = {EVEN=[54], ODD=[59]}
		}
		
		
		
		
		
	}

}
