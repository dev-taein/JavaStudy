package example03;

public class MonitorEx {

	public static void main(String[] args) {  //���� mainŬ������ ���ุ �ϴ°� �ٶ����ϴ�.
		
		//monitor���������� �������� ���� ���̶�� ��������
		Monitor monitor = new Monitor();
		
		System.out.println(monitor.toString());  //MonitorŬ����(����ͼ��赵����) toString�� �������̵�(������)�߱� ������
												 //MonitorExŬ����(����ͻ���)������ toString������ ����
		
		monitor.channel = 5;
		monitor.power();
		monitor.channelUP();
		monitor.channelUP();
		monitor.channelDOWN();
		
		monitor.volumeUP();
		monitor.volumeUP();
		monitor.volumeUP();
		
		System.out.println(monitor);
		
		monitor.power();
	}

}
