package example06;

public class B implements I {
	
	
	//I인터페이스를 구현함으로 A클래스와 간접적 관계가 된다
	//제공하는 측
	@Override
	public void method() {
		System.out.println("인터페이스 I를 구현한 B클래스의 메서드 호출");
		
	}
}
