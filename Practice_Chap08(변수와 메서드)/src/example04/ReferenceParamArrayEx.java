package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 10, 20, 30, 40, 50};
		System.out.println("Change()�޼��� ȣ�� ���� ��  :  " + arr[0]);
		System.out.println("main() arr�� �ּҰ� : " + arr);
		Change(arr);//�迭���� �� �ּҴ�.
//		Change(new int[] {10,20,30}); //������ ���� �ּҰ��� �Ѱܵ� �ȴ�.
		System.out.println("Change()�޼��� ȣ�� �� main()�� ��  :  " + arr[0]); //(Call by reference)�ּҰ� �Ѿ�� ������ 999�� ��µ�
		
	}
	
	public static void Change(int[] arr) {
		System.out.println("Change() arr�� �ּҰ� : " + arr);
		arr[0] = 999;
		System.out.println("Change()�޼��� ���� �� : " + arr[0]);
		return;
	}

}
