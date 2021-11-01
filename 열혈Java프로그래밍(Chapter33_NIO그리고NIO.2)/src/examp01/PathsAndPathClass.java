package examp01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndPathClass {

	public static void main(String[] args) {
//		java.nio.file.path ���� �� ���丮�� ���ǥ���� ���� �ڹ� 7���� �߰��� �������̽�
//		ex) Path path = Pahts.get("C:\\JavaStudy\\PathDemo.java"); --�̰�ο� ������ �־���ϴ°� �ƴϴ�
//		path getRoot() ��Ʈ ���丮 ��ȯ
//		path getParent() �θ� ���丮 ��ȯ
//		path getFileName() ���� �̸� ��ȯ
		
		Path pt1 = Paths.get("C:\\JavaStudy\\PathDemo.java");  //��, �� ��δ� ������ �ֵ� ���� ������� �� ��δ�� ����� ��ȯ�Ѵ�.
		Path pt2 = pt1.getRoot();   //Get �޼ҵ� ȣ���� ���� ���δ� �ش� ���� �Ǵ� ���丮�� ���� ���ο� �������.
		Path pt3 = pt1.getParent();
		Path pt4 = pt1.getFileName();
		
		System.out.println("Absolute: "+pt1);
		System.out.println("Root: " +pt2);
		System.out.println("Parent: "+pt3);
		System.out.println("File: "+pt4);
				
	}

}
