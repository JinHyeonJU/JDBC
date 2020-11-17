package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil4 {
	static {
		//����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//Connection ��ü�� �����ϴ� �޼ҵ�
	public static Connection getConnection() {
		Connection con = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:12345";
			String user = "JAVADB";
			String password = "12345";
			
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}