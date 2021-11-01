package examp06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardEx {
	
	//?�� ��� ��ü�� �� �ްڴ�.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������" + Arrays.toString(course.getStudents()));
	}
	
	//Course<? extends Student> = Student�̰ų� Student�� ��ӹ޴� Ŭ����   - ���� Ÿ�� ����  -- �ͻ�(extends�� ����Ŭ���� ����)
	public static void registerCourseStudent(Course<? extends Student> course) { //Student�̰ų� Student�ڼ�Ŭ������ �� �� �ִ�.
		System.out.println(course.getName() + "������" + Arrays.toString(course.getStudents()));
	}

	//Worker Ŭ�����̰ų� ���� Ŭ�����鸸 ���ü��ִ�.   - ���� Ÿ�� ����    --- ����(super�� ����Ŭ���� ����)
	public static void registerCourseWorker(Course<? super Worker> course) { //Student�̰ų� Student�ڼ�Ŭ������ �� �� �ִ�.
		System.out.println(course.getName() + "������" + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
//		registerCourse(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourse(new Course<Student>("�л� ����", 10));
//		registerCourse(new Course<Worker>("������ ����", 8));
//		registerCourse(new Course<HighStudent>("����л� ����", 7));
		
//		registerCourseStudent(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourseStudent(new Course<Student>("�л� ����", 10));
//		registerCourseStudent(new Course<Worker>("������ ����", 8));
//		registerCourseStudent(new Course<HighStudent>("����л� ����", 7));
		
		
//		registerCourseWorker(new Course<Person>("�Ϲ��� ����", 5));
//		registerCourseWorker(new Course<Student>("�л� ����", 10));
//		registerCourseWorker(new Course<Worker>("������ ����", 8));
//		registerCourseWorker(new Course<HighStudent>("����л� ����", 7));
		
		
		
//		���� Course��ü�� ������ �ؼ� Ȯ���ϴ� ����
		Course<Person> perCourse = new Course<Person>("�Ϲ��� ����", 3);
		perCourse.add(new Person("�Ϲ���1"));
		perCourse.add(new Person("�Ϲ���2"));
		perCourse.add(new Person("�Ϲ���3"));
//		registerCourse(perCourse);
		
		
		registerCourse(perCourse);
//		registerCourseStudent(perCourse);//���� Ÿ��
		registerCourseWorker(perCourse);
		System.out.println();
		
		Course<Worker> wCourse = new Course<>("������ ����", 3);
		wCourse.add(new Worker("��븮"));
		wCourse.add(new Worker("�ڰ���"));
		wCourse.add(new Worker("������"));
		
		
		registerCourse(wCourse);
//		registerCourseStudent(wCourse); // WorkerŬ������ �ƹ��� ���谡 ���� Ŭ����
		registerCourseWorker(wCourse);
		System.out.println();
		
		
		Course<Student> sCourse = new Course<>("�л� ����", 3);
		sCourse.add(new Student("���л�"));
		sCourse.add(new Student("����л�"));
		sCourse.add(new Student("���л�"));
	
		registerCourse(sCourse);
		registerCourseStudent(sCourse); 
//		registerCourseWorker(sCourse);  //StudentŬ������ �ƹ��� ���谡 ���� Ŭ����
		System.out.println();
		
		
	}

}
