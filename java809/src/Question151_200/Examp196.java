package Question151_200;

import java.util.Arrays;
import java.util.List;

public class Examp196 {

	public static void main(String[] args) {
		List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices","101, Peter, HR");
		empDetails.stream()
		.filter(s-> s.contains("r")) //��ҹ��� �����Ѵ�.
		.sorted()
		.forEach(System.out::println); //line n1
	}

}
//contains() �޼ҵ�� � ���ڿ��� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ�����ش�. 
//Ư�� ���ڿ��� �ִٸ� true��, ���ٸ� false�� ��ȯ�Ѵ�. 
//��, ��ҹ��ڸ� �����ϱ� ������, ��ҹ��� ���� ���� Ȯ���ϰ� �ʹٸ� toUpperCase()�� toLowerCase()�� �������

//�� :101, Peter, HR 200, Mary, AdminServices
