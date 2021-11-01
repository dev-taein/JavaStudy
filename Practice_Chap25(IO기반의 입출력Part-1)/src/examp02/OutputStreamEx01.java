package examp02;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamEx01 {

	public static void main(String[] args) throws Exception{
		
		//���Ϸκ��� ��½�Ʈ���� �����Ͽ� �����Ѵ�.(������)
		OutputStream oStream = new FileOutputStream("D:\\wirte.txt");
		//"ABC"��� ���ڿ����� ����Ʈ �迭�� ���� ���̴�.(���ڵ�)
		byte[] data = "ABC".getBytes();
		System.out.println(Arrays.toString(data)); //�ƽ�Ű �ڵ尡 ��µ�
		
		//3�� �����Ѵ�. �ѱ��ھ� �����ϱ�
		for(int i=0; i<data.length; i++) {
			oStream.write(data[i]);  //D:\\wirte.txt�� ABC�� ����ȴ�.
		}
		
		//write()�� ����ϸ� ������ flush()�� ȣ���Ͽ�, �ݵ�� �޸� ���۸� ��쵵�� ����.
		//���� main()�� �����ϸ� �˾Ƽ� ���ۿ��� ��������, �����ϸ� flush()�� ȣ������
		oStream.flush(); 
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		oStream.close();
	}

}
