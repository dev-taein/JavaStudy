package Question1_120;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction { 
	//line n1 
	static final int THRESHOLD_SIZE = 3; int stIndex, lstIndex; int [ ] data;  //THRESHOLD_SIZE �������� ����
	public Sum (int [ ]data, int start, int end) { 
		this.data = data; this.stIndex = start; this. lstIndex = end;
}
	
protected void compute ( ) {  //RecursiveAction�� �߻�޼��� �� �����ؾ��Ѵ�.
	int sum = 0;
	if (lstIndex - stIndex <= THRESHOLD_SIZE) {
		for (int i = stIndex; i < lstIndex; i++) {
		sum += data [i];
		}
	System.out.println(sum);
	} else {
	new Sum (data, stIndex + THRESHOLD_SIZE, lstIndex).fork( );  //fork()�� ȣ���Ͽ� �ٸ� �����忡�� �۾��� ó���ǵ��� �մϴ�.
	new Sum (data, stIndex,Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute(); //������� ��ȯ
		}
	}
}
public class Examp09 {

	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool ( );
		int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		fjPool.invoke (new Sum (data, 0, data.length));//recursiveTask.invoke�� ȣ��Ǹ� �����Ǵ� ������ Ǯ ������� exec�� compute�� ȣ��˴ϴ�.
		
		
//		�� : A. The program prints several values that total 55. 
//		 	���α׷��� �� 55���� ���� ����մϴ�.
	}

}
