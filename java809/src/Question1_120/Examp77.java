package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Examp77 {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("D:/green.txt");
				Path target = Paths.get("D:\\colors/yellow.txt");
				Files.move(source, target, StandardCopyOption.ATOMIC_MOVE); //source(green)�� targer(yellow)�� �̵�(move)�Ѵ�.
				Files.delete(source);   //green.txt�� move���� yellow�� �̵��Ǿ �����Ǿ��� ������ delete�� green.txt�� ���⶧���� ���ܰ� �߻��ȴ�.
	}

}
//B. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown.
//B. yellow.txt ���� ������ green.txt ���� �������� �ٲ�� ���ܰ� �߻��մϴ�.


//������ �̵��� ����Ϸ��� ATOMIC_MOVE �ɼ��� ����ؾ� �Ѵ�.Files.move(fromPath, toPath, StandardCopyOption.ATOMIC_MOVE);
//ATOMIC_MOVE�� FileAlreadyExistsException�� �߻����� �ʵ����մϴ�. ������ ���� �̵� ��ġ�� ���� �̹� ���ŵǾ����Ƿ� delete �޼ҵ�� ���ܸ� �߻���ŵ�ϴ�. 
//  ��, ATOMIC_MOVE�� FileAlreadyExistsException���ܸ� �߻���Ű�� �ʴ� ��ſ� source������ �����ϰ� target�� ������ �����Ѵ�.


//���� Files.move(source, target) ATOMIC_MOVE�ɼ��� ���ٸ�, 
//D. A FileAlreadyExistsException is thrown at runtime. �̰� ������


// copy �Ҷ���
//�� ���͸�(empty directory)�� �̵��� ���� �� ����� ����� �� �ִ�.
//����� �̹� ������ ���糪 �̵��� �����Ѵ�. ���� ��� ��� ���� REPLACE_EXISTING �ɼ��� ����Ѵ�. 
//��� ���� �Ӽ�(file attribute)�� ������ ���� COPY_ATTRIBUTES �ɼ��� ����Ѵ�. ���� ������� �� �ɼǵ��� �����Ѵ�.
//Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
//REPLACE_EXISTING ������� �����
//COPY_ATTRIBUTES  ��� ���� �Ӽ��� ����
