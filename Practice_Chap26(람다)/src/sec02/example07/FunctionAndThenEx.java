package sec02.example07;

import java.util.function.Function;

public class FunctionAndThenEx {
	public static void main(String[] args) {
		
		//AndThen ���� ������ ���ʴ��
		
		
		//Function<T,R>�Լ����������̽��� T�� �Ű������� �ְ�, R�� �����Ͽ� �������ش�.
		//apply()�߻�޼��带 ������ �ִ�.
		//����� AndThen()�� ���ؼ� People�� �ָ� String�� ��� ����� ���´�.
		//���⼭ Address�� functionA�� ���ϰ����� ���Դٸ� functionB�� �Ű������� ���Ǿ�����, ��� ���� country�� �������� �߽��� ������ �ϴ� ���̴�.
		Function<People, Address> functionA = p -> {return p.getAddress();};
		Function<Address, String> functionB = a -> {return a.getCountry();};
		Function<People, String> functionAB = functionA.andThen(functionB);
		String country = functionAB.apply(new People("����", "id132", new Address("���ѹα�", "�뱸")));
		System.out.println("���� : " + country);
		
		
		
		//composer�� ��������� �ݴ��
		functionAB = functionB.compose(functionA);
		country = functionAB.apply(new People("����", "id132", new Address("���ѹα�", "�뱸")));
		System.out.println("���� : " + country);
	}
}
