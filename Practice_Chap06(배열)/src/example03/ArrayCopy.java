package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] ori = new int[] { 10, 77, 33, 50 };
		int[] target = new int[10];
		int count = 0;
		System.out.println("�����ϱ� ��");
		System.out.println("Ÿ�� ���� : " + target.length); 
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		
	
		//for���� �̿��ؼ� ���� �����ϴ� ���
		for(int i=0; i<ori.length; i++){
			target[count++] = ori[i];
		}
		
		//���� for�� �̿�
//		for(int i : ori) {
//			target[count++] = i;
//		}
		
		//System.arraycopy�޼��尡 ����ӵ��� ���� ������.
 		//System.arraycopy(ori, 0, target, 5, ori.length);
		
		
		System.out.println("������ ��");
		//Arrays�� copyOf�޼���� ������ ����� �迭�� ���̶�� ���縦 �ع�����,
		//�迭���� �޼����̴�.
//		target = Arrays.copyOf(ori, ori.length);
		System.out.println("Ÿ�� ���� : " + target.length);
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
	}

}
