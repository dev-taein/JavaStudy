package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		
		if(score >= 90 ) {
			//��ø if��(������������ ��øif���� �� �� �ִ�
			//����, ��øif���� 2���� �ʰ����� �ʵ��� �ϴ°� �������鿡�� ����.
			if(score >= 95) {
				System.out.println("����� A+��� �Դϴ�.");
			}
			else {
				System.out.println("����� A0��� �Դϴ�.");
			}
		}
		
		else if(score >= 80) {
			if(score >= 85 ) {
				System.out.println("����� B+��� �Դϴ�.");
			}
			else {
				System.out.println("����� B0��� �Դϴ�.");
			}
		}
		
		else if(score >= 70) {
			if(score >= 75 ) {
				System.out.println("����� C+��� �Դϴ�.");
			}
			else {
				System.out.println("����� C0��� �Դϴ�.");
			}
		}
		
		else if(score >= 60) {
			if(score >= 65 ) {
				System.out.println("����� D+��� �Դϴ�.");
			}
			else {
				System.out.println("����� D0��� �Դϴ�.");
			}
		}
		else {
			System.out.println("����� F��� �Դϴ�.");
		}
		
		
		
		
		sc.close();
	}

}
