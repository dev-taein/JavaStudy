package example02;

//���� Ŭ����
public class Point{
	
	int x;
	int y;
	
	
	//�⺻������
	public Point() {
		this(0, 0); //�� �ٸ� ������
	}
	
	//�Ű������� �ִ� ������
	public Point(int x, int y) {
		System.out.println("PointŬ������ �Ű������� �ִ� ������ ȣ��");
		this.x = x; 
		this.y = y;
	}

}
