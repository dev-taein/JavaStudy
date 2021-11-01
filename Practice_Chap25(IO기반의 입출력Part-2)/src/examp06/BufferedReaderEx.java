package examp06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		
		//�� ��Ʈ���� ����Ʈ ���
		InputStream iStream = System.in;
		
		//������Ʈ�� ù��° : ����Ʈ�� ���ڷ� �ٲ��ִ� InputStreamReader�� ������.
		Reader reader = new InputStreamReader(iStream);
		
		//������Ʈ�� �ι�° : ���۸� ���ڷ� �ٲ��ִ� BufferedReader�� ������.  (�ӵ� �� ���� ����� ���ش�.)
		BufferedReader bReader = new BufferedReader(reader);
		
		System.out.print("�Է� : ");  //����, BufferedReader������Ʈ���� readLine()�� ����ϱ� ���ؼ� ���� ���ȴ�.
		String lineString = bReader.readLine(); //readLine()���� ������ �о� ���δ�.
		
		System.out.println("��� : " + lineString);
		
		
		iStream.close();
		reader.close();
		bReader.close();
	}

}
