package service;

import static persistence.JDBCUtil.*;

import java.sql.Connection;

import domain.MemberVO;
import persistence.MemberDAO;

public class MemberAddService {
	public boolean addMember(MemberVO vo) {
		boolean isAddSuccess = false;
		
		/* Member�� �Է��ϴ� DAO ȣ���Ͽ� DB�۾��ϱ�
		   �۾��Ϸ� �� �ᰡ�� Action �� return */
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
