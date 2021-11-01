package sec02.example04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;

import javax.print.attribute.standard.Severity;

public class FileServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			 serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 7777));
			System.out.println("[���� ����]");
		} catch (IOException e) {}
		//������ ���������� ���ѷ����� ���ƾ��Ѵ�.
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				InputStream inputStream = socket.getInputStream();
				
				byte[] bytesArr = new byte[100];
				int readCount = -1;
				//���� �̸� �б�
				inputStream.read(bytesArr, 0, 100);
				String fileName = new String(bytesArr, 0, 100, "UTF-8");
				fileName = fileName.trim(); //�����̸� �� �� ��������
				
				System.out.println("[���� �ޱ� ����] : " + fileName);
				//������ �ޱ� �����ϰ� �Ǹ�, ���� ��θ� �� ������ ������ �����ϸ� �ȴ�.
				FileOutputStream fileOutputStream = new FileOutputStream("C:/Temp/" + fileName);
				while((readCount = inputStream.read(bytesArr)) != -1) {
					fileOutputStream.write(bytesArr, 0, readCount);
				}
				fileOutputStream.flush();
				System.out.println("[���� �ޱ� �Ϸ�]");
				fileOutputStream.close();
				inputStream.close();
				
			} catch (Exception e) {
				System.out.println("���� �ޱ� ���� �߻�");
				break;
			}
		}
		try {
			serverSocket.close();
			System.out.println("[������ ����Ǿ����ϴ�.]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
