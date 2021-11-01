package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp180 {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
		System.out.println("Searching...");
		return n.contains("red");
		};
		colors.stream()
		.filter(c -> c.length() >= 3) //���⼭ ���ڱ��̰� 3�̻��ΰ͸� ���
//		.forEach(System.out::print);  --�� ���� 3���� �� �ϴ� ��Ʈ���� �� ����
		.allMatch(test); //�ٵ� ���⼭ allMatch()��� �����ؾ���- 
		
		//�� test�� �����ϰ� ù��° ���� red true�� ��ȯ�ϱ� ������ �״������� test�� �ѹ� ������(��2��) �Ѿ�� green�� contains�� ���⼭ false�� ���Ա� ������
		//Serching�� 2���� ����ϰ� �����°���
		//���� red�� 2��° �ε����� ������ Serching�� �ѹ��� ���´�.
		
		//�Ǵ� c.length() > 3�̰� �Ǹ� red ���ڱ��̰� 3�̱⶧����  test�� �ѹ������ϰ� false�� ��ȯ�ϰ� Serching�� �ѹ��� ��µȴ�.
	}

}
