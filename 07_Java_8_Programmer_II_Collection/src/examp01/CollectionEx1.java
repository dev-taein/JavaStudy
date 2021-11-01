package examp01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx1 {

	public static void main(String[] args) {
//		List
//		���� �Ϲ����� �÷����̸�, �ߺ��� ����Ѵ�. null��ҵ� ���԰���
		
		List<String> list = new ArrayList<>(10);

		System.out.println(list.isEmpty()); // true
		list.add("a");
		System.out.println(list.get(0)); // a
		list.add(0, "b"); // �ε��� 0�� b ����
		list.add("c");
		list.add(null);
		System.out.println(list); // [b, a, c, null]
		list.set(2, "a"); // Replacing element at index 2 with a
		System.out.println(list.contains("d")); // false
		// ù ��° ��ġ�ϴ� �ε����� ��ȯ�մϴ�. ã�� ���ϸ� -1
		System.out.println(list.indexOf("a")); // 1
		// ������ ��ġ�� �ε����� ��ȯ�մϴ�. ã�� ���ϸ� -1
		System.out.println(list.lastIndexOf("a")); // 2

		list.remove(1); // 1��° �ε��� ����
		list.remove(null);  // null ����
		list.remove("a"); // ù ��° ��ġ ��� ����

		System.out.println(list.size()); // 1
		
		
//		LinkedList�����ϴ� ���� ��ũ ���
//		List�� ���� java.util.Arrays.asList����� ����ϴ� ���Դϴ�.
		String[] arr = {"a", "b", "c", "d"};
		List<String> list1 = Arrays.asList(arr);
//		�Ǵ� ������ :
		List<String> list2 =
		        Arrays.asList("a", "b", "c", "d");
		
	}

}
