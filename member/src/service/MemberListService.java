package service;

import static persistence.JDBCUtil.close;
import static persistence.JDBCUtil.*;

import java.sql.Connection;
import java.util.List;

import domain.MemberVO;

import persistence.MemberDAO;

public class MemberListService {
	// DAO�� memberList() ȣ���ؼ� ListAction ���� �ѱ��
	// return dao.memberList();
	public List<MemberVO> getList() {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		List<MemberVO> list = dao.memberList();
		
		close(con);
		
		return list;
	}
}
