package sec02.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx01 {
	
	//Function = ������
	
	
	//ArraysŬ���� asList()�� �Ű������� ������ ��ü�� �� ������ ����� �ؼ� List<T>���� �������ش�.
	private static List<Student> list = Arrays.asList(
			new Student("������", 100, 95),
			new Student("�迬��", 90, 98),
			new Student("������", 80, 92),
			new Student("���־�", 81, 99)
			);
	
	public static void main(String[] args) {
		
		Function<Student, String> function = t -> {return t.getName();};
		printString(function);
		
		System.out.println("--------------------------------");
		
		
		
		ToIntFunction<Student> intFunction = t -> {return t.getEngscore();};
		printInt(intFunction,"����");
		
		
		System.out.println("--------------------------------");
		
		
		ToIntFunction<Student> intFunction2 = t -> {return t.getMatscore();};
		printInt(intFunction,"����");
	}
	
	
	//Function<T,R>�Լ��� �������̽��� T�� �Ű������� �Ͽ�, R�� �����Ͽ� �����ϴ� �������̽��̴�.
	//���⼭�� ��, printString()�޼����� �Ű����� Ÿ���� Function<T,R>�� �ǰ�,,,���ٽ��� �Ѱ��־���Ѵ�.
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			String str = function.apply(student);
			System.out.println("�̸� : " + str + "\t");
		}
		System.out.println();
	}
	
	
	//---------------------------------------------------------
	
	
	public static void printInt(ToIntFunction<Student> function, String str) {
		for(Student student : list) {
			int	score = function.applyAsInt(student);
			System.out.println(str + "���� : " + score + "\t");
		}
		System.out.println();
	}
}
