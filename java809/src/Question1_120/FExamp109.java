package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FExamp109 {

	public static void main(String[] args) {
		Stream<List<String>> strs = Stream.of(Arrays.asList("text1", "text2"),
				Arrays.asList("text2","text3"));
		
		Stream<String> bs2 = strs.filter(b->b.contains("text1")).flatMap(rs->rs.stream());
		bs2.forEach(b->System.out.println(b));
				
	}

}


//contains�� text2�̸� text1 text2 text2 text3 ���


//contains�� text1�̸� ���Ե� text1�� ���� ����Ѵ�---- �� : text1text2


// text2�� �ش��ϴ� ��� ���� ����Ѵ�.text1text2text2text3