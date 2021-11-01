package example01;

public class Card {
	
	//인스턴스 변수 -- 반드시 인스턴스를 생성해야 접근 가능
	private String color;   //카드의 색상
	private String company; //카드 회사
	
	//static(정적,클래스, 공유)변수  -- new(인스턴스)없이 클래스명.static변수명으로 접근 가능
	static int width = 100; //카드의 넓이
	static int height = 50; //카드의 높이
	
	//getter, setter 인스턴스 메서드
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void show(){
		//지역변수는 반드시 초기화를 해야한다.
		//메서드 안에 static변수를 사용을 하지 못한다. 그이유는
		//static의 특성은 인스턴스 생성 없이도 얼마든지 접근 가능해야되는데
		//언제 인스턴스가 생성될지 아무도 모르기 때문에 이렇게 코드를 작성하는 것은
		//올바른 방법이 아니다.
		//static int i = 10;
		String color = this.color;
		String company = this.company;
		System.out.println(color + ", " + company); 
	}
	
	
	
	
	@Override
	public String toString() {
		//정적변수(static)는 접근 방법이 반드시 클래스명.static변수명으로 접근해야
		//올바른 방법이다.
		return "Card1의 색상 : " + this.getColor()+ ", Card1의 회사 : " + this.getCompany() + 
				", 크기 : (" + Card.height + " , " + Card.width + ")"; 
	}
}
