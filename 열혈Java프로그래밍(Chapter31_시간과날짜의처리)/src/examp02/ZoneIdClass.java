package examp02;

import java.time.ZoneId;

public class ZoneIdClass {

	public static void main(String[] args) {
//		31_2 �ð���(����)�� ������ �ڵ� �ۼ� �׸��� ��� ������ ����
//		ZoneId �ν��Ͻ� ���� ���� ���ڿ� Ȯ�� ��� = ZoneId = �ð��� ����
		
//		�ð� �뺰 ���ڿ� ���� ��ü ��� ���
//		ZoneId.getAvailableZoneIds().stream().sorted().forEach(s->System.err.println(s)); //��� ������ �ð��븦 ������
		
//		�Ϻ� ������ �����ؼ� ����ϴ� ���
//		ZoneId.getAvailableZoneIds().stream().filter(s->s.startsWith("Asia")).sorted().forEach(s->System.out.println(s));//Asia������ �ð��� ������
		
		ZoneId paris = ZoneId.of("Europe/Paris"); //����(����) �ĸ�(����)
		System.out.println(paris); //�ĸ��� �ð��� ������ �ݿ��� ZoneId ����
	}

}
