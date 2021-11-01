package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Examp60 {

	public static void main(String[] args) {
		List<String> nL = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s); nL.stream()
		.map(funVal)
//		.forEach(System.out::println); //�̹����� ���������̱� ������ �迭�� ����մϴ�.
		.peek(System.out::print);
	}

}

// forEach�� ����ϸ� Hello : JimHello : John Hello : Jeff ���
// 	��:  C. The program prints nothing.  ���α׷��� �ƹ��͵� �μ����� �ʽ��ϴ�.------������ : map�� peek�� �߰������̱⶧���̴�.