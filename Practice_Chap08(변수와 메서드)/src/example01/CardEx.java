package example01;

public class CardEx {
	
//	public static void method() {
//		int temp;
//		System.out.println(temp);
//	}

	public static void main(String[] args) {
		
		//Ctrl + pageup : �������� �̵�
		//Ctrl + pagedown : �������Ϸ� �̵�
		
		Card card1 = new Card();
		card1.setColor("���");
		card1.setCompany("��������");
		
		
		System.out.println(card1);
		card1.show();
		
		
		//static������ �ݵ�� Ŭ������.static���������� �����Ͽ��� ��
//		//�����ϸ�, ���������� �м��ϴ� �ܰ迡���� �ٲ��� �ʴ°� �ٶ����� ���
//		card1.width = 80;        x
//		card1.height = 150;      x

		Card.width = 80;
		Card.height = 150;
		
		
		Card card2 = new Card();
		card2.setColor("�Ķ�");
		card2.setCompany("��������");
		
		System.out.println(card2);
		

	}

}
