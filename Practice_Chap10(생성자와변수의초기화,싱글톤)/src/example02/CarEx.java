package example02;

public class CarEx {

	public static void main(String[] args) {
		//�⺻��  (�������ִ� �ɼ�)
		Car c1 = new Car();
		System.out.println(c1);
		
		//�Ű������� (�ڱⰡ ���ϴ� �ɼǰ���)
		Car c2 = new Car("���", "����", 4);
		System.out.println(c2);
		
		//�ν��Ͻ� ����
		Car c3 = new Car(c2); 
		System.out.println(c3);
		
		Car c4 = new Car("�Ķ�", "����");
		System.out.println(c4);
		
		for(int i=0; i<10; i++) {
			Car c = new Car(c2);
			System.out.println( (i+1) + "��° �� " + c);
		}
	}

}
