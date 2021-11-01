package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp86 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/software/././sys/readme.txt");
		Path path2 = path1.normalize(); //Path.normalize() �޼��带 ȣ���ϸ� �ߺ��Ǵ� �κ��� ������ �� �ִ� -- .�� �ߺ��Ǽ� ������� 3�� ī��Ʈ 
		Path path3 = path2.relativize(path1); //����θ� ����
		System.out.print(path1.getNameCount()); //getNameCount()�� ������� ������ �˼� �ִ� --���� /
		System.out.print(":"+path2.getNameCount());  
		System.out.print(":"+path3.getNameCount());
		
		
		System.out.println();
		System.out.println("Path2�� normalize �ߺ�����" + path2);
		System.out.println("Path3�� relativeze �����" + path3);
	}

}
//A. 5 : 3 : 6

//�� ��ġ ������ ��� �����ϱ�.
//- relativize() �޼���
//- �ΰ�� ������ ����θ� �����Ѵ�,
//- ���� ��ο��� ���ڷ� ���޵� ��ġ�� ������ ��θ� �����Ѵ�.
//- ���ο� ��δ� ��������� ����ΰ� �ȴ�.