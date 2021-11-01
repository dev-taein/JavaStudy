package Question151_200;

import java.util.Arrays;
import java.util.List;

public class Examp198 {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList("B","C","A","D");
		codes.parallelStream().forEach(s-> System.out.println(s)); //�̰͸� ����
		System.out.println("");
		codes.parallelStream().forEachOrdered(s1->System.out.println(s1)); // BCAD ������� ����
	}
	
//	C. ABCD // in random order BCAD
	
//	forEachOrdered��Ʈ���� ���������� ���������� ������� �ҽ����� ������ ������� ��Ʈ�� ��Ҹ� ó���մϴ�.

}
