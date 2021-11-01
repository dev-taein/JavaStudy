package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Examp179 {

	public static void main(String[] args) {
		List<String> nL = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s); 
		nL.stream()
		.map(funVal)
		.forEach(s-> System.out.print (s));
		
		//�� : A. Hello : JimHello : JohnHello : Jeff
	}

}
