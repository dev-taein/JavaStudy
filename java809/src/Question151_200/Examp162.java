package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class Examp162 {

	public static void main(String[] args) {
		List<Double> doubles = Arrays.asList (100.12, 200.32);
		DoubleFunction funD = d -> d + 100.0;
		doubles.stream ().forEach(funD); // line n1    ---forEach(�Һ���consumer(�Ű���������)) �� �վ���Ѵ�. ����x
		doubles.stream(). forEach(e -> System.out.println(e)); // line n2
	}
// �� : D. A compilation error occurs at line n1.
}
