package examp05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Message> mQueue = new LinkedList<>();
		mQueue.offer(new Message("sendMail", "ȫ�浿"));
		mQueue.offer(new Message("sendSMS", "�迬��"));
		mQueue.offer(new Message("sendKaKatalk", "��浿"));
		mQueue.offer(new Message("sendFaceBook", "�Ͼ�"));
		
		while(!mQueue.isEmpty()) {
			Message message = mQueue.poll();
			System.out.println(mQueue.size());
			switch (message.getCommad()) {
			case "sendMail":
				System.out.println(message.getTo() + "���� ������ �����ϴ�");
				break;
			case "sendSMS":
				System.out.println(message.getTo() + "���� SMS�� �����ϴ�");
				break;
			case "sendKaKatalk":
				System.out.println(message.getTo() + "���� īī������ �����ϴ�");
				break;
			case "sendFaceBook":
				System.out.println(message.getTo() + "���� ���̽����� �����ϴ�");
				break;
			
			}
		}
	}

}
