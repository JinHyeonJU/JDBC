package service;

import java.sql.Connection;

import domain.MemberVO;
import persistence.JDBCUtil;
import persistence.MemberDAO;

public class MemberUpdateService {
	 // MemberUpdate(MemberVO updateMember) 를 호출하여 작업 결과를 돌려받기
	public boolean update(MemberVO updateMember) {
		//MemberDAO 객체 생성하기
		Connection con = JDBCUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		//DAO의 memberUpdate 호출 => 1(성공), 0(실패)
		int result = dao.memberUpdate(updateMember);
		
		//DB작업결과를 담을 변수 선언
		boolean updateFlag = false;
		
		if(result>0) {
			//commit
			JDBCUtil.commit(con);
			//return 을 true로 변경
			updateFlag = true;
		}else {
			//rollback
			JDBCUtil.rollback(con);
		}
		return updateFlag;
	}
}
