package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class Person {

	int age;
	String name;
	int[] arr;
	
	public Person(int age, String name, int[] arr) {
		super();
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override						// this.arr.hashCode()�� �־����� �迭���� �ؽ��ڵ带 �ҷ��ͼ� ���� �ּҰ� �ٸ��� ���Դ�.
	public int hashCode() {			//�迭 arr���� ���� arr[0] arr[1] ...�� �ڵ尡 ������� ������ �ִ� //this.arr  = Arrays.toString(this.arr).hashCode()�� ���
		//����ȣȯ�� �Ʒ��� ���� �ۼ����ϸ� �ȴ�.(������ �ؽ��ڵ� JDK 1.5����) �Ʒ��� ���� �ۼ�
//		return this.age + this.name.hashCode() + Arrays.toString(this.arr).hashCode(); //name�� String�̱� ������ intŸ���� hashcode�� ��ȯ �Ҽ� �����Ƿ� name.hashCode()�� �ٲ�����Ѵ�.
		//�ű԰��� �Ҷ�, �Ʒ��� ���� �ۼ��� �ϸ� �ؽ��ڵ� ��Ⱑ ����� �����ϴ�( �Ź���)
		return Objects.hash(this.age, this.name, Arrays.toString(this.arr)); //Objects.hash()�� �迭�̵� String�̵� ���� ���� ������� //Objects�� Arrays.toString(this.arr)�� ���
	}
	
}
