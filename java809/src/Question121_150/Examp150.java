package Question121_150;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

public class Examp150 {

	public static void main(String[] args) {
		IntConsumer consumer = e->System.out.println(e);
		Integer value = 90;
		/* insert code fragment here */
		ToIntFunction<Integer> funRef = e -> e + 10; int result = funRef.applyAsInt (value);
		consumer.accept(result);
		
		
//		Which code fragment, when inserted at line 7, enables printing 100?
		
		

		
// �� : C. ToIntFunction<Integer> funRef = e ""> e + 10; int result = funRef.applyAsInt (value);
		
//		Function(T,R) ��ü T�� R�� ���� //public interface ToIntFunction<T>
	}

}
