package examp10;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparaterEx {

	public static void main(String[] args) {
		//�����ڿ� �񱳱����� �̹� ���ø� �� ���̴�.
		TreeSet<Fruit> treeSet = new TreeSet<>(new AscendingComparater());
		
		//�͸� ���� ��ü�� ���� ����
//		TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {
////				return o1.getPrice() - o2.getPrice(); //��������
//				return o2.getPrice() - o1.getPrice(); //�������� 
//			}
//		});
//		
		
		
		
		//�񱳱����� ���ٸ� ClassCastException�� �߻��Ѵ�.
		//����ó���� �⺻������ ���ִ� ���� ����.
		try {
			treeSet.add(new Fruit("����", 42000));
			treeSet.add(new Fruit("����", 65000));
			treeSet.add(new Fruit("������", 3500));
			treeSet.add(new Fruit("�ٳ���", 3400));
			treeSet.add(new Fruit("�ڵ�", 2500));
			treeSet.add(new Fruit("ȣ��", 1000));
		} catch (Exception e) {
			System.out.println("������ ������ ����");
			e.printStackTrace();
		}
		
		System.out.println("�� ��ü �� : " + treeSet.size());
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + " :  "+ fruit.getPrice());
		}
		
		
		
	}

}
