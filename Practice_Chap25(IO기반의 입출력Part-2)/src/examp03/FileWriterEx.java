package examp03;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\Temp/abc.txt");
//		FileWriter fWriter = new FileWriter(file);   //������ ���� ��������.
		//�����ڿ� ture��� �Ű����� �ֱ� ������, ���� ���Ͽ� append�� �ȴ�.
		FileWriter fWriter = new FileWriter(file, true); //����ؼ� ������ �̾�����.   
		
		fWriter.write("FileWriterŬ������ ���� �����Դϴ�." + "\r\n");
		fWriter.write("FileWriterŬ������ �ٽ� ���� �����Դϴ�." + "\r\n");
		
		
		System.out.println(file.getName() + "�� �����Ǿ����ϴ�.");
		fWriter.flush();
		fWriter.close();
	}

}
