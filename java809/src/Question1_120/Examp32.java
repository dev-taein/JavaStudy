package Question1_120;

import java.util.Set;
import java.util.TreeSet;

class Vehicle1 {
int vno;
String name;
public Vehicle1 (int vno, String name) {
this.vno = vno;
this.name = name;
}
public String toString () {
return vno + ":" + name;
}
//public int compareTo(Vehicle1 o) {
//return this.name.compareTo(o.name);
//}
}
public class Examp32 {
	public static void main(String[] args) {
		Set<Vehicle1> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle1 (10123, "Ford"));
		vehicles.add(new Vehicle1 (10124, "BMW"));
		System.out.println(vehicles);
	}
}

//TreeSet�� ����Ʈ���� ������� �̷���� �÷����̸�, Set�������̽��� SortedSet�������̽��� ������ Ŭ�����̴�.
		//�ڵ����� �������� �����Ѵ�. �ߺ� ��Ҹ� ������� �ʴ� �÷��������� �������̽��Դϴ�
//  �� : ClassCastException is thrown at run time
//Vehicle cannot be cast to java.lang.Comparable
//	Vehicle�� java.lang.Comparable�� ĳ��Ʈ �� �� �����ϴ�.


// implements Comparable<Vehicle1> �� ����� ���� [10124:BMW, 10123:Ford] �̷��� �ȴ�