package example03;

public class Monitor {   //����ͼ��赵
	
	//�������(�ʵ�,�Ӽ�)����
	String color;  //����� ����
	int channel;   //����� ä��
	int volume;    //�Ҹ� ����
	boolean power;  //����� ����ON/OFF (�⺻false)
	
	
	//����޼���(���)����
	//Monitor�� �Ѱų� ���� ����� �ϴ� �޼���
	public void power() {  			//���� Ÿ���� void�̸� return �ʿ����� �ʴ´�
		
		if(!this.power) {
			System.out.println("����Ͱ� �������ϴ�."); 
			this.power = !power;
		}
		else {
			System.out.println("����Ͱ� �������ϴ�.");
			this.power = !power;
		}
		
	}
	
	public void volumeUP() {
		System.out.println("���� ���� : " + (++this.volume));
	}
	
	public void volumeDOWN() {
		System.out.println("���� ���� : " + (--this.volume));
	}
	
	public void channelUP() {
		this.channel++;
		System.out.println("���� ä�� : " + this.channel); //this : Ŭ������ �ּ�(new��� �����ڰ� �ν��Ͻ��� �����ϸ� ��μ� Ȱ��ȭ�� �̷�����.)
	}
	
	public void channelDOWN() {
		//this.channel--;
		System.out.println("���� ä�� : " + (--this.channel));  
	}
	
	@Override
		public String toString() { //toString ��������� �ּҳ� ���ϴ� ���� ���� ������ ���
			return "���� ä�� : " + this.channel + " , " +  "���� ����  : " + this.volume;
		}

}
