package Question151_200;

import java.util.function.BiFunction;

public class Examp192 {

	public static void main(String[] args) {
//		BiFunction<T,U,R> Ÿ���� ��� ��ġ�ؾ���
		
		BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; //line n1
		
		System.out.println(val.apply(10, 10.5));//line n2
		
		
		
//A. BiFunction<Integer, Integer, Integer> val = (t1, t2) -> t1 + t2; System.out.println(val.apply(10, 10));
		//�϶��� �� : 20 
		
//B. 20.5  ---> BiFunction<Double, Double, Double> val = (t1, t2) -> t1 + t2;System.out.println(val.apply((double) 10, 10.5));
		//�ϋ��� �� : 20.5
		
//C. A compilation error occurs at line n1. --- > BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2;
//		System.out.println(val.apply(10, 10.5));
		
//D. A compilation error occurs at line n2. --- > BiFunction<Integer, Integer, Integer> val = (t1, t2) -> t1 + t2;
//		System.out.println(val.apply(10, 10.5));
		
		
		
		//�� : C. A compilation error occurs at line n1.
	}

}
