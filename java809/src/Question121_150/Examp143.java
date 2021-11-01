package Question121_150;

import java.util.stream.Stream;

public class Examp143 {

	public static void main(String[] args) {
//		Which two code fragments, when inserted at line n1 independently, result in the output PEEK: Unix?
		Stream.of("Java", "Unix", "Linux")
		.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK:"+s))
		.findFirst();//line n1 //��, n�� ���Ե� Unix�� ���� ���� ���Ա⋚�� ���� ��ȯ��
//			.findAny();
	}
	
	//�� : E. .findFirst (); C. .findAny ();

}
/*
1. anyMatch() : �ش� ��Ʈ���� �Ϻ� ��Ұ� Ư�� ������ ������ ��쿡 true�� ��ȯ��.

2. allMatch() : �ش� ��Ʈ���� ��� ��Ұ� Ư�� ������ ������ ��쿡 true�� ��ȯ��.

3. noneMatch() : �ش� ��Ʈ���� ��� ��Ұ� Ư�� ������ �������� ���� ��쿡 true�� ��ȯ��.

findFirst()�� findAny() �޼ҵ�� �ش� ��Ʈ������ ù ��° ��Ҹ� �����ϴ� Optional ��ü�� ��ȯ�մϴ�.
*/