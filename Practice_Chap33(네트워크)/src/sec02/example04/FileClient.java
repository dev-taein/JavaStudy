package sec02.example04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class FileClient {

	public static void main(String[] args) {
		
		
		Socket socket = null;
		try {
			socket = new Socket("localhost", 7777);
			OutputStream outputStream = socket.getOutputStream();
//			String filePath = "D:\\java�۾�\\Practice_Chap33(��Ʈ��ũ)\\src\\sec02\\example04\\files\\��Ʈ��.mp4";
			String filePath = "D:\\java�۾�\\Practice_Chap33(��Ʈ��ũ)\\src\\sec02\\example04\\files\\�迬��.jpg";
			
			//���� ��ü ���
			File file = new File(filePath);
			//���� �̸� ���
			String fileName = file.getName();
			byte[] fileNameBytes = fileName.getBytes("UTF-8");
			fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
			//���� �̸��� ������ �κ�
			outputStream.write(fileNameBytes);
			
			//������ ������ ����
			System.out.println("[���� ������ ����] : " + fileName);
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] filArr = new byte[1000];
			int readCount = -1;
			
			while((readCount = fileInputStream.read(filArr)) != -1) {
				outputStream.write(filArr, 0, readCount);
			}
			outputStream.flush();
			System.out.println("[���� ������ �Ϸ�]");
			
			fileInputStream.close();
			outputStream.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("���� ������ ���� �߻�");
			e.printStackTrace();//������ ��θ� ��Ÿ����
		}
	
	
	}

}
