package examp01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception{
		InputStream iStream = new FileInputStream("D:\\test.txt"); //----->D:/test.txt   �Ȱ���  //������ �����Ҷ� �ɼ��� ANSI�� �ؾߵ�   UTF-8 X
		int readByteNO;
		int i = 0;
		
		//�ѱ��� 2����Ʈ�ε� ũ�⸦ 3���� �ָ� �ѱ��� ������.
		byte [] b = new byte[2];
		
		while( (readByteNO = iStream.read(b)) != -1 ) {
			System.out.println("���� byte �� : "  + readByteNO);
			
			//StringŬ������ �ݵ�� ���ڵ��ؾ� �ѱ��� ��µȴ�.
			String str = new String(b);
			System.out.println("���� ���ڿ�  : "  + str);
			i++;
		}
		iStream.close();
	}

}
