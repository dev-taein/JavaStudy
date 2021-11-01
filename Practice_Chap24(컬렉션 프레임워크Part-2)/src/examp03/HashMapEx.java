package examp03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//Ű�� String�̰� Integer�� ���̴�.   �� �� ��ü��� �Ϳ� �ָ�����
		Map<String, Integer> map = new HashMap<>();
		System.out.println("������ : " + map.size());
		
		//Ű�� ���� �Է�     --- Ű�� �ߺ��� ������� ����
		map.put("������", 100);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		map.put("���屺", 95);
		System.out.println("�� ������ : " + map.size());
		//Map�� �ߺ��� Ű�� �������� �ʴ´�,  ȫ�浿�� ���屺�� 2���� ������ �Ǿ��µ�
		//�ߺ� ������ �� ��쿡 �������� ����� ������  ��ü�� �ȴ�.!
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println("���屺 : " + map.get("���屺"));
		System.out.println("------------------------------------");
		
		//Map�÷��ǿ� �ִ� Ű�� Set�迭�� �ٲ۴�.
		Set<String> set = map.keySet();
		System.out.println("KeySet()�� �̿��ؼ� ����� �� ");
		
		//�ݺ��� ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			//������ ���� Ű�� ���� ������
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("------------------------------------");
		//Map�÷��ǿ� �ִ� Map.Entry��ü�� ������� Set�迭�� �ٲ۴�.
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("EntrySet()�� �̿��ؼ� ����� �� ");
		//�ݺ��� ���
		Iterator<Entry<String, Integer>> entryiterator = entrySet.iterator();
		while(entryiterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryiterator.next();
			String key = entry.getKey();  //Ű
			int value = entry.getValue(); //��
			System.out.println(key + " : " + value);
		}
		System.out.println("------------------------------------");
		//��ü ��ü�� ����
		map.clear();
		System.out.println("�� MapEntry �� : " + map.size());
	}

}
