package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp197 {

	public static void main(String[] args)   {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");){
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);//Ŀ���̵����//���������� ���
			ResultSet rs = stmt.executeQuery("SELECT emp_id, emp_name FROM employee1");
				rs.absolute(-2);//line n1    �̵��� ���
				rs.moveToInsertRow(); //moveToInsertRow() : Cursor ��ġ�� ���� ����
				rs.updateInt(1, 104); // �� �̸��� ������ ��� ������ ���� int ������ ������Ʈ�մϴ�. ---1���� 104�� �ٲ�
				rs.updateString(2, "Michael"); // �� �̸��� ������ ��� ������ ���� String ������ ������Ʈ�մϴ�. --2���� ���ڿ��� �ٲ�
				rs.insertRow();  //insertRow() : Cursor ��ġ�� ���� �����ϴ� �޼ҵ�
				rs.moveToCurrentRow(); //moveToCurrentRow(): Ŀ���� ������ ���� ��ġ�� �̵�. moveToInsertRow() �޼��带 ����ؼ� ���� ���� �̵��� �� �� ������ �� ����� �� �ִ�.
				System.out.println("Employee Id:" + rs.getInt(1) + ", Employee Name: " + rs.getString(2));
			} catch (SQLException e) {
				System.out.println("error");
			}
		
		}
	}

			//�� : D. A new record is inserted and Employee Id: 104, Employee Name: Michael is displayed.





//����Ÿ �߰� ------------------------------------------------------
//rs.moveToInsertRow();
//rs.updateInt (1, 1001);
//rs.updateString (2, "JUNG");
//rs.insertRow();
//
//rs.moveToInsertRow();
//rs.updateInt (1, 1002);
//rs.updateString (2, "PARK");
//rs.insertRow();
// 
//rs.close ();
////------------------------------------------------------------------



//moveToInsertRow �޼ҵ带 ȣ���Ͽ� ������ ���� �ۼ��Ͻʽÿ�. ResultSet �ܺ��� ���ۿ� ���� �ۼ��˴ϴ�.
//ResultSet �������̽��� moveToInsertRow () �޼ҵ�� ���� ���ڵ带 �����ؾ��ϴ� ��ġ�� Ŀ���� Ž���մϴ�. ������ ����� ����Ͽ� ���� �����Ϸ��� Ŀ���� ������ ��ġ�� �̵��Ͻʽÿ�.
//���� ���۰� �̹� ������ ������ ��� ���� ���ۿ��� ���ŵ˴ϴ�.
//

//absolute(int i)  boolean  ����� ��쿡�� Before the first row�� ��������, 
//������ ��쿡�� After the first row�� �������� �Ͽ� ������ ������ �̵�. �� ���� 1 Ȥ�� -1 ���� �����Ѵ�. 
//���(+) = Before the first row =ù ��° �� ��
//����(-) = After the first row = ù ���� �� ����
//�� ���� �����̸� Ŀ���� ResultSet�� ������ ����� �� ����ŭ �̵��Ͽ� ��ġ�մϴ�. 
//������ ���� -1, ���������� �� ��° ���� -2 ������ ��ȣ�� �����˴ϴ�. �� ���� ������ ������ ResultSet�� �� ���� ���� ��� �� �޼ҵ�� beforeFirst�� ���� ������� �۵��մϴ�.


//rs.moveToInsertRow();
//rs.updateInt("ID", id);
//rs.updateString("First_Name", "Ishant");
//rs.updateString("Last_Name", "Sharma");
//rs.updateDate("Date_Of_Birth", new Date(904694400000L));
//rs.updateString("Place_Of_Birth", "Delhi");
//rs.updateString("Country", "India");
//rs.insertRow();

// 171�� ������ ��