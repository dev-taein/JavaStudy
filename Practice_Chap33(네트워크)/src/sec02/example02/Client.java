package sec02.example02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		//������ Ŭ����Ʈ read()���� ��� ����(���ŷ)�� �ȴ�.
		//Ŭ���̾�Ʈ�� ����ǰų� ������ �߻��Ҷ� ���ŷ�� Ǯ����.
		
		//Ŭ���̾�Ʈ�� ����
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("���� ��û");
			
			//������ �����ϴ� �ڵ�
			socket.connect(new InetSocketAddress("localhost", 7777));
			System.out.println("���� ����");
			
			
			byte[] bytes = null;
			String data = null;
			
			///////////////////////////////////
			//�����͸� ������ ������ ���� �ڵ�
			OutputStream outputStream = socket.getOutputStream();
			data = "�ȳ� ����";
			//���ڵ�, ��� ��Ʈ��ũ �ۼ����� �Ҷ��� ���ڼ��� UTF-8�� ����ȭ�� �Ǿ��ִ�.
			//�ѱ��� 3����Ʈ�̴�.
			bytes = data.getBytes("UTF-8");
			outputStream.write(bytes);
			outputStream.flush();
			System.out.println("[������ ������ ����]");
			
			/////////////////////////////////////
			//�����͸� �ޱ����� �ڵ带 �ۼ��Ѵ�.
			InputStream inputStream = socket.getInputStream();
			bytes = new byte[1000];
			//read()����  ���ŷ ���°� �ȴ�.
			int readCount = inputStream.read(bytes);
			//���ڵ�
			data = new String(bytes, 0, readCount, "UTF-8");
			System.out.println("[������ �ޱ� ����]  : " + data);
			
			outputStream.close();
			inputStream.close();
			
		} catch (IOException e) {}
		
		//������ ���� ���� �ڵ�
		if(!socket.isClosed()) {
			try {
				socket.close();
				System.out.println("Ŭ���̾�Ʈ�� ������ �������ϴ�.");
			} catch (IOException e) {}
		}
	}

}
