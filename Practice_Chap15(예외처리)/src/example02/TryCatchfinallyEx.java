package example02;

public class TryCatchfinallyEx {

	public static void main(String[] args) {
		//�Ϲݿ���
		//Class Ŭ������ ���ڿ��� ������ Ŭ������ ���� ��ȯ�� ���ش�.(���� ��ü)
		//�ν��Ͻ��� ������ �˻����� ����� ����ϴ� ���� �ȵȴ�.
		try {
			Class class1 = Class.forName("java.lang.String");  //���ܰ� �߻����� �ʴ´� // java.lang.String Ŭ������ �����Ѵ�.
//			Class class1 = Class.forName("java.lang.String2"); //���ܰ� �߻��� ��� //java.lang�� String2 Ŭ������ �����Ƿ� ���ܹ߻��Ѵ�.
			System.out.println("Ŭ������ ã�ҽ��ϴ�.");
			System.out.println(class1.getName()); //getName()�� ��Ű�� + Ŭ���� ���  //���� Ŭ������ ��Ű�� �����ؼ� Ŭ�������� ȣ�����ش�.
			System.out.println(class1.getSimpleName()); //getSimpleName()�� Ŭ������ ���
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �����ϴ�.");
		}finally {  //finally�� ���ܰ� �߻��ϵ� �����ʵ� ������ �����Ѵ� //�ɼ�(��������), �׻� ����
 			System.out.println("���α׷��� �����ϰ� �����մϴ�.");
		}

	}

}
