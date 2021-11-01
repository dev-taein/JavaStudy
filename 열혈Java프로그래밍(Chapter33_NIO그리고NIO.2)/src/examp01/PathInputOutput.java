package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathInputOutput {

	public static void main(String[] args) throws IOException {
//		����Ʈ ���� �Է°� ���
//		java.nio.file.Files�� �޼ҵ��(����Ʈ ���� �����) , ���̴�(�������� ���� ������), open�� close�� ������ ����. ������ ���ٴ°� �ƴϴ�.
		Path fp = Paths.get("D:\\JavaStudy\\simple.bin");
		
		//���� ����, ������ �����ϸ� ���� �߻�
		fp = Files.createFile(fp);
		
		byte buf1[] = {0x13, 0x14, 0x15}; //���Ͽ� �� ������
		for(byte b: buf1) //������ �������� ����� ���� �ݺ���
			System.out.print(b+"\t");
		System.out.println();
		
		//���Ͽ� ������ ����
		Files.write(fp, buf1, StandardOpenOption.APPEND); //APPEND�ɼ��� ������ �߰��Ѵ�
		
		//���Ϸκ��� ������  �б�
		byte buf2[] = Files.readAllBytes(fp);
		
		for(byte b: buf2) //�о� ���� �������� ����� ���� �ݺ���
			System.out.print(b + "\t");
		System.out.println();
		
		
		
//		StandardOpenOption
//		APPEND ������ ���� �߰��Ѵ�.
//		CREATE ������ �������� ������ �����Ѵ�.
//		CREATE_NEW �� ������ �����Ѵ�. �̹� ������ �����ϸ� ���� �߻�
//		TRUNCATE_EXISITING ���� ���� ������ ���µ� ������ �����ϸ� ������ ������ �����.
		
		
	}

}
