package examp04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\text.txt");
		Writer writer = new FileWriter("D:\\text_���纻.txt");
	
		
		String str = "";
		int readBytes;
		char[] cArr = new char[2];  //char[1000];�� char[2];�� ����
		int i=0;
		while( (readBytes=reader.read(cArr)) != -1) {
			i++;
			String str1 = new String(cArr);
			str += str1;
			System.out.println("���� �� : " + i);
			System.out.println("���� ����Ʈ �� : " + readBytes);
		}
		
//		char[1000], �� ����Ʈ���� 1000���� �ָ� �Ʒ� ó�� ����ص� �ȴ�.
//		readBytes=reader.read(cArr);
//		String str1 = new String(cArr);
//		writer.write(str1);
//		
		
		writer.write(str);
		
		
		
		writer.flush();
		System.out.println("D����̺꿡 text_���纻.txt������ �����Ǿ����ϴ�.");
		writer.close();
		reader.close();
	}

}
