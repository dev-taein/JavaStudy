package examp03;

public class PersonEx {

	public static void main(String[] args) {
	
//		Person<Integer> p1 = Utill.<Integer>changing(new Integer(100));   	//�������� �ڵ� Utill.<Integer> ��Ƽ���� ��������
//		Person<Integer> p1 = Utill.changing((100)); �̰� �ڵ��ڽ�
		
		Person<Integer> p1 = Utill.changing(new Integer(100)); 
		int value1 = p1.getT();
		System.out.println("Person��ü�� ������ �ִ� �� : " + value1);
		
		Person<String> p2 = Utill.changing("ȫ�浿");
		String value2 = p2.getT();
		System.out.println("Person��ü�� ������ �ִ� �� : " + value2);
	}

}
