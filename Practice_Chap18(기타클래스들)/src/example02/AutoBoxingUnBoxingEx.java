package example02;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		//Integer�� Wrapper ���� Ŭ�����̸� ��üŬ�����̴�.
		//�ڵ� �ڽ� �ڵ�
		Integer obj1 = 100;
		Integer obj2 = 300;
		
		
		List list = new Vector(); //List�� �������̽� Ÿ���̴�. Ctrl+shift+O ����Ű�� ������ import java.util.List; �������
		list.add(obj1);
		list.add(obj2);
		list.add(500); //�ٷ� 500�̶� ���ڸ� �־ �ȴ� ������ ? -> list.add(new Integer(500))�� ����
		System.out.println(list);
		
		//list.get()�� ���ξȿ� ���ڰ� 0�̸� 0��° �ε����� �����´�
		int value1 = (Integer)list.get(0); //.get()�޼���� ����Ÿ���� <>������Ʈ Ÿ���̶� integer�� ����ĳ���� �ؾ��Ѵ�.
		System.out.println(value1);
		
		//.intValue()�� Integer ��ü���� int�� ���� �������� �޼��� 
		int value2 = obj2.intValue(); //�����ڵ�
		int value3 = obj2; //�ڵ� ��ڽ��� ����� �Ǳ⶧���� �� �ڵ嵵 ��밡���ϴ�.
		System.out.println(value2);
		System.out.println(value3);
		
		//��ü + �⺻Ÿ���� ����(syntax)�����̴�. ������ ����(wrapper)Ŭ�����̱� ������ �����Ϸ��� �˾Ƽ�
		//�ڵ� ��ڽ� �ؼ� �Ʒ��� ���� �ڵ尡 �����ϴ�.
		int result = obj1 + 500;
		System.out.println(result);
	}

}
