package example07;

public class Default_StaticEx {

	public static void main(String[] args) {
		
		MyInterface mInterface = new Person();
		mInterface.dmethod();//����Ʈ�޼���
		mInterface.method(); //�߻�޼���
		
		MyInterface.smethod();//�������̽��� �����޼��� ȣ�� -> �������̽���.�����޼���� 
	}

}
