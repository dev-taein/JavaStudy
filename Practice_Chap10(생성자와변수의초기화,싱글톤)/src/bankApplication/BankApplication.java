package bankApplication;

import java.util.Scanner;

public class BankApplication {

	//�迭 100�� ��������� �Ǿ� �ְ�, �迭�̹Ƿ� �Ѱ谡 �ִ�.(�޸� ����, �����̴�)
	private static Account[] accountsArray = new Account[10];
	private static Scanner sc = new Scanner(System.in);
	
			
			
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.���»���  |  2.���¸�� | 3.�����ϱ� | 4.����ϱ� | 5.�����ϱ�");
			System.out.println("---------------------------------------------------");
			System.out.print("���� > ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
				
			}
			else if(choice == 2) {
				accountList();
			}
			else if(choice == 3) {
				deposit();
				
			}
			else if(choice == 4) {
				withdraw();
			}
			else if(choice == 5) {
				System.out.println("���°��� ���α׷��� �����մϴ�.");
				run = false;
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.!");
			}
		}

	}


	public static void createAccount() {
		System.out.println("---------------------------");
		System.out.println("���¸� �����մϴ�.");
		System.out.println("---------------------------");
		
		System.out.print("���� ��ȣ : ");
		//next() : �Ѵܾ �Է� ������ ������ �޼���(������ �߰��ϸ� �� �ձ����� String����)
		//nextLine() : �� �����̳� �� ���� �Է� ������ ������ �޼���()
		String ano = sc.next();
		
		System.out.print("������ : ");
		String owner = sc.next();
		
		System.out.print("�ʱ� �Ա� �� : ");
		int balance = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountsArray.length; i++) {
			if(accountsArray[i] == null) {
				accountsArray[i] = newAccount;
				System.out.println("��� : ���� ���� �Ϸ�Ǿ����ϴ�.");
//				System.out.println(accountsArray[i].getAno() + ", " + 
//									accountsArray[i].getOwner() + ", " + 
//									accountsArray[i].getBalance());
				break;
			}
		}
	}

	//���� ��� ����ϱ�
	public static void accountList() {
		System.out.println("---------------------------");
		System.out.println("���¸���� ����մϴ�.");
		System.out.println("---------------------------");
		
		for(int i=0; i<accountsArray.length; i++) {
			Account account = accountsArray[i];
			//���¿� ���� ������ �����Ѵٸ�..
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println();
				
			}
		} 
	}
	
	//�����ϱ�
	public static void deposit() {
		System.out.println("---------------------------");
		System.out.println("������ �մϴ�.");
		System.out.println("---------------------------");
		
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next();
		System.out.print("���ݾ� : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�. Ȯ�ιٶ��ϴ�.");
			return;
		}
		account.setBalace(account.getBalance() + money );
		System.out.println("��� : ������ �����߽��ϴ�. ���� �ܾ� : " + account.getBalance());
	}
	//���� ã��
	public static Account findAccount(String ano) {
		
		Account account = null;
		for(int i=0; i<accountsArray.length; i++) {
			if(accountsArray[i] != null) {
				//�Ű������� �Ѿ�� ���¹�ȣ�� �����ϴٸ�..
				if(accountsArray[i].getAno().equals(ano)) {
					account = accountsArray[i];	
					break;
				}
			}
		}
		return account;
	}
	//��� �ϱ�
	public static void withdraw() {
			System.out.println("---------------------------");
			System.out.println("����� �մϴ�.");
			System.out.println("---------------------------");
			
			System.out.print("���¹�ȣ �Է� : ");
			String ano = sc.next();
			System.out.print("��ݾ� : ");
			int money = sc.nextInt();
			

			Account account = findAccount(ano);
			
			if(account == null) {
				System.out.println("��� : ���°� �����ϴ�. Ȯ�ιٶ��ϴ�.");
				return;
			}
			account.setBalace(account.getBalance() - money );
			System.out.println("��� : ����� �����߽��ϴ�. ���� �ܾ� : " + account.getBalance());
	}
}
