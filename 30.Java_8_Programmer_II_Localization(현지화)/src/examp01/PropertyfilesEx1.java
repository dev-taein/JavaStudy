package examp01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import javax.print.DocFlavor.URL;

public class PropertyfilesEx1 {

	public static void main(String[] args) {
//		Propertyfiles = �Ӽ� ����
//		�Ӽ� ������ ������ ���� �� Ű / �� ���� ���ڿ��� �����մϴ�.
//		������ ���� �� ���� ��Ģ�� �ֽ��ϴ�.
//		�� ���� �κ��� ���� (�ִ� ���)�� ���õ˴ϴ�.
//		#�Ǵ� !�� �����ϴ� ��� ���� �ּ����� ó���˴ϴ�.
//		�������� ���� �� �����÷� ���� ���� �� �ֽ��ϴ�.
		
//		Messages.properties�� ��������  java.util.Propertiesa, java.io.Reader, java.io.InputStream�� ����Ѵ�.
		Properties prop = new Properties();
		try (InputStream is = getClassLoader().getResourceAsStream("Messages.properties"))
		            {
		    prop.load(is); // Load properties
		    // Prints The video has been adde
		    System.out.println(prop.getProperty("video.added"));
		    // Ű�� ã�� ������ ��� �⺻���� �μ��մϴ�.
		    System.out.println(prop.getProperty("video.add", "default"));
		    // ��� �Ӽ� Ű ���� ����
		    Enumeration<?> e = prop.propertyNames();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
