package Question1_120;

import java.util.ArrayDeque;
import java.util.Deque;

public class FExamp115 {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		queue.add("Susan"); 
		queue.add("Allen");
		queue.add("David");
		System.out.println(queue.pop()); //Susan�� ����
		System.out.println(queue.remove()); // Allen�� ����
		System.out.println(queue); // ������ David�� ���

		//�����߰�, add,put,offer(��), push(��)
		//��������, pop,remove,poll(��)
		
//		System.out.println(queue.peek()); //���� ���⼭ �������� �ʰ� peek Ȯ�θ� �ߴٸ� susan�� ����ϰ� ���������� �ʴ´�.
//		System.out.println(queue.remove()); // ���⼭�� susan�� �����ǰ�
//		System.out.println(queue); // ������ allen, David�� ����Ѵ�.
	}

}

/*
 * pop()
removeFirst()�� ����. ���� �������� ����� �� ����
removeFirst()���� ���ʿ��� ������Ʈ �ϳ��� �̾Ƽ� ������ ���� �ش� ������Ʈ�� �����Ѵ�. ���� ��������� ���ܰ� �߻��Ѵ�. 
 * 2) ���� �����ϱ�
- poll : Deque�� ���� �� Element�� return ����. Element�� ����. Queue���� Element�� �޾ƿ��� �����̶�� �����ϸ� �ȴ�.
poll()
pollFirst()
pollLast()


3) ���� �������� �ʰ� Ȯ�θ� �ϱ�
- peek : Deque�� ���� �� Element�� return ����. Element�� �������� ����.
peek
peekFirst
peekLast
- get : First, Last�� �ִ� Element�� return ����. Element�� �������� ����.
getFirst
getLast

1) �߰��ϱ� 

- add : Deque�� �������� Element�� ����. addFirst, addLast�� �� �ڸ�(First�� Last�� Element�� ����)
add(E e) 
addFirst(E e) 
addLast(E e) 
- put : add�� �����ϰ� �۵�
put(E e)
putFirst(E e)
putLast(E e)
- offer : add�� �����ϰ� �۵�
offer(E e)
offerFirst(E e)
offerLast(E e)
- push : Deque�� �� �κп� Element�� ����.
push(E e)


*/

