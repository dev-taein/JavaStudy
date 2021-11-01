package examp02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<Member>();
		
		
		//new�� ����߱� ������ �Ʒ� 4���� Member��ü�� ���� �ٸ� �ּҸ� ������ �ִ�
		//������, MemberŬ�������� Hashcode()�� ������ �߱⿡ ���ü�� �ν��� �Ѵ�.
		//�Ͽ�, Set�� �ߺ� ������ ���� �ʴ´�.
		set.add(new Member("ȫ�浿", 30)); //�ְ� ���� ����ǰ�
		set.add(new Member("ȫ�浿", 30)); //�ְ� ������
		set.add(new Member("ȫ�浿", 25));
		set.add(new Member("ȫ�浿", 17));
		
		System.out.println("�� ��ü ��  : " + set.size());
		
		//�ݺ��� iterator ���
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member mem = iterator.next();
			System.out.println(mem.getName() + " : " + mem.getAge());
		}
	}

}
