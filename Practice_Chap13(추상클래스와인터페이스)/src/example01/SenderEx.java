package example01;

public class SenderEx {

	public static void main(String[] args) {
		//�߻�Ŭ�����̴� ���� �ν��Ͻ��� ������ ���� ����.
		//ContentSender contentSender = new ContentSender();
		
		//�߻�Ŭ������ �����̴ϱ� �ʵ��� ������ �����
		ContentSender contentSender = new KaKaoSender("īī����", "ȫ�浿", "�ȳ�!ȫ�浿�̾�");
		contentSender.sendMessage("�迬��"); //�޴»��
		
		System.out.println();
		
		ContentSender contentSender2 = new SmsSender("SMS", "����", "�ݰ���!");
		contentSender2.sendMessage("�տ���");

	}

}
