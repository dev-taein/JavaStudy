package Question1_120;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Examp33 {

	public static void main(String[] args) {
//	Stream.skip(����)���� ���ڸ�ŭ �������� �ǳʶ�� �� ������ �����۵�� ��Ʈ���� �����մϴ�.
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("D:/course.txt");
		InputStreamReader isr = new InputStreamReader(fis);) {
		while (isr.ready()) { //line n1
		isr.skip(2);  // �������� 0���� 2����  2ĭ�� ����� -----Course : : Java - => ue ja  
		i = isr.read ();
		c = (char) i;
		System.out.print(c);
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	}

