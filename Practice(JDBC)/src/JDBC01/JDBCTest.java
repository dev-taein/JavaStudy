package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			con.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ ã�� �� �����ϴ�"+cnfe.getMessage());
			// TODO: handle exception
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
//"jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234"
//                            �� ���̿� ����Ÿ���̽� �̸�
//"jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234"