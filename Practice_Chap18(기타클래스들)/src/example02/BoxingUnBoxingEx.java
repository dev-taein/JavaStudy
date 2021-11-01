package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		//�ڽ�(Boxing)�ڵ� --> ��üȭ ��Ų��.
		Integer obj1 = new Integer(100); //integer�� new�� ���� ��ü�� ������
		Integer obj2 = new Integer("100"); // �ִ� ""�� �ص� ���ڷ� �ν��Ѵ�.
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = 100; //�ڵ� �ڽ�(Auto-Boxing)�� �Ǵ� �ڵ� //Ŭ������ �⺻Ÿ�� 100�� ���� �� �ֳ� -> ������ �� new Interger(100)�� �ٲ��.
		System.out.println("�ڽ� ��");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//��ڽ�(UnBoxing)�ڵ� --> ��ü�� �⺻������ �ٲ۴�.
		int value1 = obj1.intValue(); //intValue()�� ���������� ���� ������ ������ �Ѵ�.
		int value2 = obj2;  //�ڵ� ��ڽ�(Auto-UnBoxing)�� �Ǵ� �ڵ�
		int value3 = obj3;	//�ڵ� ��ڽ�(Auto-UnBoxing)�� �Ǵ� �ڵ�
		int value4 = obj4.intValue(); // .intValue()�� ���´ٴ� ���� ��üȭ�� �Ǿ��ٴ� ���̴�.
		System.out.println("��ڽ� ��");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
