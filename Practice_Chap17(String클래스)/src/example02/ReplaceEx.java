package example02;

public class ReplaceEx {

	public static void main(String[] args) {


		//replace()�� ���ڿ� ��ü�ϴ� �޼����̴�.
		String oldstr = "�ڹٴ� ��ü���� ����Դϴ�.";
		String newstr = oldstr.replace("�ڹ�", "JAVA"); //�ڹٶ�� �ܾ ������  JAVA�� �ٲ۴�. = replace()���
		
		
		
		
		System.out.println(newstr.toString());
		
		
		System.out.println(oldstr.hashCode());  //hashcode�� �ּҸ� Ȯ���ϸ� ���� �ٸ� �ּҰ� ���´�
		System.out.println(newstr.hashCode());	//�� , oldstr�� newstr�� ���� �ٸ� �ּҸ� ������ �ν��Ͻ��̴�.
	}

}
