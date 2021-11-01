package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;


public class Examp31 {

	public static void main(String[] args) throws Exception {
	
	  						//.walk(Paths.get("���"))  ���� ���丮 ���� �ҷ�����
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home"))); files.forEach (fName ->  //line n1 
		{
			try {
				Path aPath = fName.toAbsolutePath();
				System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime()); //���ϻ�����¥��������
			} catch (IOException ex) {
				ex.printStackTrace();
				}
		});
		
//		�� : A. All files and directories under the home directory are listed along with their attributes.
//		A. Ȩ ���丮 �Ʒ��� ��� ���ϰ� ���丮�� �Ӽ��� �Բ� �����˴ϴ�.	
		
//			try {
//				Path aPath = fName.toAbsolutePath(); //line n2   //toAbsolutePath()�� ����θ� �����η� ��ȯ�Ѵ�.
//				System.out.println(fName + ":"
//				+ Files.readAttributes(aPath,   //Files.readAttributes(���� �н�, View Ŭ����); ���ϼӼ��� �����´�.
//				BasicFile.Attributes.class).creationTime());  //creationTime()������ ���� ��¥
//				} catch (IOException ex) {
//				ex.printStackTrace();
//				}});
		
		
	}

}
