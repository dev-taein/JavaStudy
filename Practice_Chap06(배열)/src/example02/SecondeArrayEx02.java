package example02;

public class SecondeArrayEx02 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {
										{100, 70, 50},
										{70, 50, 30},
										{50, 80, 70},
										{55, 85, 77},
										{100, 80, 75},
									};
									
		//���� ����
		int korTotal = 0; //����
		int engTotal = 0; //����
		int mathTotal = 0; //����
			
		int totalsum = 0; //�հ�
		double totalavg = 0.0; //���
									
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("===========================================");

		for(int i=0;i<score.length;i++) {
			int sum = 0; //���κ� ����
			double avg = 0.0; //���κ� ���
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			//System.out.print(i+1);
			System.out.printf("%3d", i+1);  //%3 = ���ڸ��� �԰ڴ�
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print("\t" + score[i][j]);
			}
			totalsum += sum; //���հ�
			avg = (double)sum / score[i].length; //���κ� ���
			totalavg += avg;
			
			//%n�� ����(�ٹٲ�)
			//printf() %d <- ������������ ������ŭ �׿� ���ԵǴ� ������ ,(��ǥ)�� ���еǾ� ����
			System.out.printf("\t%d \t%.2f%n", sum, avg);  //%n = �ٹٲ�, %.2 = �Ҽ��� ��°�ڸ� ���� ��Ÿ����, %d�� ���� ���, %f�� �Ҽ� ���
			//System.out.print("\t" + sum + "\t" + avg);
			//System.out.println();
		}
		totalavg /= score.length;
		System.out.printf("����\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, totalsum, totalavg);
	}

}
