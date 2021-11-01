package examp07;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutputStreamEx {

	public static void main(String[] args) throws Exception {
		//���� ��ü ����
		File file = new File("D:\\Temp\\primiriveData.dat");
		//�� ��Ʈ�� ����
		FileOutputStream fOutputStream = new FileOutputStream(file);
		System.out.println("������ ũ�� : " + file.length());
		
		//���� ��Ʈ�� ����
		//�⺻Ÿ��(int, long, double, float, String..��) ����� �ϱ� ���� ��Ʈ���� DataOutputStream�̴�.
		DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
		
		
		//String�� ���Ͽ� �����ϱ� ���ؼ� writeUTF()�� ����ϴµ�, �ѱ��� 3����Ʈ,  �����ڴ� 1����Ʈ
		//������, String������ ��� 2����Ʈ�� ���Եȴ�. 
		dOutputStream.writeUTF("������"); //String(2����Ʈ)+�ѱ�9����Ʈ = 11����Ʈ �߰�
		System.out.println("������ ���� �� ������ ũ��  : " + file.length() + "byte");
		dOutputStream.writeDouble(100.15);  //Double�� 8����Ʈ�̱� ������ ���� ����������ũ�� + Double(8����Ʈ �߰�)
		System.out.println("Double100.15�� ���� ũ��  : " + file.length() + "byte");
		dOutputStream.writeInt(700);  //Int�� 4����Ʈ �̱⶧���� 4����Ʈ �� �߰�!
		System.out.println("Int700�� ���� ũ��  : " + file.length() + "byte");
		
		
 
		dOutputStream.writeUTF("Kim");  // String(2����Ʈ)+����3����Ʈ = 5����Ʈ �߰�
		System.out.println("Kim ���� �� ������ ũ��  : " + file.length() + "byte"); 
		dOutputStream.writeDouble(717.15);  
		System.out.println("Double717.15�� ���� ũ��  : " + file.length() + "byte");
		dOutputStream.writeInt(555); 
		System.out.println("Int555�� ���� ũ��  : " + file.length() + "byte");
		
		dOutputStream.flush();
		fOutputStream.close();
		dOutputStream.close();
		
		System.out.println();
		System.out.println("�о���� ������ ���");
		//�ֽ�Ʈ�� ����
		FileInputStream fInputStream = new FileInputStream(file);
		//���� ��Ʈ�� ����
		DataInputStream dinputStream = new DataInputStream(fInputStream);
		
		
		//���α׷����� �о���� ������ �����Ҷ��� ������ �ݵ�� �Ȱ��� �����ϰ� �о�;� �Ѵ�.(�߿���)
		for(int i=0; i<2; i++) {
			System.out.println( (i+1) + "���� ���ڿ� : " + dinputStream.readUTF()); //�������� �о��  ���� �Է��� ������� �Ȱ��� �о���Ѵ�. �ȱ׷��� ��������� ������ ������.
			System.out.println( (i+1) + "���� Double : " + dinputStream.readDouble());
			System.out.println( (i+1) + "���� Int: " + dinputStream.readInt());
		}
		
		System.out.println("����ũ�� (byte) " + file.length() + "byte�о����ϴ�.");
		
		fInputStream.close();
		dinputStream.close();
		
	}

}
