package example01;

public class StringBuilderEx {

	public static void main(String[] args) {

		//StringBuilder, StringBufferŬ������ ����(�ӽ�����޸�)��
		//�̿��ϱ� ������ ���ο� �ν��Ͻ��� �����Ǵ°��� �ƴ϶�, �ϳ��� �ν��Ͻ���
		//������ ���ڿ��� ������ �� �ִ�.
		StringBuilder sBuilder = new StringBuilder("JAVA");
//		System.out.println(sBuilder.hashCode()); //�ּҸ� ���� �� =.hashCode()
		
		sBuilder.append("Program"); //append �޼��带 ����ص� ���� �ּҸ� ������.
		System.out.println(sBuilder);
//		System.out.println(sBuilder.hashCode());
		
		sBuilder.insert(1, "��");  // 1��° ���� "��"�� ����
		System.out.println(sBuilder);
		
		sBuilder.insert(1, 100);  
		System.out.println(sBuilder);
		
		sBuilder.setCharAt(0, 'R');  // 0��° ���ڸ� 'R'�� �ٲ۴�.
		System.out.println(sBuilder);
		
		sBuilder.reverse();
		System.out.println(sBuilder);
		
		sBuilder.delete(0, 3); //0���� 3��°���� ����� (������ ��ȣ�� �ȵȴ�- 0,1,2)
		System.out.println(sBuilder);
		
		int length = sBuilder.length();
		System.out.println("�� ���� �� : " + length);
	}

}
