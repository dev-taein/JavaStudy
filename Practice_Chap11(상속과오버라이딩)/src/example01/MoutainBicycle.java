package example01;

//����� �ϴ� ����
//1. ����� �ڵ�� ���󿡼� ����
//2. �������� �κ��� �ڼտ��� ���� ����
//3. �ڵ��� ���뼺

//����� ������ ����
public class MoutainBicycle extends Bicycle {
	//��� ���� : 5��
	String frame;
	int gear;
	int price;
	String sector;
	
	public void print() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("owner : " + this.owner);
		
	}
	public static void main(String[] args) {
		MoutainBicycle moutainBycle = new MoutainBicycle();
		moutainBycle.id = 1111;
		moutainBycle.brand = "LESPO";
		moutainBycle.frame = "�˷�̴�";
		moutainBycle.gear = 33;
		moutainBycle.price = 300000;
		moutainBycle.owner = "ȫ�浿";
		
		moutainBycle.print();
	}
}
