package Question121_150;

class ProductCode<T, S extends T> {
	T c1;
	S c2;
}
public class Examp127 {

	public static void main(String[] args) {
		ProductCode<Number, Integer> c1 = new ProductCode<Number, Integer>(); /* c1
		instantiation */
		ProductCode<Number, String> c2 = new ProductCode<Number, String>(); /* c2
		instantiation */
		
//ProductCode Ŭ������ �����϶�� ��û�� �޾ҽ��ϴ�. P
//roductCode Ŭ������ ���Ǵ� c1 �ν��Ͻ�ȭ�� �����ϵ��� ����ؾ��ϸ� c2 �ν��Ͻ�ȭ���� ������ ������ �߻���ŵ�ϴ�.
//�䱸 ������ �����ϴ� ProductCode ���Ǵ� �����Դϱ�?
//You have been asked to define the ProductCode class. 
//The definition of the ProductCode class must allow c1 instantiation to succeed and 
//		cause a compilation error on c2 instantiation.
//Which definition of ProductCode meets the requirement?
		
		//�������� c2�� ������ ������ �߻���Ű��� �����Ƿ� ���� B
	}
}


// B. class ProductCode<T, S extends T> {
//T c1;
//S c2;
//}