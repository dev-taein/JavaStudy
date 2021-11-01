package Question1_120;

import java.util.Arrays;
import java.util.List;

public class Examp59 {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG"); 
		codes.forEach (c -> System.out.print(c + " ")); //���⼭ codes ����Ʈ�� �ѹ� ����մϴ�.
		String fmt = codes.stream()
				.filter (s-> s.contains ("PEG"))
				.reduce((s,t) -> s+t).get();
				System.out.println("\n" + fmt);
				//�� ��Ʈ�� ������ PEG�� ���Ե� ���ڿ��� ����մϴ�.
	}

}
//A. DOC MPEG JPEG MPEGJPEG