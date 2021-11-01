package examp02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx02 {

	public static void main(String[] args) throws Exception {
			//���Ϸκ��� ��½�Ʈ���� �����ؼ� ������ �ϰ� �ִ�.
			OutputStream oStream = new FileOutputStream("D:\\write.txt");
			//"ABC������"���ڿ��� ���ؼ� ����Ʈ �迭�� ��� �ִ�.
			byte[] data = "ABC������".getBytes("UTF-8");  //������ �׻� 1����Ʈ
			//x-windows-949 ��Ŭ���� �⺻ ĳ���� ���� �ѱ� 2����Ʈ�� �ν��Ѵ�. 
			//getBytes()�� ����� ��, �Ű������� ������ ĳ���� ���� �� ���� �ִµ�,
			//EUC-KR�� �ѱ��� 2����Ʈ�� �ν�,,UTF-8�� �ѱ��� 3����Ʈ�� �ν��Ѵ�.,, ISO8859-1�� �ѱ��� 1����Ʈ�� �ν��Ѵ�.
			System.out.println("data ����Ʈ �迭�� ũ�� : " + data.length);
			
			
			//����Ʈ �迭�� �ѹ��� ��Ʈ���� ������. �ռ��� �� write(int b)�޼��忡 ���ؼ�
			//�ξ� ȿ�����̴�.
			oStream.write(data); //write(byte[] b) 
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			oStream.flush();
			
			
			
			
			
			//������� ������ ������ write.txt������ �о� ���δ�.
			InputStream iStream = new FileInputStream("D:\\write.txt"); //�о���̱�
			int count = 0;
			byte[] readBytes = new byte[3];
			int i = 0;
			while((count=iStream.read(readBytes)) != -1 ) {
				i++;
				String str = new String(readBytes, "UTF-8"); //���ڵ�
				System.out.println("���� �� : " + str);
				System.out.println("���� ����Ʈ �� : " + count);
				
			}
			
			System.out.println("���� �� : " + i);
			
			
			
			iStream.close();
			oStream.close();
	}
}
