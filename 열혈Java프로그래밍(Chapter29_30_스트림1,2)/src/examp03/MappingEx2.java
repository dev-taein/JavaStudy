package examp03;

import java.util.Arrays;
import java.util.stream.Stream;

public class MappingEx2 {

	public static void main(String[] args) {
//		�߰����� 
//		����(Mapping) ����1:
		Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");
		
		//�Ʒ� ���ٽĿ��� ��Ʈ���� ����
		Stream<String> ss2 = ss1.flatMap(s-> Arrays.stream(s.split("_"))); // "_"�� �������� ���ڿ��� �ɰ���, �ɰ� �� �迭�� ��Ƽ� ��ȯ�� ����(�ɰ� �� concat�̷����)
//		��Ʈ���� MY AGE 1���� YOUR LIFE 1�� �ؼ� 2���� ��Ʈ���� ��������Ű� 
//		�̷��� �ټ��� ��Ʈ���� ��������� flatMap�� 1:* ������ �̷������ �Ŵ�
		ss2.forEach(s->System.out.print(s+ "\t"));
		System.out.println();

	}

}
