package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Examp54 {
	public static void main(String[] args) {
//		List<Double> codes = Arrays.asList (10.0, 20.0); �̷��� Double������ �ٲٰ� ���� �Ҽ����� ������, ���� 20.0, 30.0�� ��µȴ�.
		
		List<Integer> codes = Arrays.asList (10, 20); //���⼭ List�� Integer�̱⶧����
		UnaryOperator<Double> uo = s -> s +10.0;  //UnaryOperator�� Double�̱⶧���� ����
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
	}
}
//List�� �Ϲ� ������ Integer�̱� ������ ������ ������ �߻������� UnaryOperator�� Double�� ����ϹǷ� ������ ������ �߻��մϴ�.

//C. A compilation error occurs.