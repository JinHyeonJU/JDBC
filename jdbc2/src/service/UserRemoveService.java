package service;

import static persistence.JDBCUtil.*;

import persistence.UserDAO;

import java.sql.Connection;

public class UserRemoveService {
	public boolean userRemove(int no) {
		/* ������ ������� ��ȣ�� DAO�� �Ѱ�
		������ �� ������۹ޱ� */
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
