package example02;

public class StudentEx {

	public static void main(String[] args) {    
		//�ؾ ��
		
		//�Ʒ��� ���� ������ ��������� ������ �ν��Ͻ��� ���� �Ҵ��� �ȴ�
		Student s1 = new Student();  
		Student s2 = new Student();
		
		s1.age = 42;
		s1.name = "ȫ�浿";
		
		//s1�� �ּҸ� s2���ٰ� ����
		s2 = s1;   //s2�� s1���� ���ԵǸ鼭  ����s2�� ����Ű�� �ִ� �ν��Ͻ��� ������ ��ü�� �ȴ�.
				   //gc(garbage collector)�� �����ⰴü�� �����Ͽ� �Ҹ��Ų��.
		
		
		s2.age = 11;
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		 
	}

}
