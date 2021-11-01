package examp02;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOChannel {

	public static void main(String[] args) {
		//ä���� ���۰� ������ �м��� ������ ����.
		
		Path src = Paths.get("D:\\data.dat");
		Path dst = Paths.get("D:\\data1.dat");
		
		//�ϳ��� ���� ����
		ByteBuffer buf = ByteBuffer.allocate(1024); //non-direct ���� : ���� -> �ü�� ���� -> ����ӽ� ���� -> �������� �ڹ� ���α׷�
//		ByteBuffer buf = ByteBuffer.allocateDirect(1024); // Direct���� : ���� -> �ü�� ���� -> ���� ���� �ڹ� ���α׷� 
		
		
		//try���� �ΰ��� ä�� ����
		try(FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ); //src�� ���� �� �� �ִ�.
				FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE)){ //dst�� ����� ��������
			int num;
			while(true) {
				num = ifc.read(buf); //ä�� ifc���� ���۷� �о� ����
				if(num==-1) // �о� ���� �����Ͱ� ���ٸ�
					break;
				buf.flip(); //��� ��ȯ!
				ofc.write(buf); //���ۿ��� ä�� ofc�� ������ ����
				buf.clear(); //���� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
