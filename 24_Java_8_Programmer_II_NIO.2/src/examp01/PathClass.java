package examp01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {
//		Path��ü���� ������ ���� ���ִ� �� ���� ������ִ�. 
//		Path��ü�� �����̳� ���丮�� ���� �ֵ� ����ȴ�.
		
		//��ΰ� ���� ����� ���
			Path path = Paths.get("C:\\temp\\dir1\\file.txt");  
			// Or Path path = Paths.get("/temp/dir1/file.txt");
			System.out.println("toString(): " + path.toString());
			System.out.println("getFileName(): " + path.getFileName());
			System.out.println("getNameCount(): " +path.getNameCount());
			// Indexes start from zero 
			System.out.println("getName(0): " + path.getName(0));
			System.out.println("getName(1): " + path.getName(1));
			System.out.println("getName(2): " + path.getName(2));
			// subpath(beginIndex, endIndex) from beginIndex to endIndex-1
			System.out.println("subpath(0,2): " + path.subpath(0,2));
			System.out.println("getParent(): " + path.getParent());
			System.out.println("getRoot(): " + path.getRoot());
System.out.println("-----------------------------------------");
//			��� :
//
//			toString(): C:\temp\dir1\file.txt // Or /temp/dir1/file.txt
//			getFileName(): file.txt
//			getNameCount(): 3
//			getName(0): temp
//			getName(1): dir1
//			getName(2): file.txt
//			subpath(0,2): temp\dir1 // Or temp/dir1
//			getParent(): C:\temp\dir1 // Or /temp/dir1
//			getRoot(): C:\ // Or /
			
			//��ΰ� ������� ���
				Path path1 = Paths.get("dir1\\file.txt");// Or dir1/file.txt 
				System.out.println("toString(): " + path1.toString());
				System.out.println("getFileName(): " + path1.getFileName());
				System.out.println("getNameCount(): " + path1.getNameCount());
				System.out.println("getName(0): " + path1.getName(0));
				System.out.println("getName(1): " + path1.getName(1));
				System.out.println("subpath(0,2): " + path1.subpath(0,2));
				System.out.println("getParent(): " + path1.getParent());
				System.out.println("getRoot(): " + path1.getRoot());
				System.out.println("-------------------------------------");
//				. ���� ���丮 ����
//				.. ���� ���丮�� �����Ϸ���
//				���� ��� :
					Path p1 = Paths.get("/temp/./file.txt");  //           /temp/file.txt
					Path p2 = Paths.get( "/temp/dir1/../file.txt"); //    /temp//file.txt
				
				
//				�� ��� normalize () �޼��带 ����Ͽ� (..) �� �ߺ��� �����Ѵ�.
				Path path3 = Paths.get("/temp/dir1/../file.txt");
				System.out.println(path3); // /temp/dir1/../file.txt
				Path path4 = path.normalize();
				System.out.println(path4); // /temp/file.txt
				
//				�� ����� ������ �ִ��� Ȯ���ϱ� ���� ���� �ý��ۿ� �׼������� �����Ƿ� ��ο��� .. �� ���� �̸��� �����ϸ� �� �̻� ���� ������ �������� �ʴ� ��ΰ� ���� �� �� �ֽ��ϴ�.
//				�̴� ���� �̸��� �ɺ��� ��ũ (�ٸ� ���Ͽ� ���� ����) �� �� �߻��� �� �ֽ��ϴ�.
//				toRealPath () �޼��带 ����ϴ� ���� �����ϴ�.
//				Path toRealPath(LinkOption... options) throws IOException
				
//				�� ����� ������ �����մϴ�.
//				LinkOption.NOFOLLOW_LINKS�� �μ��� ���޵Ǵ� ��� ��ȣ ��ũ�� ������ �ʽ��ϴ� (�⺻������ �����).
//				��ΰ� ��� ����̸� ���� ��θ� ��ȯ�մϴ�.
//				�ߺ� ��Ұ� ���� �� ��θ� ��ȯ�մϴ� (�ִ� ���).
				
//				�� ��θ� ���� �� �� �ֽ��ϴ�. �� ���� ��찡 �ֽ��ϴ�.
//				ù ��° ���. ���� ��ΰ� �ְ� ��Ʈ ��� (�κ� ���)������ �� ��° ��ο� �����Ϸ��� ��� �� ��° ��ΰ� �߰��˴ϴ�.
//
//				Path path = Paths.get("/temp");
//				System.out.println(path.resolve("newDir")); // /temp/newDir
				
//				�� ��° ���. �κ� �Ǵ� ��� ��ΰ� �ְ��̸� ���� ��ο� �����Ϸ��� ��� ���� ���� ��ΰ� ��ȯ�˴ϴ�.
//
//				Path path = Paths.get("newDir");
//				System.out.println(path.resolve("/temp")); // /temp
				
				
				
//				relativize() �� �ٸ� ��̷ο� ����Դϴ�.
//
//				path1.relativize(path2)��ó�� ������ ���� ��� ��� 2�� ��� 1���� ���� ���ִ� ��θ� �����մϴ� .
//
//				���� ���, ���丮�� /temp�ְ�� �̵��Ϸ��� /temp/dir1/subdir���� dir1�� �̵� �� ���� subdir�� �̵��ؾ��մϴ�.
//
//				Path path1 = Paths.get("temp");
//				Path path2 = Paths.get("temp/dir1/file.txt");
//				Path path1ToPath2 = path1.relativize(path2); // dir1/file.txt
//
//				��ΰ� �ٸ� �������� �� ���� ģô ��θ� ��Ÿ���� ��� ������ ���ֵǹǷ� ���� ���͸��� �̵� �� ���� �ٸ� ���͸��� �̵��ؾ��մϴ�.
//				Path path1 = Paths.get("dir1");
//				Path path1ToPath2 = path1.relativize(Paths.get("dir2")); // ../dir2
//				�� ���� ��� ��� ��θ� ����մϴ�.
//				��� �� �ϳ��� ���� ��� �� ��� ���� �������� ��� ��θ� ���� �� �� ������ a llegalArgumentException�� �߻��մϴ�.
				
//				Path absPath = Paths.get("c:\\temp\\dir1\\file.txt");
//				Path relPath = Paths.get("temp\\dir1\\file.txt");
//
//				boolean startsWith(Path other)
//				absPath.startsWith(Paths.get("c:\\temp\\file.txt")); // false
//				absPath.startsWith(Paths.get("c:\\temp\\dir1\\img.jpg")); // false
//				absPath.startsWith(Paths.get("c:\\temp\\dir1\\")) // true  O
//				absPath.startsWith(relPath); // false
//
//				boolean startsWith(String other)
//				relPath.startsWith("t"); // false
//				relPath.startsWith("temp"); // true   O
//				relPath.startsWith("temp\\d"); // false
//				relPath.startsWith("temp\\dir1"); // true O
//
//				boolean endsWith(Path other)
//				absPath.endsWith("file.txt"); // true  O
//				absPath.endsWith("d:\\temp\\dir1\\file.txt"); // false
//				relPath.endsWith(absPath); // false
//
//				boolean endsWith(String other)
//				relPath.endsWith("txt"); // false
//				relPath.endsWith("file.txt"); // true O
//				relPath.endsWith("\\dir1\\file.txt"); // false
//				relPath.endsWith("dir1\\file.txt"); // true O
	}

}
