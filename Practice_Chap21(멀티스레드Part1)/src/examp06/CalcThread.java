package examp06;

public class CalcThread extends Thread{
	long sum;
	//�ܺηκ��� �Ű������� �޾Ƽ� Thread���� ������
	public CalcThread(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int i=0; i<20000000; i++) {
			sum += i;
		}
		System.out.println("[�۾� �Ϸ� ������] : " + this.getName());
		System.out.println("[�դ�{] : " + this.sum);
	}
}
