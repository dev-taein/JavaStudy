package Question1_120;
class Test<T> {
private T t;
public T get () {
return t;
}
public void set (T t) {
this.t = t;
}
}
public class Examp34 {
	public static void main (String args [ ] ) {
		Test<String> type = new Test<>();
		Test type1 = new Test (); //line n1
		type.set("Java");
		type1.set(100); //line n2
		System.out.print(type.get() + " " + type1.get());
	}
}

// 	�� : Java 100
// ���׸� Ÿ���� �������� ������ �ڵ� �ڽ̵Ǿ� set�� �Ű����� �´� Ÿ���� ���εȴ�.