package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp50 {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of (Paths. get("D:\\data.doc"),  
				Paths. get("D:\\data.txt"),
				Paths. get("D:\\data.xml"));
//				paths.filter(s-> s.toString().contains("data")).forEach(
				paths.filter(s-> s.toString().endsWith("txt")).forEach(		 //�̰� ��, ���κ��� txt�̸� �� ���븸 ����Ѵ�.
				//	endsWith("txt")�� ���ڿ� txt�� �ν��Ͻ��� �� �κа� ������ ���ڿ��� ��ġ�ϴ����� Ȯ���մϴ�.
						
				s -> {
				try {
				Files.readAllLines(s)
				.stream()
				.forEach(System.out::println); //line n1
				} catch (IOException e) {
				System.out.println("Exception");
				}
				}
				);
	}

}
// endsWith("txt")�϶��� ���� : The program prints the content of data.txt file.
//							���α׷��� data.txt���ϸ� ����Ѵ�.

// contains("data")�ϋ��� ���� : D. The program prints the content of the three files.  
//       					 ���α׷��� 3���� ������ ������ �μ��Ѵ�.