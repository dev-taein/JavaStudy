package Question151_200;

import java.io.IOException;

class Video{
public void play() throws IOException {
System.out.print("Video played.");
}
}
class Game extends Video{
public void play() throws Exception{ // ����� �θ��� throws�� ���ƾ���, ������ ���� : Video played.Game played.
super.play();
System.out.println("Game played.");
}
}
public class Examp155 {

	public static void main(String[] args) {
		
		try {
			new Game().play();
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
	
	
	//�� :B. A compilation error occurs.
//	���� Ŭ������ �� �Ϲ����� ���ܰ� �ƴ� �� ��ü���� ���ܸ� throw�ؾ��մϴ�.

}
