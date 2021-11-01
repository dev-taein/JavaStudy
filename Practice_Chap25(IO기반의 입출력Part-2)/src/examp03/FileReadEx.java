package examp03;

import java.io.File;
import java.io.FileReader;

public class FileReadEx {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp03\\files\\���������� ��ȭ��.txt");
		System.out.println(file.getCanonicalPath());
		//~~~Reader, ~~~Writer �ٴ� Ŭ�������� ���� Ưȭ ��� Ŭ���� (( �̹�����, ���� �Ұ�)
		FileReader fiReader = new FileReader(file);
//		System.out.println("���� ũ�� : " + file.length());
		
		int readCharNo;
		
		//����� Ŭ���� ���� �����͸� �ѹ��� �б� ������ �ӵ��� ���ȴ�.
		char[] cArr = new char[100]; /// 200����Ʈ �Ҵ�  -- �ѹ��ڰ� 2����Ʈ�ϱ�
		int i = 0; 
		
		while((readCharNo=fiReader.read(cArr)) != -1 ) {
			String str = new String(cArr, 0, readCharNo);
			System.out.print(str);
			i++;
		}
		
//		System.out.println();
		System.out.write(13); //����
		System.out.println("���� �� : " + i);
		
		
		
		fiReader.close();
	}

}
