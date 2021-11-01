package example01;

public class Phone {
	//private(���� Ŭ������������ ����)
	//�ʵ�(�������)
	//protected ���� ������ : ��� �Ǵ� ���� ��Ű������ �� ���� ������. �ٸ� ��Ű������ ���� �Ұ�. �ٸ���Ű������ ��ӹ޾Ƶ� ���� �Ұ�.
	private String model;
	private String color;
	private String company;
	
	//�Ű����� ������
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}

	//getter()���� (ĸ��ȭ ����) (private�� getter�� ������ ����)
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}
	
	@Override
	public String toString() {
		String str = "��  : " + this.getModel() + "���� : " + this.getColor() + "���� ȸ�� : " + this.getCompany();
		return str;
	}
	

}
