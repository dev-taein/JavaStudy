package example02;

public class PlayerEx {

	public static void main(String[] args) {
		
		//������ ������ �ڵ�(�ڱ� �ڽ��� ȣ��)
		Player player = new Player("�̵���", 40, 20, 60);
		player.info();
		System.out.println();
		
		
		
		//�������� ����� �ڵ�(�ʵ��� ������)
		//������, �ٺ��� ����� ���Ѵ�. �Ͽ� StrikerŬ������ �ִ� getshoot()�޼����
		//player2 ���������� ������ �ȵȴ�. (�ٺ��� Player�̱� �����̴�)
		Player player2 = new Striker("�����", 25, 10, 90, 50);
		//�޼��忡�� ��Ӱ��迡 �ִٸ�, �ڼ�Ŭ���� �������̵��� �ϰ� �Ǹ�, ���� �����ϰ� �ִ�
		//�ν��Ͻ��� �޼��带 ȣ���Ѵ�.(new Striker)
		player2.info();
		System.out.println();
		
		
		
		Player player3 = new MidFielder("�̰���", 18, 18, 80, 120);
		player3.info();
		System.out.println();
		
		
		Player player4 = new Defender("�迵��", 28, 18, 60, 60);
		player4.info();
	}

}
