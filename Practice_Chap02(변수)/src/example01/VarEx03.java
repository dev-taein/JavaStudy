package example01;

public class VarEx03 {

	public static void main(String[] args) {
		
		byte b1 = 127;
		// byte b2 = b1 + 2; //오버플로우
		byte b2 = (byte)(b1 + 2); // 강제캐스팅
		System.out.println(b1);
		System.out.println("강제 캐스팅 후 : " + b2); //-128 -> -127
		
		int i1 = b1; //자동캐스팅 (형변환 코드를 생략이 가능)
		System.out.println("자동 캐스팅 후 : " + i1);

		byte b3 = 127;
		int i2 = 400;
		b3 = (byte)i2; //큰 바이트 -> 작은바이트 (데이터 손실 일어난다)
		System.out.println(b3);
		
		//정수와 실수간의 캐스팅 (저장하는 방식이 틀리기 때문에
		//반드시 데이터 손실이 있고 아울러 명시적으로 캐스팅 코드가 들어가야함)
		int i3 = 100;
		float f1 = (float)i3;
		System.out.println("정수->실수 : " + f1);
		
		float f2 = 10.55f;
		int i4 = (int)f2;
		System.out.println("실수->정수 : " + i4);
		
		char ch = 'a'; //문자o 문자열x
		int i5 = ch;
		//문자값을 정수타입으로 바꾸게 되면,
		//아스키코드 값으로 바뀌어져서 출력이 된다.
		System.out.println("문자->정수 : " + i5);
		
		//애니타입 + "" = 문자열이 됨.
		int i6 = 100;
		String str = "자바" + i6;
		System.out.println(str);
	}

}
