package example03;

public class PersonEx {

	public static void main(String[] args) {

		Person p1 = new Person(50);
		Person p2 = new Person(150);
		Person p3 = new Person(250);
		//final �Ӽ��� ����̹Ƿ� ���� ���� ���� ����.
//		p.nation = "USA";	  X
//		p.age = 100;          X
		System.out.println(p1.age);   //�� �ٸ� �ּ�   (final)
		System.out.println(p2.age);
		System.out.println(p3.age);
		System.out.println(Person.MAX_NUMBER);  // �� ���� �ּ�    (static final)
 		System.out.println(Person.MAX_NUMBER);
		System.out.println(Person.MAX_NUMBER);
	}

}
