package examp01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		 List<String> strings =
		            Arrays.asList( "Stream","Operations","on","Collections");
		        Collections.sort(strings, String::compareTo);
		        System.out.println(strings.get(0));
		        
		        
//		        String::compareTo �Դϴ�. ��ȿ�� �޼��� �����Դϴ�. ������ compareTo�ڿ� �� ���� ( A, B, C��) "Collections"�� ù ��° ��Ұ��ȴ� List.
	}

}
