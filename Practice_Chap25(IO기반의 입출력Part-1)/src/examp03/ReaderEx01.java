package examp03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		//ReaderŬ������ ���� Ưȭ Ŭ�����ν� ���� Ŭ������ FileReader�� �����ؼ� ����
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		
		
		
		//��� 1----��õ �ڵ尡 ª��
		//readData������ int���̹Ƿ� �� 2����Ʈ(���� 2����Ʈ�̴ϱ�)�� ����ȴ�.
//		while((readData=reader.read()) != -1) {
//			//���ڸ� ����� (����Ʈ ������ char���� ĳ����)
//			System.out.println("���� ���� : " + (char)readData);
//			//�����ڴ� �ƽ�Ű�ڵ尡 ����̵ǰ�, �ѱ��� �����ڵ尡 ����� �ȴ�.
//			System.out.println("���� ���� : " + readData);
//			
//		}
		
		System.out.println("------------------------------------");
		
		//���2
		while(true) {
			readData = reader.read();
			if(readData == -1 )
				break;
			//���ڸ� ����� (����Ʈ ������ char���� ĳ����)
			System.out.println("���� ���� : " + (char)readData);
			//�����ڴ� �ƽ�Ű�ڵ尡 ����̵ǰ�, �ѱ��� �����ڵ尡 ����� �ȴ�.
			System.out.println("���� ���� : " + readData);
		}
		
		reader.close();
		
	}

}
