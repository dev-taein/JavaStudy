package examp01;

import java.util.Locale;

public class LocalEx1 {

	public static void main(String[] args) {
//		Localization=����ȭ=����ȭ
//		ǥ�� ��� : ���_���� = fr_CA
		
		Locale locale = Locale.getDefault(); //���� �ڽ��� ���� ������ ��Ÿ����.
		System.out.println(locale);
		 
		System.out.println("Country Code: " + locale.getCountry()); //Country(����) �ڵ�
		System.out.println("Country Name: " + locale.getDisplayCountry()); //Country(����) �̸�
		System.out.println("Language Code: " + locale.getLanguage()); //�ش籹�� ��� �ڵ�
		System.out.println("Language Name: " + locale.getDisplayLanguage()); //�ش籹�� ��� �̸�
		
		System.out.println("---------------------------------------------------------------------");
		
//		�ڹٿ��� �����ϴ� ��� �������� ������ �� �� �ִ�.
//		Locale [] locales = Locale.getAvailableLocales();
//		Arrays.stream(locales).forEach(System.out::println);
		
//		Locale�ν��Ͻ� �� ����� ������� �� ���� ���.
//		Locale(String language)
//		Locale(String language, String country)
//		Locale(String language, String country, String variant)

//		1��° ��� : ������ ���
		Locale chinese = new Locale("zh");
		Locale CHINA = new Locale("zh", "CN");
		System.out.println("Country Code: " + CHINA.getCountry()); //Country(����) �ڵ�
		System.out.println("Country Name: " + CHINA.getDisplayCountry()); //Country(����) �̸�
		System.out.println("Language Code: " + CHINA.getLanguage()); //�ش籹�� ��� �ڵ�
		System.out.println("Language Name: " + CHINA.getDisplayLanguage()); //�ش籹�� ��� �̸�
		System.out.println("---------------------------------------------------------------------");
//		2��° ��� : forLanguageTag (String) ���丮 �޼��� ���
		Locale german = Locale.forLanguageTag("de");
		System.out.println("Country Code: " + german.getCountry()); //Country(����) �ڵ�
		System.out.println("Country Name: " + german.getDisplayCountry()); //Country(����) �̸�
		System.out.println("Language Code: " + german.getLanguage()); //�ش籹�� ��� �ڵ�
		System.out.println("Language Name: " + german.getDisplayLanguage()); //�ش籹�� ��� �̸�
		System.out.println("---------------------------------------------------------------------");
//		3���� ��� :  Locale.Builder ���
		Locale japan = new Locale.Builder().setRegion("JP").setLanguage("jp").build();
		System.out.println("Country Code: " + japan.getCountry()); //Country(����) �ڵ�
		System.out.println("Country Name: " + japan.getDisplayCountry()); //Country(����) �̸�
		System.out.println("Language Code: " + japan.getLanguage()); //�ش籹�� ��� �ڵ�
		System.out.println("Language Name: " + japan.getDisplayLanguage()); //�ش籹�� ��� �̸�
		System.out.println("---------------------------------------------------------------------");
		
//		���� ������ ��� �� �ϳ��� �߸��� �μ��� �����ϸ� ���ܰ� �߻����� �ʰ� �߸��� ������ ����� �ȴ�.
		Locale badLocale = new Locale("a", "A"); // No error
		System.out.println(badLocale); // It prints a_A
		System.out.println("---------------------------------------------------------------------");
//		���� LocaleŬ������ �Ϻ� ���� ��� �� ������ ���� ���� ���� �� ����� ���� �Ѵٴ� ����� �ƴ� ���� �����ϴ� . ���� ��� ������ �����ϴ�.
//		Locale.GERMAN
//		Locale.KOREAN
//		Locale.UK
//		Locale.ITALY
		System.out.println(Locale.getDefault()); // ���� ���� �⺻ ���_���� ���
		Locale.setDefault(new Locale("en", "US")); //���� ���_���� ������ �ٲ�
		System.out.println(Locale.getDefault()); //�ٲ� ������ ���
		
	}

}
