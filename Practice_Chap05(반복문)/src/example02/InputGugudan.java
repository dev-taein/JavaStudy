package example02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ����մϴ�.");
		System.out.print("�� �ܺ��� ����ұ�� : ");
		int start = sc.nextInt();
		
		System.out.print("������ ���ΰ��� : ");
		int end = sc.nextInt();
		
		//System.out.println(start + " " +end);
		
		for(;start<end; start++) {
			System.out.println("*****" + start + "��*****");
			for(int j=1; j<10; j++ ) {
				System.out.println(start + "*" + j + "=" + (start*j));
			}
		}
		
		
		
		//���ѷ��� for�����ٴ� while(true)�� ����
//		for(;;) {
//			System.out.println("-----");
//		}
//		
		sc.close();
		

	}

}
