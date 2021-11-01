package example01;

public class Student {
	
	//�ν��Ͻ� ��������� ������
	private String name;
	private int age;
	
	//Ctrl + Space
	//Ŭ������� �����ڸ��� �ݵ�� ���ƾ��Ѵ�.
	//�����ڴ� ����Ÿ���� �������� �ʴ´�.(void��� ���� ������ �ʴ´�)
	//�����ڰ� �ϳ��� ���� Ŭ������ �⺻������ �����Ͻÿ� �����Ϸ��� �˾Ƽ�
	//�⺻�����ڸ� �߰����ش�.
	public Student() {
		System.out.println("�⺻������ ȣ��");
		return;
	}
	
	public Student(String name) {
		System.out.println("�Ű����� String�� �ִ� ������ ȣ��");
		this.name = name;
	}
	public Student(int age) {
		System.out.println("�Ű����� int�� �ִ� ������ ȣ��");
		this.age = age;
	}
	
	
	//�����ڴ� �����ε� ����
	//�Ű������� �ִ� ������
	//�����ڶ�� ���� �ν��Ͻ� �ʱ�ȭ �޼����� ��������.
	public Student(String name, int age) {
		System.out.println("�Ű�������  �ִ� ������ ȣ��");
		this.name = name;  //���̶�� ������ �Է��� ���� ����
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		
		return this.getName() + ", " + this.getAge();
	}
	
}
