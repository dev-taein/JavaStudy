package example04;

public class Account {

	private long balance;
	
	public Account() {
		
	}
	//���� �ܾ��� ��������
	public long getBlance() {
		return this.balance;
	}
	//�Ա��ϱ�
	public void deposit(int money) {
		this.balance += money;
	}
	//����ϱ�
	public void witdraw(int money) throws BalanceException {  //BalanceExceptionŬ������ ����
		if(this.balance < money) {
			//������ ���� �߻�
			throw new BalanceException("�ܾ� ����");
		}
		this.balance -= money;
		
	}
}
