package example03;

public class RanddomEx {

	public static void main(String[] args) {
		
		//Math.random()�� ���� 0.00000~0.99999������ ���� �߻���Ŵ
		//System.out.println(Math.random());
		
		//�ֻ��� ���� �������� �߻�
		int num = (int)(Math.random()*6) + 1; //1~6������ ������ ���� �߻���Ű�� ��
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("1�� ���Գ׿�!");
		}
		else if(num == 2) {
			System.out.println("2�� ���Գ׿�!");
		}
		else if(num == 3) {
			System.out.println("3�� ���Գ׿�!");
		}
		else if(num == 4) {
			System.out.println("4�� ���Գ׿�!");
		}
		else if(num == 5) {
			System.out.println("5�� ���Գ׿�!");
		}
		else {
			System.out.println("6�� ���Գ׿�!");
		}
		//���� if���� switch������ �ٲ㺸����...
	}

}
