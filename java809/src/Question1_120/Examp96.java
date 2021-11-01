package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Examp96 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "userName");
			prop.put("password", "passWord");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			if(conn != null) {
				System.out.println("Connection Established");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//	C. The program prints Connection Established.

}
/*Properties Ŭ������ Hashtables�� ���� Ŭ�����̴�.
Hashtables�� ��� �޾ұ� ������ Map�� �Ӽ� ��, Key�� Value�� ���´�.
HashMap�� ū ���̰� ������, Properties Ŭ������ ���� ������� �����Ѵ�.
key=value �������� �ۼ� �� ������ key�� value �� ������ ������ �� �����ϴ�.


*/
