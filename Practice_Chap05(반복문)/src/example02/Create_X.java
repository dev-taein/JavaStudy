package example02;

public class Create_X {

	public static void main(String[] args) {
//		*    *        //1��° �� ��� 5��° �� ����
//		 *  *         //2��° �� ��� 4��° �� ����
//         *          //3��° �� ����
//		 *  *		  //2��° �� ��� 4��° �� ����
//		*    *	      //1��° �� ��� 5��° �� ����
		
		//x, y�� ���� �ڸ��� �ٲپ� ���鼭, ���ǿ� ������ �ǰ�
		//������, *�� �ڸ����� �ȴ�.
		int x=1;
		int y=5;
		
		for(int i=1; i<=5; i++) {         //5��
			for(int j=1; j<=5; j++) {     //5��
				if(j == x || j == y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(); //�ٹٲ�
			x++;
			y--;
		}

	}

}
