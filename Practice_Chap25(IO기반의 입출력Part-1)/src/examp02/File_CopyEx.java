package examp02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_CopyEx {

	public static void main(String[] args) throws Exception {
		
		//�Է°� ����� ���ÿ� �ϴ¹�
		
		FileInputStream fInputStream = new FileInputStream("D:\\write.txt");
		
		FileOutputStream fOutputStream = new FileOutputStream("D:\\write���纻.txt");
		
		byte[] readBytes = new byte[1000];
		int data = 0;
		
		
		
		
		
		while((data=fInputStream.read(readBytes)) != -1 ) {
			fOutputStream.write(readBytes);
			System.out.println("���� ����Ʈ �� : " + data);
		}
		
		
//		data=fInputStream.read(readBytes);
//		fOutputStream.write(readBytes);
//		System.out.println("���� ����Ʈ �� : " + data);
		
		
		
		fOutputStream.flush();
		System.out.println("D����̺꿡 write���纻.txt ������ �����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		fInputStream.close();
		
		fOutputStream.close();
	}

}
