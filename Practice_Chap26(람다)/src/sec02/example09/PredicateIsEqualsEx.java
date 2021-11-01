package sec02.example09;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateIsEqualsEx {

	public static void main(String[] args) {
//		Predicate<String> predicate = null;
		Predicate<Object> predicate = null;
		boolean result = false;
		
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(Objects.equals(obj, obj2)); //���� ��
		
		
		
		//Predicate.isEqual()�� ���� �޼���ν�, �� ��ü�� ���� ���Ѵ�.
		//�� �� null�̸� true�� ���´�.
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("�� ��ü�� Null�� �� : " + result);
		
		predicate = Predicate.isEqual(null);
		result = predicate.test("������");
		System.out.println("�ϳ��� null�̰� �ϳ��� StringŸ���� ������  : " + result);
		

		//�Ʒ��� �ڵ� �ΰ��� ������ ����(�ּ�)�� ���Ѵ�.
		predicate = Predicate.isEqual("������");
		result = predicate.test("������");
		System.out.println("�� ��ü�� StringŸ���� ������ �� �� : " + result);
		
		
		
		//Object
		//Objects.equals("������", "������")�� �Ʒ� �ڵ�� ����.
		predicate = Predicate.isEqual("������");
		result = predicate.test("������");
		System.out.println("�� ��ü�� Objct�� �� : " + result);
		
		
		
		System.out.println(Objects.equals("������", "������")); //�̰��� ���� ��
		
		
		//���� �ڵ���� ��뷮 �����͸� ���߿� �����ϰ� �����ϰ� null���� �񱳴�󿡼� �ɷ����� �ؾߵǱ� ������ �Լ��� �������̽��� 
		//�����ϰ� ����ϸ� ���� ���� �ڵ��� ���Ἲ�� ��������.
	}
}
