package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Studentee {
String course, name, city;
public Studentee (String name, String course, String city) {
this.course = course; this.name = name; this.city = city;
}
public String toString() {
return course + ":" + name + ":" + city;
}


}
public class Examp24 {

	public static void main(String[] args) {
		List<Studentee> stds = Arrays.asList(
				new Studentee ("Jessy", "Java ME", "Chicago"),
				new Studentee ("Helen", "Java EE", "Houston"),
				new Studentee ("Mark", "Java ME", "Chicago"));
				stds.stream().
				collect(Collectors.groupingBy(Studentee :: getCourse)).forEach((src, res) -> System.out.println(res)); //scr�̸� 
																									//D. A compilation error occurs.
	}
}
/*
 * 
 * 
 * �Ǵ� StudentŬ������ getCurse() �޼��尡���ٸ� ����  A compilation error occurs. �� �ȴ�..
 * 
 *  
 *  �Ǵ� getCourse()Ŭ������ �ְ�
 * .forEach ((src, res)-> System.out.println (src)); ����� B. Java EE Java ME�Դϴ�. 
 * 
 * 
 * 
 * �Ǵ� getCourse()Ŭ������ �ְ�
 * .forEach ((src, res)-> System.out.println (res)) ; ����� A�Դϴ�. [Java EE : Helen : Houston] [Java ME : Jessy : Chicago, Java ME : Mark : Chicago]
 */
