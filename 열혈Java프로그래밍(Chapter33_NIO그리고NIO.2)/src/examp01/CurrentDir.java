package examp01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDir {

	public static void main(String[] args) {
//		���� ���丮 ������ ��� ��
		Path cur = Paths.get(""); //���� ���丮 ���� '��� ���' ���·� ���  �ν��Ͻ� ����
		String cdir;
		
		
		if(cur.isAbsolute()) //������ ��Ÿ�Ϸ� ������ �ִ��İ� ���
			cdir = cur.toString();  //true�̸� �׳� ���
		else
			cdir = cur.toAbsolutePath().toString(); //false�̸� ������ ���
		
		System.out.println("Current dir :  "+cdir);
	}

}
