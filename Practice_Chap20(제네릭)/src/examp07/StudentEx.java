package examp07;

public class StudentEx {

	public static void main(String[] args) {
		//�ʵ��� ������
		Person<String, String> person = new Student<String, String, Integer>();
		person.setKind("Ȳ����");
		person.setMode("�����¼�");
		System.out.println(person.getKind() + " : " + person.getMode());
		
		
		
		
		
		
		Student<String, String, Integer> personStudent = new Student<>();
		personStudent.setKind("Ȳ����");
		personStudent.setMode("�����¼�");
		personStudent.setC(100);
		System.out.println(personStudent.getKind() + " : " + personStudent.getMode() + " ������ : " + personStudent.getC());
	}

}
