package example03;

public class MethodEx {
	
	
	//�޼����� ����� ����  - int add (int x, int y) �� �����
	//1. ����Ÿ��(��ȯ��) : int
	//2. �޼���� : add
	//3. () : �Ű�����, ���ڰ�, Arguments 
	//�޼��� ����� �߿䵵(98%), �޼��� ������(���Ǻ�)
	public static int add(int x, int y, int z1) {
//		int temp = 0;
//		temp = x + y + z1;
		System.out.println("add�޼��� ȣ���");
		return x + y + z1;
	}
	
	
	
	
	public static int minus(int x1, int y1) {
		System.out.println("minus�޼��� ȣ���");
		return x1 - y1;
	}
	
	public static int multiply(int x2, int y2) {
		return x2 * y2;
	}
	
	public static int divide(int x3, int y3) {
		return x3 / y3;
	}
	//multiply(����), divide(������)
	
	
	
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
		//���� ���� ����(Call by Value)
		int result = add(num1, num2, 100); //add��� �޼���
		System.out.println("num1 + num2 : " + result);
		
		
		//���� ���� ����(Call by Value)
		result = minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		//���� ���� ����(Call by Value)
		result = multiply(num1, num2);
		System.out.println("num1 * num2 : " + result);
		
		//���� ���� ����(Call by Value)
		result = divide(num1, num2);
		System.out.println("num1 / num2 : " + result);
		
	}

}
