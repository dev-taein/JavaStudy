package Question1_120;

import java.io.FileInputStream;
import java.util.Properties;

public class Examp18 {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream ("D:\\courses.txt"); //������ ������ welcome1="Good day!"�� ����ִ�.
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1")); //welcome1�� ���� Good day!�� �����Ѵ�.
		System.out.println(prop.getProperty("welcome2", "Test"));//line n1  welcome2������ ���⶧���� Test�� �����Ѵ�.
		System.out.println(prop.getProperty("welcome3"));  //�� ���뵵 ���⶧���� null�� �����Ѵ�.

//public String getProperty(String key)��
//ù��° �޼ҵ�� key�� Ű������ ���� ������Ƽ�� ���� ��� �� ���� �����ϰ�,���ٸ� null�� �����Ѵ�. 
		
//public String getProperty(String key, String defaultValue)��
//�ι�° �޼ҵ�� key�� Ű������ ���� ������Ƽ�� ���� ��� �� ���� �����ϰ�, ���ٸ� �ι�° �ĸ����ͷ� �Ѱ��� defaultValue�� �����Ѵ�
		
	}

}
