package examp05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
//		Stack�� Ŭ����
		Stack<String> stack = new Stack<>();
//		Queue�� �������̽��̸� �̸� ������ LinkedListŬ������ ���� �� �����ϰ� �ִ�.
		Queue<String> queue = new LinkedList<>();
		
		//���� push�� �ֱ�  pop�� ������------���Լ���LIFO (�ýñ�� ������
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		//ť offer�� �ֱ� poll�� ������----���Լ��� FIFO (������, ���� ȣ��
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		
		System.out.println("=����=");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("=ť=");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
