package example04;

class Data{
	int data;
}

public class ReferenceReturnClass {

	public static void main(String[] args) {
		
		
		Data ori = new Data();
		ori.data = 100;
		System.out.println(ori);
		Data cloned = copy(ori);
		System.out.println(cloned);
		System.out.println(cloned.data);
	}
	
	public static Data copy(Data d) {
		System.out.println(d);
		
		Data clonde = new Data();
		clonde.data = d.data;
		System.out.println(clonde);
		
		return clonde; //Data클래스의 주소를 리턴값으로 넘기고 있다.
	}

}
