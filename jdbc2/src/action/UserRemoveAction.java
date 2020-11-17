package action;

import java.util.Scanner;

import service.UserRemoveService;
import ui.ConsoleUtil;

public class UserRemoveAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// ������ ������� ��ȣ�� �Է¹ޱ�
		ConsoleUtil console = new ConsoleUtil();
		int no = console.printUserRow(sc);
		// �Է� ���� ��ȣ�� Service �ѱ��
		UserRemoveService service = new UserRemoveService();
		// DB ó�� ����� ���� �޼��� ���
		if(service.userRemove(no)) {
			console.printRemoveSuccessMessage();
		}else {
			console.printRemoveFailMessage();
		}
	
	}

}
