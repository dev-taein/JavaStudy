package examp04;

import java.sql.Struct;
import java.util.Objects;

public class Student {
	private int sno; //�й�
	private String name; //�̸�
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}
	
	
	// �������̵��ϴ� ����
//	hashcode�� �����ͼ��̳� �콬���̺��� �������� �ϳ��� ������ �ε������ �����ִ�.
//	�츮�� ���־��� IntegerŬ������ StringŬ���� ������� ���� �����(Ű��)�����ؼ� 
//	���� hashcode�� ���ü� �ֵ��� �������̵� �Ǿ� �ִ�. object�ȿ� �ִ� hashcode�޼ҵ��
//	������ ���� ��ȯ���شٰ� ����ȴ�. �� ����� ���ǵ� Ŭ������ �ν��Ͻ��� �����Ͽ� hashcode��
//	���� ��������� ���������� hashcode�� ������ �ٸ����� �� �� �ִ�. �̴� ����ڰ� 
//	hashcode() �� �������̵� �ؼ������ �Ѵٴ� ���̴�. 
//	set�� �������� ���� ��� ������ �ڷ�鿡 ���Ͽ� hash���̺��� ������ش�. �� �������� �޾Ƽ�
//	�������ִ� ����, �� ���� ���̺����Ͽ� equals������ �������ָ�, �װ�� ������ set�ȿ� �鿩������
//	�ʴ´�. 
	
	
//	�� ����� ���� Ŭ������ equals�� ������ ���ְ� hashcode()�� ������ ������ ������ 
//	���� �ٸ������̱� ������ ������ ����.

	@Override
	public int hashCode() {
		return Objects.hash(this.sno, this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
//		obj�� studentŬ������ �´�?
		if(obj instanceof Student) {
//			������ ���� ���� ��ü���� Ȯ���� �ϰ� �����ϸ� true�� �����ϰ� �ƴϸ� false�� ��ȯ�Ѵ�.
			Student student = (Student) obj;
			return this.sno == student.sno && this.name.equals(student.name);
		}
		return false;
	}
	
//	���� ȣȯ�� ���� �ڵ�  1.4��������
//	@Override
//	public int hashCode() {
//		return this.sno + this.name.hashCode();
//	}
	
}
