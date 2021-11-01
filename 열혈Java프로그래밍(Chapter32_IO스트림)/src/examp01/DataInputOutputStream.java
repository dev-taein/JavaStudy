package examp01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStream {

	public static void main(String[] args) {
//		InputStream in = new FileInputStream("data.dat"); //�Է� ��Ʈ�� ����
//		DataInputStream fin = new DataInputStream(in); //���� ��Ʈ�� ���� �� ����
//		DataInputStream ���� ��Ʈ��  : �⺻ �ڷ��� ������(Double,Int ��) �������� �Է��� ���� ���� ��Ʈ��  ( ����Ʈ ����, �ڵ����� ����)
//		
//		OutputStream out = new FileOutputStream("data.dat"); //�Է� ��Ʈ�� ����
//		DataOutputStream fout = new DataOutputStream(out); //���� ��Ʈ�� ���� �� ����
//		DataInputStream ���� ��Ʈ��  : �⺻ �ڷ��� ������(Double,Int ��) �������� �Է��� ���� ���� ��Ʈ�� ( ����Ʈ ����, �ڵ����� ����)
		
		
		try (DataOutputStream fout = new DataOutputStream(new FileOutputStream("data.dat"))) {
		fout.writeInt(370); //int�� ������ ����
		fout.writeDouble(3.14); //Double�� ������ ����
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
