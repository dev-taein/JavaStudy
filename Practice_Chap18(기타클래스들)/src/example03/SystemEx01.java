package example03;

public class SystemEx01 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println(i);
//			if( i == 5) {
//				System.exit(0);
//			}
		}

		for(int i=0; i<10; i++) {
			System.out.println(i);
			if( i == 5) {
				//System.exit()�� ���α׷��� ����, ()�ȿ��� 0�� �ش�.
				System.exit(0); // i�� 5�� �Ǿ����� ���α׷��� �����Ѵ�.  = break���� ���� ���������� ���̴�.
			}
		}
	}

}
