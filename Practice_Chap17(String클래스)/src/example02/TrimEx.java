package example02;

public class TrimEx {

	public static void main(String[] args) {
		
		
		
		//trim()�� �¿� ���鸸 ������. �߰��� �ִ� ������ ���α׷��Ӱ� ����
		//�����ϴ� �ڵ带 �ۼ��ϼž� ��.
		String tel1 = "       02";
		String tel2 = "-772     ";
		String tel3 = "     -1037  ";
		
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
		

	}

}
