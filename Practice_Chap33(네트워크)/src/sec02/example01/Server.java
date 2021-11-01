package sec02.example01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		//������ ����
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			//��Ʈ�� ���ε��ϱ� ���� �ڵ�
			serverSocket.bind(new InetSocketAddress("localhost", 7777));
			
			//������ Ŭ���̾�Ʈ�� ��û�� ���� ���� �� �𸣹Ƿ� ���� ������ ���ƾ��Ѵ�.
			while(true) {
				System.out.println("���� ��� ��");
				
				//accept()�� Ŭ���̾�Ʈ�� ���� ��û�� �ؿ��� �������� ���, �� ���ŷ ���·� �ȴ�.
				//Ŭ���̾�Ʈ�� ��û�� ������ ��μ� �������� ��ſ� Socket ���� �����Ѵ�.
				Socket socket = serverSocket.accept(); 
				
				//Ŭ���̾�Ʈ�� ip�ּҸ� ����ڵ�
				//Ÿ�� ��ȯ�� �ϴ� ������ getRemoteSocketAddress()�� SocketAddressŬ������ �����ϹǷ�
				//SocketAddressŬ������ �ڼ��� InetSocketAddress�� �ٿ� ĳ������ �ϴ°��̴�
				InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("���� ���� �� : " + inetSocketAddress.toString());
			}
		} catch (IOException e) {}
		//�ý����� ���ҽ�(�ڿ�)�� �� ����ϰ� ���� �ݵ�� close()�� ȣ������.
		//������ �� �ڵ尡 �ǹ̰� ����.
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {}
		}
	}

}
