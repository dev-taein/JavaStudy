package sec01.example01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			//�ڱ� �ڽ��� PC IP�ּ� Ȯ��
			InetAddress iAddress = InetAddress.getLocalHost();  //����
			String ip = iAddress.getHostAddress();
			System.out.println("�� ��ǻ���� ip �ּ� : " + ip);
			
			//������ ������ �̿��ؼ� IP�ּҸ� Ȯ��
			//���� ū ������ ������ �ִ� ȸ����� IP�� 2�� �̻��̴�.
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress inetAddress : inetAddresses) {
				ip = inetAddress.getHostAddress(); //ȣ��Ʈ
				System.out.println("���̹��� IP �ּ� : " + ip );
			}
			
			InetAddress[] inetAddresses2 = InetAddress.getAllByName("www.samsung.com");
			for(InetAddress inetAddress : inetAddresses2) {
				ip = inetAddress.getHostAddress(); //ȣ��Ʈ
				System.out.println("samsung������ IP �ּ� : " + ip );
			}
		} catch (UnknownHostException e) {
		}
	}

}
