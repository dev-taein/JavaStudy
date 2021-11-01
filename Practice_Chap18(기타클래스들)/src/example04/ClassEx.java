package example04;

public class ClassEx {

	public static void main(String[] args) {

		//��ü�� ���� Ŭ���� ������ ��� ���(getClass()-ObjectŬ������ �ִ�)
		Person person = new Person();
		Class class1 = person.getClass(); //getClass(); = ObjectŬ������ -> ���콺 ������ ��� ���� ����
		System.out.println(class1.getName()); //getName() = ��Ű����, Ŭ�������� ������.
		System.out.println(class1.getSimpleName());//getSimpleName() =Ŭ������ ������
		System.out.println();
		//���ڿ��κ��� ��ü�� ������ ��� ��� (Class.forName() - Object�ƴ� Ŭ������ü�� ����)
		try {
			Class class2 = Class.forName("example04.Person");//forName()�� example04�� PersonŬ������ �ִ�? ��� ����°�
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());		
		} catch (ClassNotFoundException e) {e.printStackTrace();} 
	}

}
