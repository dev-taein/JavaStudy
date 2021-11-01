package examp01;

public class ReductionEx1 {

	public static void main(String[] args) {
//		Reduction ����(���)

//	 reduction�� ���� ��Ҹ� ���� �ͼ� �ϳ��� ���̳� ��ü�� ���� (���)�ϴ� �۾��̸� �۾��� ���� �� �����Ͽ� ����˴ϴ�.
//	 reduction�� �� ���� ���� N ���� ��� �ջ�, N ���� �ִ� ��� ã�� �Ǵ� ��� ����Դϴ�.
//	  ���� ������ ���� for ������ ����ϸ� ���� �迭�� �հ�� ���Դϴ�.
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		for(int n : numbers) {
		    sum += n;
		}
//		���� ���� ��� ��Ʈ���� ����Ͽ� ����ϸ� ����ȭ�� �� �������� �������� ���Ǵ� �� �� ���� ������ �ֽ��ϴ�.
//		Stream �������̽����� ��Ҹ����� �� ���� ����� �ֽ��ϴ�. -- reduce(), collect()
		
		
		
//		reduce()
//		�� ������� �� ���� ������ �ֽ��ϴ�.
		Optional<T> reduce(BinaryOperator<T> accumulator)

		T reduce(T identity,
		         BinaryOperator<T> accumulator)

		<U> U reduce(U identity,
		             BiFunction<U,? super T,U> accumulator,
		             BinaryOperator<U> combiner)
		

//		BinaryOperator <T>�� BiFunction <T, T, T>�� �����մϴ�. ���⼭ �� �μ��� ��ȯ ������ ��� ������ �����Դϴ�.	

//		�ϳ��� �μ��� ���ϴ� �������� �����ϰڽ��ϴ�. �̰��� ������ �����մϴ�.
		boolean elementsFound = false;
		T result = null;
		for (T element : stream) {
		    if (!elementsFound) {
		        elementsFound = true;
		        result = element;
		    } else {
		        result = accumulator.apply(result, element);
		    }
		return elementsFound ? Optional.of(result)
		                     : Optional.empty();
		
//		�� �ڵ�� �� ��ҿ� ���� function�� �����Ͽ� ����� �����ϰ� �� ����� �����ϴ� Optional�� ��ȯ�ϰų� ��Ұ����� ��� �� Optional�� ��ȯ�մϴ�.
		
//		��ü���� ���� ���� ���ڽ��ϴ�. �հ谡 ��� ��� �۾����� Ȯ���մϴ�.
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		for(int n : numbers) {
		    sum += n;
		}
//		���⼭ ����� �۾��� ������ �����ϴ�.
		sum += n;
		Or:
		sum = sum + n;
//		���� :
		OptionalInt total = IntStream.of(1, 2, 3, 4, 5, 6)
			                .reduce( (sum, n) -> sum + n );
//		(�⺻ ������ ��Ʈ���� �⺻ ������ Optional�� ����ϴ� ����� �����Ͻʽÿ�.)
//		�̰��� �ܰ������� �Ͼ�� ���Դϴ�.
//		1. ����� �����ϴ� ���� ������ ��Ʈ���� ù ��° ��� (1)�� �����˴ϴ�.
//		2.�� ������ ��Ʈ���� �� ��° ��� (2)�� ���� �� (sum, n)-> sum + x�� ǥ���Ǵ� BinaryOperator�� �μ��� ���޵˴ϴ�.
//		3. ��� (3)�� ����⿡ �Ҵ�˴ϴ�.
//		4. ����� (3)�� ��Ʈ���� �� ��° ��� (3)�� BinaryOperator�� �μ��� ���޵˴ϴ�.
//		5. ��� (6)�� ����⿡ �Ҵ�˴ϴ�.
//		6. �� �̻� ��Ұ� ���� ������ ��Ʈ���� ���� ��ҿ� ���� 4 �ܰ�� 5 �ܰ踦 �ݺ��մϴ�.

		
//		�׷��� �ʱ� ���� �ʿ��ϸ� ����մϱ�? �̿� ���� ��� �� ���� �μ��� ����ϴ� ������ �ֽ��ϴ�.
//		T reduce(T identity, BinaryOperator<T> accumulator) ---T identity�� �ʱⰪ ����
//		ù ��° �μ��� �ʱ� ���̸�, ������ ���ϸ��� ���� ����� �Լ��� ID �����մϴ�. 
//		��, �� �� v�� ���� accumulator.apply (identity, v)�� v�� ���ƾ��ϱ� ������ identity����մϴ�. .
		
//		�� ���� reduce()�� ������ �����մϴ�.
		T result = identity;
		for (T element : stream)  {
		    result = accumulator.apply(result, element);
		} 
		return result;
//		Optional��Ʈ���� ��� ������ ID ���� ��ȯ�ǹǷ��� ������ ��ü�� ��ȯ���� �ʽ��ϴ� .
//		���� ��� �հ� ������ ������ ���� �ٽ� �ۼ��� �� �ֽ��ϴ�.
		int total = IntStream.of(1, 2, 3, 4, 5, 6)
		               .reduce( 0,
		                       (sum, n) -> sum + n ); // 21
//		�Ǵ� �ٸ� �ʱ� �� ��� :
			int total = IntStream.of(1, 2, 3, 4, 5, 6)
			                .reduce( 4,
			                        (sum, n) -> sum + n ); // 25
//			�׷��� ������ ������ ù ��° ���� ���� ��� 4 + 1�� 4�� ���� �����Ƿ� ù ��° �������� ���� ID�� ���� �� �� �����ϴ�.
//			�̰��� ���� �忡�� ���� �� ���� ��Ʈ������ �۾� �� �� �� ���� ������ ����ų �� �ֽ��ϴ�.
//			���� �̷��� ���������� T ������ ��Ҹ� ������ T ������ ��� �� ���� ��ȯ�մϴ�.
//			�׷��� �ٸ� ������ ��� �� ���� ��ȯ�Ϸ��� reduce ()�� �� ���� �μ� ������ ����ؾ��մϴ�.
			<U> U reduce(U identity,
		             BiFunction<U,? super T, U> accumulator,
		             BinaryOperator<U> combiner)

//			(���� T�� ��뿡���� U)
//			�� ������ ������ �����մϴ�. 
			U result = identity;
			for (T element : stream) {
				result = accumulator.apply(result, element) 
			}
			return result;
//			���� ��� ��Ʈ���� ��� ���ڿ� ������ �հ踦 ��� ���ϹǷ� ���ڿ� (type T)�� ��� ���� ��� (type U)�� ���Ѵٰ� �����غ��ʽÿ� .
//			�� ��� ������ ���� ��� reduce()�մϴ�.
			int length =
				    Stream.of("Parallel", "streams", "are", "great")
				        .reduce(0,
				                (accumInt, str) ->
				                   accumInt + str.length(), //accumulator
				                (accumInt1, accumInt2) ->
				                   accumInt1 + accumInt2);//combiner

//				�μ� ������ �߰��Ͽ� �� ��Ȯ�ϰ� ���� �� �ֽ��ϴ�.
				int length =
				  Stream.of("Parallel", "streams", "are", "great")
				      .reduce(0,
				            (Integer accumInt, String str) ->
				               accumInt + str.length(), //accumulator
				            (Integer accumInt1, Integer accumInt2) ->
				               accumInt1 + accumInt2);//combiner
		
//	����� �Լ��� ����� �Լ��� ���� (��ȯ) �ܰ踦 �߰��ϱ� �������� ������ reduce ()�� map ()�� �ٸ� ������ reduce () �޼����� �������� �ۼ��� �� �ֽ��ϴ� (�̸� ���� ��� ����) :
				int length =
					    Stream.of("Parallel", "streams", "are", "great")
					        .mapToInt(s -> s.length())
					        .reduce(0,
					               (sum, strLength) ->
					                   sum + strLength);
//				�Ǵ� ������ :
					int length = Stream.of("Parallel", "streams", "are", "great")
					                .mapToInt(s -> s.length())
					                .sum();
					
//					���, ���� �忡�� ��� ��� �۾��� ���������� �۾��� ���̱� ���� �����Ǳ� �����Դϴ�.
					average
					count
					max
					min
					sum
//					���� ������ ������ ���� ��ȯ�ϸ� ���ձ� �Լ��� �� �̻� �ʿ����� �����Ƿ� (�� �Լ��� ����� �Լ��� ���� ��)�� ��� �� �μ� ������ ����ϴ� ���� �����ϴ�.

//					������ ���� ��� �� ���� ������ reduce () �޼��带 ����ϴ� ���� �����ϴ�.

//					���� ��Ʈ�� �۾� (�ڼ��� ������ ���� �忡��)
//					���� �� ������ �ϳ��� ����� ���� ���� ������ ���� �� ��� ����� ���� �ͺ��� �� ȿ�����Դϴ�.
					
	}

}
