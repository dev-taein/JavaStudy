package Question1_120;

class Product2{
	String pname;
	public Product2(String pname) {
		this.pname = pname;
	}
	
}
public class Examp94 {

	public static void main(String[] args) {
		Product2 p1 = new Product2("PowerCharger");
		Product2 p2 = p1;
		System.out.println(p1.equals(p2));  //equals �޼ҵ�� ���ϰ��� �ϴ� ����� ���� ��ü�� ��������, == �����ڴ� ���ϰ��� �ϴ� ����� �ּҰ��� ���մϴ�.
		Product2 p3 = new Product2("PowerCharger");
		System.out.println(p1.equals(p3)); //false
	}

}

// �� : D. true false
//�ڹٿ�����,
//String o1 ="java"
//String o2 = new String("java"); �� ���� �ٸ��� ����Ѵ�. �ؿ� String�� �ڹٶ�� ���� ���� ��ü�� ����Ѵ�.
//�׸��� ��ü�� ���� ������ ������ġ�� �������� �ʰԵȴ�. �׷��� o1 == o2 ����ϸ� �ٸ� ��ġ�� �ֱ� ������ false��� ���� ��µȴ�. 
//���õ����� Ÿ���� �ƴ� ��ü���� equals��� �޼ҵ带 ������.
//���� ���õ�����Ÿ�Կ��� ����񱳿����ڸ� ����ǰ� ��ü�� ����õ�����Ÿ�Կ��� equals�� ����ȴ�.
//�׷���, String�� ��� Ư���� �ް��ִ�. �������� ����־����� ������ ���� ���� ����Ų��.
//(�㳪 ���ܷ� ���ð��� �Է°��� �Ȱ��� ��µ� false�� ����������. �̴� ���������� �Է°��� �ٸ����� ����Ǿ��ٴ� ���̴�. )��ġ ���õ�����Ÿ��ó�� �����Ѵ�.