package Question121_150;


class Book {
	private int id;
	private String name;
	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {this.id = id;}
	public void setName(String name) {this.name=name}
	
}
public class Examp126 {

	public static void main(String[] args) {
//		Which statement is true about the Book class?
//				A. It demonstrates encapsulation.
//				B. It is defined using the factory design pattern.
//				C. It is defined using the singleton design pattern.
//				D. It demonstrates polymorphism.
//				E. It is an immutable class.
		
		
		//�� : A. It demonstrates encapsulation.
	}

}
//-- private final �Һ�Ŭ����


//createProduct �޼ҵ尡 ���丮 �޼ҵ��̴�.
//abstract class Factory {
//    public final Product create(String owner) {
//        Product p = createProduct(owner);
//        registerProduct(p);
//        return p;
//    }
//    protected abstract Product createProduct(String owner);
//    protected abstract void registerProduct(Product p);
//}




// �̱��� ����
//public class Printer {
//	  // �ܺο� ������ �ڱ� �ڽ��� �ν��Ͻ�
//	  private static Printer printer = null;
//	  private Printer() { }
//	  // �ڱ� �ڽ��� �ν��Ͻ��� �ܺο� ����
//	  public static Printer getPrinter(){
//	    if (printer == null) {
//	      // Printer �ν��Ͻ� ����
//	      printer = new Printer();
//	    }
//	    return printer;
//	  }
//	  public void print(String str) {
//	    System.out.println(str);
//	  }
//	}
//	https://gmlwjd9405.github.io/2018/07/06/singleton-pattern.html
