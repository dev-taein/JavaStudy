package examp01;

public class whlidCardEx1 {
	public static void main(String[] args) {
//		List<Object> list = new ArrayList<String>();  //������ ���� �ʴ´�.
//		�׷��� ���ϵ� ī�� �Ű� ������ ����ϵ��� ������ �����ϴ� ��� :
//			List<?> list = new ArrayList<String>(); //������ �ȴ�
		
//		���� �ڵ�� �����ϵ��� �ʽ��ϴ�.
//		List<?> list = new ArrayList<String>();
//		list.add("Hi"); // Compile-time error
		
		//ù��° ������
//		// ���⿡�� ��� ������ ����� ������ �� �ֽ��ϴ�.
//		int getSize(List<?> list) {  
//		    return list.size();
		//�ι�° ������
//		class Printer<T> {
//			   public void print(T t) {
//			      System.out.println(t.toUpperCase());// Error
//			   // T�� ���ڿ��� ��Ÿ���� ������ ��Ե˴ϱ�?
//			   }
//			}
		
//		�ذ�å�� ���� ��� ���ϵ� ī�带 ����ϴ� ���Դϴ�.
//
//		? extends T (���� ���ϵ� ī��)   �ͻ� = extends�� ���� Ŭ���� ����
//		? super T (���� ���ϵ� ī��)     ����  = super�� ���� Ŭ���� ����
		
		//���� ���� �ذ��
//		class Printer<T extends String> {
//			   public void print(T t) {
//			      System.out.println(t.toUpperCase());//OK!
//			   }
//			}
//		Printer<String> p1 = new Printer<>(); // OK
//		Printer<Byte> p2 = new Printer<>(); // Error, Byte is not a String
		
		
		//�� �ٸ� �ذ��
//		List<Object> list =
//		        new ArrayList<String>(); // Error
//		List<? extends Object> list2 =
//		        new ArrayList<String>(); // OK!
//		�׷��� ����� ������ �� �����ϴ�.
//		list2.add("Hi"); // Compile-time error
//		������ �����ϴ�. �����Ϸ��� ������ ��Ͽ� � ������ �ִ��� �� �� �����ϴ� (� ������ �߰� �� �� ����).
		
		
		
		List<Integer> listInteger = new ArrayList<>();
		List<Float> listFloat = new ArrayList<>();
		List<Number> listNumber = new ArrayList<>();
		listNumber.add(new Integer(1)); // OK
		listNumber.add(new Float(1.0F)); // OK
		listNumber = listInteger; // Error
		listNumber = listFloat; // Error

		List<? extends Number> listExtendsNum = new ArrayList<>();
		// �̷� ���� ������ �߻��մϴ�.
		// listExtendsNum.add (new Integer (1));
		listExtendsNum = listInteger; // OK
		listExtendsNum = listFloat; // OK
		
		
		//���� = ���� Ŭ�������� ,, �� ���� Ŭ���� Object�� �����ϱ� ������ list.add�� ������
//		List<? super Integer> list = new ArrayList<>();
//		list.add(1); // OK!
//		list.add(2); // OK!
		
		
//		���� ȥ������ ���ʽÿ�. �� ������ �Ҵ� �� ���ִ� ���̰� �ٸ� ���� �߰� �� ���ִ� ���Դϴ�. ���� ��� ������ �����ϴ�.
		List<Integer> listInteger = new ArrayList<>();
		List<Object> listObject = new ArrayList<>();
		List<? super Number> listSuperNum = new ArrayList<>();
		listSuperNum.add(new Integer(1)); // OK
		listSuperNum.add(new Float(1.0F)); // OK
		listSuperNum = listInteger; // Error!
		listSuperNum = listObject; // OK
		
		
		
		
		//���� ����
		1.���׸��� �⺻ �������� �۵����� �ʽ��ϴ�.
		// Use Wrappers instead
		List<int> list = new ArrayList<>(); 

		
		
		
		2.���� �Ű� ������ �ν��Ͻ��� �ۼ��� �� �����ϴ�.
		class Test<T> {
		   T var = new T();
		   // You don't know the type's constructors
		}

		
		
		
		3.static���� �Ű� ������ �ʵ�� ���� �� �� �����ϴ� .
		class Test<T> {
		   // If a static member is shared by many instances,
		   // and each instance can declare a different type,
		   // what is the actual type of var?
		   static T var;
		}

		
		
		
		4.���� ������ ���� instanceof���׸� ������ �Բ� ����� �� �����ϴ� .

		if(obj instanceof List<Integer>) { // Error
		}
		if (obj instanceof List<?>) {
		    // It only works with the unbounded 
		    // wildcard to verify that obj is a List
		} 

		
		
		
		5.���׸� ������ �迭�� �ν��Ͻ�ȭ �� �� �����ϴ�.
		class Test<T> {
		    T[] array; // OK
		    T[] array1 = new T[100]; // Error
		    List<String>[] array2 = new List<String>[10]; // Error
		}

		
		
		
		
		
		6.���׸� ������ ����, ���� �Ǵ� ���� �� �����ϴ�.
		class GenericException<T> extends Exception { } // Error

		<T extends Exception> void method() {
		    try {
		        // ...
		    } catch(T e) {
		        // Error
		    }
		}

		
		
		
		
		7.�׷��� throws�� ���� ���� �Ű� ������ ����� �� �ֽ��ϴ� .

		class Test<T extends Exception> {
		    public void method() throws T { } // OK
		}

		
		
		
		
		8.���� ������ �Ű� ������ ������ �������� ���� �δ� �޼���� �����ε� �� �� �����ϴ�.

		class Test {
		    // List<String> and List<Integer>
		    // will be converted to List at runtime
		    public void method(List<String> list) { }
		    public void method(List<Integer> list) { }
		}
		
		
		
	}
}
