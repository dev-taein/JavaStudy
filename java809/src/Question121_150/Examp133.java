package Question121_150;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp133 {

	public static void main(String[] args) throws IOException {
//		Which code fragment can be inserted at line n1 to enable the code to print only /company/emp?
		Stream<Path> stream = Files.list(Paths.get ("/company/emp"));//line n1  //\company\emp ���
		stream.forEach(s->System.out.println(s));
		
	}

}
//find�� �̿��ؼ� � ���丮�� �����ϴ� ��� ������ ���������� �ϴ� �Լ�
//Files.walk(path); ��� �������丮�� ������ �ҷ��´�.
//Files.list(path);  /company�� ���� ���丮�� �ִ� ���ϸ� ������



//Stream<Path> stream = Files.find( Paths.get ("/company"), 1, (p,b) -> b.isDirectory (), 
//		 FileVisitOption.FOLLOW_LINKS); => \company
//											\company\emp   �Ѵ� ���


//walk�� \company
//\company\emp
//\company\emp\benefits
//\company\emp\benefits\b1.txt
//\company\emp\info.txt        
