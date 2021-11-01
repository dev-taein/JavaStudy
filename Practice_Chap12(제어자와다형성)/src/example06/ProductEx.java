package example06;

import java.util.Scanner;

public class ProductEx {

	//Ŭ���� ������ �ö󰡼� ���뵥���ͷ� ��� �ȴ�.
	static int productID = 0;
	static int numberOfProduct = 0;  //�迭 �ε��� ����
	static Product[] p = new Product[10];
	static Scanner sin = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice = 0;
		while(choice != 3) {
			int type = 0;
			
			System.out.println("��ǰ��ȸ ���α׷� �Դϴ�.");
			System.out.print("��ǰ �߰��� (1), ��ǰ��ȸ(2), ������(3) >> ");
			choice = sin.nextInt();
			
			switch(choice) {
			case 1 :
				if(numberOfProduct >= p.length) { //10���� ũ�� �ȵǴϱ�  numberOfProduct(�ε���)�� �迭ũ�⺸�� ũ�� �ȵȴ�.
					System.out.println("�� �̻� ��ǰ�߰� �Ұ�");
					break;
				}
				System.out.print("å�̸� (1), ����CD(2), ȸȭå(3) >> ");
				type = sin.nextInt();
				if(type < 1 || type > 3) {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					break;
				}
				addProduct(type);
				break;
			case 2:
				for(int i=0; i<numberOfProduct; i++) {
					p[i].showInfo();
				}
				break;
			case 3:
				System.out.println("���α׷� ����");
				break;
			}
		}
			
	}
	public static void addProduct(int type) {
		sin.nextLine(); //���� ����(����Ű)
		System.out.print("��ǰ ���� >> ");
		String desc = sin.nextLine();
		System.out.print("������ >> ");
		String maker = sin.nextLine();
		System.out.print("���� >> ");
		int price = sin.nextInt();
		sin.nextLine();//���� ����(����Ű)
		switch(type) {
		//Book Ŭ����
		case 1 :
			System.out.print("�Ϲ� å ���� >> ");
			String title = sin.nextLine();
			System.out.print("���� >> ");
			String author = sin.nextLine();
			System.out.print("����ǥ�ص�����ȣ(ex. 0001)  >> ");
			int ISBN = sin.nextInt();
			sin.nextLine();//���� ����(����Ű)
			//�ʵ��� ������(���� ��ü�迭�� �ڼ��� �ν��Ͻ��� ���̰� �ִ�.)
			p[numberOfProduct] = new Book(productID++, desc, maker, price, ISBN, title, author);
			break;
			//CompactDisc Ŭ����
		case 2 :
			System.out.print("�ٹ� ����  >> ");
			String albumTitle = sin.nextLine();
			System.out.print("����  >> ");
			String artist = sin.nextLine();
			p[numberOfProduct] = new CompactDisc(productID++, desc, maker, price, albumTitle, artist);
			break;
			//ConversationBook Ŭ����
		case 3 :
			System.out.print("ȸȭå ����  >> ");
			String title2 = sin.nextLine();
			System.out.print("����  >> ");
			String author2 = sin.nextLine();
			System.out.print("���  >> ");
			String language = sin.nextLine();
			System.out.print("����ǥ�ص�����ȣ(ex. 0001)  >> ");
			int iSBN2 = sin.nextInt();
			p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, iSBN2, title2, author2, language);
			break;
		}
		numberOfProduct++;
		
	}
	
}
