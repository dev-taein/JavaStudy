package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp71 {

	public static void main(String[] args) {
		try{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		st.execute("SELECT * FROM Employee");
		ResultSet rs = st.getResultSet();
		while (rs.next()) {
		if (rs.getInt(1) == 112) {
		rs.updateString(2, "Jack"); //�� �۾��� ���õȴ�.
		}
		}
		rs.absolute(2);   //absolute(int row)	 ������ ��ġ�� Ŀ���� �̵��Ѵ�. --���⼭ 112,Jerry ������ �̵���	
		System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}catch (SQLException ex) {
				System.out.println("Exception is raised");
		 } //�� : C. The Employee table is not updated and the program prints: 112 Jerry
		//	Employee ���̺��� ������Ʈ���� �ʰ� ���α׷��� ������ �μ��մϴ�. 112 Jerry
		//���� : rs.updateRow()�� �����Ƿ� �����ͺ��̽��� ������Ʈ���� �����Ƿ��� ������ C �����մϴ�.
		// updateRow�� ���� Ŀ���� ��ġ�� ���� �ٲ�
		//  insertRow�� ���� Ŀ���� ��ġ�� ���ο� ���� �߰���
		
	}
}












/*
ResultSet.TYPE_FORWARD_ONLY
�̰��� �⺻ �����Դϴ�. ������ ��� �˻��� ������� ����� �� ���� �˻� �� �� �ֽ��ϴ�.
ResultSet.TYPE_SCROLL_INSENSITIVE
������ ��� ����� ���� �յڷ� �̵��� �� ������ ��� ������ Ư�� ��ġ�� �̵��� �� �ֽ��ϴ�.
ResultSet.TYPE_SCROLL_SENSITIVE
������ ��� ��� ������ Ư�� ��ġ�� �յڷ� �̵��� ���� ������ �����͸� ����ϴ� ���� �׻� �������� �ֽ� ���� ������ �� �� �ֽ��ϴ�. 
TYPE_SCROLL_INSENSITIVE�� ���� ���׿� "sensitive"���� �ʽ��ϴ�. ������.

�� ���� ���ü� ��尡 �ֽ��ϴ�.
ResultSet.CONCUR_READ_ONLY
�̰��� �⺻ ����Դϴ�. ������ ��� ��� ������ ������Ʈ �� �� �����ϴ� (INSERT, UPDATE �Ǵ� DELETE �� ���).
ResultSet.CONCUR_UPDATABLE
��� ������ ������Ʈ �� �� ������ ��Ÿ���ϴ�.
*/
//
//�������� �޼���� �� ���� ������� ����� �� �ֽ��ϴ�.
//
//���� ���� �� ���� ������Ʈ�մϴ�. ��ũ�� ������ ResultSet��ü���� Ŀ���� �յڷ�, ���� ��ġ �Ǵ� ���� �࿡ ������� ��ġ�� �̵��� �� �ֽ��ϴ�. ���� �ڵ� ���� NAME�� ResultSet��ü �� �ټ� ��° �࿡�ִ� �� �� ������Ʈ rs�� ���� �޼��� updateRow�� ����Ͽ� rs�Ļ� �� ������ ���� ���̺��� ������Ʈ�մϴ� .
//
//       rs.absolute (5); // Ŀ���� rs�� �ټ� ��° ������ �̵�
//       rs.updateString ( "�̸�", "AINSWORTH"); // ������Ʈ
//          // NAME5 ���� ���� ��AINSWORTH
//       rs.updateRow (); // ������ �ҽ��� ���� ������Ʈ�մϴ�.
//
// 
//�� ���� ���� �࿡ �����մϴ�. ������Ʈ �� ���ִ� ResultSet��ü���� ���� �� ���� �����ϱ����� �غ� ���� �������ϴ� Ư�� ���� ����Ǿ� �ֽ��ϴ�. ���� �ڵ� ������ Ŀ���� ���� ������ �̵��ϰ� 3 �� ���� ���� �� rs���� �޼��带 ����Ͽ� ������ �ҽ� ���̺� �����մϴ� insertRow.
//
//       rs.moveToInsertRow (); // Ŀ���� ���� ������ �̵�
//       rs.updateString (1, "AINSWORTH"); // ������Ʈ
//          // ���� ���� ù ��° ���� AINSWORTH
//       rs.updateInt (2,35); // �� ��° ���� 35
//       rs.updateBoolean (3, true); // �� ��° ����true
//       rs.insertRow ();
//       rs.moveToCurrentRow ();

