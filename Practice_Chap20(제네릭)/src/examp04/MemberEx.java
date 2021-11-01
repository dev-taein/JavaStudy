package examp04;

public class MemberEx {
	
	
	//���׸� Ŭ������ Member�� ������     //MemberEx Ŭ������ �ν��Ͻ� �޼���
	public <T> Member<T> boxing(T t){
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}
	
	//MemberExŬ������ ���� �޼���
	
	public static <T> Member<T> wrapping(T t){
		Member<T> member = new Member<T>();
		member.setT(t);
		return member;
	}

	
	public static void main(String[] args) {
		MemberEx memberEx = new MemberEx();
		Member<Integer> member = memberEx.<Integer>boxing(new Integer(100));  //�ڵ� �ڽ��ϸ� memberEx.boxing((100));
		System.out.println("Member Ŭ������ �� : "+ member.getT());
		
//		Member<String> member2 = MemberEx.<String>wrapping("ȫ�浿");
		Member<String> member2 = wrapping("ȫ�浿");
		System.out.println("Member2 Ŭ������ �� : "+member2.getT());
	}

}
