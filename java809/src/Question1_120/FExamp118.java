package Question1_120;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class FExamp118 {

	public static void main(String[] args) throws Exception{
		//Login time : 2015-01-12T21:58:18.817z
		Instant loginInTime = Instant.now();
		Thread.sleep(1000);
		//Logout time : 2015-01-12T21:58:18.880z
		Instant logoutTime = Instant.now();
		
		loginInTime = loginInTime.truncatedTo(ChronoUnit.MINUTES); //line n1  //MINUTES�� ¥���°� �ƴ� minute�ڿ� ��second�� �ڸ�
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);  //MINUTES�� ¥���°� �ƴ� minute�ڿ� ��second�� �ڸ�
		
//		System.out.println(loginInTime);
//		System.out.println(logoutTime);
		
		if(logoutTime.isAfter(loginInTime)) {
			System.out.println("Logged out at:"+logoutTime);
		} else {
			System.out.println("Can't logout");
		}
	}

}
   //�� : C. Can't logout

//���� �α׾ƿ��ð��� �� ��ٸ� true�� ��ȯ �ؼ� �α׾ƿ� �ð��� ����Ѵ�.

/*Truncation(��¥ �ڸ���)
�ű� API�� ��¥, �ð�, �� � �ش��ϴ� �� ���� �߶󳻼� ǥ���� �� �ֵ��� truncatedTo ��� �޼��带 �����Ѵ�.

Instant.now() ���� �޼ҵ带 ȣ���ϸ� ���� �ð��� Instant ��ü�� ���� �� �ֽ��ϴ�. 
Instant ��ü�� UTC ������ ISO �������� ��µ˴ϴ�. �׸��� Instant ��ü�� getEpochSecond()�� toEpochMilli() 
�޼ҵ带 ȣ���Ͽ� �ʴ��� �Ǵ� �и� �� ���� Ÿ�ӽ����� ���� long Ÿ������ ���� �� �ֽ��ϴ�.



//startDateTime�� endDateTime ���� ���� ��¥ ���� ��
//startDateTime.isBefore(endDateTime);    

//���� ��¥���� ��
//startDateTime.isEqual(endDateTime); 

//startDateTime�� endDateTime ���� ���� ��¥���� ��
//startDateTime.isAfter(endDateTime);












*/