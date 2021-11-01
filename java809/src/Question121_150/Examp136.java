package Question121_150;

import java.util.ArrayDeque;
import java.util.Deque;

public class Examp136 {

	public static void main(String[] args) {
		Deque<Integer> nums = new ArrayDeque<>();
		nums.add(1000); //add �� �߰�
		System.out.println(nums);
		nums.push(2000); //push ���߰�
		System.out.println(nums);
		nums.add(3000);
		System.out.println(nums);
		nums.push(4000);
		System.out.println(nums);
		Integer i1 = nums.remove(); //�� ����
		System.out.println(nums);
		Integer i2 = nums.pop();  //�� ����
		System.out.println(nums); //���� �� ���� 1000�� 3000�� ���´�.
		System.out.println(i1 + ":" + i2); //������ ���� ����ϹǷ� 4000�� 2000�� ��µȴ�.
	}
}
/*
�ϴ� ������ �Լ��鿡 ���� �˾ƺ���.
���� �������� �ʴ� �͵�
peek()        : ��

peekLast()  : ��

peekFirst()  : ��

getFirst()    :  ��

getLast()    :  �� 

���� �����ϴ� �͵�
poll()         :  ��

pollFirst()   :  ��

pollLast()   :  �� 

pop()         :  ��

�Է��ϴ� �Լ��鿡 ���� �˾ƺ���.
offerFirst  :  ��

offerLast  :  ��

offer        :  ��  

addFirst   :  ��   

addLast   :  ��

add         :  ��

putFirst    :  ��  

putLast    :  ��

put          :  ��

push       :  �� 
�������ڸ�

����� Last�� ���� ������ ���� �տ��� ������.
�Է��� ��û���� ���� �ϴ�.
First, Last�� �����͵��� �ش� ��ġ�� �� ����.
offer, add, put�� �ڿ� �ִ´�.
push�� ������ �ִ´�.
*/