package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
		//�߻�Ŭ������ �ν��Ͻ��� ���� �� ���� ����
		//Phone phone = new Phone();
		
		
		//������
		Phone[] p = new Phone[10];
		p[0] = new SmartPhone(1, "����", "L");
		p[1] = new FolderblePhone(2, "����", "��");
		//�ٺ��� Phone�̴ϱ� SmartPhone�̳� FolderblePhone�� ����Ǿ� �ִ�
		//�޼���� ����� ���Ѵ�. ��? �ٺ��� Phone�̱� �����Դϴ�.
		p[0].turnOff();
		p[0].showInfo();
	
		
		
		System.out.println("-------------------------------------");
		
		p[1].turnOff();
		p[1].showInfo();
		
		System.out.println("-------------------------------------");
		
		
		
		SmartPhone smartPhone = new SmartPhone(190815, "ȫ�浿", "LG-V50");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		System.out.println("------------------------------------");
		
		FolderblePhone fphone = new FolderblePhone(190820, "Ƽ�ƶ�", "�Ｚ");
		fphone.showInfo();
		fphone.turnOn();
		fphone.turnOff();
		fphone.FoldOn();
		fphone.FoldOff();
		
	}

}
