package example03;

public class Person {
	
	//static final = �Һ��� �������
	//static final�� ������ ����� ���ÿ�
	//�ʱ�ȭ �ؾ� �Ѵ�. ������!
	//���뵥���ͷν� ���Ǿ����� �ִ� (�ּҸ� �����ϱ� ������)
	//Ŭ�������� �����Ǿ�����.
	static final int MAX_NUMBER = 1000;  
			
	
	
	//final �ʱ�ȭ ��� 2����
	//1.����� ���ÿ� �ʱ�ȭ �ϴ� ���
	//2.�����ڿ��� �� �ѹ� �ʱ�ȭ
	final String nation = "KOREA"; //(����� ���ÿ� �ʱ�ȭ)�������
	final int age;  //�Ʒ� �����ڸ� ����� �ʱ�ȭ�� 
	//������
	public Person(int age) {
		this.age = age;
	}
	
//@Override
//public String toString() {
//		return "nation : " + this.nation + ", age : " + this.age;
//	}
}
