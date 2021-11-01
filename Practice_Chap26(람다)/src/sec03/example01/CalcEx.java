package sec03.example01;

import java.util.function.IntBinaryOperator;

public class CalcEx {

	public static void main(String[] args) {
		
		//������ ����Ÿ�԰� ������ �Ű����� Ÿ���� ��ġ�ؾ� �޼��� ������ �����ϴ�.
		
//		1. ������ �޼����� �Ű������� ���ϰ��� ���������� ��Ȯ�ϰ� �ľ��� �Ѵ�.
//		2. �ľ��� ���� ���� ������ �Լ��� �������̽��� ã�´�.
//		3. �� ���� ���� �޼�������, �ν��Ͻ��޼��������� Ȯ���ؼ� �޼��带 �����ϴ� ������ �͸�����ü�� �����.
//		��� : �޼��� ���� ���õ� �͸� ���� ��ü�� ����� ���̹Ƿ�, �Լ��� �������̽��� ������ �����ϴٴ� ���̰�,
//		�ƿ﷯, �Ű������� ���� ���� �´� ���� Ÿ�� Ÿ������ �����Ͽ� �����ؾ� �Ǵ� ���̴�.
//		�ڵ尡 �پ��� �����͵� ������ ó���� ����������.
		
		
		
		
		//IntBinaryOperator�Լ��� �������̽��� 2���� int�� �Ű������� �޾� �����Ͽ� 
		//�ϳ��� int������ �����Ͽ�, �߻�޼��� int applyAsInt(int left, int right);�� ������ �ִ�.
		//�Ͽ� ���ٽ����� �����ϸ� �Ʒ��� ����.
		IntBinaryOperator intBinaryOperator = null;
		
		//���ٽ� ����
		intBinaryOperator = (x,y) -> {return Calc.sAddMethod(x, y);};
		System.out.println("���ٽ� : " + intBinaryOperator.applyAsInt(100, 200));
		intBinaryOperator = (x,y) -> {return Calc.sMulMethod(x, y);};
		System.out.println("���ٽ� : " + intBinaryOperator.applyAsInt(100, 200));
		
		//�޼��� ���� ���� ����---�����޼ҵ� ȣ��
		//���ŷӰ� ���ٽ����� ������ �Ҷ� �Ű������� 2�� �����־�� �Ѵٴ� ���� ���̱� ���ؼ�
		//�Ʒ��� ���� �޼��� ������ �ڵ��� �ϸ� �ڵ��� ���� ���� �� �ִٶ�� �������� ��ȵ� ����̴�.
		intBinaryOperator = Calc :: sAddMethod;
		System.out.println("�޼��� ���� : " + intBinaryOperator.applyAsInt(100, 200));
		
		
		intBinaryOperator = Calc :: sMulMethod;
		System.out.println("�޼��� ���� : " + intBinaryOperator.applyAsInt(100, 200));
		
		
		System.out.println("----------------�ν��Ͻ� �޼���--------------------------------------------");
		
		Calc calc = new Calc();
		//���ٽ� ����
		intBinaryOperator = (x,y) -> {return calc.iMethod(100, 200);};
		System.out.println("���ٽ� : " + intBinaryOperator.applyAsInt(100, 200));
		
		//�޼��� ����
		intBinaryOperator = calc :: iMethod;
		System.out.println("�޼��� ���� : " + intBinaryOperator.applyAsInt(100, 200));
	}

}
