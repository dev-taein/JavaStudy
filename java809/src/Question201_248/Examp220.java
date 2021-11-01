package Question201_248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp220 {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get ("/data/december/log.txt");  
		Path destination = Paths.get("/data");  //("/data/log.txt");
		Files.copy (source, destination);
		
//		/data/december/log.txt is accessible and contains:
//			and assuming that the file
//			10-Dec-2014 Executed successfully
//			What is the result?
//			log.txt is created in the /data directory and the content of the /data/december/log.txt file is copied to it.
//		
		
		
//		("/data") �϶� �� : A FileAlreadyExistsException is thrown at run time.
//		
//	("/data/log.txt");�� �ٲٰ� �Ǹ� ����
//	log.txt��� �̸��� ������ / data ���丮�� �����ǰ� / data / december /log.txt ������ ������ ���⿡ ����˴ϴ�.
//		A file with the name log.txt is created in the /data directory and the 
//				content of the /data/december/log.txt file is copied to it.
		
		
	}

}
