package examp01;

public class TvEx {

	public static void main(String[] args) {
		
		Tv<String> tv1 = new Tv<>();
		tv1.setE("LG OLED TV");
		String tvName = tv1.getE();
		System.out.println("���� TV�� "+tvName+" �Դϴ�.");
	}

}
