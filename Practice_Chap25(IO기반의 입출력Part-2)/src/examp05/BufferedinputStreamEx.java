package examp05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedinputStreamEx {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		File file = new File("D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp05\\�迬��.png");
		//����Ʈ ������� �ӵ��� ���̸� ���� ���� ���α׷��� �ۼ��غ���.
		FileInputStream fStream1 = new FileInputStream(file);
		System.out.println("File�� ũ�� : " + file.length());
		
		System.out.println("����Ʈ ��� �б� ���� ");
		start = System.currentTimeMillis();
		//�׳� �б⸸ �Ѵ�
		while(fStream1.read()!= -1) {}
		System.out.println("����Ʈ ��� �б� ��");
		end = System.currentTimeMillis();
		System.out.println("���۸� ������� �ʾ��� �� (����Ʈ ���)" + (end - start));
		fStream1.close();
		
		System.out.println();
		
		//�� �Է½�Ʈ���� FileInputStream���ٰ� �ӵ� �� ���� ��� ������Ʈ���� BufferedInputStream�� �����Ѵ�.
		//���������� ������ �о���� ��Ʈ���� �� ��Ʈ���̰� �� �о�� �����͸� ���� ó�� ���ִ� ������ �ٷ� ���� ��Ʈ����BufferedInputStream�̴�.
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);
		
		System.out.println("���� ��� �б� ����");
		start = System.currentTimeMillis();
		while(bStream.read()!= -1) {}
		System.out.println("���� ��� �б� ��");
		end = System.currentTimeMillis();
		System.out.println("���۸� ��� ������ (���� ���)" + (end - start));  //���� 500���̻� ��������.
		
		fStream2.close();
		bStream.close();
	}
}
