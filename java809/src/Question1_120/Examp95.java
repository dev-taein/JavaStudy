package Question1_120;

//class DataConverter {{ //Ŭ������  implements AutoCloseable�� �������Ѵ�.
	class DataConverter {
	public void copyflatFilesTotables() {}
	public void close() throws Exception{
		throw new RuntimeException(); //line n1
	}
}
public class Examp95 {

	public static void main(String[] args)throws Exception{
		try(DataConverter dc = new DataConverter()) //line n2 
		{ dc.copyflatFilesTotables();} 
	}

}

//A. A compilation error occurs at line n2.
// �� : A. n2 �࿡�� ������ ������ �߻��մϴ�.



//�̰� AutoCloseable�� �����ϰ� �������� ���̴�.
//B. A compilation error occurs because the try block doesn't have a catch or finally block.
//B. try ��Ͽ� catch �Ǵ� finally ����� ���� ������ ������ ������ �߻��մϴ�.