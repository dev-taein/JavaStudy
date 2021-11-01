package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp199 {

	public static void main(String[] args)  {
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
				//line n1
//			ResultSetMetaData rsmd = rs.getMetaData(); int totRows = rsmd.getColumnCount(); //���� �����˷���
//			A. ResultSetMetaData rsmd = rs.getMetaData(); int totRows = rsmd.getRowCount();getRowCount() �޼ҵ�� ����
			int totRows=0; while(rs.next()){ totRows++; } // 3�� ���
			System.out.println(totRows);
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
//Which code fragment, inserted at Line n1, helps you determine the number of records in ResultSet?
//n1 �࿡ ���� �� �ڵ� ������ ResultSet�� ���ڵ� ���� �����ϴ� �� �����̵˴ϱ�? 
//���ڵ�=��


//		�� : B. int totRows=0; while(rs.next()){ totRows++; }


/*
CONCUR_UPDATABLE: Ŀ���� ��ġ���� ���� ������Ʈ ����.ResultSet�� �����ϰ� �ִ� ���ڵ���� ���� �����ؾ� �� ���.)Resultset Object�� ������ ����)

CONCUR_READ_ONLY: Ŀ���� ��ġ���� ���� ������Ʈ �Ұ�.ResultSet�� �����ϰ� �ִ� ���ڵ���� �б� �������� ����.(Resultset Object�� ������ �Ұ���)

TYPE_FORWARD_ONLY: SCROLL�� �Ұ����� forward only���� ���� 

TYPE_SCROLL_INSENSITIVES�� SCROLL�����ϳ� ����� ������ ������� ����(�����, ��ũ�� �� ������Ʈ �ݿ�����)

TYPE_SCROLL_SENSITIVE��  SCROLL�����ϸ鼭 ����� ���׵� ����� (����� ��ũ�ѽ� ������Ʈ �ݿ�)
*/