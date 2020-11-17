package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil4 {
	static {
		//드라이버 로드
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//Connection 객체를 생성하는 메소드
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