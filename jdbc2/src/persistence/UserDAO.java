package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static persistence.JDBCUtil.*; //JDBCUtil클래스가 모두 static 이여야 가능

import domain.UserVO;

public class UserDAO {
	
	Connection con;
	
	public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//개별 조회 메소드
	public UserVO getRow(int no) {
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		UserVO vo = null;
		try {
			String sql = "select * from userTBL where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) { //하나만 나오니 if문
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
	
	//전체 조회 메소드
	public List<UserVO> getList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		
		try {
			// select : 여러 행의 결과가 출력(ArrayList)되는 것인지 or 하나의 행만
			// 출력(~~VO)되는 것인지에 따라 담을 객체가 결정
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
	//삭제 메소드
	public boolean deleteUser(int no) {
		PreparedStatement pstmt=null;
		boolean flag = false; //실패한다면 flag는 false
		
		try {
			//String sql = "delete from userTBL where no="+no;
			//no를 바꿔버릴 해킹위험이 있어서 아래처럼 ?를 사용한다.
			
			
			String sql = "delete from userTBL where no=?";
			pstmt = con.prepareStatement(sql); //sql문에 대해서 분석
			pstmt.setInt(1, no); //1 =>1번물음표에  no넣어달라는 뜻
			int result = pstmt.executeUpdate();
			
			if(result>0) { //삭제성공
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);		
		}
		return flag;
	}
	//수정 메소드
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
	//삽입 메소드
		public boolean insertUser(UserVO vo) {
		PreparedStatement pstmt =null;
		boolean flag = false;
		try {
			String sql = "insert into userTBL values (userTBL_seq.nextval,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getUserName()); //1번물음표에 getUserName값을 대입해달라는 뜻
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
