package examp01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception{
		//   '\'��ȣ �ΰ� '\\'��      '/'�ϳ��� ����,,,, '\'�� �̽������� ����
		File file = new File("D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp01\\FileInputStreamEx.java");
		System.out.println("������ ��� : " + file.getPath());  //������ ��θ� ���
		System.out.println("�θ� ���丮 : " + file.getParent());
		System.out.println("������ ���డ���Ѱ�? : " + file.canExecute());
		System.out.println("�б� �����Ѱ� ? : " + file.canRead());
		System.out.println("���⳪ ������ �����Ѱ� ? : " + file.canWrite());
		System.out.println("���� �̸��� ���� ? : " + file.getName());
		System.out.println("�������� �ΰ�? : " + file.isHidden());
		System.out.println("������ ũ�� : " + file.length());
		System.out.println("URI ��� ���� : " + file.toURI());
//		System.out.println("URL ��� ���� : " + file.toURL());
		
		//�������� �Ű������� File��ü�� �ް� �ִ�.
		FileInputStream fis = new FileInputStream(file);
//		FileInputStream fis = new FileInputStream("D:\\java�۾�\\Practice_Chap25(IO����� �����Part-2)\\src\\examp01\\FileInputStreamEx.java");
		
		
		
		//Read()���� 1����Ʈ�� �о��
		int data;
		int i = 0 ;
		
		
		
		
		//����Ʈ �迭 �̿��� ���--�ӵ��� ����--- ���� Ƚ���� 2��
		
//		byte[] bArr = new byte[1000]; ����Ʈ �迭�� ���� �ӵ��� ��������.
//		while((data = fis.read(bArr)) != - 1) {
			//�ܼ� ���(���� System.out.println()�� ����ص� �����ϳ�,
			//1����Ʈ�� �д� ���� �ѱ��� ������ ��찡 �ֱ� ������ write()�� �ᵵ ������.
			//write()�� ���� ��� ��Ʈ���̱� ������ ������ ���̴�.
//			System.out.write(bArr);
			
			//�Ʒ� �ڵ�� �ѱ��� ������,,, 1����Ʈ�� �б⶧����
//			System.out.print((char)data);
//			i++;
//		}
		
		
		
		
		
		
		//�Ϲ����� ��� ����
		while((data = fis.read()) != - 1) {
			//�ܼ� ���(���� System.out.println()�� ����ص� �����ϳ�,
			//1����Ʈ�� �д� ���� �ѱ��� ������ ��찡 �ֱ� ������ write()�� �ᵵ ������.
			//write()�� ���� ��� ��Ʈ���̱� ������ ������ ���̴�.
			System.out.write(data);
			
			//�Ʒ� �ڵ�� �ѱ��� ������,,, 1����Ʈ�� �б⶧����
//			System.out.print((char)data);
			i++;
		}
		System.out.println("���� �� : " + i);
		fis.close();
	}
}
