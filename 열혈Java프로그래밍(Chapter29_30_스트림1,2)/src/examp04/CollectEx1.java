package examp04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectEx1 {

	public static void main(String[] args) {
//		collect: ��Ʈ���� �ִ� �����͸� ��ƶ�!
//		[Stream<T>�� �޼ҵ�] IntStream, LongStream, DoubleStream���� ���ǵ� �޼ҵ�
//		<R> R collect(Supplier<R> supplier,
//						BiConsumer<R, ? super T> accumulator,
//						BiConsumer<R, R> combiner>
		
		String[] words = {"Hello", "Box", "Robot", "Toy"};
		Stream<String> ss = Arrays.stream(words);
		
		List<String> ls = ss.filter(s->s.length() < 5)  //�������� : Box�� Toy�� ��Ʈ���� ����
							.collect(() -> new ArrayList<>(), //����� ����
									(c,s)->c.add(s), //c�� ������ ������ ArrayList�� �����,  ArrayList�� ����Ҹ� c�� ���������Ƿ� c.add�� ����Ҽ��ֵ�.
														//s�� filter���� ���� ��Ʈ���� �����͵�
									(list1, list2) -> list1.addAll(list2));
		System.out.println(ls);
		
		
		
//		���� ��Ʈ�������� collect
		List<String> ls2 = ss.parallel() //���Ľ�Ʈ�� ����
				.filter(s->s.length() < 5)  //�������� : Box�� Toy�� ��Ʈ���� ����
				.collect(() -> new ArrayList<>(), //����� ����
						(c,s)->c.add(s), //c�� ������ ������ ArrayList�� �����,  ArrayList�� ����Ҹ� c�� ���������Ƿ� c.add�� ����Ҽ��ֵ�.
											//s�� filter���� ���� ��Ʈ���� �����͵�
						(list1, list2) -> list1.addAll(list2)); //�����Ѵٴ� ��
//		��Ʈ���� 1,2,3,4,5,6�� �ִٰ� �����ϸ�
//		�ھ 3���ְ� 1,2�� �ھ�1, 3,4�� �ھ�2, 5,6�� �ھ�3�̶�� �����ϸ�
//		������ �ھ� ���� ArraysList�� ������ �ȴ�.
//		�׸��� list1�� �ھ�1�� �ɼ��ְ� �ھ�2�� �ɼ��ְ� ����� �Ȱ�����,
//		list1�� �ھ�1�̶�� �����ϸ� list1�� �������� list2�� ���� �����Ѵ�.
//		�� list1.addAll(list2) �ھ�1�� �ھ�2�� �����ϴ� ������ �ھ�1�� ���� 1,2,3,4�� �Ǹ�
//		������ �ھ�3�� �ڵ����� list2�� �Ǿ� �����ϰ� �ȴ�.
		
		System.out.println(ls2);
	}

}
