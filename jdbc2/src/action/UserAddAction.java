package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserAddService;
import ui.ConsoleUtil;

public class UserAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		ConsoleUtil console = new ConsoleUtil();
		
		//�߰��� ȸ������ ��������
		UserVO user = console.getNewUser(sc);
		
		//ȸ������ Service ��ü�� �ѱ��
		UserAddService service = new UserAddService();
		boolean isAddSuccess = service.addUser(user);
		
		//�������� ���� ��� �޽��� ���
		if(isAddSuccess) {
			console.printAddSuccessMessage(user);
		}else {
			console.printAddFailMessage(user);
		}
	}
}
