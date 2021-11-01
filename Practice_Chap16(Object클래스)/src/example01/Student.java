package example01;

import java.util.Arrays;

public class Student {

	int age;
	String name;
	int[] subject;
	
	public Student(int age, String name, int[] subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("equals()");
		//Ÿ�Ժ�ȯ�� �������� ���θ� �˾ƺ��� ���ؼ� instanceof������ �̿� -> obj�� student�� �����ִ��� �˾ƺ��°Ŵ�
		if(obj instanceof Student) {
			Student student = (Student)obj; //�ٿ�J���� object(����)->Student(�ڼ�)
			//���� ������ ���ؼ� ���ǹ��� ����, age�� name�� �� ���ٶ�� �ǹ�
			boolean result = Arrays.equals(this.subject, student.subject);
			if((this.age == student.age) && (this.name.equals(student.name)) && result) {  
				//(this.name.equals(student.name)�� String�� name�� ���� ���ϴ� ���̴�.											
				return true;
			}
		}
		return false;
	}
	
}
