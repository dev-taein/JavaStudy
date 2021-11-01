package Question121_150;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test{
	List<String> list = null;
	public void printValue() {
		System.out.println(getList());
	}
	public List<String> getList(){return list;}
	public void setList(List<String> newList) {list=newList;};
}
public class Examp148 {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Dog","Cat","Mouse");
		Test t= new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test::printValue); //���Ұ�
//		t.getList().forEach(System.out::print); //�̷����ϸ� ��µ�,, �϶��� �� : DogCatMouse
		//���� : forEach(Consumer)�� ��, Consumer�Һ��ڴ� �Ű������ְ� ���ϰ��� ���� 
		// �׷��� ���� �޼��� ����(Ŭ���� :: �޼���) ����Ҽ� ����.
	}
}


//�� : B. A compilation error occurs.
//B because void forEach(Consumer action)