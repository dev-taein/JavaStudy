package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		System.out.println("���� �ü�� : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("����� ���� : " + userName);
		
		//PropertiesŬ������ Map�迭�� �÷����̴�. �׷��� String, String���´�
		//Key(Ű)�� String, ��(value)�� String�̴�.  //getProperties()�� �Ӽ����� ���� �� �����´�
		Properties properties = System.getProperties(); //getProperties ���� ���� getProperties�̹Ƿ� getProperties�� �޴´�.
		
		
		//Map�÷��ǿ��� Key���� Set�迭�� �������� �޼��尡 KeySet()�̴�
		Set set = properties.keySet();
		System.out.println(" KEY        VALUE");
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println(key + "               "  + value);
		}
		
		
		
	
	}

}
