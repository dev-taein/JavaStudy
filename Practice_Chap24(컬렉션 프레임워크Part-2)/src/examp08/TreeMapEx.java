package examp08;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "ȫ�浿");
		scores.put(98, "������");
		scores.put(75, "�迬��");
		scores.put(95, "�տ���");
		scores.put(80, "����");
		
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry(); //���ʿ��� ���� ���� ��
		System.out.println("���� ���� ���� : " + entry.getKey() + " - " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + " - " + entry.getValue());
		
		System.out.println("================================");
		entry = scores.lowerEntry(95);
		System.out.println("95�� �ٷ� �Ʒ� ����(95�� ������) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println("================================");
		entry = scores.higherEntry(95);
		System.out.println("95�� �ٷ� �� ����(95�� ������) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println("================================");
		entry = scores.floorEntry(95);
		System.out.println("95�� �ٷ� �Ʒ� ����(95�� ����) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println("================================");
		entry = scores.ceilingEntry(95);
		System.out.println("95�� �ٷ� �� ����(95�� ����) : " + entry.getKey() + " - " + entry.getValue());
		System.out.println("================================");
//		while(!scores.isEmpty()) {
//			entry = scores.pollFirstEntry(); //�������� ---�÷��ǿ��� ����(��ü ���� �ڵ�)
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("Ű : " + value + "-" + "��" + str);
//			System.out.println("���� ��ü�� : " + scores.size());
//		}
		
//		while(!scores.isEmpty()) {
//			entry = scores.pollLastEntry(); //�������� ---�÷��ǿ��� ����(��ü ���� �ڵ�)
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("Ű : " + value + "-" + "��" + str);
//			System.out.println("���� ��ü�� : " + scores.size());
//		}
		
		//iterator���    -- ��ü ���Ŵ� ��������� ������Ѵ�.
		Set<Map.Entry<Integer, String>> entryset = scores.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entryset.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> mapentry = iterator.next();
			int value = mapentry.getKey();
			String str = mapentry.getValue();
			System.out.println("Ű : " + value + "-" + "��" + str);
			iterator.remove();
			System.out.println("���� ��ü�� : " + scores.size());
		}
		//KeySet()�� �̿��ؼ� ����غ���
	}

}
