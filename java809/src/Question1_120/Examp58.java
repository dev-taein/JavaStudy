package Question1_120;

import java.util.function.ToIntFunction;

public class Examp58 {
	public static void main(String[] args) {
//		indexOf() �޼���� �迭���� ������ ��Ҹ� ã�� �� �ִ� ù ��° �ε����� ��ȯ�ϰ� �������� ������ -1�� ��ȯ�մϴ�.
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str::indexOf; //line n1   indexOf()�� ���� ������ �ش� ���� �ε����� ��� ,, ������ -1
		int x = indexVal.applyAsInt("Java"); //line n2   //��, indexOf�� Java ��Ҹ� ã�� ã���� �� ����� ��ġ index�� ��ȯ�Ѵ�.
//							"Java"�� 0��° �ε����� �����Ƿ� 0�� ��ȯ
		System.out.println(x);
		
	}
}
