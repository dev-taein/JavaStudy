package example01;

//���赵, �ؾƲ�� ����� �۾�
public class FieldInit extends Object {  //�ؾ ���赵�� //extends Object ������ �� �ڵ����� (��������)
	//�⺻�� ����
	byte byteField;	     //1
	short shortField;    //2
	int intField;        //4(����Ʈ Ÿ��(�⺻))
	long longField;		//8
	
	boolean boolField;	//1
	char charField;		//2
	
	float floatField;	//4
	double doubleField; //8
	
	//����������
	int[] arrField;		//4
	String strField;	//4
	
	
	//this : ��ü�ڱ��ڽ��� �ּ�
	//super : ����ü�� �ּ�
	
	
	//toString() : Ŭ������ �������(�ʵ�)�� ������ ���÷� Ȯ���ϰ��� �� ����, 
	//���ϴ� �������� ����������� ����ϰ��� �Ҷ� ����� ���� �Ѵ�.
	@Override //annotation : �����Ϸ����� ���� ������ �䱸
	public String toString() {
		String str = "byteField : " + byteField + " shortField : " + shortField + " intField" + intField 
						+ " boolField : " + boolField + " strField : " + strField;
		
		return str;
	}
	
}
