package tokenExample;

import java.util.StringTokenizer;

public class SplitStringTokenizerEx {

	public static void main(String[] args) {
		
		String data = "baby cat dog a d c d e f s a s f e g e s g r t";
		
		long start = System.nanoTime();
		
		//split()�� �����ڸ� �������� �ָ� �����Ͱ� ������ �ټ� �����ϰ� �ִٸ�,
		//���鵵 �ϳ��� ��ū���� �ν��Ѵ�. = ������ �������� �� ����̵ȴ� 
		String[] result = data.split(" ");
		for(String str : result) {
			System.out.println(str);
		}
		long end = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (end-start) + "ns");
//		System.out.println("��ū ���� : " + result.length); //���鵵 ��ū�̶� ���� ���� ����
		System.out.println("------------------------------------------");
		
		
		//StringTokenizer�� �����ڷ� ������ �ָ� �����Ͱ� ������ �ټ� �����ϰ� �ִٸ�,
		//������ ��ū���� �������� �ʴ´�. = ������ ���������� �� �ϳ��� �������� �ν��Ѵ�
		StringTokenizer stringTokenizer = new StringTokenizer(data, " ");
		start = System.nanoTime();
		while(stringTokenizer.hasMoreTokens()) {
//			System.out.println("���� ��ū �� : " + stringTokenizer.countTokens());
			String str = stringTokenizer.nextToken();
			System.out.println(str);
		}
		end = System.nanoTime();
		System.out.println("�ɸ� �ð� : " + (end-start) + "ns");
	}

}
