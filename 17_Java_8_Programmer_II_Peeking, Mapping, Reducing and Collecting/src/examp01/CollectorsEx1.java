package examp01;

public class CollectorsEx1 {

	public static void main(String[] args) {
//		Collectors = ������ 
//		Collectors�� ���� ���� collect()�� Collectors�� �۵� ����� ���� �� ���������� �����δ� �ٸ� ������ ����ϴ� ���� �����ϴ�.

//		CollectorsŬ���� �� �Ϲ����� �������� ������ �����ϴ�.
		
//		���			|					collect ()���� ��ȯ �� �� 				|���
		toList								List							��Ҹ� List.
		toSet								Set								��Ҹ� Set.
		toCollection						Collection						Collection������ ��Ҹ� �����մϴ� .
		toMap								Map								��Ҹ� Map.
		joining								String							��Ҹ� String.
		groupingBy							Map<K, List<T>>					T�з� ��ɿ� ���� ��� �� ���� ��Ҹ� ���� Ű���ִ� ������ �׷�ȭ �մϴ� K.
		partitioningBy						Map<Boolean, List<T>>			T��� ���� ��Ͽ� �ִ� ������ ��Ҹ� ������ �����մϴ�.
		
//		��� ����� reduce�� ������ �� �����Ƿ� CollectorsŬ�������̸� Collectors�ε� �����մϴ�.

���					|				collect ()���� ��ȯ �� ��					|���
averagingInt
averagingLong								Double							�Է� ����� ����� ��ȯ�մϴ�.
averagingDouble
	
counting									Long							�Է� ����� ��Ҹ� ����մϴ�.

maxBy										Optional<T>						�־����� ���� �ִ� ��Ҹ� ��ȯ�մϴ� Comparator.
minBy										Optional<T>						�־����� ���� �ּ� ��Ҹ� ��ȯ�մϴ� Comparator.

summingInt									Integer	
summingLong									Long							�Է� ����� �հ踦 ��ȯ�մϴ�.				
summingDouble								Double

		
		
		
		
	}

}
