package examp04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx03 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\text.txt");
		
		//���ڿ� -> ���ڹ迭�� ������
		char[] str = "�������̴�".toCharArray();
		
		writer.write(str, 1, 4);
		System.out.println("������  �����Ǿ����ϴ�.");
		
		writer.flush();
		writer.close();
	}

}
