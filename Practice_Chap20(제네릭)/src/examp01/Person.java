package examp01;


//Person�̶�� Ŭ������ ���׸� Ÿ������ ������
public class Person<T> {
	
	//T��� Ÿ���� ���� �������� �ʾҴ�.
	//T�� ���� �ڵ忡�� ��������.
	//�Ͽ�, static�� �� ���� ����.
	private T t;
	
	public Person() {
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}



}
