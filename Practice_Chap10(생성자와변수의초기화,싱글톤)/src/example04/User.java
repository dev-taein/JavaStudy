package example04;

public class User {
	
	//�ش� Ŭ���� �ڽ��� Ÿ������ ���� ���(static)����� ���ÿ� ������ �ϰ� �ִ�.
	private static User singleton = new User();
	
	//�ش� Ŭ������ �ܺο��� new�����ڷ� �ν��Ͻ��� ���� ���ϰ� ����
	private User() {
		
	}
	
	public static void add() {
		System.out.println("add�޼��� ȣ��");
	}
	
	//�ش� Ŭ������ ����� �ּҸ� �Ѱ��ֱ�(����)���ؼ� �ܺο��� ȣ���� �� �ִ�
	//getter�޼��带 �������ְ� �ִ�.
	public static User getInstance() {
		return User.singleton;
	}

}
