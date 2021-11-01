package examp01;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionEx2 {

	public static void main(String[] args) {
//		Set
//		���� ���� ���Ǵ� �� ���� ������ HashSet�� TreeSet�Դϴ�. 
		
//		Hash���� �� �������� �ʰ� null�� ���
//		Tree���� �� �����ϰ� null�� �Ұ���
		
		
//		HashSet : HashSet�� ���� ����, null�� ���
		// Creating a HashSet with an initial capacity of 10
		Set<String> set = new HashSet<>(10);
		// add() returns true if the element is not already in the set
		System.out.println(set.add("b")); // true
		System.out.println(set.add("x")); // true
		System.out.println(set.add("h")); // true
		System.out.println(set.add("b")); // false
		System.out.println(set.add(null)); // true
		System.out.println(set.add(null)); // false
		System.out.println(set); // [null, b, x, h]
		
		
//		TreeSet : TreeSet�� ���� �Ѵ�., null�� ������
		Set<String> set1 = new TreeSet<>();
		System.out.println(set1.add("b")); // true
		System.out.println(set1.add("x")); // true
		System.out.println(set1.add("h")); // true
		System.out.println(set1.add("b")); // false
//		System.out.println(set1.add(null)); // nullpointException �߻�
		System.out.println(set1); // [b, h, x]
		
		
		
//		Queue :  FIFO (���� ����) ������� �߰� �� ���ŵ˴ϴ�. -- Collection, ArrayDeque
//		 �� (����)�� �� (ť)��  �߰� �� ����,  null�� ������
//		boolean add(E e)
//		ť ���� ��Ҹ� �߰��ϰ� �����ϸ� true�� ��ȯ�ϰ� �׷��� ������ ���ܸ� throw�մϴ�.
//		E remove()
//		ť�� ù ��° ��Ҹ� �����ϰ� ��ȯ�ϰų� ����ִ� ��� ���ܸ� throw�մϴ�.
//		E element()
//		ť�� ���� ��Ҹ� ��ȯ�ϰų� ����ִ� ��� ���ܸ� throw�մϴ�.
//		boolean offer(E e)
//		ť ���� ��Ҹ� �߰��ϰ� true�����ϰų� false�׷��� ������ ��ȯ �մϴ� .
//		null������ �߻��ϸ� ��ȯ �ϴ� �޼��� :
//
//			E poll()
//			ť�� ù ��° ��� �Ǵ� null����ִ� ��� �����ϰ� ��ȯ�մϴ� .
//			E peek()
//			ť�� ���� ��Ҹ� ��ȯ�ϰų� null����ִ� ��� ��ȯ�մϴ� .
		Queue<String> queue = new ArrayDeque<>();
		System.out.println(queue.offer("a")); // true [a]
		System.out.println(queue.offer("b")); // true [a, b]
		System.out.println(queue.peek()); // a [a, b]
		System.out.println(queue.poll()); // a [b]
		System.out.println(queue.peek()); // b [b]
		System.out.println(queue.poll()); // b []
		System.out.println(queue.peek()); // null
		
		
//		���� �޼��带 ����� ���� Ŭ������ LIFO (���� ����)�� ��Ҹ� �����ϴ� ������ ���� �� �������� ����� ���� �ֽ��ϴ�.

		// ��� �տ� ��Ҹ� �߰��մϴ�.
//		void push(E e)


		// ���� ��Ҹ� �����ϰ� ��ȯ�մϴ�.
		// �Ǵ� ť�� ����ִ� ��� ���� �߻�
//		E pop() 

//		�̷��� �޼���� Queue�������̽��� �����ϴ� .

		ArrayDeque<String> stack = new ArrayDeque<>();
		stack.push("a"); // [a]
		stack.push("b"); // [b, a]
		System.out.println(stack.peek()); // b [b, a]
		System.out.println(stack.pop()); // b [a]
		System.out.println(stack.peek()); // a [a]
		System.out.println(stack.pop()); // a []
		System.out.println(stack.peek()); // null
		
		
		
//		Map :	String���� ��� ����  Ű�� �����. ���� ���� ���Ǵ� �� ���� ������ HashMap�� TreeMap�Դϴ�. 
//		TreeMap�� Ű �� ���������� log (n) �ð��� Ű�� �߰��ϰ� �˻��ϴ� �ݸ� HashMap������ ���������� ������ Ű�� �� ������ �߰��ϰ� �˻��Ѵٴ� ���Դϴ�.
		
		Map<String, Integer> map = new HashMap<>();


		// Ű / �� �� �߰�
		System.out.println( map.put("oranges", 7) ); // null
		System.out.println( map.put("apples", 5) ); // null
		System.out.println( map.put("lemons", 2) ); // null
		System.out.println( map.put("bananas", 7) ); // null

		// ���� Ű�� ���� ��ü�մϴ�. ���� ���� ��ȯ
		System.out.println( map.put("apples", 4) ); // 5
		 System.out.println( map.size() ); // 4

		// {oranges=7, bananas=7, apples=4, lemons=2}
		System.out.println(map);

		// Ű�� oranges�� ���� ���
		System.out.println( map.get("oranges") ); // 7

		// Map�� Ű�� ���ԵǾ� �ִ��� �׽�Ʈ
		System.out.println( map.containsKey("apples") ); // true
		// Map�� ���� ���ԵǾ� �ִ��� �׽�Ʈ
		System.out.println( map.containsValue(5) ); // false

		// Ű / �� �� ���� �� �� ��ȯ
		System.out.println( map.remove("lemons") ); // 2
		// Ű�� ã�� �� ������ null�� ��ȯ�մϴ�.
		System.out.println( map.remove("lemons") ); // null

		// Ű�� Set���� ���� ����
		// (���� ������ Map�� �ݿ��Ǹ� �� �ݴ뵵 ���������Դϴ�.)
		Set<String> keys = map.keySet(); // [oranges, bananas, apples]

		// ���� Collection���� ���� ����
		// (���� ������ Map�� �ݿ��Ǹ� �� �ݴ뵵 ���������Դϴ�.)
		Collection<Integer> values = map.values(); // [7, 7, 4]

//		��� Ű / �� �� ����
		map.clear();

		System.out.println( map.isEmpty() ); // true
		
		
		
//		Tree���
		Map<String, Integer> map2 = new TreeMap<>();

		System.out.println( map2.put("oranges", 7) ); // null
		System.out.println( map2.put("apples", 5) ); // null
		System.out.println( map2.put("lemons", 2) ); // null
		System.out.println( map2.put("bananas", 7) ); // null

		// {apples=5 , bananas=7, lemons=2, oranges=7}
		System.out.println(map2);

		// [apples, bananas, lemons, oranges]
		Set<String> keys1 = map.keySet();
		 Collection<Integer> values1 = map.values(); // [5, 7, 2, 7]

//		������ ����Ǵ� ��� ������ (�ٽ� �������� TreeSet) a TreeMap�� nullŰ�� ���� ���� �� �����ϴ� .

		Map<String, Integer> map3 = new TreeMap<>();
		map3.put(null, 1); // throws NullPointerException!

//		�׷��� ������ ���� HashMap�� �� �ֽ��ϴ�.

		Map<String, Integer> map4 = new HashMap<>();
		map4.put(null, 1); // OK
	}

}
