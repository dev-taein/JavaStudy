package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp71_1 {

	public static void main(String[] args) {
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT*FROM Employee1");
			ResultSet rs = st.getResultSet();
			while (rs.next()) { //Ŀ���� �ϳ��� �̵�.
			if (rs.getInt(1) == 100) {
			rs.updateString(2, "Jack"); 
//			rs.updateRow(); //������ ���� ����
			}
			}
			rs.absolute(2);   //Cursor�� ���ϴ� ������ �̵��ϴ� �޼�
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}catch (SQLException ex) {
					System.out.println("Exception is raised");
			 } 
			
	}

}
//=> ResultSet.TYPE_FORWARD_ONLY : Cursor�� �Ʒ��θ� �̵�(�⺻)
		// => ResultSet.TYPE_SCROLL_INSENSITIVE : Cursor�� ���ϴ� ������ �̵� - �� ���� �̹ݿ�
		// => ResultSet.TYPE_SCROLL_SENSITIVE : Cursor�� ���ϴ� ������ �̵� - �� ���� �ݿ�
		//resultSetConcurrency : Cursor ��ġ�� �� ���� ������ �����ϴ� �Ķ����
		// => ResultSet.CONCUR_READ_ONLY : �� ���� �Ұ���(�⺻)
		// => ResultSet.CONCUR_UPDATABLE : �� ���� ����