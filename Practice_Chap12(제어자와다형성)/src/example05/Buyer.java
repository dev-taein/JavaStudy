package example05;
//����Ŭ����
public class Buyer {

	int money = 1000;    //�����ݾ�
	int bonusPoint = 0;  //���ʽ� ����
	
	
	
	
	
	//       buy(Product porduct)
	//���⼭ �Ű����� ProducŸ���� �Դٴ� ���� ������ �ǹ� �մϱ�?
	//Product�̰ų� ���� �ڼյ��� �� �� �� �ִٶ�� ���� �ǹ��մϴ�. �̰��� (�Ű������� ������)�̴�
	public void buy(Product porduct) {
	//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
	if(this.money < porduct.price) {
		System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
		return;
	}
	this.money -= porduct.price;
	this.bonusPoint += porduct.bonusPoint;
	System.out.println(porduct + "�� �����ϼ̽��ϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
			//			�Ʒ��� ���� ���α׷��� �ϴٺ���, �ڵ��� ���̴� ���Ѵ밡 �� ���̸�,
			//						���� ������� �ڵ�θ� ������ ����
	
//	public void buy(TV tv) => //buy�޼ҵ尡 TVŬ������ �޴´�. TV�� Ŭ���� tv�� ȣ��� �̸�
//	public void buy(TV tv) {
//		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
//		if(this.money < tv.price) {
//			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
//			return;
//		}
//		this.money -= tv.price;
//		this.bonusPoint += tv.bonusPoint;
//		System.out.println(tv + "�� �����ϼ̽��ϴ�.");
//	}
//	
//	
//	public void buy(Audio audio) {
//		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
//		if(this.money < audio.price) {
//			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
//			return;
//		}
//		this.money -= audio.price;
//		this.bonusPoint += audio.bonusPoint;
//		System.out.println(audio + "�� �����ϼ̽��ϴ�.");
//	}
//	
//	
//	public void buy(Computer computer) {
//		//�����ڰ� ���� ������ ��ǰ�� ������ ��� ���
//		if(this.money < computer.price) {
//			System.out.println("�ܾ��� �����Ͽ�, ���� ������ �ȵ˴ϴ�.");
//			return;
//		}
//		this.money -= computer.price;
//		this.bonusPoint += computer.bonusPoint;
//		System.out.println(computer + "�� �����ϼ̽��ϴ�.");
//	}
	

}
