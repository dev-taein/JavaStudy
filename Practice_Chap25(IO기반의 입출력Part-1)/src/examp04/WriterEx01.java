package examp04;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

public class WriterEx01 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\text.txt");
		
		
		//toCharArray()�� ���ڿ��� char[]�� �������ش�.
		char[] str  = "ȫ�浿".toCharArray();
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<str.length; i++) {
			//�ѹ��ھ� ������ ����
			writer.write(str[i]);   // writer(int )Ÿ����
			System.out.println("���� �� : " + i);
		}
		
		writer.flush();  //������ ���۸� ����ش�.
		System.out.println("������ �����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		writer.close();
	}

}
