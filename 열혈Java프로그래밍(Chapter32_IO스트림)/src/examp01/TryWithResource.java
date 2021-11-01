package examp01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TryWithResource {

	public static void main(String[] args) {
//		try-with-resource��� 
//		���� �ۼ��ϸ� close�� ���� �ʿ䰡����
//		���������� �ڵ����� �ݾ��ش�.
		try(OutputStream out = new FileOutputStream("data.dat")){
			out.write(7);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
