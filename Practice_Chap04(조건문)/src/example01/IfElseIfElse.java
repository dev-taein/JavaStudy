package example01;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		
		//Resurce이기 때문에 닫아줘야한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		
		//score변수의 값에 따라서 아래의 조건문에서 분기가 일어나고 있는 점이
		//이 예제의 핵심이다
		if(score >= 90) {
			System.out.println("점수가 90~100점 사이입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if(score >= 80) {
			System.out.println("점수가 80~89점 사이입니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score >= 70) {
			System.out.println("점수가 70~79점 사이입니다.");
			System.out.println("등급은 C입니다.");
		}
		else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		sc.close();
	}
}
