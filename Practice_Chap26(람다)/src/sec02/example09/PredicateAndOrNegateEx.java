package sec02.example09;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate intPredicateA = x -> {return (x % 2) == 0;}; //2�� ����� true���� Ȯ��
		IntPredicate intPredicateB = x -> {return (x % 3) == 0;}; //3�� ����� true���� Ȯ��
		
		System.out.println("15�� 2�� ����Դϱ�?  " + intPredicateA.test(15));
		System.out.println("15�� 3�� ����Դϱ�?  " + intPredicateB.test(15));
		
		//And()�� �Ѵ� true���� true �����Ѵ�.
		IntPredicate intPredicateAB = intPredicateA.and(intPredicateB);
		System.out.println("6�� 2�� 3�� ������Դϱ�?  " + intPredicateAB.test(6));
		
		
		
		
		//Or()�� �� �� �ϳ��� true�� true����
		intPredicateAB = intPredicateA.or(intPredicateB);
		System.out.println("7�� 2�� 3�� ����Դϱ�?  " + intPredicateAB.test(7));
		
		
		
		//Negate() = NOT ----- true�̸� false����,,,false�� true����
		intPredicateAB = intPredicateA.negate();  //intPredicateA �� 2�� �������� 0�̸� true�ϱ� 8�� ¦�����ǰ� negate()�� ȣ���ؼ� ���� �ݴ�� ���´�
		System.out.println("8�� ¦�� �Դϰ�?  " + intPredicateAB.test(8));  //���� �ݴ�� ���´�
	}

}
