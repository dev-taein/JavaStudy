package Question1_120;
class Customer {
private String fName;
private String lName;
private static int count;
public Customer(String first, String last) {
	fName = first;
	lName = last;
	++count;}
static { count = 0; }  //�̻����� �� �ִ°���?
public static int getCount() {return count; }
}
public class Examp55 {
		public static void main(String[] args) {
			Customer c1 = new Customer("Larry", "Smith");
			Customer c2 = new Customer("Pedro", "Gonzales");
			Customer c3 = new Customer("Penny", "Jones");
			Customer c4 = new Customer("Lars", "Svenson");
			c4 = null;   //
			c3 = c2;  	//   �� �ΰ��� �ƹ��� ������ ����
			//�ν��Ͻ��� �����ؾ� count�� ������
			System.out.println (Customer.getCount());
	}
}


//��:  D. 4