package example04;

public class ContinueEx {

	public static void main(String[] args) {

		//1~100���� ���̿��� Ȧ��, ¦���� ����ϴ� ���α׷�
		
//		for(int i=1; i<=100; i++) {
//			//continue���� �޹����� �������� �ƴ��ϰ�
//			//�ٷ� ���������� �̵��Ѵ�.
//			if((i%2) != 0) {
//				continue;
//			} 
//			System.out.println("¦���� : " + i );
//		}

		
		
		for(int i=1; i<=100; i++) {
			//continue���� �޹����� �������� �ƴ��ϰ�
			//�ٷ� ���������� �̵��Ѵ�.
			if((i%2) == 0 && (i%3) == 0) {
				System.out.println("2�� 3�� ����� ��� : " + i );
			} 
			
		}
	}

}
