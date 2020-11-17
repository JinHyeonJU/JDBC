package service;

import domain.UserVO;
import persistence.UserDAO;

import static persistence.JDBCUtil.*;

import java.sql.Connection;

public class UserRowService {
	public UserVO getUserRow(int no) {
		// UserDAO�� getRow() ȣ���Ͽ� ��� ���۹ޱ�
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		UserVO vo = dao.getRow(no);
		
		close(con);
		
		//���۹��� ����� UserRowAction �Ѱ��ֱ�
		return vo;
	}
}
