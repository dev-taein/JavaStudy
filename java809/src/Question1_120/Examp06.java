package Question1_120;

public class Examp06 {
	public static void main(String[] args) {
		int a = 10;
		int b = -1;
		assert (b >=1) : "Invalid Denominator";  //false�̸�  "Invalid Denominator"�� ����ϰ�  true�̸� a/b�� ����� c�� ��µȴ�.
		int c = a / b;
		System.out.println (c);
		
		
	
		
		
//		asesert�� ����ϱ� ���ؼ��� Run-Configurations-VM arguments�ȿ� -ea �ɼ��� �־�� �Ѵ�.
		//�� : AssertionError Invalid Denominator
//		-da = -ea�ɼ��� ��
	}
}
