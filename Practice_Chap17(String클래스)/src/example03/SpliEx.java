package example03;

public class SpliEx {

	public static void main(String[] args) {
		
		String str1 = "�����,�ʸ�/����ġŲ&���ġŲ,����ġŲ";
		
		//����ǥ����(,?/!@$%^ ��)
		//spli() : �Ű������� ����ǥ������ �´�. ����Ÿ���� ����ǥ���� ���еǾ���
		//String[]�� �����Ѵ�.
		String[] strArr = str1.split(",|/|&"); // ���ڿ����� |��  -> or (~�̰ų�) ����
		for(String str : strArr)
			System.out.println(str);
	}

}
