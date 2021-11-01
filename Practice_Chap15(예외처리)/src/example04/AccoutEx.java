package example04;

public class AccoutEx {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(50000);
		System.out.println("���� �ܾ� : " + account.getBlance());
		
		try {
			//����ó���ڵ尡 �ݵ�� ������.
			//withdraw()���� ���ܸ� throws�ϰ� ������ ȣ���� main�޼��� ���⼭ �����ڵ带 �ۼ��������.
			account.witdraw(10000);
			account.witdraw(50000);
			System.out.println("���� �ܾ� : "+ account.getBlance());
		} catch (BalanceException e) {
			System.out.println("���� ���� : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("���� ����˴ϴ�.");
		}

	}

}
