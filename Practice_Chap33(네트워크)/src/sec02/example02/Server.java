package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.xml.ws.handler.MessageContext.Scope;

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
				System.out.println("[���� ��ٸ�]");
				
				//accept()�� Ŭ���̾�Ʈ�� ���� ��û�� �ؿ��� �������� ���, �� ���ŷ ���·� �ȴ�.
				//Ŭ���̾�Ʈ�� ��û�� ������ ��μ� �������� ��ſ� Socket ���� �����Ѵ�.
				Socket socket = serverSocket.accept(); 
				
				//Ŭ���̾�Ʈ�� ip�ּҸ� ����ڵ�
				//Ÿ�� ��ȯ�� �ϴ� ������ getRemoteSocketAddress()�� SocketAddressŬ������ �����ϹǷ�
				//SocketAddressŬ������ �ڼ��� InetSocketAddress�� �ٿ� ĳ������ �ϴ°��̴�
				InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[���� ������] : " + inetSocketAddress.toString());
				
				
				byte[] bytes = null; //���ڵ�
				String data = null;  //���ڵ�
				/////////////////////////////////////
				//�����͸� �ޱ� ���ؼ� ���Ͽ��� �Է½�Ʈ���� ��� �ڵ�
				InputStream inputStream = socket.getInputStream();
				bytes = new byte[1000];
				
				//Ŭ���̾�Ʈ���� ������ �����͸� �д� �κ�
				int readCount = inputStream.read(bytes);
				//�����ߴ� ����Ʈ�迭�� String���� ���ڵ�
				data = new String(bytes, 0, readCount, "UTF-8");
				
				System.out.println("[������ �ޱ� ����] : " + data );
				
				
				////////////////////////////////////////
				//�����͸� ������ ���ؼ� ���Ͽ��� ��½�Ʈ���� ��� �ڵ�
				OutputStream outputStream = socket.getOutputStream();
				data = "�ȳ��ϼ��� Ŭ���̾�Ʈ";
				//���ڵ��� �ϴ� �ڵ�
				bytes = data.getBytes("UTF-8");
				outputStream.write(bytes);
				outputStream.flush();
				
				System.out.println("[������ ������ ����]");
				
				inputStream.close();
				outputStream.close();
				socket.close();
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
