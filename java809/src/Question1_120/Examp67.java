package Question1_120;

import java.util.function.BiFunction;

public class Examp67 {

	public static void main(String[] args) {
		BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; //line n1
		System.out.println(val.apply(10, 10.5));
		//Inter�� Double�� ���� ���� �Ҽ� ����----  3���� ���׸� Ÿ���� ���ƾ���
	}

}
