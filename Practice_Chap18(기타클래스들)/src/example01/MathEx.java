package example01;

public class MathEx {

	public static void main(String[] args) {
		
		//abs() ���밪
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-7.88);
		System.out.println(v1);
		System.out.println(v2);
		
		//�ø���
		double v3 = Math.ceil(5.3);
		System.out.println(v3);
		
		//������
		double v4 = Math.floor(5.3);
		System.out.println(v4);
		
		//MAX �� �߿� �ִ밪
		int v5 = Math.max(10, 5);
		System.out.println(v5);
		
		//MIN �� �߿� �ּҰ�
		int v6 = Math.min(10, 5);
		System.out.println(v6);
		
		//������ 0.0~0.9
		double v7 = Math.random();
		System.out.println(v7);
		
		//����� ������ �Ǽ���
		double v8 = Math.rint(5.3);
		System.out.println(v8);
		
		//�ݿø��� - ������ �Ҽ��� ù° �ڸ������� �ݿø��� �����ϴ�.
		long v9 = Math.round(5.5);
		System.out.println(v9);
		
		//�Ҽ��� ��°�ڸ����� �ݿø� �ϴ� ���� ��� �ϳ�
		double value = 12.3456;
		double temp1 = value * 100;  // ���� 100�� ���ϰ�  -> 1234.56
		System.out.println(temp1);
		long temp2 = Math.round(temp1); //round�� �ݿø� 1235
		System.out.println(temp2);  
		double v10 = temp2 / 100.0; // �ٽ� ��������Ѵ�. 1235/100.0
		System.out.println(v10);	// ��� : 12.35
	}

}
