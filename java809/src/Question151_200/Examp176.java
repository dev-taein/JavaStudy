package Question151_200;


class Canvas implements Drawable {
public void draw () { }
}
abstract class Board extends Canvas { }
class Paper extends Canvas {
protected void draw (int color) { } //���� �ε�,,, �������̵��ҷ��� �Ű������� �����, public���� �ٲ�����Ѵ�.
}
class Frame extends Canvas implements Drawable {
public void resize () { }
//abstract void open(); // �߻�޼��带 �߰��ҷ���, Ŭ������ �߻�Ŭ���������ϰų�, �߻�޼��带 �Ϲݸ޼���� �������Ѵ�.
}
interface Drawable {
public abstract void draw ();
}

//Which statement is true?
// �� : C. Frame does not compile.



//���� FrameŬ������ Canvas�� ������� �ʰ� Drawable�� �����Ѵٸ�
//draw()�� �������̵� �ؾ��Ѵ�.



public class Examp176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
