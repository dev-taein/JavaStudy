package example01;

public class StudentEx {

	public static void main(String[] args) {
		//�⺻������ ȣ��
		Student student = new Student();
		System.out.println(student);

		//�Ű������� �ִ� �����ڸ� ȣ��
		Student student2 = new Student("ȫ�浿", 50);
		System.out.println(student2);
		
		Student student3 = new Student("��⵿");
		System.out.println(student3);
		
		Student student4 = new Student(33);
		System.out.println(student4);
	}

}
