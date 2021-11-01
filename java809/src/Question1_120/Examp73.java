package Question1_120;

import java.time.LocalTime;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallerThread implements Callable<String> {
String str;
public CallerThread(String s) {this.str=s;}
public String call() throws Exception {
return str.concat("Call");
}
}
public class Examp73 {

	public static void main(String[] args)throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(4); //line n1
		Future f1 = es.submit (new CallerThread("Call"));
		String str = f1.get().toString();
		System.out.println(str);
//		Future�� �����Ͱ� set���� ������ Future.get()�� ȣ���� Thread�� ������ ����մϴ�. �׷� ���α׷��� ������� ���°� �˴ϴ�.
		// �ַ� Ÿ�Ӿƿ����� ���Ѵ����¸� Ǭ��
	
	}

}
//B. The program prints Call Call and does not terminate.
//�� : B. ���α׷��� Call Call�� �μ��ϰ� ������� �ʽ��ϴ�

/*
Runnable : return ���� ���� ������
Callable : return ���� �����ϴ� ������ + ���׸����� ���ϰ��� �޴´�

���� Callable��, Runnableó�� �ٷ� Thread�� ���ڷ� ������ ���� ������. 
�Ʒ��� ����, ExecutorService��ü�� submit()�޼ҵ带 ����Ͽ��� �����մϴ�. (������ Ǯ�� ����Ѵٴ� ����)
ExecutorService�� �����۾� �� �������� �۾��� ȿ�������� ó���ϱ� ���� �����Ǵ� JAVA�� ���̺귯���̴�.
*/