package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Examp79 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		Stream.of(list1, list2) .flatMap(list -> list.stream()) .forEach(s -> System.out.print(s + " "));//line n1
		
		//map�� for�� �ѹ��ۿ� ������ ��������
		//flatmap�� for���� 2�� �̻� ���� �� �ִ�
		// ��, �迭 �Ǵ� ����Ʈ�� 2���� �Ѵ� ������ �̸��̴�.
	}

}
