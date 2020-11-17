package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserUpdateService;
import ui.ConsoleUtil;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		//������ ���� �Է¹��� �� ���񽺿� �Ѱܼ� ���� ��� �ޱ�
		ConsoleUtil console = new ConsoleUtil();
		UserVO updateUser = console.printUpdateMassage(sc);
		
		UserUpdateService service = new UserUpdateService();
		boolean updateSuccess = service.userUpdate(updateUser);
		
		if(updateSuccess) {
			console.printUpdateSuccessMessage();
		}else {
			console.printUpdateFailMessage();
		}
	}

}
