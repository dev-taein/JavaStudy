package example04;
//����� ���� ���� Ŭ����  //�Ϲ� ���ܴ� Exception�� �����̴�  // ���࿹�ܴ� RuntimeException�� �����̴�
public class BalanceException extends Exception{ 
	
	
	public BalanceException() {
		
	}

	public BalanceException(String message) {
		super(message); //���� Ŭ����-Exception�� ������ ȣ��
	}
}
