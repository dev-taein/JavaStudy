package examp10;

//�������� ���¸� �˾ƺ��� ���� Ŭ����
public class TargetThread extends Thread{
	@Override
	public void run() {
		//�������->������(Runnable����)->�������
		for(long i=0; i<200000000; i++){
		}
		//�Ͻ�����(TIMED_WATTING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		//�������->������(Runnable����)->�������
				for(long i=0; i<200000000; i++){
		}
	}  //����(TERMINATED)

}
