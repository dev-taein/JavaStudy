package sec02.example08;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class MinByMaxByEx {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator = null;
		Fruit fruit = null;
		
		
		
		
		//BinaryOperator�� minBy() ���� �޼���� �� ���� ��ü�� ������ String�̵� ���� �⺻Ÿ���� ���� ������ ��ü�� �����Ѵ�.
		//�� ������ �Ǵ� �ʵ��� ����� ���ڵ� ���ڵ� ���� ���α׷����� ���̴�.
		//�ƿ﷯ , minBy�� Comparator<T>�� �������̽� Ÿ���� �Ű������� ������ �ֱ� ������
		//�߻�޼����� int compara(T o1, T o2); �������ϴ� ���ٽ��� �ü����ִ�.
		binaryOperator = BinaryOperator.minBy((f1,f2) -> { ///minBy �� �߿� ���� ���� ������. ���ٷ� ������
//			if(f1.getPrice() < f2.getPrice())
//				return -1;
//			else if(f1.getPrice() == f2.getPrice())
//				return 0;
//			else
//				return 1;
			return Integer.compare(f1.getPrice(), f2.getPrice());
		});
		
		//minBy()�� ����ؼ� price�� ���� ���� �����ư� ��µȴ�.
		fruit = binaryOperator.apply(new Fruit("Ȳ��", 5000), new Fruit("������", 4000));
		System.out.println(fruit.getName());
		
		
		
		
		binaryOperator = BinaryOperator.maxBy((f1,f2) -> { ///maxBy �� �߿� ū ���� ������. ���ٷ� ������
//			if(f1.getPrice() < f2.getPrice())
//				return -1;
//			else if(f1.getPrice() == f2.getPrice())
//				return 0;
//			else
//				return 1;
			return Integer.compare(f1.getPrice(), f2.getPrice());
		});
		
		fruit = binaryOperator.apply(new Fruit("Ȳ��", 5000), new Fruit("������", 4000));
		System.out.println(fruit.getName());
	}
}
