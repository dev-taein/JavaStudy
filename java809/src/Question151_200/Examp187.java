package Question151_200;

import java.util.Set;
import java.util.TreeSet;

class Vehicle1 implements Comparable<Vehicle1>{
int vno;
String name;
public Vehicle1 (int vno, String name) {
this.vno = vno;
this.name = name;
}
public String toString () {
return vno + ":" + name;
}
public int compareTo(Vehicle1 o) {
return this.name.compareTo(o.name);   //name �������� ������ �� compareTo()�޼��� �ȿ��� String�� �Ű����� 1���� �ü� ����
}
//Comparable = compareTo(String �Ű����� 1��)
}
public class Examp187 {

	public static void main(String[] args) {
		Set<Vehicle1> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle1 (10123, "Ford"));
		vehicles.add(new Vehicle1 (10124, "BMW"));
		System.out.println(vehicles);
	}

}


// �� :B. [10124:BMW, 10123:Ford]