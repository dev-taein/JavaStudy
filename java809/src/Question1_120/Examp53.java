package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp53 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		String query = "SELECT eid FROM employee";
		try(Statement stmt = conn.createStatement()) {
		ResultSet rs = stmt.executeQuery(query);    
		stmt.executeQuery("SELECT id FROM Customer");  //ResultSet�� ������ �ʾ� ���ܰ� �߻��մϴ�. stmt.executeQuery�� 13 �࿡�� ȣ��Ǹ� �ڵ����� �����ϴ�.
		//�� ������ �ּ�ó���ϸ� employee ������ ����
		while (rs.next()) {
		 //process the results
		System.out.println("Employee ID: "+ rs.getInt("eid"));
		}
		
		} catch (Exception e) {
		System.out.println ("Error");
		}
		
	}

}                   
//                  ���� : The program prints Error.    --------stmt.executeQuery("SELECT id FROM Customer"); �϶� ����
//			rs = stmt.executeQuery("SELECT id FROM Customer"); -----------�϶��� ���������� ��µǰ� ���� B. The program prints customer IDs.
//                       ResultSet not open                 