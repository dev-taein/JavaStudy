package examp01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInterface {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		JDBC�� ����� �� ������ �ƴ� �������̽��� �۾��մϴ�. �̷��� ������ JDBC ����̹����� �����˴ϴ�.
//����̹��� Ư�� �����ͺ��̽��� ����ϴ� ����� �˰��ִ� Ŭ�������ִ� JAR �����Դϴ�. ���� ��� MySQL�� ��� mysql-connector-java-XXX.jar, ���⼭ XXX�� �����ͺ��̽� �����Դϴ�.
//		4���� �ֿ� �������̽�
//		java.sql.Driver
//		��� JDBC ����̹��� �����ͺ��̽��� �����ϴ� ����� �˱� ������ �������̽��� �����ؾ��մϴ�.
//		java.sql.Connection
//		������ �����ͺ��̽��� ���� ������ ���, ���� �����, ������ �����ϴ� ����� �����մϴ�.
//		java.sql.Statement
//		������ SQL ���� �����ϰ� ����� ��ȯ�ϴ� �� ���˴ϴ�.
//		java.sql.ResultSet
//		������ ���� ����� �˻��ϰ� ������Ʈ�ϴ� �� ���˴ϴ�.
		
//		�����ͺ��̽��� ����
//	 	����̹��� �ε�Ǹ� static������� �����ͺ��̽��� ���� �� �� �ִ�. DriverManager.getConnection()
//		Connection getConnection(String url)
//		Connection getConnection(String url,
//		                         Properties info)
//		Connection getConnection(String url,
//		                         String user,
//		                         String passw)
//		JDBC URL ����
//		1. �������� (�׻� ����)
//		2. ���� �������� (��κ��� ��� �����ͺ��̽� �̸� / ����̹� ����)
//		jdbc:mysql://host:3306/db
//		3. �����ͺ��̽� Ư�� ���� �Ӽ� (��κ��� ��� // SERVER : HOST / DATABASE_NAME ������ �����ͺ��̽� ��ġ)	
		
//		������ �� ���� URL ���Դϴ�.
//		jdbc:postgresql://localhost/test
//		jdbc:sqlserver://localhost\SQLEXPRESS;databasename=db
//		jdbc:derby:db;create=true
		
//		�� �ּ� 
//		"jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234"
		
//		Connection��ü �� ��� ������ �޼ҵ带 ȣ���Ͽ� �����ͺ��̽��� ������ �� �ֽ��ϴ� .
//		Properties props = new Properties();
//		props.put("user", "db_user");
//		props.put("password", "db_p4assw0rd");
//		Connection con =
//		    DriverManager.getConnection("jdbc:mysql://localhost/db",
//		                                props);
//		�Ǵ�:
//
//			Connection con =
//			    DriverManager.getConnection("jdbc:mysql://localhost/db",
//			                                "db_user",
//			                                "db_p4assw0rd");
//		Connection con =
//		    DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC\", \"root\", \"a1234\"");
//		Connection�� AutoCloseable�� ���� �ϱ� ������ try-with-resources ������ �ڵ����� close()�����ش�.
//		String url = "jdbc:mysql://localhost/db";
//		String user = "db_user";
//		String passw = " db_p4assw0rd";
//
//		try(Connection con =
//		        DriverManager.getConnection(url, user, passw)) {
//		    // Database operations
//		} catch(SQLException e) {
//		    System.out.format("%d-%s-%s",
//		                      e.getErrorCode(),
//		                      e.getSQLState(),
//		                      e.getMessage());
//		}
		
		
		
//		���� ����
//		�� ���� Statement�������̽��� �ֽ��ϴ�.
//
//		java.sql.Statement
//		�Ű� �������� �����ͺ��̽��� ���� ������ SQL ���� ��Ÿ���ϴ�.
//		java.sql.PreparedStatement
//		��ɹ��� ���� �� ȿ�������� �����ϱ� ���� ���� ������ �� SQL ���� ��Ÿ���ϴ�. �Է� �Ű� ������ �޾� ���� �� �ֽ��ϴ�.
//		java.sql.CallableStatement
//		���� ���� ������ �����ϴ� �� ���˴ϴ�. �Է� �� ��� �Ű� ���������� �� �ֽ��ϴ�.
		

//createStatement () �޼��带 ����Ͽ� Connection ��ü���� Statement�� ������ �� �ֽ��ϴ�.
//		Statement createStatement()
//		Statement createStatement(int resultSetType,
//		                          int resultSetConcurrency)
//		resultSetType  modes :
//		ResultSet.TYPE_FORWARD_ONLY
//		�̰��� �⺻ �����Դϴ�. ������ ��� �˻��� ������� ����� �� ���� �˻� �� �� �ֽ��ϴ�.
//		ResultSet.TYPE_SCROLL_INSENSITIVE
//		������ ��� ����� ���� �յڷ� �̵��� �� ������ ��� ������ Ư�� ��ġ�� �̵��� �� �ֽ��ϴ�.
//		ResultSet.TYPE_SCROLL_SENSITIVE
//		�����Ǹ� ��� ������ Ư�� ��ġ�� �յڷ� �̵��� ���� ������ �����͸� ����ϴ� ���� �׻� �ֽ� ���� ������ �� �� �ֽ��ϴ�. 
//		TYPE_SCROLL_INSENSITIVE�� ���� ���׿� "�ΰ�"���� �ʽ��ϴ�. ������.
		
		
//		resultSetConcurrency modes :
//		ResultSet.CONCUR_READ_ONLY
//		�̰��� �⺻ ����Դϴ�. ������ ��� ��� ������ ������Ʈ �� �� �����ϴ� (INSERT, UPDATE �Ǵ� DELETE �� ���)..
//		ResultSet.CONCUR_UPDATABLE
//		��� ������ ������Ʈ �� �� ������ ��Ÿ���ϴ�.
		
//		Statement stmt = con.createStatement();
//		 Statement��ü �� �����Ƿ� SQL ����� ������ ���ִ� �� ���� ����� �ֽ��ϴ�.
//
//		���					�����Ǵ� SQL ��				��ȯ ����
//		execute() :	SELECT INSERT UPDATE DELETE     CREATE	boolean( true�� SELECT, false������)
//		executeQuery() :		SELECT				ResultSet
//		executeUpdate()	:	INSERT UPDATEDELETE	    CREATE	�������޴� �� �� (0�� CREATE)
//		
	try(Connection con =
	      DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC\", \"root\", \"a1234\"");
	      Statement stmt = con.createStatement()) {
	   boolean hasResults = stmt.execute("SELECT * FROM user");
	   if(hasResults) {
	      // To retrieve the object with the results
	      ResultSet rs = stmt.getResultSet();
	   } else {
	      // To get the number of affected rows
	      int affectedRows = stmt.getUpdateCount();
	   }
	   ResultSet rs = stmt.executeQuery("SELECT * FROM user");
	   stmt.executeUpdate("INSERT INTO user(id, name) "
	        + "VALUES(1, 'George')"); // Returns 1
	   stmt.executeUpdate("UPDATE user SET name='Joe' "
	        + "WHERE id = 1"); // Returns 1
	   stmt.executeUpdate("DELETE FROM user "
	        + "WHERE id = 1"); // Returns 1
	} catch(SQLException e) {
	   e.printStackTrace();
	}
	
	
//	��� �б�
//	��ü�� ���� ���� ����Ű�� Ŀ���� �����ϸ� �� ���� �� �ุ ���� �� �ֽ��ϴ�.
//
//	ó������ Ŀ���� ù ��° �� �ٷ� �տ� �ֽ��ϴ�. next()�޼��带 ȣ���ϸ� Ŀ���� �� ��ġ ������ �̵��ϰ� true�����Ͱ� �ְų� ������ false������ ��� ��ȯ �˴ϴ� . 
//	�̷� ������ ��ü ��� ���տ� ���� ������ �ݺ� �� �� �ֽ��ϴ�.
	
	try(Connection con =
		      DriverManager.getConnection(url, user, passw);
		      Statement stmt = con.createStatement();
		      ResultSet rs =
		         stmt.executeQuery("SELECT * FROM user")) {
		   while(rs.next()) {
		      // Read row
		   }
		} catch(SQLException e) {
		   e.printStackTrace();
		}
	
//	ResultSet ������Ʈ�� ���� ���� ���� Statement ������Ʈ, Connection ������Ʈ�� ���ʷ� �����ϴ�.
//	ResultSet -> Statement -> Connection ������ ����
//	ResultSet�� ������ Statement ������Ʈ���� �ٸ� ResultSet�� ����� �� �ڵ����� �����ϴ�.
//	 Statement ������ ResultSet ������Ʈ�� �����ϴ�.
//	Connection ������ Statement �׸��� ResultSet ������.
	
	
//	�Ʒ� ��Ұ� ������ SqlException�� �߻��Ѵ�.
//	if(rs.next) {
//		   // Access the first element if there's any
//		}
//	 �����͸� �������� ResultSet���� ������ ������ ���� getter �޼��尡 �ֽ��ϴ�. ���� ��� ������ �����ϴ�.
//
//	getInt() returns an int
//	getLong() returns a Long
//	getString() returns a String
//	getObject() returns an Object
//	getDate() returns a java.sql.Date
//	getTime() returns a java.sql.Time
//	getTimeStamp() returns java.sql.Timestamp
	
//	�� ������� �� ���� ������ �ֽ��ϴ�.
	
	Result rs = stmt.executeQuery(
		      "SELECT id, name FROM user"
		);
		while(rs.next()) {
		   int id = rs.getInt("id"); //( ��� ���ڸ� ���� ���� ���� ).
		   String name = rs.getString("name");
		   // Do something
		}
//	�Ʒ��� ������.
	
		Result rs = stmt.executeQuery(
			      "SELECT id, name FROM user"
			);
			while(rs.next()) {
			   int id = rs.getInt(1);
			   String name = rs.getString(2);
			   // Do something
			}
//			�������� �ʴ� �� (�ε��� �Ǵ� �̸�����)�� �����ϸ�  SQLException�� �߻��մϴ�.
			
			Result rs = stmt.executeQuery(
				      "SELECT insertion_date FROM user"
				);
				while(rs.next()) {
				   // Getting the date part
				   java.sql.Date sqlDate = rs.getDate(1);
				   // Getting the time part
				   java.sql.Time sqlTime = rs.getTime(1);
				   // Getting both, the date and time part
				   java.sql.Timestamp sqlTimestamp =
				                        rs.getTimestamp(1);
				   // Converting date
				   LocalDate localDate = sqlDate.toLocalDate();
				   // Converting time
				   LocalTime localTime = sqlTime.toLocalTime();
				   // Converting timestamp
				   Instant instant = sqlTimestamp.toInstant();
				   LocalDateTime localDateTime =
				                sqlTimestamp.toLocalDateTime();
				}
			
//				Ŀ�� �̵������� ��ü �޼ҵ� ���
/*	boolean absolute(int row) Ŀ���� ��� ��Ʈ�� �־��� �� ��ȣ�� �̵��Ͽ� ó�� (�μ��� ����� ���) �Ǵ� �� (���� �� ���)���� ����մϴ�.
�μ��� 0�̸� Ŀ���� ù ��° �� ������ �̵��մϴ�.
Ŀ���� ��ȿ�� ��ġ�� �̵��ϸ� true�� ��ȯ�ϰ� Ŀ���� ù ��° �� ���̳� ������ �� �ڿ� ������ false�� ��ȯ�մϴ�

void afterLast()	������ �� �ڷ� Ŀ���� �̵��մϴ�.

void beforeFirst()	ù ��° �� ������ Ŀ���� �̵��մϴ�.

boolean first()	Ŀ���� ù ��° ������ �̵��մϴ�.
Ŀ���� ��ȿ�� �࿡ ������ true�� ��ȯ�ϰ� ��� ���տ� ���� ������ false�� ��ȯ�մϴ�.

boolean last()	Ŀ���� ������ ������ �̵��մϴ�.
Ŀ���� ��ȿ�� �࿡ ������ true�� ��ȯ�ϰ� ��� ���տ� ���� ������ false�� ��ȯ�մϴ�.

boolean next()	Ŀ���� ���� ������ �̵��մϴ�.
�� ���� ���� ��ȿ�ϸ� true�� ��ȯ�ϰ� �� �̻� ���� ������ false�� ��ȯ�մϴ�.

boolean previous()	Ŀ���� ���� ������ �̵��մϴ�.
�� ���� ���� ��ȿ�ϸ� true�� ��ȯ�ϰ� Ŀ���� ù ��° �� �տ� ������ false�� ��ȯ�մϴ�.

boolean relative(int rows)	Ŀ���� ��� �Ǵ� ������ ������� �� ����ŭ �̵��մϴ�.
��� ������ ù ��° / ������ ���� �Ѿ� �̵��ϸ� Ŀ���� ù ��° / ������ ���� �� / �ڿ� ��ġ�մϴ�.
Ŀ���� ��ȿ�� �࿡ ������ true�� ��ȯ�ϰ� �׷��� ������ false�� ��ȯ�մϴ�.
*/
				
//				table : 
//				ID	NAME	INSERTION_DATE
//				1	THOMAS	2016 / 03 / 01
//				2	LAURA	2016 / 03 / 01
//				3	MAX	2016 / 03 / 01
//				4	KIM	2016 / 03 / 01
				
			try(Connection con =
		    DriverManager.getConnection(
		                                 url, user, passw);
		    Statement stmt = con.createStatement(
		           ResultSet.TYPE_SCROLL_INSENSITIVE,
		           ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = stmt.executeQuery(
		                  "SELECT * FROM user")) {
		   System.out.println(rs.absolute(3)); // true
		   System.out.println(rs.getInt(1)); // 3
		   System.out.println(rs.absolute(-3)); // true  ,, -3�� �� �ڿ��� ���� 1,2,3 ��° id���� ��Ÿ��
		   System.out.println(rs.getInt(1)); // 2
		   System.out.println(rs.absolute(0)); // false ,, 0��° ID�࿡ Ŀ���� �ö�
		   System.out.println(rs.next()); // true ,, ���� Ŀ���� �̵� 
		   System.out.println(rs.getInt(1)); // 1
		   System.out.println(rs.previous()); // false  ,, Ŀ���� ���������� �̵�
		   System.out.println(rs.relative(2)); // true  ,, 2�ุŭ �̵�
		   System.out.println(rs.getInt(1)); // 2
		   System.out.println(rs.relative(0)); // true  ,, 0�ุŭ �̵�
		   System.out.println(rs.getInt(1)); // 2
		   System.out.println(rs.relative(10)); // false ,, 10�ุŭ �̵�
		   System.out.println(rs.previous()); // true  ,, ���������� �̵�
		   System.out.println(rs.getInt(1)); // 4
		} catch(SQLException e) {
		   e.printStackTrace();
		}		
				
				
	}

}
