package examp04;

import java.util.stream.IntStream;

public class LoopingEx1 {

	public static void main(String[] args) {
//		����(Looping)
//		��ǥ������ ���ο��� forEaxh�� �ִ�. �̴� '���� ����', �ݸ� ���� �޼ҵ���� '�߰� ����'���� ���� �������Ѵ�.
//		Stream<T> peek(Consumer<? super T> action) //Stream<T>�� �޼ҵ�
//		IntStream peek(IntConsumer action) //IntStream<T>�� �޼ҵ�
//		LongStream peek(LongConsumer action) //LongStream<T>�� �޼ҵ�
//		DoubleStream peek(DoubleConsumer action) //DoubleStream<T>�� �޼ҵ�
		
		
		//���� ������ ������ ��Ʈ���� ������ ����
		IntStream.of(1, 3, 5).peek(d->System.out.println(d+"\t"));
		//�߰����길 �����ϹǷ� �ƹ� �͵� ��µ��� �ʴ´�.
		System.out.println();
		
		
		
		//���� ������ �����ϴ� ��Ʈ���� ������ ����
		IntStream.of(5,3,1).peek(d->System.out.println(d+"\t")).sum();
		//sum�� �հ踦 ��ȯ������, �ڵ忡�� ��ȯ���� �׳� ������ �ִ�, ��ȯ���� �����ϰų� �ؾ��Ѵ�.
		//9�� ��ȯ�� ������ �ƹ��͵� ���� �ʾұ� ������ peek�� ����Ѵ�.
		
		
		
		System.out.println();
	}

}
