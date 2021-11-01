package Question201_248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Examp247 {
	public static void main(String[] args) throws IOException {
//		/green.txt and /colors/yellow.txt are accessible, and the code fragment:
		Path source = Paths.get("/green.txt");
				Path target = Paths.get("/colors/yellow.txt");
				Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);//�����̵��ϰ� green.txt�� ���ŵȴ�
				Files.delete(source); //���� ����--green.txt�� move���� ���� ���⶧���� nosuchException �߻�
				
				
				//nosuchfileException�� �߻�������
				//green.txt�� �������, �� ������ yellow.txt�� ����
//				A. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown.
//				. yellow.txt ���� ������ green.txt ���� �������� �ٲ�� ���ܰ� �߻��մϴ�.
//				NoSuchFileException�� �߻��մϴ�. ������ �ҽ� ������ ã�� �� ���� �����Դϴ�.
//
	}

}


//���� copy �ɼ���
//����� ������ ���� ���� �Ǵ� �̵��� �����Ѵ�. �����ϴ� ����� ������� REPLACE_EXISTING �ɼ��� ����Ѵ�. 
//��� ���� �Ӽ��� �����Ϸ��� COPY_ATTRIBUTES �ɼ��� ����Ѵ�


//���� move �ɼ��� �̵��� ���������� �����ؾ� ���� ����� �� �ִ�. �� ��� �̵��� ���������� �Ϸ��ϰų� �ҽ��� ��ӵǼ� �������� ����޴´�. �������� �̵����� ATOMIC_MOVE �ɼ��� ����Ѵ�