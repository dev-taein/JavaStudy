package example04;

public class ReferEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		Child child = new Child();
		
		//��� ������ �ڱ�Ŭ����(�ٺ�)�� ȣ���Ѵ�. �ٺ��� ����� ����
		System.out.println(parent.x);
		System.out.println(child.x);
		
		//��� �޼���� ���� �����ϰ� �ִ� �ν��Ͻ��� ������ ����
		parent.method();
		child.method();

		
		
//		parent.type(new Car());
		parent.type(new Child());
		//new Child()��  ParentŬ������ type()�޼��忡 Object obj�� �Ѿ��
		//ObjectŬ������ �ֻ��� �����̱� ������ �����ȴ�.
		// if(obj(Child) instanceof Parent)�� Child�� Parent�� ���ϳ�(��Ӊ����) �����
		// Child�� Parent�� ���迡 ���ϸ� true, ������������ false�� �ȴ�.
		// true�̸� Parent parent = (Parent)obj ����ȯ�� ���۵ǰ�
		//        Parent parent = (Parent)obj��  Parent parent = (Parent)Child�� ���� 
		//         (�ڼ�->����)= ��ĳ���� = �ڵ尡 �þ = ����ȯ �ڵ� ��������(���൵��)
		

	}

}
