package Question151_200;

import java.io.File;
import java.io.IOException;

public class Examp195 {
	public void recDelete (String dirName) throws IOException {
		File [ ] listOfFiles = new File (dirName) .listFiles();
			if (listOfFiles != null && listOfFiles.length >0) {
				for (File aFile : listOfFiles) {
					if (!aFile.isDirectory ()) { //aFile.isDirectory ()=�������丮�� �ִٸ� true
												 //!aFile.isDirectory ()=�������丮�� ���ٸ� true
//						recDelete (aFile.getAbsolutePath ());
//					} else {  //������ �� ������ ����
						if (aFile.getName ().endsWith (".class"))
							aFile.delete ();
						}
					}
				}
		}

	 
	//�� : B. The method deletes the .class files of the Projects directory only.
//		B.�� �޼���� Projects ���͸��� .class ���� �� �����մϴ�.
	
	
	
	
	
//  https://www.briefmenow.org/oracle/what-is-the-result-936/	
		
//	A. The method deletes all the .class files in the Projects directory and its subdirectories.
	//A.�� �޼���� Projects ���͸��� ���� ���͸����ִ� ��� .class ������ �����մϴ�.
	//  if(aFile.isDirectory())  �϶�
	
//	B. The method deletes the .class files of the Projects directory only.
	//�� : B.�� �޼���� Projects ���͸��� .class ���� �� �����մϴ�.
	//  if(!aFile.isDirectory()) �϶�
	
//	C. The method executes and does not make any changes to the Projects directory.
//	�޼��尡 ����ǰ� Projects ���͸��� �������� �ʽ��ϴ�. 
	// �̰žƸ� ������ ���ǹ��� .class�� �ƴϰų� �ٸ� �ɷ� �ٵ�
	
//	D. The method throws an IOException. 
	//�̰� main�޼��� �ڿ� throws�� �������� �ʾҴٸ� ���� ����
	
	//8������ ,, 13�� ����

	public static void main(String[] args) {

	}

}
