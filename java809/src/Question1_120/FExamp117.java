package Question1_120;

import java.util.Arrays;
import java.util.List;

public class FExamp117 {

	public static void main(String[] args) {
		List<String> valList = Arrays.asList("","George","","John","Jim");
		Long newVal = valList.stream() //line n1
				.filter(x->!x.isEmpty())  // ""�� �ƴ� ���� ������ ���ϴ� ��Ʈ���̴�.  ��: B. 3
				.count(); //line n2    
		System.out.println(newVal);
		
		//Long�� �ƴϸ� ������ ---- count()�� ��ȯ���� long�̱� �����̴�.
	}

}
