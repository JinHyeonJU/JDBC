package action;

import java.util.Scanner;

import domain.MemberVO;
import service.MemberAddService;
import ui.MemberConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		/* ����ڷκ��� �Է¹ޱ� - MemberConsoleUtil �� getAddMember()
		 * getAddMember()�޼ҵ带 �ҷ��;ߵǴ� ��ü ������ ���� */
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberVO vo = console.getAddMember(sc);

		/*  �Է¹��� ��ü�� Service�� �Ѱܼ� DBó���� �� �� ����� ���۹޾� */
		MemberAddService service = new MemberAddService();
		if (service.addMember(vo)) {  //�Է¹��� vo �� �ѱ�� 
			/*  ������ ��� �޼��� ��� - MemberConsoleUtil �� printAddSuccessMessage() */
			console.printAddSuccessMessage(vo.getName());
		}
	}
}
