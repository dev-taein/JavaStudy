package Question1_120;

import java.io.File;
import java.io.IOException;

public class Examp13 {
	public void recDelete (String dirName) throws IOException {
		File [ ] listOfFiles = new File (dirName).listFiles();
		
		if (listOfFiles != null && listOfFiles.length >0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory ()) {
					recDelete (aFile.getAbsolutePath ()); //recDelete�޼��� ȣ��
					} else {
								if (aFile.getName ().endsWith(".class"))
									aFile.delete ();
							}
				}
			}
		}
}

//getPath() : �Էµ� ��� ���
//getAbsolutePath() : ������+�ԷµȰ�� ( ������� ������� )
//getCanonicalPath() : ������+�ԷµȰ��( ����� ���)
//ex)
//File file = new File("..")
//file.getPath(); ==> ��� : ..
//file.getAbsolutePath(); ==> ��� : C:\sou\project\src\..
//file.getCanonicalPath(); ==> ��� : C:\sou\project


//Projects�� .class ������ ���� �� ���� ���͸��� ���ԵǾ� �ְ� ȣ��� recDelete () �޼��忡 �μ��� ���޵ȴٰ� �����մϴ�.
//����� �����Դϱ�? A
//A. The method deletes all the .class files in the Projects directory and its subdirectories. // ��
//B. The method deletes the .class files of the Projects directory only.
//C. The method executes and does not make any changes to the Projects directory.
//D. The method throws an IOException.
//A.�� �޼���� Projects ���͸��� ���� ���͸����ִ� ��� .class ������ �����մϴ�.
//B.�� �޼���� Projects ���͸��� .class ���� �� �����մϴ�.
//C. �޼��尡 ����ǰ� Projects ���͸��� �������� �ʽ��ϴ�.
//D. �޼��忡�� IOException�� �߻��մϴ�.