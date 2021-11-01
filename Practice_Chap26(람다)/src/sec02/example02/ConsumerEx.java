package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		//�Լ��� �������̽� = �߻�޼��尡 1��
		
		//Consumer = �Һ��� = ���ϰ� ����
		
		//StringŸ���� �Ű������� ������ Consumer���׸� �Լ��� �������̽��� �����ߴ�.
		//t�� ������ StringŸ���̰� �Ű������� �ȴ�.
		//Consumer�������̽� ������ ���ϰ��� ����.
		
		
		//t -> {System.out.println("ConsumerInterface : " + t);  ----> �̰� �ٷ�, accept()�� ���ٽ����� �����ѰŴ�.
		Consumer<String> consumer = t -> {
			System.out.println("ConsumerInterface : " + t);  //�̺κ� accept()�� ����(��ü)
		};
		
		consumer.accept("�Һ��� �������̽� �ڹ� 1.8�߰�");
		
		
		
		//Bi�� 2����� ���̴�.
		//BiConsumer�� 2���� ��ü�� �޾Ƽ� �Һ��ϴ� �Լ��� �������̽��̴�.
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println("BiConsumerInterface : " + t + "," + u);
		};
		
		biConsumer.accept("�ڹ�", "C++");
		
		
		
		//DoubleConsumer�� �Ű����� ������ ������ Double���� �޴´�.
		DoubleConsumer doubleConsumer = d -> {
			System.out.println("DoubleConsumerInterface : " + d);
		};
		doubleConsumer.accept(100.99);
		
		
		
		//ObjIntConsumer<T>�Լ��� �������̽��� �Ű������� T�� int��(����)�� ������.
		ObjIntConsumer<String> objIntConsumer = (t,i) -> {   //t�� ���׸�Ÿ��,,,,,i�� intŸ��
			System.out.println("ObjIntConsumerInterface : " + t + " " + i);
		};
		objIntConsumer.accept("�ڹ�", 8);
		
		
		
		
		
		
		
		
		
		
	}

}
