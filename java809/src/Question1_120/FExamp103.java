package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FExamp103 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,20,30);
		Function<Integer, Integer> fn = f1 -> f1 + f1;      // ��, 10+10, 20+20 �̷����̴�.
		Consumer<Integer> conVal = s -> System.out.println("Val" + s + " ");//Consumer()�Һ��� �Ű����� �ִ�.
		li.stream().map(fn).forEach(conVal);
		//�� : A. Val:20 Val:40 Val:60
	}

}
