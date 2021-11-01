package examp01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		System.out.println("������ : " + set.size());
		System.out.println("---------------------------------");
		//Set�÷����� �ߺ� ������ �ȵȴ�. �ƿ﷯ ���������� ������ �ʴ´�.
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("iBATIS");
		set.add("Java");    
		//Set�迭���� null���� ���尡��������, ���� 1���� ����ȴ�.
//		set.add(null);
//		set.add(null);
		
		System.out.println("������ : " + set.size());
		
		//�ݺ��ڸ� set�� ���ؼ� ��礤��.
		Iterator<String> iterator = set.iterator();
		//hasNext()�� �����ð� �ִ���... ������ true ������ false 
		while(iterator.hasNext()) {
			String element = iterator.next(); //next()�� ��ü�� ����������
			System.out.println(element);
			//�ݺ��ڸ� ���ؼ� �������� Set���� ��ü���� �������� �ʴ´�.
			System.out.println("������ : " + set.size());
		}
		System.out.println("---------------------------------");
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("������ : " + set.size());
		System.out.println("---------------------------------");
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("---------------------------------");
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��ü�� �����ϴ�.");
		} else {
			System.out.println("��ü�� �����ϴ�.");
		}
	}

}
