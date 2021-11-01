package arraysExample;

import java.util.Arrays;

//����� ���� Ŭ������ �ݵ�� ������ �ϱ� ���ؼ��� Comparable�������̽��� �ݵ�� �����ؾ��Ѵ�.
class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//�� ������ ������ ��
	@Override
	public int compareTo(Person o) {
		return this.age - o.age; // ���̼����� �������� ����
//		return o.age - this.age; // ���̼����� �������� ����
//		return o.name.compareTo(this.name); // �̸��� �������� ����
//		this.name.compareTo(o.name);  �̸��� �������� ����
	}
	
}

public class ArraySortEx {

	public static void main(String[] args) {

		Person person1 = new Person("ȫ����", 18);
		Person person2 = new Person("�����", 9);
		Person person3 = new Person("������", 59);
		Person person4 = new Person("�ֱ���", 38);
		Person person5 = new Person("�����", 8);
		
		Person[] persons = { person1, person2, person3, person4, person5 };
		Arrays.sort(persons);
		//�迭 �˻�(binarySearch)�� �ݵ�� sort�ϰ� �� �ڿ� �ؾ��Ѵ�. -- ������ ������ ���־���Ѵ�.
		int index = Arrays.binarySearch(persons, person1);
		System.out.println("person1�� �ν��Ͻ��� �ִ� �ε��� : " + index + ", �̸�  : " + person1.name);
		for(Person person : persons)
			System.out.println("�̸� : " + person.name + ", ���� : " + person.age );
		
//		System.out.println(Arrays.toString(persons));
		
		//�⺻�� Ÿ�԰� StringŬ������ Arrays.sort�� �ϰԵǸ� �⺻������ �������� ������ �̷������.
		int[] arr = { 55, -10, -9, 0, 100};
		Arrays.sort(arr); //�������� �ڵ� ����
		System.out.println("�⺻�� Ÿ�� ���� ��  : " + Arrays.toString(arr));
		
		String[] names = new String[] { "ȫ�浿", "�谳��", "������", "������" };
		Arrays.sort(names); //�������� �ڵ� ����
		System.out.println("String�� Ÿ�� ���� ��  : " + Arrays.toString(names));
	}

}
