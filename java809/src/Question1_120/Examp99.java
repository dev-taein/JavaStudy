package Question1_120;

class Resource implements AutoCloseable{
	public void close() throws Exception {
		System.out.println("Close-");
	}
	public void open() {
		System.out.println("OPen-");
	}
}
public class Examp99 {

	public static void main(String[] args) {
		Resource res1 = new Resource();
		try {
			res1.open();
			res1.close();
		} catch (Exception e) {
			System.out.println("Exception- 1");
		}
		//������� ����� OPEN CLOSE
		
//		try(res2 = new Resource()) { //line 1  //�ùٸ� ���� Resource res2 = new Resource()) �̷��� ���� �ν��Ͻ��� ���������Ѵ�.
		try(Resource res2 = new Resource()) {
			res2.open();
		} catch (Exception e) {
			System.out.println("Exception -2 ");
		}
	}

}


//�� : C. A compilation error occurs at line n1.



//res2�� �ν��Ͻ��� ���� �����
//���� OPen-Close-OPen-Close-