package examp01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReaderEx03 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("D:\\test.txt");
		int count;
		byte[] readbytes = new byte[8];
		
		
		
		//���� �ε����� 2�̰� 3���� �о �����ϴ� �ڵ带 �ۼ��Ѵ�.
		count = iStream.read(readbytes, 2, 4); //2��° �ε������� 4���� �����Ͷ�
		System.out.println("���� ����Ʈ �� : " + count);
		System.out.println();
		for(byte b : readbytes) {
			System.out.println("���� ����Ʈ : " + (char)b);
		}
		
		
		
		
		
		iStream.close();
	}

}
