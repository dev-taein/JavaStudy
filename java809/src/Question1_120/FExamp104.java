package Question1_120;

import java.util.Optional;

public class FExamp104 {
	public static Optional<String> getCountry(String loc){
		Optional<String> couName = Optional.empty();
		if("Paris".equals(loc))
			couName = Optional.of("France");
		else if("Mumbai".equals(loc))
			couName=Optional.of("India");
		return couName; // �Ѵ� ���ٸ� couName�� ����,, �� empty()���� ����
	}
	public static void main(String[] args) {
		Optional<String> city1 = getCountry("Paris");
		Optional<String> city2 = getCountry("Las vegas");
		System.out.println(city1.orElse("NOT Found")); //city1�� France�� �����ϹǷ� �̰��� ���,,, ������ٸ� NOT Found�� ��µ�
		if(city2.isPresent()) //city2�� ������ ���⶧���� false�� ��ȯ
			city2.ifPresent(x-> System.out.println(x));
		else
			System.out.println(city2.orElse("Not Found")); //������ ��� Not Found�� ���
		
		//���� : France		Not Found

	}

}
/*
orElse() �޼ҵ� : ����� ���� �����ϸ� �� ���� ��ȯ�ϰ�, ���� �������� ������ �μ��� ���޵� ���� ��ȯ��.
orElse�� null�̴����� �׻� �Ҹ��ϴ�.
orElseGet�� null�� ���� �Ҹ��ϴ�.


 isPresent()�� ������ �ִٸ� true ���ٸ� false
*/