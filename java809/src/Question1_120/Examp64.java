package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp1{
private String eName;
private Integer eAge;

Emp1(String eN, Integer eA) {
this.eName = eN;
this.eAge = eA;
}
public Integer getEAge () {return eAge;}
public String getEName () {return eName;}
}
public class Examp64 {

	public static void main(String[] args) {
		List<Emp1>li = Arrays.asList(new Emp1("Sam", 20), new Emp1("John", 60), new Emp1("Jim", 51));
		Predicate<Emp1> agVal = s -> s.getEAge() > 50; //line n1      //getEAge() > 50-- 50�̻��̸� true�� �ǰ� agVal�� �����Ѵ�.
		li = li.stream().filter(agVal).collect(Collectors.toList());  //filter�� 50�̻� �ɷ����� �÷��͸� �����Ѵ�.
		// Collector<T, ?, List<T>>  toList()  T�� List�� ���� ------ li������ List�̹Ƿ� toList�� ����Ʈ�� �����Ѵٶ�� ���̴�.
		Stream<String> names = li.stream().map(Emp1::getEName); //line n2 //���̰� 50�̻��� �̸��� ����Ѵ�.
		names.forEach(n -> System.out.print(n + " "));
	}

}


