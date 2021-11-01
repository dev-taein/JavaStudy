package examp05;

public class Compare {

	//�Ű����� TŸ���� Number(�߻�Ŭ����)Ÿ���̰ų� NumberŬ������ ��ӹ޴�
	//�ڼ�Ŭ������ TŸ������ ���� �� �ִ�.(���� Ÿ���� ������) �ͻ�
	public static <T extends Number> int compare(T t1,T t2) {  //NumberŬ������ ���� Ŭ������ �� �� �ֵ�.
		
		//NumberŬ������ doubleValue()�޼���� ���� �߻�޼�������,
		//�ڼ�Ŭ����(Integer, Double ��)�� �� ���� �ִµ� �ڼ�Ŭ������
		//doubleValue()�޼��带 �������̵��� �߱⿡ ������ ���� �ʴ´�.
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		return Double.compare(value1, value2);
	}
}
