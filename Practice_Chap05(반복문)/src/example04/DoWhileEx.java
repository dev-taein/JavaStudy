package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ͻ÷��� q�� �Է��ϼ���");
		String str = null;
		
		//do-while���� �ּ� �ѹ� �̻� ������ ������ �ϴ� �ݺ����̴�.
		//�� ������ ���ǹ��� do�� ���� �ʰ� �޺κп� �����ϱ� �����̴�
		do {
			System.out.print(">");
			str = sc.nextLine();
			//StringŬ���� next()�޼���� ���鸸���� ������ �� ���� ����
			//next() �Ѵܾ �Է¹��� �� �� �� �ִ� �޼����
			//nextLine() ���� �����Ͽ� ����Ű�� �Է��� ������ ������ ����
			System.out.println("�Է¹��� �޼��� : " + str);
			
		}while(!str.equals("q"));   //equals�� ����
			System.out.println("���α׷� ����");
			
		sc.close();

	}

}
