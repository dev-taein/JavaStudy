package example01;

//�߻�Ŭ������? 1���̻��� �߻�޼��带 �����ϴ� Ŭ������ �߻�Ŭ����
//�ν��Ͻ��� ����� ������ ���� ����.(�߻�޼��尡 �����ϱ� �����̴�)
//�߻�޼���� ����θ� �����ϰ� �����ΰ� ���� ��
public abstract class ContentSender {
	
	private String title;
	private String name;
	
	//������
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return this.title;
	}

	public String getName() {
		return this.name;
	}
	//�߻�޼���-> ����� ���ؼ� �ݵ�� �����ǰ� �Ǿ�� ��μ� 
	//�ν��Ͻ��� ������ �� �ִ�.
	public abstract void sendMessage(String content);
}
