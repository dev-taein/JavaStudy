package example02;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		//�ν��Ͻ��޼��� ȣ��
		int addresult = cal.add(100, 200);
		System.out.println("addresult : " + addresult);
		
		//static�޼��� ȣ��
		long mulResult = Calculator.multiply(100, 20);
		System.out.println("multiply : " + mulResult );
		//static�޼��� ȣ��
		double divResult = Calculator.divide(100.88, 10.55);
		System.out.println("divResult : " + divResult);
		
		//���� �޼����� ����(����ο� static������(s)�� �پ� �ִ�.) -- �ڹٴڽ����� Ȯ���� �ߴ�
		//Integer.parseInt("100");
		//Math.random();
	}

}
