package Question1_120;


interface Moveable<Integer> {
public default void walk (Integer distance) {System.out.println("Walking");}
//����Ʈ �޼���� �������̽����� ����Ǹ� �ν��Ͻ��� �����ϸ� ���� ����� �� �ִ� �������ִ�.
public void run(Integer distance);  //�̰� ���ٽ��� �����
}

public class Examp61 {

	public static void main(String[] args) {
		Moveable<Integer> animal = n -> System.out.println("Running" + n); //���ٽ��� �߻�޼��尡 �ϳ��� �������̽��� �� �� �ִ�.//����Ʈ �޼���� ����
		animal.run(100);
		animal.walk(20);
	}

}
//  Moveable can be used as below: Moveable<Integer> animal = n - > System.out.println("Running" + n); animal.run(100); animal.walk(20);