package examp01;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws Exception {
		//�Ʒ����� �����Ѵٰ� �ؼ� Temp\directory������ ������ �ʴ´�.
		File directory = new File("D:/Temp/directory"); 
//		File directory = new File("D:/directory"); 
		File file1 = new File("D:/Temp/file1.txt");
		File file2 = new File("D:/Temp/file2.txt");
		//���������� file://localhost/D:Temp/file3.txt�ε� ����pc�� localhost�� �����Ѵ�.
		File file3 = new File(new URI("file:///D:/Temp/file3.txt"));
//		URI ��ü�� ���ڿ� ���۰� ������ ���� ���������̴�.
//		URL ��ü�� ��Ʈ��ũ ������ ���� ���������̴�.
//		���������� ��űԾ� (TCP/IP, UDP..)
//		URI�� �����ڿ� �ĺ��ڴ� ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ּҸ� �ǹ��Ѵ�.
		
		//URI ��� ����
//		String uriname = "http://www.google.co.kr/Temp/file3.txt";
//		URI uri = new URI(uriname);
//		System.out.println(uri);
		
		
	
		if(directory.exists() == false) {	//directory������ �����ϴ���?
//			mkdir()�� ("D:/Temp/directory")�θ� ���丮 Temp�� �ֱ� ������ �����ص� �ڵ����� ���丮�� ������ �ʴ´�
//			mkdir()�� ("D:/directory"); �ִ� �θ���丮�� ���� ������ �����ϸ� �ٷ� ���丮�� �����.
//			directory.mkdir();
			
			
			
//			mkdirs()�� ("D:/Temp/directory") �θ� ����(Temp)�� ���丮�� �Ѵ� ����� �ش�.(������)
			directory.mkdirs();
		}
		if(file1.exists() == false) { //file1.exists()�� file1��ο� file.txt������ �ִ�?����? ������ ����
			//���࿡ Temp������ ���ٸ� IOException�� �߻���Ų��.
			file1.createNewFile(); //file1 ��ο� file1.txt���� ����
			System.out.println("file1.txt�� �����Ǿ����ϴ�.");
		}
		if(file2.exists() == false) {
			file2.createNewFile(); //file2��ο� file1.txt���� ����
			System.out.println("file2.txt�� �����Ǿ����ϴ�.");
		}
		if(file3.exists() == false) {
			file3.createNewFile(); //file3 ��ο� file1.txt���� ����
			System.out.println("file3.txt�� �����Ǿ����ϴ�.");
		}
		

		
		
		File tmp = new File("D:/Temp");
		//tmp���� ���丮 �� ������ �迭�� ���� ����غ���
		File[] contents = tmp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println("����\t       �ð�\t\t����\tũ��\t�̸�");
		System.out.println(sdf.format(new Date()));
		System.out.println("-----------------------------------------");
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) { //file�� ���丮��?
				System.out.print("\t\t<Dir>\t\t" + file.getName()); //���丮 �̸��� ����Ѵ�.
			}
			else { //file�̸�
				System.out.print("\t\t" + file.length() + "\t" + file.getName()); //������ ũ��� �̸��� ����Ѵ�.
			}
			System.out.println();
		}
		
		
	}

}
