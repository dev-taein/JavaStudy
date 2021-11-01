package examp09;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

//	age������ ���� ���� ����
	
//	@Override
//	public int compareTo(Person o) {
////		if(this.age < o.age) {  // �ε�ȣ <��     >�� �ٲٸ� �������� ������ �ȴ�.
////			return -1;
////		} else if(this.age == o.age)
////			return 0;
////		else 
////			return 1;
//	���ٷ� ���¹�	return this.age - o.age;   //this.age�� ������ ���������� ������ �ȴ�.,,,, o.age - this.age ���ָ� �������� ������ �ȴ�.
//	}
	
	
//	name������ ���ı��� ����
	@Override
	public int compareTo(Person o) {
		if(this.name.compareTo(o.name) < 1) {  
		return -1;
	} else if(this.name.compareTo(o.name) == 0)
		return 0;
	else 
		return 1;
	} 
//	���ٷ� ���¹� this.name.compareTo(o.name) - o.name.compareTo(this.name);
}
