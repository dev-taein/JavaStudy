package example01;

public class If_If_elseEx {

	public static void main(String[] args) {

		int score = 90;
		
		//�� ���ʰ��� if���� �����ϴ���, CPU�� ��� if���� �����մϴ�.(��ȿ������ �ڵ�)
//		if(score > 90) {
//			System.out.println("������ 90���� Ů�ϴ�");
//			System.out.println("����� A�Դϴ�.");
//		}
//
//		if(score > 80) {
//			System.out.println("������ 80���� Ů�ϴ�");
//			System.out.println("����� B�Դϴ�.");
//		}
//		if(score > 92) {
//			System.out.println("������ 90���� Ů�ϴ�");
//			System.out.println("����� B�Դϴ�.");
//		}
		
		
		//if-else������ 50%Ȯ���� ��, ����ϴ°� �ٶ����ϴ�.
		//else���� ������ ���ǹ��� ����� ���� �ȵȴ�.
		if(score >= 90 ) {
			System.out.println("90�� �̻��Դϴ�.");
		}
		 else {
			System.out.println("90�� �̸��Դϴ�.");
		 }
	}

}
