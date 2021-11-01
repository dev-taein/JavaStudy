package example01;

public class KaKaoSender extends ContentSender{

	private String content;

	public KaKaoSender(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}
	
	
	public String getContent() {
		return this.content;
	}


	//����Ŭ������ �߻�޼��带 �������̵���
	@Override
	public void sendMessage(String recipient) { //sendMessage(String content)�� �������̵��� �׷��� �޴»�� recipient�� ȣ���
		System.out.println("���� : "+ this.getTitle());
		System.out.println("�̸� : "+ this.getName());
		System.out.println("���� : "+ this.getContent());
		System.out.println("�޴� ��� : "+ recipient);
		
	}
}
