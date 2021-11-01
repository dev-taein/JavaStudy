package Question151_200;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp178 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log"); //resolve()�� �����ϴ°���
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path2.resolve("/readme/"); //�̰��� /��ΰ� �ֱ⶧���� ������ �Ұ�����..
		System.out.println(res1);
		System.out.println(res2);

		//�� : C. /app/./sys/log /readme
	
		//D. /app/./sys/log /server/exe/readme �̰���� ���÷��� /readme/ --> readme/�� �ٲټ�

	}

}


/*
�� ��θ� �����ϱ�
// ���� ���(fixed path)�� �����Ѵ�
Path base = Paths.get("/rafaelnadal/tournaments/2009");


// C:\rafaelnadal\tournaments\2009\BNP.txt"
Path path_1 = base.resolve("BNP.txt");
path_1.toString();


// C:\rafaelnadal\tournaments\2009\AEGON.txt"
Path path_2 = base.resolve("AEGON.txt");
path_2.toString();
*/