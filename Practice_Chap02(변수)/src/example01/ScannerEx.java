package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl + shift + O  �ڵ� import
		//Scanner Ŭ������ �Է��� �ޱ� ���� Ŭ�����̰� �Է½�Ʈ���̴�, println�� ��½�Ʈ��
		//�ڿ�(Resource)�� ����ϰ� ���� �ݵ�� �ݾ���� �ȴ�. 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���ڸ��� �Է� : ");  //print�� �ٹٲ�x println�� �ٹٲ�o
		int num = sc.nextInt();
		System.out.println("����ڷκ��� �Է¹��� ���� : " + num);
		
		System.out.print("�Ǽ� ���ڸ��� �Է� : ");  
		double dnum = sc.nextDouble();
		System.out.println("����ڷκ��� �Է¹��� ���� : " + dnum);
		
// �巡�� + Ctrl + / = �巡���� ���� �ּ�ó����
		
		System.out.print("���ڿ��� �Է� : "); 
		//next()�� ������ �������� �ؼ� ���ڸ� �Է�--�ܾ �Է�
		// String str = sc.next();
		
		//nextLine()�� ������ �ƴ϶� ����Ű�� �Է��Ҷ�����   ���ڸ� �Է�--�ܾ �Է�
		String str = sc.nextLine();
		System.out.println("����ڷκ��� �Է¹��� ���ڿ� : " + str);
		
		
		int result = 100;
		String num1 = sc.nextLine();
		//Integer.parseInt()������ ���ڿ��� �Է¹��� ���ڵ��� ���ڿ��� �ƴ϶� ���ڷ� �ٲپ��ִ� ������ �ϴ� �޼���
		int temp = Integer.parseInt(num1);
		int total = result + temp;
		System.out.println("������ : " + total);
		
		sc.close();
		

	}

}
