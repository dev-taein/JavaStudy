package example06;

public class IndirectEx {

	public static void main(String[] args) {
		// A�� B,C�� �δ��̷�Ʈ ����
		I i = new B();
		i.method();
		
		i = new C();
		i.method();
	}

}
