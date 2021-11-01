package Question151_200;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp167 {

	public static void main(String[] args) throws IOException {
//		Given that these files exist and are accessible:
//			/sports/info.txt
//			/sports/cricket/players.txt
//			/sports/cricket/data/ODI.txt
//			and given the code fragment:
//		���丮 ������ ���Ͽ� ���� ����Ʈ ��ũ / ��ȣ ��ũ�� ���ٰ� �����ϸ� ����� �����Դϱ�?
//		Assuming that there are NO soft-link/symbolic links to any of the files in the directory structure, what is the result?

		//�������� ��ȣ ��ũ�� ���ٰ� �����߱� ������ ���� D�� �ȴ�.

//		��:	���� ������ ���ٸ� D. An Exception is thrown at runtime.
		//�ִٸ� 2�� ����Ѵ�.
		
		//���� D����̺꿡 ������ ����� ���� ������ 2�� ����Ѵ�.
		//��, txt������ spots ���丮 ������ 3���� �ֱ⶧���� maxDepth�� 4���ϸ� 3���� ������, 2���ϸ� 2���� ���´�.
//			maxDepth�� 2�� �־��� ������ 2�������� ã�´�. 5���ָ� txt������ 3�������Ƿ� 3���� ��µȴ�.
		int maxDepth =2;
		Stream<Path> paths = Files.find(Paths.get("/sports"),
		maxDepth,
		(p, a) -> p.getFileName().toString().endsWith ("txt"), //txt���ϸ� ã�´�.
		FileVisitOption.FOLLOW_LINKS);
		Long fCount = paths.count();
		System.out.println(fCount);
	}

}
/*
Files.find(start, maxDepth, (path, attr) -> true)
Integer.MAX_VALUE�� �ϸ� ��� ������ ������ �� �ִ�


���� ��� .java���ϸ� ã�� �ʹٸ�
(path, attr) -> path.toString().endsWith(".java")
*/