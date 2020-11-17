package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserRowService;
import ui.ConsoleUtil;

public class UserRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		/* ��ȸ�� ������� ��ȣ�� �Է¹޾� Service ��ü����
		�Ѱ��ֱ� */
		ConsoleUtil console = new ConsoleUtil();
		int no = console.printUserRow(sc);
		// �Է� ���� ��ȣ�� ���񽺷� �Ѱ��ֱ�
		UserRowService service = new UserRowService();
		UserVO user = service.getUserRow(no);
		
		// ��ȸ ����� Console�� �Ѱ� ȭ�� ���
		console.printUserDetail(user);
		
	}

}
