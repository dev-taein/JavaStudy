package Question201_248;

import java.io.IOException;
//"final" Ŭ������ ����� ���� ��ŵ�ϴ�.
//"final" �̶�� ���� ���� Ŭ������ �޼ҵ�� ��Ӱ� �������̵尡 ������ �Ǳ� �����Դϴ�. 
final class Folder implements AutoCloseable { //line n1
	//line n2
	public void close () throws IOException {
		System.out.print("Close");
		}
	public void open () {
	System.out.print("Open");
	}
	}
public class Examp233 {

	public static void main(String[] args) throws Exception {
		 try (Folder f = new Folder()) { 
			 f.open();
		 }
	}
}
//Open Close?
//Which two modifications enable the code to print



//A. Replace class Folder implements AutoCloseable { line n1 with:
//	E. At line n2, insert: public void close () throws IOException { System.out.print("Close");



//https://www.briefmenow.org/oracle/which-two-modifications-enable-the-code-to-print-open-close/