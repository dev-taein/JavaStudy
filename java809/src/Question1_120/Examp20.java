package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp20 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount() +":" + p1.getName(1) + ":" + p1.getFileName());
		//p1.getName(1)�� �ε����� 1���� �����̿��� pics�� 0��° �ε�����,, Mypic�� 1��° �ε������� �̰��� ����Ѵ�.
		
		
//		Path ��ü�� getNameCount �޼���� ��� �������ִ� ���� �Ǵ� ���͸� �̸��� ���� ����մϴ�. 
//		�� ������ ��δ� "/Pics/MyPic.jpeg"�̹Ƿ� "Pics"�� "MyPic.jpeg"��� �� ���� �̸��� �ֽ��ϴ�.
//
//		Path ��ü�� getName �޼���� ��� �������� ���� �Ǵ� ���͸� �̸��� �����ɴϴ�. �ε��� ���� 0���� �����մϴ�.
//
//		Path ��ü�� getFileName �޼���� ������ �����̸��� �����ɴϴ�.
//
//		������ ������ ���� �Ǵ� ���丮�� �����ϴ��� ���ο� ������� ��µ˴ϴ�.
		
		
//		�� : 2:MyPic.jpeg:MyPic.jpeg 
	}

}
