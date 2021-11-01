package Question201_248;

import java.io.File;
import java.io.IOException;

public class Examp215 {
//	public void recDelete(String dirName) throws IOException {
//	File [] listOfFiles = new File (dirName) .listFiles();
//	if (listOfFiles != null && listOfFiles.length >0) {
//	for (File aFile : listOfFiles) {
//		if (aFile.isDirectory()) {
//			recDelete(aFile.getAbsolutePath ());
//				} else {
//						if (aFile.getName ().endsWith (".class"))
//								aFile.delete ();
//				}
//			}
//		}	
//	}
	
	//���� �ڵ� �϶� ������ 
//	A.The method deletes all the .class files in the Projects directory and its subdirectories.
	//	�� �޼���� Projects ���͸� �� ���� ���͸����ִ� ��� .class ������ �����մϴ�.
	
	public void recDelete (String dirName) throws IOException {
		File [ ] listOfFiles = new File (dirName) .listFiles();
		if (listOfFiles != null && listOfFiles.length >0) {
		for (File aFile : listOfFiles) {
		if (!aFile.isDirectory ()) {
		if (aFile.getName ().endsWith (".class"))
		aFile.delete ();
		}
		}
		}
		}
	
	// �� �ڵ�� �������丮�� class������ �������� �ʰ�,, Projects������ class���ϸ� ������
	// ��, ���� �ڵ��� �� ������   B.The method deletes the .class files of the Projects directory only.
//			�� �޼���� Projects ���͸��� .class ���� �� �����մϴ�.
	
	
//	C.The method executes and does not make any changes to the Projects directory.
//	�޼��尡 ����ǰ� Projects ���͸��� �������� �ʽ��ϴ�.
	//C�� ���� �ɷ��� 
	//�Ʒ� ���� !�� recDelete�� ���ȣ���ϰ�, else������ ����ϸ� ���� C
//	public void recDelete(String dirName) throws IOException {
//	File [] listOfFiles = new File (dirName) .listFiles();
//	if (listOfFiles != null && listOfFiles.length >0) {
//	for (File aFile : listOfFiles) {
//		if (!aFile.isDirectory()) {
//			recDelete(aFile.getAbsolutePath ());
//				} else {
//						if (aFile.getName ().endsWith (".class"))
//								aFile.delete ();
//				}
//			}
//		}	
//	}
	
	public static void main(String[] args) throws IOException {
		new Examp215().recDelete ("D:\\Projects");
}
}

/*
A. The method deletes all the .class files of the Projects directory only.
B. The method deletes the Projects directory.
C. The method executes and does not make any changes to the
D. The method throws an IOException.
�� �亯�� �̻��� �Ʒ� ����
A.
The method deletes all the .class files in the Projects directory and its subdirectories.  ---�̰� �´� �亯��
�� �޼���� Projects ���͸� �� ���� ���͸����ִ� ��� .class ������ �����մϴ�.
B.
The method deletes the .class files of the Projects directory only.
�� �޼���� Projects ���͸��� .class ���� �� �����մϴ�.
C.
The method executes and does not make any changes to the Projects directory.
�޼��尡 ����ǰ� Projects ���͸��� �������� �ʽ��ϴ�.
D.
The method throws an IOException.
�� �޼���� IOException�� throw�մϴ�.



https://www.briefmenow.org/oracle/what-is-the-result-936/



*/