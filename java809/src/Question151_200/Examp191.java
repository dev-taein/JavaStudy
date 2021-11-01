package Question151_200;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Examp191 {

	public static void main(String[] args) throws IOException {
		//.walk(Paths.get("���"))  ���� ���丮 ���� �ҷ�����
		//�Ʒ� ��Ʈ���� walk�� ���� ���丮 ��� ���� ������
		Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home"))); 
		files.forEach (fName -> { //line n1 
			try {
			Path aPath = fName.toAbsolutePath(); //line n2    toAbsolutePath()�� ����θ� �����η� ��ȯ�Ѵ�.
			System.out.println(fName + ":"
			+ Files.readAttributes(aPath, BasicFileAttributes.class).creationTime//�����ð�
			());
			} catch (IOException ex) {
			ex.printStackTrace();
			}
			});
		//�� : C. The files and folders in the home directory are listed along with their attributes.
	}
}

//��� Files.list�� user.home�� ����Ʈ�� ������ = �� : C
// 	 Files.Walk�� user.home�� �������丮���� ������ = �� :A 



//31�� ������ �Ȱ���
//31���� A. All files and directories under the home directory are listed along with their attributes.
//A. Ȩ ���丮 �Ʒ��� ��� ���ϰ� ���丮�� �Ӽ��� �Բ� �����˴ϴ�.
//directories =  Files.walk



//191�� ������ C. The files and folders in the home directory are listed along with their attributes.
//C. Ȩ ���丮�� ���ϰ� ������ �ش� �Ӽ��� �Բ� �����˴ϴ�.
//folders = Files.list