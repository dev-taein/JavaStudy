package Question1_120;

class ImageScanner implements AutoCloseable {
	public void close () throws Exception {
		System.out.println ("Scanner closed.");
	}
	public void scanImage () throws Exception {
		System.out.print ("Scan.");
		throw new Exception("Unable to scan.");
	}
}

class ImagePrinter implements AutoCloseable {
	public void close () throws Exception {
		System.out.print ("Printer closed.");
	}
	public void printImage () {System.out.print("Print."); }
}

public class Examp28 {

	public static void main(String[] args) {
		try (ImageScanner ir = new ImageScanner();
				ImagePrinter iw = new ImagePrinter()) {
				ir.scanImage();
				iw.printImage();
				} catch (Exception e) {
				System.out.print(e.getMessage());
				}
	}

}

//
//ir.scanImage ()�� 'Scan'�� �μ��մϴ�. �׷� ���� ���ܰ� �߻��մϴ�.
//�׸��� �� Ŭ���� ��� �ڵ� ���� �� �ֱ� ������ �� close () �޼��尡 ��� ȣ������� �ݴ� ������ ȣ��ǰ�
//�׷��� iw.close ()�� ȣ��ǰ� ir.close ()
//���������� ���� �޽����� �μ�˴ϴ�.
