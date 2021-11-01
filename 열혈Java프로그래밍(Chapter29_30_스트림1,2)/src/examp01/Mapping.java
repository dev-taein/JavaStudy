package examp01;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
//		����1
//		"Box", "Robot", "Simple" => 3, 5, 6
		List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		ls.stream()
			.map(s->s.length())
			.forEach(n->System.out.print(n+"\t"));
		System.out.println();
		
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper)
//		Function�� ������ ������,,,, 
//		Function<T, R> R apply(T t)
//		T�� ������ ������, R�� ��ȯ�Ǵ� ������
		
//		String�ν��Ͻ��� ���ڷ� ��ȯ�Ǵ� �Ŵϱ� T�� String�̰�, R�� Int������ Int�� �ɼ����⶧���� Integer�� �ȴ�.
		
//		R�� int�� �ƴ� ��ȯ�� int�� �ٲܷ���
//		IntStream mapToInt(ToIntFunction<? super T> mapper)
//		LongStream mapToLong(ToLongFunction<? super T> mapper)   //��ȯ���� Long
//		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) //��ȯ���� Double
		
		List<String> ls2 = Arrays.asList("Box", "Robot", "Simple");
		ls2.stream()
			.mapToInt(s->s.length())
			.forEach(n->System.out.print(n+"\t"));
		System.out.println();
		
//		����� ������ �̷��� �ϴ� ������
//		��ȯ���� Int�� ���������� ������ ù��° ���������� int�� Integer�� �ڵ��ڽ��� �ϱ� �����̴�
//		���ʿ��� �ڵ��ڽ̰� ��ڽ��� ���α׷� ���� ���ϸ� ����Ű�� ������
//		��������� mapToInt�� ����ؼ� int������ ������ش�.
		
	}

}
