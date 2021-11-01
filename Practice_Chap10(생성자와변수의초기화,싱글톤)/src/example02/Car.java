package example02;

public class Car {
	
	String color; //����
	String gearType; //���ӱ� ����
	int door;
	
	//�⺻ ������
	//
	public Car() {
		//���� Ŭ�������� �ִ� �Ű������� 3���� �ִ�(�����ϰ� Ÿ�Ե� ���ƾ���)�����ڸ� ȣ���ϴ� ����
		//Ctrl������ thisŬ���ϸ� �ּ�(��ġ)�� ������
		this("����", "����", 4);
		
		
		//���������� �ν��Ͻ���������� �ʱ�ȭ
//		this.color = "���";
//		this.gearType = "����";
//		this.door = 4;
	}
	
	//this : ���������� ���� ����, �Ű������� ��������� �������µ� ���
	//       �ݵ�� this�Ἥ ��Ȯ�ϰ� ���α׷��� �ǵ��� �Ѵ�.
	
	public Car(String color, String gearType, int door) {
		this.color = color;
//		color = color; //������ ��ȣ���� �Ͼ��, �ʱ�ȭ ���̷������.
		this.gearType = gearType;
		this.door = door;
	}
	

	public Car(String color) {
		this.color = color;
	}
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	public Car(int door) {
		this.door = door;
	}
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}

	//�ν��Ͻ� ������ ���� ������
	public Car(Car c) { //Car �ϰ� c�� b�� a�� �������
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	
	@Override
	public String toString() {
		return this.color + ", " + this.gearType + ", " + this.door;
	}
}
