package examp04;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception {
		//�� ��Ʈ���� ������.
		FileOutputStream fStream = new FileOutputStream("D:\\writer.txt");   //c����̺꿡 ���� ������ ������ ������ �������ִ�.
		
		//������Ʈ�� ������.
		Writer writer = new OutputStreamWriter(fStream); //������Ʈ���� �ֽ�Ʈ���� ����
		
		
		//������ ������
		String data = "���� �����͸� ���� ��½�Ʈ������ ������ ����Ʈ ������� ��ȯ�Ǿ� �����";
		writer.write(data); //���� ��Ʈ�� ��, ���ڱ�� ��Ʈ���� outputStreamWriter�� data�� ������ ����Ʈ ������� ��ȯ �����ִ� ������ ��.
		
		System.out.println("������ ����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		writer.flush();
		writer.close();
	}

}
