package examp03;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx02 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		char[] cArr = new char[2];
//		String str = "";     //StringŬ������ �̿��� ���
		StringBuilder sbBuilder = new StringBuilder();  //StringBuilder�� �̿��� ���
		
		//read()�Ű������� char[]Ÿ���̶�� �Ϳ� �ָ��� �ݵ�� ����
		while((readData = reader.read(cArr)) != -1) {
//			str += new String(cArr, 0, readData); //���� ���ڸ� ���ڿ��� �����Ѵ�.  //StringŬ������ �̿��� ���
			sbBuilder.append(cArr); //StringBuilder�� �̿��� ���
			System.out.println("���� ���� �� : " + readData);
		}
		//���ڿ� ���
		System.out.println(sbBuilder);
		
		
		
		
		
		
		
		
		
		
		
		
		reader.close();
		
	}

}
