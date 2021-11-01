package Question121_150;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Examp132 {

	public static void main(String[] args) {
		final List<String> list = new CopyOnWriteArrayList<>();
		final AtomicInteger ai = new AtomicInteger(0); //AtomicInteger�� ������ ���� ������ �� �ֽ��ϴ�. �ʱⰪ�� 0�̸�, �ʱⰪ�� �����ϰ� ������ ���ڷ� int ������ �����ϸ� �˴ϴ�.
		final CyclicBarrier barrier = new CyclicBarrier(2, new Runnable() { //1�̸� 1������, 2�� 2�� ����.
			@Override
			public void run() {
				System.out.println(list);
			}
		});
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000* ai.incrementAndGet());  //AtomicInteger.incrementAndGet()�� ȣ���ϸ� ���� 1�� �ڵ����� �����մϴ�.
					list.add("X");
					barrier.await();//N ���� �����尡 ���� �ִٰ� �����ϰ� CyclicBarrier �� ������ �� ���ڰ����� N �� �ش�. 
									//������ ������ ������ CyclicBarrier �� await() �� ȣ���ϰ� ȣ�� Ƚ���� N���� �������� ��, N���� ��� �������� ��� ���°� �����ȴ�.   
				} catch (Exception xe) {}
				}
		};
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
	//�� CyclicBarrier(2)�� �ְ� �Ǹ� 2���� �����尡 awit()ȣ���ϰ� �� ȣ�ⰹ���� 2���� ���������� �����°� �����ǰ� ����ϰԵȴ�
		//�� 1�� �ָ� 1���� add�ؼ� 1���� �����ϰ� �ǰ�
		//2�� �ָ� 2���� add�ؼ� 2->4�� �Ǵ°Ŵ�
		
		//�� : [X, X]
//		[X, X, X, X]

	}

}
/*
CopyOnWriteArrayList�� ���� ��İ� Ư¡
�̸����� �� �� �ֵ��� ArrayList�� ������ Ŭ�����μ�,
���θ� �����ϴ� �۾��� �׻� ������ ���纻�� ���� �����ϵ��� �����Ǿ� �ִ�.
������ �迭�� ���� ������ �� �����Ƿ� ��ȸ�� �� ���� �ʿ� ��� �ӵ��鿡�� �ſ� �����ٴ� ������ �ִ�.

������ �����̳� ���� ���� �ٸ� �뵵�� ���� ��쿡�� �ӵ��� �������� ������
������ ���� ���� ������ �ַ� ��ȸ�� �Ͼ�� �뵵�� ����ϴ� ���� �����ϴ�.

CopyOnWriteArrayList�� ��ü�� �Ź� �������� �ʰ�, ������ �� �ش� ���¸� ���������� ������ �ִ� ����̴�.


ArrayListVS CopyOnWriteArrayList
CopyOnWriteArrayList�� ArrayList ���̿��� �� ���� ���̰� �ִ�.
CopyOnWriteArrayList�� ArrayList�ʹ� �޸�,
List�� �б� ���� ��򰡿� ������ �� ������ �ƴ� ���纻�� ���� �����Ѵ�.
*/