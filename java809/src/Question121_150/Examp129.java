package Question121_150;

import java.util.Arrays;
import java.util.List;

public class Examp129 {

	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE", "SE");
		String ans = nums.parallelStream().reduce("Java", (a,b)->a.concat(b));
		System.out.println(ans);
		
		
		
//	���� ��Ʈ���� ���	D. Java EEJava SE
		
		//���� ���� ��Ʈ���� ���� �Ϲ� ��Ʈ���̸�, ���� : JavaEESE

	}

}
