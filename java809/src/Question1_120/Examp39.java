package Question1_120;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {
String str;
public Caller (String s) {this.str=s;}
public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
String str;
public Runner (String s) {this.str=s;}
public void run () { System.out.println (str.concat ("Runner"));}
}
public class Examp39 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2); //������ ������ ���� ������Ǯ
		Future f1 = es.submit (new Caller ("Call")); //submit ��ü�� �����Ѵ�.
		Future f2 = es.submit (new Runner ("Run"));
		String str1 = (String) f1.get();   //get()���� �����Ͱ� set�ɶ����� ��ٸ���
		String str2 = (String) f2.get(); //line n1
		System.out.println(str1+ ":" + str2);
		//str1�� Call�� Caller�� ����ϸ�, Run�� Runner�� ���α׷��� ����Ǹ� �ڵ����� ����ȴ�.
		//str2�� null�� �߻�
		//��� : f1��  .get()���� ȣ���ؾ� ���������, f2�� �ڵ����� ����Ǽ� get�� �ʿ����.
		}
	}

/*
Future�� �����Ͱ� set���� ������ Future.get()�� ȣ���� Thread�� ������ ����մϴ�. 
 
Future�� �񵿱� ó�� ����� ǥ���ϱ� ���ؼ� ���ȴ�.
 �񵿱� ó���� �Ϸ�Ǿ����� Ȯ���ϰ�, ó�� �ϷḦ ��ٸ���, ó�� ����� �����ϴ� �޼ҵ带 �����Ѵ�. 
 �񵿱� ����� ó���� �Ϸ�Ǹ� get �޼ҵ带 ����ؼ� ���� �� �ִ�.
*/