package examp01;

import java.util.Arrays;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(30, 5, 8);
         list.stream().max().get();  //C. ������ ����
//		   max()�� Stream�� Compartor�� �μ��� ����Ѵ�. . max�ִ� ��Ҹ� ����ϴ� ����� �ƴ� ���� ��Ʈ�� �� ������� �ٸ��ϴ�.
	}

}
