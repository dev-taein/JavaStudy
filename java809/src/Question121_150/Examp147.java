package Question121_150;

import java.util.Locale;
import java.util.ResourceBundle;

public class Examp147 {
	public void loadResourceBundle() {
	ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);;
	System.out.println(resource.getObject(1));  //error 
//	System.out.println(resource.getObject("HELLO_MSG"));  //�̷��� ���ڿ��� Ű���� ��� ������� ��µȴ�, �϶��� ��:Hello, everyone!
	}
	public static void main(String[] args) {
		new Examp147().loadResourceBundle();
	}
}


//�� :A. Compilation fails.
