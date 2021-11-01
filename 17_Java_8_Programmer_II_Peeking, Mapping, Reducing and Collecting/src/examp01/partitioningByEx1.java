package examp01;

public class partitioningByEx1 {

	public static void main(String[] args) {
//		partitioningBy()
//		�� ��° �׷�ȭ ����� partitioningBy ()�Դϴ�.
//		groupingBy ()���� �������� partitioningBy ()�� Ű �������� �ο��� ���� �� Map�� ��ȯ�Ѵٴ� ���Դϴ�. 
//		��, true�� ���� �ϳ��� false�� ���� �ϳ��� �� �׷� �� ������ �ǹ��մϴ�.
//		�� ������� �� ���� ������ �ֽ��ϴ�. ù ��°�� ������ �����ϴ�.
		partitioningBy(Predicate<? super T> predicate)
		
//		���� �ڿ� ���� ��Ҹ� �����ϰ��̸� Map <Boolean, List <T >>�� �����մϴ�.
//		���� ��� ���� ��Ʈ���� 50 �̸��� ���ڿ� �׷��� ���� ���ڷ� �����Ϸ��� ������ ���� �� �� �ֽ��ϴ�.
		Map<Boolean, List<Integer>> map =
	    Stream.of(45, 9, 65, 77, 12, 89, 31)
	        .collect(partitioningBy(i -> i < 50));
//		���
		{false=[65, 77, 89], true=[45, 9, 12, 31, 12]}
		
//		���ôٽ��� Predicate ������ �ʿ��� �׻� �� ���� ��Ұ� �ֽ��ϴ�.
//		groupingBy ()�� ������������ �޼��忡�� �ٿ� ��Ʈ�� �����⸦ ����ϴ� �� ��° ������ �ֽ��ϴ�.
//		���� ���, �ߺ��� �����Ϸ��� ������ ���� ��Ҹ� �������� �����ϸ�˴ϴ�.
		Map<Boolean, Set<Integer>> map =
			    Stream.of(45, 9, 65, 77, 12, 89, 31, 12)
			        .collect(
			            partitioningBy(i -> i < 50,
			                           toSet()
			            )
			        );
//		���:
		{false=[65, 89, 77], true=[9, 12, 45, 31]}   //12�� �ߺ����� ����
		
		
//		�׷��� groupingBy ()�� �޸� ��ȯ�Ǵ� Map�� ������ ������ ���ִ� ������ �����ϴ�. ������ �߿����� �ʽ��ϴ�. ����� ���ִ� Ű�� �� �����Դϴ�.
		Set<Integer> lessThan50 = map.get(true);
		Set<Integer> moreThan50 = map.get(false);
		
	}

}
