package clothing;
interface Exportable11{
	void export(); //�������̽��� �߻� �޼���� �⺻�� abstrack public ��
}
class Tool11 implements Exportable11{
	 public void export() { //public�� ���� ������ public�̱� ������
		// TODO Auto-generated method stub
		 System.out.println("Tool:export");
		
	}
}

public class Examp26 extends Tool11 implements Exportable11{
	 public void export() {
		// TODO Auto-generated method stub
		System.out.println("RTool::export");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool11 aTool = new Examp26();
		Tool11 bTool = new Tool11();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable11 ex) {
		ex.export();
	}
}
