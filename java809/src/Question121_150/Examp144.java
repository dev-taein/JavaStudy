package Question121_150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//���� ����

class Person1 implements Comparable<Person1>{//line n1
	String name;       //String ������ �ϳ� �̹Ƿ� Comparable�� �����ϰ�
	public Person1(String name) {  
		this.name=name;
	}
	//line n2
	@Override
	public int compareTo(Person1 p) {  //String �Ű������� �ϳ��� �޴� compareTo(String t)�� ����ϴ°� �´�.
		return this.name.compareTo(p.name);
	}
	@Override
		public String toString() {
			return this.name;
		}
}
public class Examp144 {

	public static void main(String[] args) {
		List<Person1> emps = new ArrayList<>();
		emps.add(new Person1("aa"));
		emps.add(new Person1("bb"));
		emps.add(new Person1("cc"));
		Collections.sort(emps);
		System.out.println(emps);
	}

}
//�� : 
//B. At line n2 insert public int compareTo (Person p) { return this.name.compareTo (p.name);}
//C. Replace line n1 with class Person implements Comparable<Person>