package Question201_248;
class Vehhicle {
int distance; //line n1
Vehhicle (int x) {
this.distance = x;
}
public void increSpeed(int time) { //line n2
int timeTravel = time; //line n3
class Car {
int value = 0;
public void speed () {
value = distance /timeTravel;  // 60/100 = 0.6�ε� value������ int���̱� ������ 1�� ���´�.
System.out.println ("Velocity with new speed"+value+"kmph");
}
}
new Car().speed();
}
}
public class Examp208 {

	public static void main(String[] args) {
		Vehhicle v = new Vehhicle (100);
		v.increSpeed(60);
	}

}


//�� Answer is "Velocity with new speed1kmph"
// �Ǵ� �� �������� ���ٸ� Velocity with new speed �̰� �����ض�
