package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUtil {
	// Step 1: ����̹� �ε�
	static {
		try {
			Class.forName("oracle.jdbc.OracleDrvier");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Connection ��ü�� �������ִ� �޼ҵ�
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "JAVADB";
			String password = "12345";
			
			con = DriverManager.getConnection(url, user, password);
			//auto commit stop
			con.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//��ü ���� ���� �޼ҵ�
	public static void close(Connection con) {
		try {
			con.close();
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}