package examp09;
//���� ��ü
public class Toilet {

	//�÷��� ���� (Ʈ���϶� �޽��ϋ� ������ �ض�)
//	private boolean seat;
//	�޼��� ����� �Ͼ��.
	public synchronized void use() throws Exception{
		
		String name = Thread.currentThread().getName();
		
		//�������� ȭ��ǿ� ��������
//		if(this.seat==false) {
//			this.seat = true;
		System.out.println(name + "��/�� ȭ��ǿ� �����Ͽ����ϴ�.");

		
		
		Thread.sleep(1000);
		System.out.println(name + "��/�� �� : �� �����ϴ�~~!");
		
//		this.seat = false;
		System.out.println(name + "��/�� ȭ��� ����� ���ƽ��ϴ�.");
		System.out.println();
//		} else {
//			System.out.println(name + "��/�� ȭ��� ��� �� �Դϴ�. ��ٸ�����!");
//		}
	}
	//�񵿱�ȭ �޼���
	public void noke() {
		System.out.println(Thread.currentThread().getName()  + " �� �� !");
	}
}
