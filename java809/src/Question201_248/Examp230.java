package Question201_248;
final class IceCream {
public void prepare() {}
}
class Cake {
public final void bake(int min, int temp) {}
public void mix() {}
}
class Shop {
private Cake c = new Cake ();
private final double discount = 0.25;
public void makeReady () { c.bake(10, 120); }
}
class Bread extends Cake {
public void bake(int minutes, long temperature) {}  //final �޼���� ������ �� �� ������ �����ε� �� �����մϴ�.
//���� public void bake(int minutes, long temperature) {} Ÿ���� long���� �ٲ��ִ� �����ε��ؼ� ����
public void addToppings() {}
}


//C. A compilation error occurs in Bread
//���� �޼���� ������ �� �� ������ �����ε� �� �����մϴ�.
public class Examp230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
