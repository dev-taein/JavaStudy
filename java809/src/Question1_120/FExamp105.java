package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FExamp105 {

	public static void main(String[] args) {
//		1 �࿡ ���� �� �� �ڵ尡 /First.txt�� �μ� �� �� �ֵ����ϴ� �ڵ� ������ �����Դϱ�?
//	Which code fragment, when inserted at line n1, enables the code to print /First.txt?	
		Path iP = Paths.get ("/", "First.txt");//line n1
		System.out.println(iP);
	}

}
