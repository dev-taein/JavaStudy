package example03;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;	 //while���� �ʱ�ȭ �ϴ� �κ��� ���� �������� �ʴ´�.
		
		//while�� ������ ���ǽĸ� ���� ������, for���� ���ؼ� �Ϲ������ο�����
		//�������� ��������.
//		while(i<=100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~100������ �� : " + sum);
		
		
		
		
		//c������ ���� boolean Ÿ���� ����. �Ͽ�, 0�� ����, 0�� ������ 
		//��� ������ ������ �ν��Ѵ�
		//while���� ���ѷ��������� ���� ���ȴ�. if()�� break���� �Բ�
		//���ѷ����� ��� �ڵ带 �ۼ� ���ֽô°� �´�.
		while(true) {
			System.out.println(i);
			if(i>=100) {
				break;
			}
			i++;
			
		}
			
			


	}

}
