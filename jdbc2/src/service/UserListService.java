package service;

import static persistence.JDBCUtil.close;
import static persistence.JDBCUtil.getConnection;

import java.sql.Connection;
import java.util.List;

import domain.UserVO;
import persistence.UserDAO;
public class UserListService {
	//dao.getList() ����� �޾Ƽ� UserListAction���� �ѱ��
	public List<UserVO> getUserList(){
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		List<UserVO> list = dao.getList();
		
		close(con);
		return list;
	}
}
