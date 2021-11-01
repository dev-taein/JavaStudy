package sec03.example01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public UDPServer(int port) {
		try {
			while(true) {
				DatagramSocket datagramSocket = new DatagramSocket(port);
				byte[] bytes = new byte[100];
				DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
				System.out.println("���� ����");
				datagramSocket.receive(datagramPacket);
				//���ڵ�
				String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength(), "UTF-8");
				System.out.println("���ŵ� ������ : " + str.trim());
				
				//Ŭ���̾�Ʈ�� ������ ����� �Ѵ�
				InetAddress inetAddress = datagramPacket.getAddress(); //Ŭ���̾�Ʈ�� ip�� ���� �� �ִ�
				int clientPort = datagramPacket.getPort(); //��Ʈ��ȣ�� ��´�.
				System.out.println("Ŭ���̾�Ʈ IP : " + inetAddress + "Ŭ���̾�Ʈ Port : " + clientPort);
				
				datagramSocket.close();
			}
		} catch (Exception e) {
			//�񿬰� ������UDP�̹Ƿ� ���ܸ� Ȯ�� �ϱ� �����.
			System.out.println("������ ���� ���� �߻�");
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new UDPServer(7777); //���� ��Ʈ
	}

}
