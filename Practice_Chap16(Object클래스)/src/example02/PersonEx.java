package example02;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		
		//����� ���� Ŭ�������� hash�ø������ �ݵ�� hashcode()�� equals()�� �������̵��� �ؾ� 
		//�ߺ������� �ȵȴ�.
		HashSet hashSet = new HashSet();
		
		//StringŬ������ �������̵� ���ֱ� ������ ���尹���� 1���̴�
//		String str1 = new String("��");
//		String str2 = new String("��");
		
		Person person1 = new Person("ȫ�浿",50);
		Person person2 = new Person("ȫ�浿",50);
	
//		hashSet.add(str1);
//		hashSet.add(str2);
		hashSet.add(person1);
		hashSet.add(person2);
		System.out.println("����� ��ü �� :" + hashSet.size());
		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		
		
		//�ڵ������� toString()ȣ��
		System.out.println(person1);
		System.out.println(person1);
	}

}
