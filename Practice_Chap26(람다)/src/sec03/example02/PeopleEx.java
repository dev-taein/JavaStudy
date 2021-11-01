package sec03.example02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PeopleEx {

	public static void main(String[] args) {
			
		//���ٽ����� �����ڸ� ȣ���Ͽ� �ν��Ͻ��� ����� �ִ�.
		Function<String, People> function1 = s -> {return new People(s);};
		People people = function1.apply("������");
		System.out.println(people);
		
		System.out.println("-------------------------------");
		
		//������ ����
		function1 = People :: new;
		people = function1.apply("������");
		System.out.println(people);
		
		
		System.out.println("-------------------------------");
		
		//���ٽ����� ������ ȣ���Ͽ� �ν��Ͻ��� ����� �ִ�. (2��¥�� ������ ȣ��)---�ִ� 2���� �����ϴ�.
		BiFunction<String, Integer, People> function2 = (x,y) -> {return new People(x,y);};
		people = function2.apply("������", 12);
		System.out.println(people);
		
		//������ ����
		function2 = People :: new;
		people = function2.apply("������", 12);
		System.out.println(people);
		
//		������ ������ ��������� 3���̻� ������, �׿� ������ 3�� �̻��� �Լ��� �������̽��� �־���ϴµ� ����� 2������ �ۿ� ����...��) BiFunction
		
	}

}
