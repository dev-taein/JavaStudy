package Question201_248;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp219 {

	public static void main(String[] args) {
		Path p1 = Paths.get("/Pics/MyPic.jpeg"); //���丮�� ��� ����Ѵ�. �̰�η� �����
		System.out.println (p1.getNameCount() + //���ڼ� ����"/" �� pics�� mypic �� 2��
		":" + p1.getName(1) + //1��° �̸�  MyPic
		":" + p1.getFileName()); //�׸��� ����� ���� �̸�MyPic
		
//		Pics directory does NOT exist. Pics ���丮�� �����ϴ�.
		
		//getName(1)�϶��� �� :B. 2:MyPic.jpeg: MyPic.jpeg
		//getName(0)�϶��� �� :D. 2:Pics: MyPic.jpeg
	}

}
