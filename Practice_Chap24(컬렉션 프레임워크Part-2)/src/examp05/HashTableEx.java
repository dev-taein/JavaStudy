package examp05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
//		HashMap�� �Ź��� 
//		HashTable�� ������
//		����� �Ȱ���.
		Map<String, String> map = new Hashtable<String, String>();
		//��ü �߰�
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12");
		System.out.println("�� Entry �� : " + map.size());
		
		
		int count = 0; //��й�ȣ�� Ʋ�� ����
		
		//��ü �˻�
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵� : ");
			String id = scanner.nextLine(); //��������
			
			System.out.print("��й�ȣ : ");
			String password = scanner.nextLine(); 
			System.out.println();
			
			//����Ǿ� �ִ� ��ü�� �˻��Ͽ�(������ DB��� ��������) ���̵�� ��й�ȣ�� ��ġ�ϸ� �α��� ����, �ƴ϶�� ���ѷ����� ��������
			if(map.containsKey(id)) {//containsKey�� Ű ��ü�� �ִ� ����°� , 
				//id ��, Ű�� �ְ� ������ ���� password�̴ϱ�, ���ٸ� �α��� ����, �ƴϸ� ��й�ȣ ����ġ �ȴ�. ��, Ʋ�� Ƚ�� 1������
				if(map.get(id).equals(password)) { //map.get(id)���⼭ ������ ��й�ȣ�� .equals(password) ���� ��й�ȣ�� ���Ѵ�.
					System.out.println(id + "���� �α��� �Ǿ����ϴ�.");
					break;
				}
				else {
					count++; //��й�ȣ Ʋ�� Ƚ�� ����
					System.out.println("��й�ȣ�� "+ count + "ȸ" + "Ʋ�Ƚ��ϴ�.");
					if(count == 3) { //3�� Ʋ����
						System.out.println("��й�ȣ�� "+ count + "ȸ" + "Ʋ�Ƚ��ϴ�. ���� �湮 ��Ź�帳�ϴ�.");
						break;
					}
				}
			}
			else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
		
		scanner.close();
	}

}
