package Question1_120;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp12 {

	public static void main(String[] args) throws Exception {
		Path file = Paths.get ("D:\\courses.txt");
		Files.lines(file); Stream<String> fc = Files.lines(file);   // ����
//		List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s)); //����
		fc.forEach (s -> System.out.println(s));
		
		
//		1. ���� �б� : line
//		String fileName = "D:/file.txt";
//		Stream<String> stream = Files.lines(Paths.get(fileName), Charset.forName("euc_kr"));
//		stream.collect(Collectors.toList()).forEach(System.out::println);
//		stream.close();
		
//		Files.lines ���
//		Files.lines(file); Stream<String> fc = Files.lines(file);  
		
		
//		2. ���� �б� : readAllLines
//		String fileName = "D:/file.txt";
//		List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.forName("euc_kr"));
//		lines.forEach(System.out::println);
		
//		Files.readAllLines ���
//		List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s));
		
		
		
		
		
		
		
//�� D. Stream<String> fc = Files.lines (file); fc.forEach (s - > System.out.println(s));
	
	}
}
