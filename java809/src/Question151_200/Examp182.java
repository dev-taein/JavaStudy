package Question151_200;
class Book {
int id;
String name;
public Book (int id, String name) {
this.id = id;
this.name = name;
}
public boolean equals (Object obj) { //line n1 ---- Book obj �ص� �Ȱ�����
boolean output = false;
Book b = (Book) obj;
if (this.id  == b.id) { //id���� ���� �ٸ��� ������ false ����   --- ���� name���� ������ //if (this.name.equals(b name))}  true�� ����
output = true;
}
return output;
}
}
public class Examp182 {

	public static void main(String[] args) {
		Book b1 = new Book (101, "Java Programing");
		Book b2 = new Book (102, "Java Programing");
		System.out.println (b1.equals(b2)); //line n2
//	System.out.println (b1.equals((Object) b2)); //�̰͵� �Ȱ��� ����� ����Ѵ�.	
	
		
//		�� : B. The program prints false.
	}

}
/*
public boolean equals (Book obj) {���� System.out.println (b1.equals((Object) b2)); ��밡�� */


//���� 17���� name���� ����