package Question151_200;

class MyClass implements Runnable{ //line n1
	public int value; // line n2
	@Override
	 public synchronized void run() {  //line n3 //synchronized�� �ٿ��ָ� ����� 1~100���� ������� ������
		while(value < 100) {
			value++;
			System.out.println("value : " + value);
		}
	}
}
public class Examp165 {
	public static void main(String[] args) {
//		What change should you make to guarantee a single order of execution (printed values 1 -100 in order)?
//		���� ���� ������ �����Ϸ��� � �������ؾ��մϱ� (������� 1-100 �� �μ�)?
		
//		MyClass mc = new Thread(mc);������ �̷��� �������� --- ������ ���� �߻�
		MyClass mc = new MyClass(); 
		Thread a = new Thread(mc);
		a.start();
		Thread b = new Thread(mc);
		b.start();
		
	}
}
//�� : A. Line 3: public synchronized void run() {