package patternExample;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx02 {

	public static void main(String[] args) {

		String[] data = { "bat", "baby", "bonus", "ca", "cb", "c.", "car",
							"com", "date", "zoo", "disc"
							};
		//�ҹ��� c�� �����ϴ� ����ܾ ���ڸ� �������� ������
		Pattern pattern = Pattern.compile("c[a-z]*");
		
		Vector<String> vStrings = new Vector<String>();
		
		for(String str : data) {
			Matcher matcher = pattern.matcher(str);
			
			//���Ǹ� �� ���ϰ� ��ġ�ϴ°�? ��� ����� �ڵ�� �Ʒ��� ����
			if(matcher.matches()) {
				System.out.println(str + ", ");
				vStrings.add(str);
			}
		}
		System.out.println();
		System.out.println("c�� �����ϴ� �ҹ��� ���ܾ� : " + vStrings.toString());
	}

}
