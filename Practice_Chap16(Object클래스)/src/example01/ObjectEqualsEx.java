package example01;

public class ObjectEqualsEx {

	public static void main(String[] args) {
		
		//ObjectŬ������ equals()
		//�Ʒ��� �ڵ�� ���� �ּҰ� �� �ٸ���.
		Object object1 = new Object();
		Object object2 = new Object();
		
		//ObjectŬ������ equals()�� ���������� �޸� ���� ��
		boolean result1 = object1.equals(object2);  //equals�� ����Ÿ���� boolean�̶� boolean���� �޾��Ѵ�.
		boolean result2 = object1 == object2;
		
		System.out.println(object1);
		System.out.println(object2);
		
		System.out.println("equals() : " + result1);
		System.out.println("== ������ : " + result2);
	}

}
