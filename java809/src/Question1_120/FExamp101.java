package Question1_120;

import java.util.function.UnaryOperator;

public class FExamp101 {

	public static void main(String[] args) {
		final String str1= "Java";
		StringBuffer strBuf = new StringBuffer("Course"); 
//		String strBuf = new String("Course");// �̰� ����ϸ� ���� : Javacourse
		UnaryOperator<String> u = (str2) -> str1.concat(str2); //line n1    Java�� Course�� ������.
		UnaryOperator<String> c = (str3) -> str3.toLowerCase();  //str3�� Course��  �ҹ��ڷ� ����
		System.out.println(u.apply(c.apply(strBuf)));  //line n2  

	}

}

//�� :D. A compilation error occurs at line n2.