package clothing;

public class Test64 {
	static double area;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,b,h;
		if(area==0) {
			b=3;
			h=4;
			p=0.5;
			area = p*b*h;  // line n2 ���⿡ ������ ����
		} 
//		area = p*b*h; �̰� ���������� ������ ���� //line n2
		System.out.println("Area is "+ area);
	}

}
