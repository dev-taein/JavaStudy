package Question1_120;

//Book.java:
class Book2 {
	private String read(String bname) { return "Read" + bname; } //�޼��尡 private���� ���� Ŭ������ �ƴ� main�޼��忡�� ����Ҽ� �� ����.
//private -> public  �ٲ������
}


//EBook.java:
 class EBook2 extends Book2 {
 public class String read (String url) { return "View" + url; }
}  
//public String read (String url) �̿�����,, class ���� ,, �϶��� ���� //D. The Test.java file fails to compile.

//Test.java:
public class Examp81 { 
	public static void main(String[] args) {
		Book2 b1 = new Book2();
		b1.read("Java Programing");
		
		Book2 b2 = new EBook2();
		b2.read("http://ebook.com/ebook");
		
	}

}

//C. The EBook.java file fails to compile.
//D. The Test.java file fails to compile.