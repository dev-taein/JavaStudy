package examp04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx02 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\text.txt");
		char[] str = "������".toCharArray();
		
		
		
		//writer()�� �Ű����� Ÿ���� ���ڹ迭�̴�. ������ �н��ߴ� writer(int b)����
		//�ξ� ȿ�����̴�.
		writer.write(str); // writer(char[])Ÿ����
		writer.flush();
		System.out.println("������ �����Ǿ����ϴ�.");
		writer.close();
	}

}
