package Question1_120;

abstract class Operator{
	protected  void turnOn();// abstrack�� ���������� ����
	protected  void turnOff(); //  abstrack�� ���������� ����
}

class EngineOperator extends Operator{
	public final void turnON() {System.out.println("ON");};
	public final void turnOff() {System.out.println("Off");};
}

public class Examp10 {
	Operator m = new EngineOperator();
	public void opreate() {
		m.turnOn();
		m.turnOff();
	}
	public static void main(String[] args) {
		Examp10 carEngine = new Examp10();
		carEngine.opreate();
		
	}

}
//C. The Operator.java file fails to compile.