package Question1_120;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Examp88 {

	public static void main(String[] args) {
		
		Locale currentLocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale); //�϶��� MessagesBundle_fr_FR�� Ű�� ���� ������
//		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle"); // �϶��� �⺻ MessagesBundle�� Ű�� ���� ������
		Enumeration<String> names = messages.getKeys();
		while(names.hasMoreElements()) {
			String key = names.nextElement();
			String name = messages.getString(key);
			System.out.println(key + " = "+ name);
		}
	}

}
//�� : A. username = Entrez le nom d'utilisateur password = Entrez le mot de passe
