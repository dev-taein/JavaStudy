package clothing;

public class Test50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stack = {10,20,30};
		int size = 3;
		int idx = 0;
//		while(idx<=size-1) {  //=���� idx<size-1 �̸� ����
//			idx++;
//		}
		do {
			idx++;
		} while(idx<size-1);
		System.out.println("the Top elemennt:" + stack[idx]);

	}

}
