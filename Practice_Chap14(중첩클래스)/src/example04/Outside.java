package example04;

public class Outside {

	//�ܺ� Ŭ���� �ʵ� ����
	String str = "Outside-Field";
	
	//��� �޼���
	public void method() {
		System.out.println("Outsize-method()ȣ��");
	}
	
	class Inner{
		//�ʵ� ����
		String str = "Inner-Field";
		//��� �޼���
		public void method() {
			System.out.println("Inner-method()ȣ��");
		}
		//��� �޼���
		public void showInfo() {
		
			System.out.println(this.str); //Inner�� this�̴�
			this.method(); // Inner�� method()ȣ��
			
			System.out.println();
			
			//�ܺ� Ŭ������ �����ϴ� ���
			//�ܺ� Ŭ������.this.�ܺ�Ŭ��������̸�
			System.out.println(Outside.this.str); //Outside�� this�̴�
			Outside.this.method(); //Outside�� method()ȣ��
			
			
		}
	}
	
	public void show() {
		//�ܺ� Ŭ���� ���������� this�� �翬�� OutsideŬ������ ���Ѵ�.
		System.out.println("------�ܺ�-------");
		System.out.println(this.str);
		this.method();
		
		//�ܺο��� ���η� �����ϴ� ���  //�ܺ�Ŭ�������� ���� Ŭ������ ������ �ҷ��� ������ �ʴ´�.
		//�Ʒ��� ���� �ν��Ͻ��� �ϳ� �����ؼ� ��øŬ������ ����鿡�� ������ �ϸ� �ȴ�.
		System.out.println("------�ܺο��� ���� ���-------");
		Inner in = new Inner();
		System.out.println(in.str);
		in.showInfo();
	}

}
