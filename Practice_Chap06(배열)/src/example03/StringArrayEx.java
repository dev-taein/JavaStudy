package example03;

import java.util.Arrays;

public class StringArrayEx {

	public static void main(String[] args) {
		//String �迭
//		String str = new String("�ڹ�");
//		System.out.println(str.toString());
		//��ü(Ŭ����)�迭 -- 2���� �迭 (������ ��������� ������� �ʾƵ���)
		String[] str = new String[] {
										"�ȳ�", "ȫ�浿", "�迬��"
									};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);  //���η����� �ʿ����
		}
		
		
		str[0] = "����";
		
		//���� for��
		for ( String str1 : str) {
			System.out.println(str1);
		}
		
		
		
		
//		System.out.println(Arrays.toString(str));
//		System.out.println("String�迭�� �ּ� : " + str.toString());
		//ObjectŬ������ ��� Ŭ������ �ְ�����
		//StringŬ������ ObjectŬ������ toString()�������̵�(������)
//		System.out.println("String�迭�� �ּ� : " + str[0].toString());
	}

}
