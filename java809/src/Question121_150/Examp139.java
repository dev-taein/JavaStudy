package Question121_150;

import java.util.Locale;
import java.util.ResourceBundle;

public class Examp139 {

	public static void main(String[] args) {
//		1 �࿡ ���������� ���� �� �� �ڵ尡 "Wie geht ��s?"�� �μ� �� �� �ֵ����ϴ� �� ���� �ڵ� ������ �����Դϱ�?
//		Which two code fragments, when inserted at line 1 independently, enable the code to print ��Wie geht��s?��
		Locale currentLocale;
		 currentLocale = new Locale ("de", "DE");//line n1
		 currentLocale = new Locale.Builder ().setLanguage ("de").setRegion ("DE").build();//line n1
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
//		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle");//�̷����ϸ� Hou are you�� ���
		System.out.println(messages.getString("inquiry"));
	}

}
/*
properties ������ Text �����̸� ResourceBundle�� ������ ���� �̸��� ������ �˻��Ѵ�.

<Resource��> "_" language1 "_" country1 "_" variant1
<Resource��>  "_" language1 "_" country1
<Resource��>  "_" language1
<Resource��>  




Eclipse���� ������Ʈ ������ ���콺 ������ ��ư���� Ŭ���ϰ� Build Path ���� "new source Folder"�� �����Ͻʽÿ�
*/