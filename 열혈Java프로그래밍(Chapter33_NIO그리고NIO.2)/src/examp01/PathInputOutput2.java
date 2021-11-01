package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PathInputOutput2 {

	public static void main(String[] args) throws IOException {
//		���� ������ ���� �����
		Path fp = Paths.get("D:\\JavaStudy\\simple.txt");
		String st1 = "One Simple String";
		String st2 = "Two Simple String";
		List<String> lst1 = Arrays.asList(st1, st2);
		
		Files.write(fp, lst1); //���Ͽ� ���ڿ� �����ϱ�
		List<String> lst2 = Files.readAllLines(fp); //���Ϸκ��� ���ڿ� �б�
		System.out.println(lst2);
		
	}

}
