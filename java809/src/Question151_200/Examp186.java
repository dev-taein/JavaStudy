package Question151_200;

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
public class Examp186 {

	public static void main(String[] args)throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future f1 = es.submit (new Caller ("Call"));
		Future f2 = es.submit (new Runner ("Run"));
		String str1 = (String) f1.get();
		String str2 = (String) f2.get(); //line n1
		System.out.println(str1+ ":" + str2);
//		System.out.println(str1+ ":" + "Run"); //�̷����ϸ�  B�� ��
		es.shutdown(); // �� ������ �ּ�ó���ϸ� A�� ����
	}

}

//A. The program prints: Run Runner Call Caller : null And the program does not terminate.
//     es.shutdown();�� ���ٸ� �̰� ���̰���
//B. The program terminates after printing: Run Runner Call Caller : Run -- �� �����δ� �̰� ����

//C. A compilation error occurs at line n1. -- �̰� �� �̵ɷ��� STring�� Integer�� �̷��ɷ� �ٲ��
//D. An ExecutionException is thrown at run time. -- �̰� main�޼��� throws���� �������� ������ ��������

//���� �ָ��� , es.shoutdown�� ����� A���� ��ȿ�ϰ�

// B����  Run Runner Call Caller : Run�� �ƴ϶� null�� �ٱ⶧���� �ָ���
//B���� ��ȿ�ҷ��� �ڵ带 System.out.println(str1+ ":" + "Run"); �����ؾ���

