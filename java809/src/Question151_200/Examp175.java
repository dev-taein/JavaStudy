package Question151_200;

import java.util.Map;
import java.util.TreeMap;

public class Examp175 {

	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>();
		books.put (1007, "A");
		books.put (1002, "C");
		books.put (1003, "B");
		books.put (1003, "B");
		System.out.println (books);
		//�� : {1002=C, 1003=B, 1007=A}
		//�ߺ� ������
	}

}
/*
 TreeSet
- �ϳ��� ���� ��� ���� value�� ���ʰ� ������ �ڽ� ��带 �����ϱ� ���� �� ���� ������ ����
- TreeSet�� ��ü�� �����ϸ� �ڵ����� ���ĵǴµ� �θ𰪰� ���ؼ� ���� ���� ���� ��忡, ���� ��
ex)TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
	treeSet.add(new Integer(i*10));

         

TreeMap
- TreeSet�� �������� Ű�� ���� ����� Map.Entry�� �����Ѵٴ� ��
- TreeMap�� ��ü�� �����ϸ� �ڵ����� ���ĵǴµ�, �⺻������ �θ� Ű���� ���ؼ� Ű ���� ���� ���� ���� ��忡, Ű ���� ���� ���� ������ ��忡 Map.Entry�� ����
ex)TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(new Integer(90), "Jack");


*/