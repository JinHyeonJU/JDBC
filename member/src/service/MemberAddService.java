package service;

import static persistence.JDBCUtil.*;

import java.sql.Connection;

import domain.MemberVO;
import persistence.MemberDAO;

public class MemberAddService {
	public boolean addMember(MemberVO vo) {
		boolean isAddSuccess = false;
		
		/* Member를 입력하는 DAO 호출하여 DB작업하기
		   작업완료 후 결가를 Action 에 return */
		Connection con = getConnection();
		MemberDAO dao =new MemberDAO(con);
		
		int addResult = dao.memberInsert(vo);
		
		if(addResult>0) {
			isAddSuccess=true;
			commit(con);
		} else {
			rollback(con);
		}
		
		close(con);
			
		return isAddSuccess;
	}
}
