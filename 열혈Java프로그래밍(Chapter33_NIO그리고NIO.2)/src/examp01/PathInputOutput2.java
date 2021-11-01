package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PathInputOutput2 {

	public static void main(String[] args) throws IOException {
//		문자 데이터 단위 입출력
		Path fp = Paths.get("D:\\JavaStudy\\simple.txt");
		String st1 = "One Simple String";
		String st2 = "Two Simple String";
		List<String> lst1 = Arrays.asList(st1, st2);
		
		Files.write(fp, lst1); //파일에 문자열 저장하기
		List<String> lst2 = Files.readAllLines(fp); //파일로부터 문자열 읽기
		System.out.println(lst2);
		
	}

}
