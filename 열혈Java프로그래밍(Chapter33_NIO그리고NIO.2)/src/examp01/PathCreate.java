package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreate {

	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("C:\\JavaStudy\\empty.txt");
		fp = Files.createFile(fp); //���ϻ���, �� ���� ��ΰ� ��ȿ�ؾ��Ѵ�.!
		
		Path dp1 = Paths.get("C:\\JavaStudy\\Empty");
		fp = Files.createDirectory(dp1); //���丮 ����, �� ���� ��ΰ� ��ȿ�ؾ��Ѵ�.!
		
		
		Path dp2 = Paths.get("C:\\JavaStudy\\Empty");
		fp = Files.createDirectories(dp2); //����� ��� ���丮 ����, �̰� �������丮(JavaStudy)�� ������ ������
		
		
		System.out.println("File : " + fp);
		System.out.println("Dir1 : " + dp1);
		System.out.println("Dir2 : " + dp2);

	}

}
