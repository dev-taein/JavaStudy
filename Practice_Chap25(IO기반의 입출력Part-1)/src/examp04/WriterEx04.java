package examp04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\text.txt");
		String str = "�ȳ��ϼ���. ���� �ڹٸ� ����ġ�� �־��.";
		
		
		
//		writer.write(str); //writer(String)  �Ű����� Ÿ���� String�̴�
		writer.write(str, 2, 10);  //��������,,,���ڿ� 2��° �ε������� 10���� ���ڸ� ���Ϸ� �����϶�
		
		
		
		
		
		
		writer.flush();
		writer.close();
	}

}
