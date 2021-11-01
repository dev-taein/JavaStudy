package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {
		//�A�� �� equals , ���� �� Deepequals
		
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer(100);
		
		
		//Object�� equals()�� ������ �Ǵ� ��ü��, �񱳰� �Ǿ����� ��ü ���� �и��� �Ǿ� �ִ� ����
		//��� wrapper(����)Ŭ���������� ObjectŬ������ equals()�������̵��� �Ǿ� �ִ�!
		//equals() -> integer1�� ������ �ǰ� integer2�� ���Ѵ�.
		System.out.println(integer1.equals(integer2)); 
		
		
		//Objects�� equals()��  ���ϴ� 2��� �Ű������� �ָ� �ȴ�. -- �������� Ȥ�� ���� ����
		//Objects.equals -> ���� �����̰� ���� �񱳰� �̷� ������ ����
		System.out.println(Objects.equals(integer1, integer2)); //���� ��
		
		Integer[] arr1 = {new Integer(10), new Integer(50)};
		Integer[] arr2 = {new Integer(10), new Integer(50)};
		
		//Objects.equals()�� �Ű������� ����Ÿ���� ������ �ּҸ� ���Ѵ� �׷��� �����񱳰� �ȴ�.
		System.out.println(Objects.equals(arr1, arr2)); //���� �� = �ּҺ�~
		
		//Objects.deepEquals�� �Ű������� �迭�� ������ ���� ���̸� �׸� ������ �񱳸� �Ѵ� deepEquals
		System.out.println(Objects.deepEquals(arr1, arr2)); //���� �� (deepEquals)= �� ��
		System.out.println(Arrays.deepEquals(arr1, arr2)); //�迭Ŭ������ Arrays�� �Ȱ��� deepEquals �����񱳸� �����Ѵ�.
	}

}
