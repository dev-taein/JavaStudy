package dateExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {


		//DateŬ������ Timestamp������� ���� ���ȴ�.
		//ex) ����, ī�� ��� ����, �α� ���� ��..
		Date today = new Date();
		//DateŬ������ toString()ȣ���ϸ� ����ǥ��������(UTC)
		System.out.println(today);
		
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� a hh:mm:ss");
		System.out.println(sDateFormat.format(today));
		

	}

}
