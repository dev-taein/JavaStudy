package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp83 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log"); //�����
		Path path2 = Paths.get("/server/exe/");  
		Path res2 = path2.resolve("/readme/");   //������ = resovlve X
//		Path res2 = path2.resolve("readme"); // ����� O--  ��� :/server/exe/readme 
		System.out.println(res1);
		System.out.println(res2);
		
		// ("/ readme /")�� ���� ����̹Ƿ��� ��δ� resolve �޼���� ������� ������ ������ ��� / readme�� ����մϴ�.
		
		//��� :  /app/./sys/log /readme
	}

}
