package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {
		
		SamsungPhone sam = new SamsungPhone();
		sam.setCompany("�Ｚ");
		sam.setModel("������8");
		sam.setRelease(2018);
		sam.setColor("����");
		
		System.out.println(sam);
		
		
		SamsungPhone sam1 = new SamsungPhone();
		sam1.setCompany("LG"); 
		sam1.setModel("G6");
		sam1.setRelease(2017);
		sam1.setColor("����");
		
		System.out.println(sam1);
	}

}
