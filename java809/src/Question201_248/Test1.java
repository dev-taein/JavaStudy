package Question201_248;

import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
	    .map(str -> str.length())
	    .filter(i -> i > 3)
	    .limit(3) //���� ������ �����ϰ� 3�������� ǥ���Ѵ�.
	    //map���� ���̸� ��ȯ�ؼ� ���� int���� ���´�.Stream<T> limit(long maxSize)
//	    . orElse()�޼���°� Optional��� ���� �� �μ��� ��ȯ�ϰ�    �׷��� �������� ĸ��ȭ �� ���� ��ȯ�մϴ� 
	    .forEach(System.out::println);
//		4
//		5
//		6

	}
}
