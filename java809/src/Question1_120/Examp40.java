package Question1_120;
class Canvas implements Drawable {
public void draw () { }
}

abstract class Board extends Canvas { }

class Paper extends Canvas {
protected void draw (int color) { }  //�޼ҵ� �����ε����� ������,,, 
//protected void draw () { } //�̰� �Ұ�����  �����ϰ� �ҷ��� => public void draw () { } �ϴ��� Canvas�� draw�� Protected�� �ٲ��ش�.
}

class Frame extends Canvas implements Drawable {
public void resize () { }
}

interface Drawable {
public abstract void draw ();
}



//All classes compile successfully.




public class Examp40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
