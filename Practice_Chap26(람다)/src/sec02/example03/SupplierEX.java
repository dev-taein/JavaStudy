package sec02.example03;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEX {

	public static void main(String[] args) {
		
//		Supplier = ������ 
		
		//Supplier<T>�Լ��� �������̽��� �Ű����� ����, TŸ���� ���� ������ ���ش�. (������)
		//�Ͽ�, �Ʒ��� ���� �Լ��� �������̽��� �߻�޼����� get()�� ���ٽ����� ������ ��������,
		//���� ȣ�⵵ �� ����̴�.
		Supplier<String> supplier = () -> {
			String str = "�ڹ� ���θ� �մϴ�.";
			return str;
		}; 
		String str = supplier.get();
		System.out.println(str);
		
		
		//���� �ڵ带 ���ΰ�,,, return�� ������ �����ϸ�, return�� �����ϸ� {};�� ������ �����ϴ�.
		supplier = () -> "�ڹ� ���θ� �մϴ�.";
		str = supplier.get();
		System.out.println(str);
		
		
		
		
		//IntSupplier�� �Ű����� ������,,, ���ϰ��� Int�̹Ƿ� ������ Int�� �޾ƾ��Ѵ�.
		//getAsInt()�� ���ٽ����� �����ؼ� ȣ���غ� ����̴�.
		//��, getAsInt()��  ------ { () -> {int rand = (int)(Math.random()*45)+1;return rand;};   �̰��� �����Ѱ��̴�.
		IntSupplier intSupplier = () -> {
			int rand = (int)(Math.random()*45)+1;
			return rand;
		};
		int rand = intSupplier.getAsInt();
		System.out.println("IntSupplier�Լ��� �������̽��� �̿��� �ζ� ��ȣ : "+rand);
		
		
		
		
		
		
		
		
		
	}

}
