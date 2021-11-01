package example01;

import java.io.IOException;

public class KeyboardToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		//System.out.println(bytes[99]);

		System.out.print("�Է� : ");
		int readBtyesNo = 0;
		try {
			//Ű����(ǥ���Է�)���κ��� �Է��� �ް� �� ������ bytes�� ������ �ϰ�
			//�Է¹��� ����Ʈ ���� ������.
		readBtyesNo = System.in.read(bytes);
		//���ڼ� EUC-KR�� ���ڵ�(����� ���� ���������� �ڵ��ϴ� ���� ���ڵ�)
		String str = new String(bytes, 0, readBtyesNo-2, "EUC-KR");  
		//String str = new String(bytes, 0, readBtyesNo-2, "UTF-8");
		System.out.println(str);
		System.out.println("�Է¹��� ����Ʈ �� : " + readBtyesNo);
		
		//EUC-KR : �ѱ� 2byte, UTF-8 : �ѱ� 3byte
		byte[] b = str.getBytes("EUC-KR"); //���ڵ� (�Ƴ��α׽�ȣ�� �����н�ȣ�� �ٲ�)
		System.out.println(b.length);
		
		//���ڵ��� ���ڵ��� �������� �ݵ�� �������� �����ϰ� �������� ���ڰ� �����ų� 
		//�ϴ� ������ ������ �� �ִ�.
		byte[] b2 = "�ȳ��ϼ���".getBytes("UTF-8");  //getBytes()�⺻���� EUC-KR
		String str1 = new String(b2, 0, b2.length, "UTF-8");
		System.out.println(str1);
		System.out.println(b2.length);
		} catch (IOException e) {}
		
	}

}
