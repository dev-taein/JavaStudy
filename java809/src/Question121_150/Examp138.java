package Question121_150;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Examp138 {

	public static void main(String[] args) {
		BiPredicate<String, String> bp=(String s1,String s2)->s1.contains("SG")&& s2.contains("Java");
		BiFunction<String, String, Integer>bf=(String s1,String s2)->{
		int fee=0;
		if(bp.test(s1,s2)) { //�� ������ true��� fee=100�� ��ȯ,, false��� 0�� ��ȯ
		fee=100;
		}
		return fee;
		};
		int fee1=bf.apply("D101SG", "Java programming");
		System.out.println(fee1);
	}

}



//�� : B. 100