package examp03;

public class Utill {
	
	//<T>�� ���׸� Ÿ�� �޼��带 ��Ī�ϴ� ���̸�, ���� Ÿ�԰� �Ű����� Ÿ���� 
	//�����ϰ� <T>Ÿ������ ���������Ѵ�.
	//�ܺη� ���� TŸ���� �޾Ƽ� Person<T>��� ���׸� Ŭ������ �ν��Ͻ���
	//�����Ͽ� ������ ���ִ� ������ �ϴ°� �Ʒ� �޼����.
	public static<T> Person<T> changing(T t){
		
		Person<T> person = new Person<T>();
		person.setT(t);
		
		
		return person;
	}
	

}
