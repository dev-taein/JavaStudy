package examp05;

public class CompareEx {

	public static void main(String[] args) {
		
		
		int result = Compare.compare(100, 200); //compare�� �տ����� ������ -1 ������ 0 �տ��� ũ�� 1
		System.out.println(result);
		
		
//		StringŬ������ NumberŬ�����ϰ� �ƹ��� ���谡 ����
//		Compare.compare("ȫ�浿", "�����");
		
//		NumberŬ������ ObjectŬ������ �ڼ��̱� ������ �Ű����� Ÿ������ �������� �ʴ�.
//		Compare.compare(new Object(), new Object());
		
		result = Compare.compare(new Integer(100), new Double(75.11));  //�տ��Ű� ū �� �̹Ƿ� 1�� ����
		System.out.println(result);
		
//		Number�� �߻� Ŭ�����̹Ƿ� �ν��Ͻ��� �������� ���Ѵ�.
//		result = Compare.compare(new Number(), new Number());
		
	}

}
