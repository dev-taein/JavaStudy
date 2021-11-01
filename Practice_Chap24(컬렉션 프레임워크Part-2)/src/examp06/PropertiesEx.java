package examp06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception{
		//Properties ��ü�� Ű�� ���� String���� ���� �� Map�÷����̴�.
		Properties properties = new Properties();
		
		//PropertiesExŬ������ ������ ���� ���� properties������ �����ϹǷ� �Ʒ��� ���� �н��� �˾ƿ��°�
		//database������ ��ġ(path)�� �˾ƺ���
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		//���� ��� ���
		System.out.println(path); //�����ڵ�� ��µ�
		//�ѱ۷� ���� ��ΰ� ��µǵ��� ���ڵ��Ѵ�.
		path = URLDecoder.decode(path,"UTF-8"); //�ѱ��� 3����Ʈ
//		path = URLDecoder.decode(path,"EUC-KR"); //EUC-KR�� �ѱ��� 2����Ʈ -- �ѱ��� ����
		System.out.println(path);
		//database.properties������ �о���δ�.
		properties.load(new FileReader(path));
		
		System.out.println("---------------------------------");
		
		//Ű�� �ְ� ���� �о��
		String driver =properties.getProperty("driver");
		System.out.println("driver : " + driver);
		
		String url =properties.getProperty("url");
		System.out.println("url : " + url);
		
		String username =properties.getProperty("username");
		System.out.println("username : " + username);
		
		String password =properties.getProperty("password");
		System.out.println("driver : " + password);
	}

}
