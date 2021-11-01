package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class PathCopyMove {

	public static void main(String[] args) throws IOException {
//		���� �� ���丮�� ����
		Path src = Paths.get("D:\\JavaStudy\\CopyFileFormFiles.java"); //Source���� - �ִ� �����ϰ�
		Path dst = Paths.get("D:\\JavaStudy\\CopyFileFormFiles2.java"); //targer���� - �ִ� �������� �ʴ´ٴ� ����
//		Path dst = Paths.get("D:\\CopyFileFormFiles2.java"); ��ΰ� �̷��� src�� ������ �̰�η� CopyFileFormFiles2��� ������ �̸����� ���簡 �ȴ�.
		
		
		//src�� �����ϴ� ������ dst�� �����ϴ� ��ġ�� �̸����� ����
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING); //REPLACE_EXISTING : �̹� ������ �����Ѵٸ� �ش� ������ ��ü�Ѵ�.
//		src�� dst�� �����ض�
		//REPLACE_EXISTING : �̹� ������ �����Ѵٸ� �ش� ������ ��ü�Ѵ�.		
		//COPY_ATTRIBUTES : ������ �Ӽ����� ���縦 �Ѵ�.
		
//		���� �� ���丮�� �̵�
		
		Path src2 = Paths.get("D:\\JavaStudy\\Dir1");  //�ҽ������� �ְ� �������� ������ nosuchFileException �߻�
		Path dst2 = Paths.get("D:\\JavaStudy\\Dir2");
//		Path dst2 = Paths.get("D:\\Dir2"); ��ΰ� �̰Ÿ� src2�� dir1�� D:\\��ο� Dir2�� ���簡 �ȴ�.
		
		//src2�� �����ϴ� ���丮�� dst�� �����ϴ� ���丮�� �̵�
		Files.move(src2, dst2, StandardCopyOption.REPLACE_EXISTING);
		//dir1�� dir2�� �ٲ��(�̵�) ��
		//REPLACE_EXISTING : �̹� ������ �����Ѵٸ� �ش� ������ ��ü�Ѵ�.
		
		
		
	}

}
