package example08;

public class ChildEx {

	public static void main(String[] args) {
		//�͸� �ڼ� ��ü  (�̸� ����) �ٺ��� Ŭ�����̴�. ---- UI�̺�Ʈ ó���� ������ ��ü ��������� ���δ�.
			//�׳� ��� ����� �뵵�� ����� ���̴�
		Parent parent = new Parent() {   //Parent()�����ڸ� ������ �����Ѵ�.
			int b = 10;
			public void method1() {
				System.out.println("�͸� �ڼ� ��ü �޼���");
			}
			@Override
			public void method() {
				int a = 10;
				System.out.println("a : " + a);
				System.out.println(this.b);
				this.method1();
			}
		};
		parent.method();

	}

}
