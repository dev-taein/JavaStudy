package examp08;

public class UnsynchronizedEx {

	public static void main(String[] args) {
		//���� ��ü ����
		Calcurator calcurator = new Calcurator();
		
		
		User1 user1 = new User1();
		user1.setCalcurator(calcurator);
		user1.start();
		
		
		User2 user2 = new User2();
		user2.setCalcurator(calcurator);
		user2.start();
		
//		System.out.println(calcurator.getMemory());
	
	}

}
