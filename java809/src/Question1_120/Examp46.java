package Question1_120;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Examp46 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList (10, 20, 8);
			System.out.println (
			nums.stream().max(Comparator.comparing(a -> a)).get()//line n1 //comparing�� Function<T,R>�� ���ڷ� �޽��ϴ�.
			//max(Comparator)�� param���� �Ѱ��� Comparator�� ��Ʈ���� �����۵��� ��� ���Ͽ� �ִ� �� 1���� �����մϴ�. 
			);
	}
}
