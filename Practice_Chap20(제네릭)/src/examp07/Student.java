package examp07;

//������ ���׸��̸� �ڼյ� ���׸��̿��� �Ѵ�.
//�ڼ� ���׸� Ȯ�嵵 ����
public class Student<T,M,C> extends Person<T, M> {

	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
}
