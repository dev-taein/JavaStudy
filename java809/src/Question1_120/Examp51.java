package Question1_120;

import java.io.IOException;

// AutoCloseable �������̽��� 
//try-with-resources ������ �����Ǵ� ��ü�� �� close() �޼��尡 �ڵ����� ȣ��ȴ�.
final class Folder implements AutoCloseable{ //line n1
	public void close () throws IOException { System.out.print("Close"); }//line n2
	
	public void open () {
	System.out.print("Open");
	}
	}
public class Examp51 {

	public static void main(String[] args) throws Exception {
		try (Folder f = new Folder()) { 
			f.open();
		}
	}
}

//      A. Replace line n1 with: class Folder implements AutoCloseable {
// ���� : E. At line n2, insert: public void close () throws IOException { System.out.print("Close"); }