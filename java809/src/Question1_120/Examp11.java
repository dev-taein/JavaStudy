package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Examp11 {

	public static void main(String[] args) {
		Stream<List<String>> iStr= Stream.of (
				Arrays.asList ("1", "John"),
				Arrays.asList ("2", null));
//				Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream ());  
//				Stream<String>�ε� ��ü�� flatMapToInt Int�� �ޱ� ������ �����Ͽ����� �߻�
				Stream<String> nInSt = iStr.flatMap ((x)-> x.stream ());  //�ùٸ� ������� �������ϸ� �̷��� �ȴ�.  1John2null
				nInSt.forEach (System.out :: print);
				
				
//				D. A compilation error occurs.
	}

}
