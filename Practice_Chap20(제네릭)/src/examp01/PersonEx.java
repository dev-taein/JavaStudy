package examp01;

public class PersonEx {

	public static void main(String[] args) {
		
		//Person���׸�Ŭ������ T�� String�� �����Բ� ������ �������.
		Person<String> person1 = new Person<>();
		person1.setT("ȫ�浿");  //��ĳ���� String->Object �ڼ��� ��������... Ÿ��ĳ���� ��������
		String str1 = person1.getT(); //�ٿ� ĳ���� (Object->String)
		System.out.println(str1);    
		//ĳ������ ���� �Ͼ�� ���� ������ �� ����
		
		//���������� �������� ����ȭ, Ÿ�Ժ�ȯ ����, ������ �� ���� �߻�
		
		Person<Integer> person2 = new Person<>();
//		person2.setT(new Integer(100)); //�ڽ� ���Ѱ�
		person2.setT(100); //�ڵ� �ڽ�
		int value1 = person2.getT(); //�ڵ� ��ڽ� �ڵ�
		System.out.println(value1); 
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple());
		Apple apple = person3.getT(); 
		System.out.println(apple); 
	}

}
