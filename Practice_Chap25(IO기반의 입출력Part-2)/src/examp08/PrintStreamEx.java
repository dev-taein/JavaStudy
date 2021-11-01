package examp08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\printStream.txt");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		//������Ʈ�� �߿��� ������ ����ϰ� �Ͼ ��쿡 ����� �ϸ� ����.
		PrintStream pStream = new PrintStream(fOutputStream);
		
		//���Ͽ� ����� �Ѵ�. ��½�Ʈ���̶� System.out(�ܼ�)�ؼ� ����ص� �ȴ�.
		pStream.println("[����Ʈ ��Ʈ�� ���]");
		pStream.println("����");
		pStream.println("�ڹ� ���α׷� ����");
		pStream.println("�����Ͱ� ����ϴ� �� ó��");
		pStream.println("���α׷��� ���� �����͸� ����մϴ�.");
		
		System.out.println("���� ���� �Ϸ�");
		
		
		System.out.printf("%.2f, %d, %s", 10.123,20,"������");
		
		
		
		
		
		
		
		
		pStream.flush();
		pStream.close();
	}

}
