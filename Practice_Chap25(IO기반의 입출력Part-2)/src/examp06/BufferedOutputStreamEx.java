package examp06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp06\\�迬��.png");
		System.out.println("������ ũ��  : " + ((file.length()/1024)/1024) + "MB"); //length()����Ʈ ũ��  --> ������ 1024�ϸ� KB �̰� �� 1024�� ������ MB
		
		//�ֽ�Ʈ��
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		
		//���� ��Ʈ��
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		
		
		byte[] bArr = new byte[100];
		
		
		
		//�ֽ�Ʈ���� ���� ��Ʈ���� ������--�Է�
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		//�ֽ�Ʈ���� ���� ��Ʈ���� ������--���
		fOutputStream = new FileOutputStream("D:\\Temp\\�迬��_copy.png");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		start = System.currentTimeMillis(); //�а� �����ϱ� �� �ð��� ����
		
		
		//byte[] �迭�� ���
		while((dataCount=bInputStream.read(bArr)) != -1) {
//			fOutputStream.write(bArr, 0, dataCount);  //����X,,,,,(������Ʈ�� ����)  byte[] �迭�� �̿���  --byte[100]�϶� 269ms
			bOutputStream.write(bArr, 0, dataCount);  //����O,,,,,(������Ʈ�� ���) byte[] �迭�� �̿���    --byte[100]�϶� 14ms
		}
		
		
		
		//byte[] �迭 ���� ���
//		while((dataCount=bInputStream.read()) != -1) {
//			fOutputStream.write(dataCount);  //����X,,,,,(������Ʈ�� ����)  1����Ʈ�� �а� 1����Ʈ�� �����ϴ� ��
//			bOutputStream.write(dataCount);  //����O,,,,,(������Ʈ�� ���)
//		}

		
		fOutputStream.flush();
		end = System.currentTimeMillis(); //�а� ���� �� �� �ð�
		
//		System.out.println("BufferedOutputStream�� ������� �ʾ��� �� : "  + (end - start) + "ms"); //23995ms�� ���Դ�
		
		System.out.println("BufferedOutputStream�� ������� �� : "  + (end - start) + "ms");  //67ms�� ���Դ�.
		
		
		//��� : �迭�� ����ؼ� �����ϰ� ��������� �ְ�, �ӵ��� ��������� ���� 		
		//BufferedInputStream,BufferedOutputStream ������Ʈ������ �����Ͽ� ����ϸ�
		//�ð��� �� �����Ű�� ������ ����Ų��.
		
		bInputStream.close();
		fInputStream.close();
		bOutputStream.close();
		fOutputStream.close();
	}

}
