package Question1_120;
class Book {
	int id;
	String name;
	public Book (int id, String name) {
		this.id = id;
		this.name = name;
	}
	public boolean equals (Book obj) { //line n1 boolean equals (Book obj) { �� �͵� true�� �����
		boolean output = false;
		Book b = (Book) obj;
		if (this.name.equals(b.name)) {
			output = true;
		}
		return output;
	}
}
public class Examp17 {

	public static void main(String[] args) {
		Book b1 = new Book (101, "Java Programing");
		Book b2 = new Book (102, "Java Programing");
		System.out.println(b1.equals(b2)); //line n2
		
		
//		public boolean equals (Object obj) { --equals�� �Ű����� ���� Object�϶�
//		 (b1.equals(b2));�϶���   true�� ���,  (b1.equals((Object) b2));�϶��� true���
		
//		public boolean equals (Book obj) { --equals�� �Ű����� ���� Book�϶�
//		 (b1.equals(b2));�϶��� true�� ���,	  (b1.equals((Object) b2));�϶��� false�� ���

	}

}
