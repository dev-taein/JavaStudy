package examp01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		
		//Arrays.asList()�� �÷����� �ƴ϶� �迭 �������� �� �÷����� �����Ѵ�.
		List<String> list1 = Arrays.asList("ȫ�浿", "����ȣ", "������");
		
		
//		�Ʒ��� ���� ��ü �߰�, ������ �ϸ� java.lang.UnsupprotedOperationException�� �߻��Ѵ�.
//		������ �ٷ� asList() �迭 ������ �÷����� �����ϱ� ������ �׷���.
//		list1.add("���׸�");
//		list1.remove(0);
		System.out.println(list1.toString());
		
		List<Integer> list2 = Arrays.asList(100,200,300);
		
		//����Ʈ �÷����� ������ �迭�� ���� ����� �ִ�.
		Integer[] arr = (Integer[]) list2.toArray();
		int[] arr1 = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];  //��ڽ�
		}
		for(int i=0; i<arr.length; i++) {
			if(arr1[0] == 100) {
				arr1[0] = 0;
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
