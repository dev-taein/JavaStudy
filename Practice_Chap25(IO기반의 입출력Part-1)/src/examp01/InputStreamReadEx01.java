package examp01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadEx01 {

	public static void main(String[] args) throws Exception{
		//�Ϲݿ��ܰ� �߻��ϴµ� �� ���ܸ� JVM���� ������ �ִ�.	������ ������ IOException�� �߻��Ѵ�.
		//�������� ����� �ڵ�---FileInputStream�� InputStream�� ��ӹް� �ִ�.
		InputStream iStream = new FileInputStream("D:\\test.txt"); //�Է� ��Ʈ��
		int readByte; //���� ����Ʈ ���� ���� �޴� ����
		
		//InputStream�� read()�� ���̻� ������ ���ٸ�, -1���� �����Ѵ�.
		//�⺻������ ��Ŭ������ �ѱ��� 2����Ʈ�� �о���δ�.
		//��� 1
		while((readByte = iStream.read()) != -1) {  //read()�� 1byte�� �д´�.
			System.out.println("���� Byte �� : " + readByte);   //�ƽ�Ű �ڵ尪�� ���
			System.out.println("���� ���� : " + (char)readByte); //���� Ÿ�� ĳ���� �� ���ڸ� ���
		}
		System.out.println(Charset.defaultCharset());
		
		//���2  �㳪, ��ó�� �ڵ带 �ٿ��ִ°� ���� ����.
//		while(true) {
//			readByte = iStream.read();
//			if(readByte == -1) {
//				break;
//			}
//			System.out.println("���� Byte �� : " + readByte);   //�ƽ�Ű �ڵ尪�� ���
//			System.out.println("���� ���� : " + (char)readByte); //���� Ÿ�� ĳ���� �� ���ڸ� ���
//		}
		iStream.close();//���ҽ��� ����
	}

}
