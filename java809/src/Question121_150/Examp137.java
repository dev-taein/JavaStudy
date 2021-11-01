package Question121_150;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examp137 {
//Given that version.txt is accessible and contains:	1234567890

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream fis = new FileInputStream("D:/version.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);){
			if(br.markSupported()) {
				System.out.println((char) br.read()); // 1
				br.mark(2); //���⼭ ������ġ��  mark�س��� 
				System.out.println((char) br.read());//2
				br.reset(); //���⼭ mark�س��� ������ �̵���
				System.out.println((char) br.read());//2
//				System.out.println((char) br.read());//3
//				System.out.println((char) br.read());//4
//				System.out.println((char) br.read());//5
			}
		}catch (Exception e) {
		e.printStackTrace();
		}
	}

}
/*
boolean	markSupported ()
�Է� ��Ʈ���� mark �� reset �޼��带 �����ϰ� ������ ����� �����մϴ�.
BufferedReaderŬ������  mark �� reset �޼��带 �����Ѵ�.

 void	mark (int readlimit)
          �Է� ��Ʈ���� ���� ��ġ�� ��ũ�� �����մϴ�.
          
  void	reset ()
          �� ��Ʈ���� ��ġ��, �Է� ��Ʈ���� �������� mark �޼��尡 �ҷ� ���� ���� ��ũ ��ġ�� �缳���մϴ�.
*/