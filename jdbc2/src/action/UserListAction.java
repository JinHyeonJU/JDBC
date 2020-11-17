package action;

import java.util.List;
import java.util.Scanner;

import domain.UserVO;
import service.UserListService;
import ui.ConsoleUtil;

public class UserListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//UserListService �� getUserList() ȣ���ؼ� ��� ���۹ޱ�
		UserListService service = new UserListService();
		List<UserVO> userList = service.getUserList();
		
		//���� ����� ConsoleUtil �� �Ѱܼ� ����Ʈ ����ϱ�
		ConsoleUtil console = new ConsoleUtil();
		console.printUserList(userList);
	}

}
