package examp02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) throws Exception {
		//������ ���縦 �ϱ� ���ؼ� ��θ� ����
//		String oriFileName = "D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp02\\PPT.ppt";
//		String tarFileName = "D:/Temp/PPT.ppt";
		String oriFileName = "D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp02\\�迬��.png";
		String tarFileName = "D:/Temp/�迬��.png";

		File file = new File(oriFileName);
		FileInputStream fis = new FileInputStream(file);  //���Ϸκ��� �����͸� ����
		FileOutputStream fos = new FileOutputStream(tarFileName); //������ ������ ���
		
		
		int readByteCount;
		int i=0;
		byte[] bArr = new byte[100]; //����Ʈ �迭�� ũ�� �������� ����ð��� ��������.
		
		
		
		long startTime = System.currentTimeMillis(); //���� ������ �ð����� ����
		while((readByteCount=fis.read(bArr)) != -1) {
//			fos.write(bArr); //�̰� ���� �ڿ� ���� ����Ʈ�� ���� �� �ֱ� ������ �Ʒ�ó��
			fos.write(bArr, 0, readByteCount);  // 0���� readByteCount �� ��ŭ ���⶧���� ���� ����Ʈ�� ����.
			i++;
		}
		fos.flush();
		long endTime = System.currentTimeMillis(); //������ ���� ���� �ð�
		System.out.println("�� ���� �� : " + i);
		System.out.println("���� �ð� : " + (endTime - startTime) + "ms");  //300ms = 0.3��
		System.out.println("������ ������ ũ�� : " + (file.length()/1024) +  "kbyte"); //kb�� ǥ���ϱ�---> ������ 1024
		fis.close();
		fos.close();
		System.out.println(file.getName() + "������ ���簡 �Ϸ� �Ǿ����ϴ�.");
	}

}
