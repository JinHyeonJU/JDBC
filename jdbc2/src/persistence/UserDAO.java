package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static persistence.JDBCUtil.*; //JDBCUtilŬ������ ��� static �̿��� ����

import domain.UserVO;

public class UserDAO {
	
	Connection con;
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//���� ��ȸ �޼ҵ�
	public UserVO getRow(int no) {
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		UserVO vo = null;
		try {
			String sql = "select * from userTBL where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) { //�ϳ��� ������ if��
				vo = new UserVO();
				vo.setNo(rs.getInt("no"));
				vo.setUserName(rs.getString("userName"));
				vo.setBiryhYear(rs.getInt("birthYear"));
				vo.setAddr(rs.getString("addr"));
				vo.setMobile(rs.getString("mobile"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
		
	}
	
	//��ü ��ȸ �޼ҵ�
	public List<UserVO> getList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
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
		}
		return list;
	}
	//���� �޼ҵ�
	public boolean deleteUser(int no) {
		PreparedStatement pstmt=null;
		boolean flag = false; //�����Ѵٸ� flag�� false
		
		try {
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
		}
		return flag;
	}
	//���� �޼ҵ�
		public boolean updateUser(String addr, int no) {
			boolean flag = false;
			PreparedStatement pstmt =null;
			
			
			try {
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
			}
			return flag;
		}
	//���� �޼ҵ�
		public boolean insertUser(UserVO vo) {
		PreparedStatement pstmt =null;
		boolean flag = false;
		try {
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
		}
		return flag;
		}
}
