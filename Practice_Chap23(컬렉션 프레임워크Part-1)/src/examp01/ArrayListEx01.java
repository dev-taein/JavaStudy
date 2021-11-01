package examp01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
//		ArrayList�� ���׸� Ÿ���̴�. �׷��� Warning�� ���.
//		�Ͽ� ���ְ� �ʹ� ������� �˻���ư�� Ŭ���Ͽ�,  Error�Է�-->preference�� ���� Generics�ǿ� �ִ� ���� ��� ignore�� �ٲٸ� �ȴ�.
		
		ArrayList list = new ArrayList<>(); //�⺻������ 10���� ���� �����Ѵ�.
		System.out.println("�� ũ�� : " + list.size()); //����� ��ü�� �ϳ��� ���� ������ 0�� ������.
		
		//��ü �߰��ϱ�
		list.add("111");    //boolean add(Object o) --> ������ �߰�
		list.add("222");
		list.add("333");
		list.add("444");
		list.add(new Integer(333)); // list.add(111) �ڵ��ڽ�
		System.out.println(list.size());
		System.out.println("ArrayList�� �ּ� " + list.hashCode());
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		//0��° �ε����� "333" �߰��ϱ�
		list.add(0, "333");
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		//�տ��� ���� �˻��Ͽ� "333"�� �����Ѵ�. (����� �� �Ѱ��� ����)
		//��ü �����ϱ�
		list.remove("333");
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
		
		//����� ��ü�� �ε����� ã�ƿ���(������ -1�����Ѵ�.)
		System.out.println("index = " + list.indexOf("333"));
		System.out.println("index = " + list.indexOf(333));
		
		
		
		
//		�Ʒ��� ���� �����ϸ� ��ü�� ���´�. ���� ������ �ε���0�� �����Ҷ�, i�� 0�̴ϱ� �翬�� 0�ε����� �ִ� ��ü�� ���������� 
//		���� i���� ���� �ǰ�, list�� ��ü���� ������ ������鼭 ����� ���� ���� �ʴ´�.
//		�Ͽ�, ������ ��ų���� �׻� �ڿ��� ���� ������ ���ִ� ���̴�.
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//		}
		
		
		//�Ʒ��� ���� ������ �ϸ� IndexOutOFBoundsException�� �߻��Ѵ�. ������
		//size()���� 4�ε�, �ε����� 3���� �����ϱ� �׷���
//		for(int i=list.size(); i>=0;i--) {
//			list.remove(i);
//		}
		
		
		//�ùٸ� ��� //list.clear(); ��ü ������ ���� ����
		for(int i=list.size()-1; i>=0;i--) {
			list.remove(i);
		}
		System.out.println("ArrayList�� �ִ� �� : " + list.toString());
	}

}
