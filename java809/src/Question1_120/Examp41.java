package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp41 {
	public static void main(String[] args) {
//		/*contains( ) �޼���� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϴ� ����� �Ѵ�. Ư�� ���ڿ��� ���ԵǾ� �ִٸ� true�� ���ٸ� false�� ��ȯ�Ѵ�.
		List<String> str = Arrays.asList ("my", "pen", "is", "your", "Pen"); //�̰� �빮�� P��
				Predicate<String> test = s -> {
				int i = 0;
				boolean result = s.contains ("pen"); //��ҹ��� �����Ѵ�
				System.out.print((i++) + ":");  //i�� ���������� �ƴ� ���� �����̹Ƿ� filter(test)�� ȣ���Ҷ����� i++�� �������� �������̹Ƿ� ���� �� ���� �����ϴ�.
												//���� i�� ++i ����������̸� filter(test)ȣ���Ҷ����� 1�� ǥ���Ұ̴ϴ�.
				return result;
				};
				str.stream()
				.filter(test)
				.findFirst()   // findFisrt�� ��Ʈ���� ������ ���� ù��° �ִ� ���� ����
				.ifPresent(System.out ::print);
				
				
				//filter(test)�� �ѹ��� ����Ǽ� 1�� �������� �ʴ´�.
				
//				��  :  0 : 0 : pen
	}
}
