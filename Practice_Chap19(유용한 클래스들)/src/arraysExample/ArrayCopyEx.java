package arraysExample;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 10, 20, 30, 40};
		
		//1��° �迭 ���� ���(copyOf)
		int[] cloned = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		System.out.println("-----------------------------------");
		
		
		//2��° �迭 ���� ���(copyOfRange) ��������
		cloned = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		System.out.println("-----------------------------------");
		
		
		
		//3��° �迭 ���� ���(System.arraycopy) �ý���Ŭ����
		System.arraycopy(arr1, 0, cloned, 0, 2);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
	}

}
