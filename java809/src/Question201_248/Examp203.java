package Question201_248;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp203 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("pen", "is", "not", "a", "pencil");
		Predicate<String> test = s -> {
			int i =0;
			boolean result = s.contains("pen");
			System.out.println((i++) + ":");
			return result;
		};
		str.stream().filter(test).findFirst().ifPresent(System.out::print);
	}

	
	//�� : C. 0 : pen
	
}
// findFisrt�� ��Ʈ���� ������ ���� ù��° �ִ� ���� �������ְ�, findAny�� ������ ������� ���� ã������ ��ü�� �����մϴ�.
// -->  A. 0 : 0 : pen   = pen�� ����Ʈ���� ù��°�� �ƴ� 2������ ���� �� ��
// -->  C. 0 : pen   = pen�� ù��° ������ ��
// pen�� 3��°�� ������ 0�� 3�� ��µ�