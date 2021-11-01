package examp01;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class FindMinimumAction extends RecursiveAction {
	   // A thread can easily handle, let's say, five elements
	   private static final int SEQUENTIAL_THRESHOLD = 5;
	   // The array with the numbers (we'll pass the same array in
	   // every recursive call to avoid creating a lot of arrays)
	   private int[] data;
	   // The index that tells use where a (sub)task starts
	   private int start;
	   // The index that tells use where a (sub)task ends
	   private int end;

	   // Since compute() doesn't take parameters, you have to
	   // pass in the task's constructor the data to work
	   public FindMinimumAction(int[] data, int start, int end) {
	      this.data = data;
	      this.start = start;
	      this.end = end;
	   }
	   @Override
	   protected void compute() {
	      int length = end - start;
	      if (length <= SEQUENTIAL_THRESHOLD) { // base case
	         int min = computeMinimumDirectly();
	         System.out.println("Minimum of this subarray: "+ min);
	      } else { // recursive case
	         // Calcuate new subtasks range
	         int mid = start + length / 2;
	         FindMinimumAction firstSubtask =
	            new FindMinimumAction(data, start, mid);
	         FindMinimumAction secondSubtask =
	            new FindMinimumAction(data, mid, end);
	         firstSubtask.fork(); // queue the first task
	         secondSubtask.compute(); // compute the second task
	         firstSubtask.join(); // wait for the first task result
	      }
	   }
	   /** Method that find the minimum value */
	   private int computeMinimumDirectly() {
	      int min = Integer.MAX_VALUE;
	      for (int i = start; i < end; i++) {
	         if (data[i] < min) {
	            min = data[i];
	         }
	      }
	      return min;
	   }
//	   �� compute()����� (����) �迭�� 5 �� ������ ��Ұ��ִ� ��� �⺻ ���̽��� �����ϸ�,�� ��� �ּҰ��� ���������� ã���ϴ�. 
//	   �׷��� ������ �⺻ ���̽��� ������ ���� �� ������ �迭�� �ݺ������� �� ���� ���� �迭�� ���ҵ˴ϴ�.
//
//	   �۾��� �����ص� ���� �۾��� �׻� �յ��ϰ� �л�Ǵ� ���� �ƴմϴ�. �׷��� �̰��� �����ϰ� �����ϱ� ���� 20 ���� ��Ұ��ִ� Ŭ������ �õ��� ���ڽ��ϴ�.
//	   �� Ŭ������ 4 ���� ��Ʈ�� ���� ���ɼ��� �ſ� �����ϴ�.

	public static void main(String[] args) {
		 int[] data = new int[20];
		   Random random = new Random();
		   for (int i = 0; i < data.length; i++) {
		      data[i] = random.nextInt(1000);
		      System.out.print(data[i] + " ");
		      // Let's print each subarray in a line
		      if( (i+1) % SEQUENTIAL_THRESHOLD == 0 ) {
		         System.out.println();
		      }
		   }
		   ForkJoinPool pool = new ForkJoinPool();
		   FindMinimumAction task =
		      new FindMinimumAction(data, 0, data.length);
		   pool.invoke(task);
		   
		   //���
//		   885 839 486 27 612 
//		   656 972 375 44 164 
//		   445 817 951 277 219 
//		   316 634 318 365 175 
//		   Minimum of this subarray: 175
//		   Minimum of this subarray: 219
//		   Minimum of this subarray: 27
//		   Minimum of this subarray: 44

//		   Ǯ�� ��� ������ ���� �� �ʿ䰡 �����ϴ�. ���α׷��� ����Ǹ� Ǯ�� ����Ǿ� ���� �� �� �ֽ��ϴ�.
//
//		   ���� ���� ��ȯ���� ������ fork (), compute () �� join () �޼��带 ȣ���ϴ� �Ͱ� ������ �۾��� �����ϴ� invokeAll () �޼��嵵 �ֽ��ϴ�. 
//		   ���� ������ ���� ���� ���� ��� :
//		   ...
//		   FindMinimumAction firstSubtask =
//		      new FindMinimumAction(data, start, mid);
//		   FindMinimumAction secondSubtask =
//		      new FindMinimumAction(data, mid, end);
//		   // queue the first task
//		   firstSubtask.fork();
//		   // compute the second task
//		   secondSubtask.compute();
//		   // wait for the first task result
//		   firstSubtask.join();
//		   ...
//		      �Ʒ� �ڵ�� �� �ܼ��ϰ� ���� ��
//
//		   ...
//		   FindMinimumAction firstSubtask =
//		      new FindMinimumAction(data, start, mid);
//		   FindMinimumAction secondSubtask =
//		      new FindMinimumAction(data, mid, end);
//		   invokeAll(firstSubtask, secondSubtask);
//		   ...
		   
//		   ���� ��� �ּҰ��� ��ȯ �� �� �ֵ��� RecursiveTask�� ����ϵ����� ������ ������ ���ڽ��ϴ�.
//
//		   ������ �츮���ؾ� �� ������ ���� ������ compute () �޼����Դϴ�.
//		   class FindMinimumTask extends RecursiveTask<Integer> {
//			   // ...
//			   @Override
//			   //Return type matches the generic
//			   protected Integer compute() {
//			      int length = end - start;
//			      if (length <= SEQUENTIAL_THRESHOLD) { // base case
//			         return computeMinimumDirectly();
//			      } else { // recursive case
//			         // Calcuate new subtasks range
//			         int mid = start + length / 2;
//			         FindMinimumTask firstSubtask =
//			            new FindMinimumTask(data, start, mid);
//			         FindMinimumTask secondSubtask =
//			            new FindMinimumTask(data, mid, end);
//			         // queue the first task
//			         firstSubtask.fork();
//			         // Return the miminum of all subtasks
//			         return Math.min(secondSubtask.compute(),
//			                         firstSubtask.join());
//			      }
//			   }
//			   // ...
//			}
		   
//		   main () �޼��忡�� ������ ���� ������ pool.invoke (task)�� ��ȯ�ϴ� ���� �ణ�� ������ ��¿� �μ��ϴ� ���Դϴ�.
		   //���
//		   819 997 124 425 669 657 487 447 386 979 31 748 194 644 893 209 913 810 142 565
//		   Minimum value: 31
//		   FindMinimumTask Ŭ������ ����
	}

}
