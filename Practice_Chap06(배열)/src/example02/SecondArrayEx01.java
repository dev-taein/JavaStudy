package example02;

public class SecondArrayEx01 {

	public static void main(String[] args) {
		
		//[]���ȣ�� ������ �� ������ �ǹ��Ѵ�.
		//2���� �迭�� ����� ���ÿ� �ʱ�ȭ�� �ϰ� �ִ�.
		int[][] score = new int[][] {
							{100, 100, 100},
							{50, 50, 50},
							{10, 20, 30},
							{60, 20, 40}
						};
		
		//2���� �迭�� ���� �а� ���� ���ؼ��� ��������� �ݵ�� �ʿ��ϴ�
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {  //2�����迭�� 1�����迭�� �ּҰ��̴�, score[i]�� 2�����迭�� 1�����ּҰ�
				System.out.println(score[i][j]);
			}
		}
		System.out.println("2���� �迭�� ũ�� : " + score.length);
		System.out.println("2���� �迭�� �ּ� : " + score);
		
		
		
		//2���� �迭������ 2���� �迭�� �ּ�, 1���� �迭�� �ּҰ� �ȴ�.(�߿�)
		for(int i=0; i<score.length; i++) {
			 	System.out.println("1���� �迭�� ũ�� : " + score[i].length);
				System.out.println("1���� �迭�� �ּ� : " + score[i]);
			}
		
		//2���� �迭������ �迭��[][]�� �� ������ �����ϴ�
		score[0][0] = 999;
		System.out.println(score[0][0]);
		
		
		
		//���� for��(JDK 1.5)
		//collection framework ��ü�� ������ ��, ���� ���Ǵ� ���
		//for( ������ Ÿ�� : ������ ��� )
		int sum = 0;
		for(int[] temp : score) {
			for(int i : temp) {
				sum += i;
			}
		}
		System.out.println("�հ� : " + sum);
		
	}

}
