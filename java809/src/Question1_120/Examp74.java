package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

class FileThread implements Runnable {
String fName;
public FileThread(String fName) { this.fName = fName; }
public void run () {System.out.println(fName);}
}
public class Examp74 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService executor = Executors.newCachedThreadPool();
		Stream<Path> listOfFiles = Files.walk(Paths.get("D:\\data")); 
		listOfFiles.forEach(line -> { executor.execute(new FileThread(line.getFileName().toString())); // line n1
		});  //��� ���� ���丮�� ���ϵ��� �ϳ��� ����Ʈ�� ����� 
		//Files.walk(path);path���� String ���ڿ��� �ƴ� Path �������̽��� ��ü�� �Ķ���ͷ� ������ Paths.get("���"); �� �̿��� ��ü�� ��� �� �� �ִ�

		//��: B. ���α׷��� ���� �̸��� ���ÿ� �μ��մϴ�. The program prints files names concurrently.
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.DAYS); // line n2
		//������ 5�ϵ��� ��� �ϸ� ��� �۾��� ��� �����Ǿ����� üũ �Ѵ�. �۾��� ��� ���� �ɶ� ����, ������ �ð����� Loop ����
	}
}
	//The Java Projects directory exists and contains a list of files. 
//		Java Projects ���丮�� �����ϸ� ���� ����� �����մϴ�.
//	Files Ŭ������ walk �޼���� ���� �켱�� ����Ͽ� ������ ������ ��θ� �湮 �� �� �ֽ��ϴ�.

//ExecutorService ��ü�� execute �޼���� �� �����带 ����Ͽ� ���� �� Runnable ��ü�� ������ �� �ֽ��ϴ�.
//shutdown �޼���� �� �̻� �� ���� ��ü (Runnable �Ǵ� Callable)�� ������� �ʵ��� ExecutorService 
//��ü�� ���� �� ������ ���� ����ǰ� ������� �۾��� �Ϸ� �� ������ ��ٸ��� �ʽ��ϴ�. awaitTermination �޼���� ExecutorService 
//��ü�� ��� �۾� ó���� �Ϸ� �� ������ ����ϴ� ���� �ð��� ������ �� �ֽ��ϴ�. 
//B. The program prints files names concurrently.

/*
newFixedThreadPool
�־��� �����尳����ŭ �����ϰ�, �� ���� �����Ѵ�. �̶� ������ �������� �Ϻΰ� �۾��� ����Ǿ��ٸ� �����带 �ٽû����Ͽ� �־��� ���� �����.

newCachedThreadPool
ó���� �۾��� �����尡 �������� �� ��ŭ �����带 �����Ͽ� �����Ѵ�. ���� ���� �����尡 ���ٸ� �����带 �����Ų��. �ݸ� �����带 ���ѵ��� �ʱ⶧���� ������ ����ؾ� �Ѵ�.

newSingleThreadExecutor
�����带 �� �ϳ��� �����Ѵ�. ���� �����尡 ������������ ����Ǿ��ٸ� �ٽ� �ϳ��� �����Ѵ�.

newScheduledThreadPool
Ư���ð� ���Ŀ� ����ǰų� �ֱ������� �۾��� ������ �� �ִ�.
*/
