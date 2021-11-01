package Question1_120;
class Foo{
	public void methodB(String s) {System.out.println("Foo " + s);}
}
class Bar extends Foo{
	public void methodB(String s) {System.out.println("Bar " + s);}
}
class Baz extends Bar{
	public void methodB(String s) {System.out.println("Baz " + s);}
}
class Daze extends Baz {
	private Bar bb = new Bar();
	public void methodB(String s) {
		bb.methodB(s);   //bb�ν��Ͻ� = Bar ���,, Bar�� methodB�� ���
		super.methodB(s); //super���� = Baz ��� ,, Daze�� ���� Baz�� methodB���
	}
}
public class Examp90 {

	public static void main(String[] args) {
		Baz d = new Daze();
		d.methodB("Hello");
	}

}
//B. Bar Hello Baz Hello