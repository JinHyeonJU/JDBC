package service;

import static persistence.JDBCUtil.*;

import persistence.UserDAO;

import java.sql.Connection;

public class UserRemoveService {
	public boolean userRemove(int no) {
		/* 삭제할 사용자의 번호를 DAO에 넘겨
		삭제한 후 결과전송받기 */
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.deleteUser(no)) {
			commit(con);
			return true;
		} else {
			rollback(con);
			return false;
		}
	}
}
