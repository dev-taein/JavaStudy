package example01;

public class ForEx02 {

	public static void main(String[] args) {

		int sum = 0;
		int temp = 0;
		
		//����� : debugâ���� �ǵ�ġ �ʰ� �Ѿ�ٸ�, ���α׷��� ����
		//�߻��� ������ ������ ��Ƴ����� ������ ������̶�� �մϴ�.
		//breakPoint,TogglePoint(������)���� ��, ���� ��Ű�� F8�� �����鼭 �Ѵܰ��
		//������ѳ����鼭 ������ ������ ���쳪���� ������ ���� ���� �� �ִ�.
		
		//�����հ谡 2000�̻��� �� i�� ���� ����Ͻÿ�
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum >= 2000) {
				temp = i;
				break;
			}
			//System.out.println("sum : " + sum);
		}
		System.out.println("2000�̻��� �� sum�� ��  : " + sum);
		System.out.println("2000�̻��� �� i�� ��  : " + temp);
	}

}
