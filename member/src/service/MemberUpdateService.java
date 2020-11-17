package service;

import java.sql.Connection;

import domain.MemberVO;
import persistence.JDBCUtil;
import persistence.MemberDAO;

public class MemberUpdateService {
	 // MemberUpdate(MemberVO updateMember) �� ȣ���Ͽ� �۾� ����� �����ޱ�
	public boolean update(MemberVO updateMember) {
		//MemberDAO ��ü �����ϱ�
		Connection con = JDBCUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		//DAO�� memberUpdate ȣ�� => 1(����), 0(����)
		int result = dao.memberUpdate(updateMember);
		
		//DB�۾������ ���� ���� ����
		boolean updateFlag = false;
		
		if(result>0) {
			//commit
			JDBCUtil.commit(con);
			//return �� true�� ����
			updateFlag = true;
		}else {
			//rollback
			JDBCUtil.rollback(con);
		}
		return updateFlag;
	}
}
