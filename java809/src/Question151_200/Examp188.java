package Question151_200;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Examp188 {

	public static void main(String[] args) {
//		Given that course.txt is accessible and contains:
//			Course : : Java -
		int i;
		char c;
		try (FileInputStream fis = new FileInputStream ("/course.txt");
		InputStreamReader isr = new InputStreamReader(fis);) {
		while (!isr.close()) { //line n1   while (isr.ready()) �̷����ؾ� ��µ�
		isr.skip(2); // �������� 0���� 2����  2ĭ�� ����� -----Course : : Java - => ue ja  
		i = isr.read ();
		c = (char) i;
		System.out.print(c);
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	}

//�� :D. A compilation error occurs at line n1.


// ����   line n1        while (isr.ready()) �̸�   ue ja�� ��µ�,, �϶��� �� : B. ueJa


//boolean	ready ()��Ʈ���� �б� �����Ѱ� ����� �����մϴ�.
//Stream.skip(����)���� ���ڸ�ŭ �������� �ǳʶ�� �� ������ �����۵�� ��Ʈ���� �����մϴ�.
//33�� ������ �Ȱ���