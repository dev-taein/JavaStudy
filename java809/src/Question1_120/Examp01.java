package Question1_120;

class Vehicle{
	int distance;
	Vehicle(int x) {
		this.distance = x;
	}
	public void increSpeed(int time) {
		int timeTravel = time; //line n1
		//line n3
		class Car{
			int value = 0;
			public void speed() {
				value = distance/timeTravel; //line ne2
				System.out.println("Velocity with new speed" + value + "kmph");
					}
				}
				speed(); //line n3 //new Car().speed();         //�޼���ȿ� �̳�Ŭ�������� �޼��带 ȣ���Ϸ��� new Car().speed();�̷��� �ؾ��Ѵ�.
		}
}
	

public class Examp01 {
	public static void main(String[] args) {
		 Vehicle v = new Vehicle(100);
		 v.increSpeed(60);
		 
		 
		 //new Car().speed();�� ���ָ� ����� Velocity with new speed1kmph �����´�.
		 
		 
		 
		 //�׳� speed()�� ������ ����  D. A compilation error occurs at line n3.
		 
	}

}
