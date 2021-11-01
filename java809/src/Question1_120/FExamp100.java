package Question1_120;

import java.util.Arrays;
import java.util.List;

public class FExamp100 {
//	Which code fragment, when inserted at line n1, ensures false is printed?
//	 false�� ����ϴ� ��
	public static void main(String[] args) {
		List<String> cs = Arrays.asList("Java", "Java EE", "Java ME");
		boolean b = cs.stream() .allMatch(w -> w.equals("Java"));//line n1
		//allMatch()�� ��� ��Ұ� Java�̿��� �Ѵ�.
		System.out.println(b);
	}

}


/*
 * findFirst()�� findAny() �޼ҵ�� �ش� ��Ʈ������ ù ��° ��Ҹ� �����ϴ� Optional ��ü�� ��ȯ�մϴ�.
allMatch() ��� ��ҵ��� �Ű���(Predicate)���� �־��� ������ �����ϴ��� ����
anyMatch() �ּ��� �� ���� ��Ұ� �־��� ���ǿ� �����ϴ��� ����
noneMatch() ��� ��ҵ��� �־��� ������ �������� �ʴ��� ����
*/