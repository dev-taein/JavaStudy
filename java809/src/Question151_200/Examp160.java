package Question151_200;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees {
	String dept, name;
	public Employees(String dept, String name) {
		super();
		this.dept = dept;
		this.name = name;
	}
	@Override
	public String toString() {
		return getDept() + ":" + getName();
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
}
public class Examp160 {
	public static void main(String[] args) {
		List<Employees> emps = Arrays.asList(new Employees("sales", "Ada"), 
								new Employees("sales", "Bob"),
								new Employees("hr", "Bob"),
								new Employees("hr", "Eva"));
		Stream<Employees> s = emps.stream()
				.sorted(Comparator.comparing((Employees e) -> e.getDept()) //getDept�� ���ĺ������� 1������ ������
						.thenComparing((Employees e) -> e.getName())); // �״��� getName�� ���ĺ������� 2������ ������
		List<Employees> eSorted = s.collect(Collectors.toList());
		System.out.println(eSorted);
//		e.getDept()�� ����������, then�� e.getName()�� �ö��� ��		
//		�� : D. [hr:Bob, hr:Eva, sales:Ada, sales:Bob]
		
//		e.getName()�� ����������, then�� e.getDept()�� �ö��� ��
//		�� : A. [sales:Ada, hr:Bob, sales:Bob, hr:Eva]
	}

}
