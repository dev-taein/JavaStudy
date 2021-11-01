package Question1_120;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;

class Book1 implements Comparator<Book1> { //Comparator���� ���� implements Comparator<Book1>
String name;
double price;
public Book1 () {}
public Book1(String name, double price) {
this.name = name;
this.price = price;
}

public int compare(Book1 b1, Book1 b2) {  // ���� ���� �������̵�
return b1.name.compareTo(b2.name);  // �� ���� ��� Collections.sort(books, new Book1()); �̹������� �����̵�
}

public String toString() {
return name + ":" + price;
}
}public class Examp37 {

	public static void main(String[] args) {
		List<Book1>books = Arrays.asList (
//				new Book1("C eginning with Java", 2), 
//				new Book1("D Guide to Java Tour", 2)	
//				���ڿ� �� �� ���ĺ� ������� ������ �̷������. �� ���� ����� C�� ���� ��µ�
				
				new Book1("Beginning with Java", 2),
				new Book1("A Guide to Java Tour", 3) //�̰� �翬�� A�� ���� ��µ�
				);
				Collections.sort(books, new Book1());
				System.out.print(books);
//				�� : A. [A Guide to Java Tour:3.0, Beginning with Java:2.0]
				
				
//				���� ���迡�� 
//				new Book ("Beginning with Java", 2),
//				new book ("A Guide to Java Tour", 3)
//				�̷��� �ν��Ͻ� �̸��� �ٸ��ٸ� 
//				D. An Exception is thrown at run time. ���� �̰Ŵ�.
				
				
				
				
				
				/*
				 * ���� ���ĺ��� �������� ���̶���� ���� �������� ���� natural order ����� ���� ���� ����ڰ� ���ϴ� ������ ���� ����(���� �̸��� ���ڿ� ���� ����)��� 
				 * �����ϰ� ������ ��� �ؾ��ұ�? �̷��� ������ �Ǵ� ������ �����ڰ� ���� �������־�� �Ѵ�. 
				 * �̶� ������ �Ǵ� ���� Comparator �������̽��� �����ϴ� ���̴�. ��, compare() �޼ҵ带 �������̵� ���ִ� ���̴�. 
				 */
	}

}
