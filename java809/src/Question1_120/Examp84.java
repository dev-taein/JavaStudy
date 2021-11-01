package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp84 {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
		System.out.println("Searching");
		return n.contains("red");
		};
		colors.stream()
		.filter(c -> c.length() > 3)
		.allMatch(test);
		//allMatch(test)�� test�ѹ� ���� 
		//anyMatch(test)�� �ι� ���� 
		//noneMatch(test)�� �ι�
		
	}

}
//Stream Ŭ�������� ��� ��ҵ��� �־��� ���ǿ� �����ϴ��� ���θ� �˻��ϴ� allMatch() �޼��带 �����Ѵ�.