package service;

import static persistence.JDBCUtil.*;

import java.sql.Connection;

import persistence.MemberDAO;

public class MemberRemoveService {
	// DAO�� memberRemove(int id)�� ������ ��
	// ����� �����ޱ�
	// �������� ����� Action �ѱ��

	public boolean member_Remove(int id) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		int result = dao.memberRemove(id);
		boolean isRemoveSuccess=false;
		if(result>0) {
			commit(con);
			isRemoveSuccess=true;
		}else {
			rollback(con);
		}
		close(con);
		return isRemoveSuccess;
	}
}
