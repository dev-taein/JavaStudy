package formatExample;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		
		double number = 5577669.78;
		
		//0�� �ڸ����� �� �����ϰ� 0�� �� ǥ����, #�� ǥ���� �� �ϵ� #ǥ���� �ȵȴ�.
		DecimalFormat dFormat = new DecimalFormat("0");  
		System.out.println(dFormat.format(number));

		dFormat = new DecimalFormat("0.0");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("00000000000.00000");
		System.out.println(dFormat.format(number));
		
		
		
		dFormat = new DecimalFormat("#");  
		System.out.println(dFormat.format(number));
		
		
		dFormat = new DecimalFormat("#.#");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("########.#####");
		System.out.println(dFormat.format(number));
		
		dFormat = new DecimalFormat("#,###.00");
		System.out.println(dFormat.format(number));
		
	}

}
