package examp07;

public class UnsynchronizedEx {

	public static void main(String[] args) {
		//���� ��ü ����
		Calcurator calcurator = new Calcurator();
		
		//������ �����Դϱ�? ��°���� ����, User-2�����尡 ������ ������ 
		//User-1 �����嵵 ����Ѵ�. (�������� �ŷڼ��� �ر�)
		//����ȭ ó���� �����ν� ��ü�� ����� �Ͼ�鼭 �������� �ŷڼ��� 
		//Ȯ�����ش�.
		
		User1 user1 = new User1();
		user1.setCalcurator(calcurator);
		user1.start();
		
		
		User2 user2 = new User2();
		user2.setCalcurator(calcurator);
		user2.start();
		
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
	}

}
