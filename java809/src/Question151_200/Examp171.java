package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp171 {

	public static void main(String[] args) {
//		player table
//		pid  pname
//		1	 Dave
//		2	 Jack
//		3	 Sam
		
		try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		Statement st= conn.createStatement(
		ResultSet.TYPE_SCROLL_SENSITIVE,//Ŀ���̵����
		ResultSet.CONCUR_UPDATABLE);//���������� ���
		st.execute ("SELECT * FROM Player");
		st.setMaxRows(2);  //�ִ� ���,, �ƹ��� ���� ����,, while���ȿ� �־ ȿ������
		ResultSet rs = st.getResultSet();
//		rs.absolute(3); // �̵��� ���  ,, while�� �ȿ� �־�� ȿ������.
		while (rs.next ()) {
		rs.absolute(3); // ��ȿ��,,, 3������ �̵��Ͽ� 3 Sam�� ����ϰ� �ȴ�.
		System.out.println(rs.getInt(1) + " " + rs.getString(2));//���ڰ� ����ȣ�� ����Ų�� //1���� int���̱� ������ getInt(1)�� �޾ƾ��Ѵ�.
//		getString("pname")); // �̷��� ���̸��� �־ ���� ����
		} 
		}catch (SQLException ex) {
		System.out.print("SQLException is thrown.");
		
		//�� : D. SQLException is thrown.  
		//rs.absolute(3);�� while�� �ۿ� �־ ����  D. SQLException is thrown.  
		// while���ȿ� �����Ѵٸ� ���� C. 3 Sam
		}
	}
}


/*
 CONCUR_UPDATABLE: Ŀ���� ��ġ���� ���� ������Ʈ ����.ResultSet�� �����ϰ� �ִ� ���ڵ���� ���� �����ؾ� �� ���.)Resultset Object�� ������ ����)

CONCUR_READ_ONLY: Ŀ���� ��ġ���� ���� ������Ʈ �Ұ�.ResultSet�� �����ϰ� �ִ� ���ڵ���� �б� �������� ����.(Resultset Object�� ������ �Ұ���)

TYPE_FORWARD_ONLY: SCROLL�� �Ұ����� forward only���� ���� 

TYPE_SCROLL_INSENSITIVES�� SCROLL�����ϳ� ����� ������ ������� ����(�����, ��ũ�� �� ������Ʈ �ݿ�����)

TYPE_SCROLL_SENSITIVE��  SCROLL�����ϸ鼭 ����� ���׵� ����� (����� ��ũ�ѽ� ������Ʈ �ݿ�)

setMaxRows()�ִ� �� ���� ��Ÿ���� int�̸�, ������ ���� ��쿡�� 0�Դϴ�.�� setMaxRows �޼���� ���� ��ũ�� ���� Ŀ������ �ƹ��� ������ ���� �ʽ��ϴ�.

absolute(int i):�̵��� �� ��ȣ�� ��Ÿ���� int�Դϴ�. ���, ���� �Ǵ� 0�� �� �ֽ��ϴ�.

getInt(int)	�� SQLServerResultSet ��ü�� ���� �࿡�� ������ �� �ε����� ���� Java ���α׷��� ����� int�� �˻��մϴ�.

getString(int)	�Ű� ���� �ε����� ������ ��� ������ �Ű� ������ ���� Java ���α׷��� ����� ���ڿ��� �˻��մϴ�
*/





/*
previous():Cursor�� ���� Row�� �̵� 

first():Cursor�� ResultSet�� ó������ �̵� 

last():Cursor�� ResultSet�� ���������� �̵� 

isFirst():���� Cursor�� ù Row������ Ȯ�� 

isLast():���� Cursor�� ������ Row������ Ȯ�� 

getType():ResultSet�� Type�� Return 

getCucurrency():Concurrency�� Type�� Return 

getRow():���� Cursor�� ����Ű�� �ִ� Row Number 

beforeFirst():Before the first row�� �̵� 

afterLast():After the last row�� �̵� 

relative(int i):���� ��ġ���� i��ŭ �̵� i���� �����̸� ���� �̵��ϰ� ����̸� �Ʒ��� �̵� 

197�� �� ��
*/