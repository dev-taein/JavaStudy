package examp07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSearchEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		//���ĺ��� �����ڵ忡 ���� ����Ʈ���� ���� �������� ����ȴ�.
//		treeSet.add("apple");
//		treeSet.add("f");
//		treeSet.add("forever");
//		treeSet.add("description");
//		treeSet.add("ever");
//		treeSet.add("zoo");
//		treeSet.add("guess");
//		treeSet.add("cherry");
//		System.out.println(treeSet);
		treeSet.add("����");
		treeSet.add("����");
		treeSet.add("�ٽô�");
		treeSet.add("��");
		treeSet.add("����");
		treeSet.add("���");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
//		System.out.println("[c~f]���̿� �ܾ �˻� �غ���");
		//c���� �����ؼ� f���� �˻��ϴµ� f�� f�� �ڸ� ����Ѵ� ���״�� "f"�� �ȴ�
		//�� , f���� 2�� �̻��� ��� ���Ѵ�.
//		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
//		System.out.println(rangeSet);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("[��~��]���̿� �ܾ �˻� �غ���");
		NavigableSet<String> rangeSet1 = treeSet.subSet("��", true, "��", true);
		System.out.println(rangeSet1);
	}

}
