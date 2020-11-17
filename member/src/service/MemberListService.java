package service;

import static persistence.JDBCUtil.close;
import static persistence.JDBCUtil.*;

import java.sql.Connection;
import java.util.List;

import domain.MemberVO;

import persistence.MemberDAO;

public class MemberListService {
	// DAO의 memberList() 호출해서 ListAction 으로 넘기기
	// return dao.memberList();
	public List<MemberVO> getList() {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		List<MemberVO> list = dao.memberList();
		
		close(con);
		
		return list;
	}
}
