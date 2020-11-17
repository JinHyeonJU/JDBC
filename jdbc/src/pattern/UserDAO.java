package pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserDAO {

	//����̹� �ε�
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Connection ��ü�� �������ִ� �޼ҵ�
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="javaDB";
			String password="12345";
			
			con=DriverManager.getConnection(url, user, password);
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
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//��ȸ �޼ҵ�
	public List<UserVO> getList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
			con = getConnection();
			// select : ���� ���� ����� ���(ArrayList)�Ǵ� ������ or �ϳ��� �ุ
			// ���(~~VO)�Ǵ� �������� ���� ���� ��ü�� ����
			String sql = "select * from userTBL";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) { //
				UserVO user = new UserVO();
				user.setNo(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setBiryhYear(rs.getInt("birthYear"));
				user.setAddr(rs.getString("addr"));
				user.setMobile(rs.getString("mobile"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
			close(con);
		}
		return list;
	}
	//���� �޼ҵ�
	public boolean deleteUser(int no) {
		Connection con=null;
		PreparedStatement pstmt=null;
		boolean flag = false; //�����Ѵٸ� flag�� false
		
		try {
			con = getConnection();
			//String sql = "delete from userTBL where no="+no;
			//no�� �ٲ���� ��ŷ������ �־ �Ʒ�ó�� ?�� ����Ѵ�.
			
			
			String sql = "delete from userTBL where no=?";
			pstmt = con.prepareStatement(sql); //sql���� ���ؼ� �м�
			pstmt.setInt(1, no); //1 =>1������ǥ��  no�־�޶�� ��
			int result = pstmt.executeUpdate();
			
			if(result>0) { //��������
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(con);
		return flag;
		}
	}
	//���� �޼ҵ�
		public boolean updateUser(String addr, int no) {
			boolean flag = false;
			Connection con = null;
			PreparedStatement pstmt =null;
			
			
			try {
				con = getConnection();
				String sql = "update userTBL set addr=? where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, addr);
				pstmt.setInt(2, no);
				int result = pstmt.executeUpdate();
				if(result>0) {
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(pstmt);
				close(con);
			}
			return flag;
		}
	//���� �޼ҵ�
		public boolean insertUser(UserVO vo) {
		Connection con = null;
		PreparedStatement pstmt =null;
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "insert into userTBL values (userTBL_seq.nextval,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getUserName()); //1������ǥ�� getUserName���� �����ش޶�� ��
			pstmt.setInt(2, vo.getBiryhYear());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getMobile());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(con);
		}
		return flag;
		}
}