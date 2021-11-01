package examp07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//TreeSet�� ����Ʈ���� ������� �̷���� �÷����̸�, Set�������̽��� SortedSet�������̽��� ������ Ŭ�����̴�.
		//�ڵ����� �������� �����Ѵ�.
		TreeSet<Integer> scores = new TreeSet<>();
		//��ü �߰�
		scores.add(new Integer(87));
		scores.add(98);//�ڵ� �ڽ�
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		//���� ���� ������ ���غ��� (����Ʈ���� ���� ������ ��)
		System.out.println("���� ���� ���� :  " + scores.first());
		//���� ���� ������ ���غ��� (����Ʈ���� ���� �������� ��)
		System.out.println("���� ���� ���� :  " + scores.last());
		
		//�־��� ��ü�� ���ʿ� �ִ� ���� (Lower)
		score = scores.lower(95);//95�� �ؿ��ִ� ���ʿ� �ִ� ��-- �ڱ� �ڽ��� �������� �ʴ´�=(�־��� ��ü�� �������� �ʴ´�.)
		System.out.println("95�� �Ʒ� ���� :  " + score);
		//floor�� �ڱ��ڽ� ����=(�־��� ��ü�� �����Ѵ�.)
		score = scores.floor(95);
		System.out.println("95�� �Ʒ� ����(95���� ����) :  " + score);
		System.out.println("������ : " + scores.size());
		System.out.println("-------------------------------------------------");
		//�־��� ��ü�� �����ʿ� �ִ� ���� (Lower)
		score = scores.higher(95);//95�� ������ ���� ����,,,,,�ڱ� �ڽ��� �������� �ʴ´�=(�־��� ��ü�� �������� �ʴ´�.)
		System.out.println("95�� ���� ���� :  " + score);
		//ceiling�� �ڱ��ڽ� ����=(�־��� ��ü�� �����Ѵ�.)
		score = scores.ceiling(95);
		System.out.println("95�� ���� ����(95���� ����) :  " + score);
		System.out.println("������ : " + scores.size());
		System.out.println("-------------------------------------------------");
//		while(!scores.isEmpty()) {
//		System.out.println("pollFirst()����");
////			pollFirst()�� �� ���� ��ü���� �����´�. ��, ������ �� TreeSet���� ���Ÿ� �Ѵ�.
//			score = scores.pollFirst();
//			System.out.println("���� �� ��ü : " + score);
//			System.out.println("���� ��ü �� : " + scores.size());
//		}
//		while(!scores.isEmpty()) {
//			System.out.println("pollLast()����");
////			pollLast()�� �� ������ ��ü���� �����´�. ��, ������ �� TreeSet���� ���Ÿ� �Ѵ�.
//			score = scores.pollLast();
//			System.out.println("���� �� ��ü : " + score);
//			System.out.println("���� ��ü �� : " + scores.size());
//		}
		
		
		//�ݺ��� ���
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst, pollLast�޼���� iterator�� �������� 
			//��ü�� �����ϴ��� ���ϴ����� �������� �ִ�.
			int value = iterator.next();
			iterator.remove(); //�ݺ��ڴ� �̷��� ��������� ��ü �����ؾ��Ѵ�.
			System.out.println(value + "���� ��ü �� : " + scores.size());
		}
	}

}
