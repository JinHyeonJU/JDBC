package action;

import java.util.Scanner;

import service.MemberRemoveService;
import ui.MemberConsoleUtil;

public class MemberRemoveAction implements Action {

	
	@Override
	public void execute(Scanner sc) throws Exception {
		// ������ ȸ�� ���̵� �Է��ϼ��� ��� �޼����� �����ִ�
		// �޼ҵ� ȣ�� => ConsoleUtil���� �ۼ�
		MemberConsoleUtil util = new MemberConsoleUtil();
		int id = util.printRemoveMember(sc);
		//���Ϲ��� ���̵� Service���� �Ѱܼ� ������ ��� ���۹ޱ�
		MemberRemoveService service = new MemberRemoveService();
		//��������� ���� �޽���(ConsoleUtil���� �ۼ�) ����ϱ�
		if (service.member_Remove(id)) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}
		
	}
}
