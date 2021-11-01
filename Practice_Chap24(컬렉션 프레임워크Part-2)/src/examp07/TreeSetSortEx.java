package examp07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSortEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		//�⺻������ ���������� �̷������.
		System.out.println(scores);
		System.out.println("��ü �� : " + scores.size());
		
		System.out.println("----------------------------------------------");
		NavigableSet<Integer> descndingSet = scores.descendingSet();
		System.out.println("�������� ��� : ");
		System.out.println(descndingSet);
		System.out.println("��ü �� : " + descndingSet.size());
		System.out.println("----------------------------------------------");
		//���������� �� �ѹ� �� ����������
		NavigableSet<Integer> ascendingSet = descndingSet.descendingSet();
		System.out.println("�������� ��� : ");
		System.out.println(ascendingSet);
		System.out.println("��ü �� : " + ascendingSet.size());
	}

}
