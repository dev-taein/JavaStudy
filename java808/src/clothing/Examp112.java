package clothing;

interface Exportable2{
	void export(); //�������̽��� �߻� �޼���� �⺻�� abstrack public ��
}
class Tool2 implements Exportable2{
	  public void export() { //public�� ���� ������ public�̱� ������
		  System.out.println("Tool::export");
	}
}
class ReportToll2 extends Tool2 implements Exportable2{
	public void export() {
		System.out.println("RTool::export");
	}
}
public class Examp112 {

	public static void main(String[] args) {
		Tool2 aTool = new ReportToll2();
		Tool2 bTool = new Tool2();
		callExport(aTool);
		callExport(bTool);

	}
	public static void callExport(Exportable2 ex) {
		ex.export();
	}
}