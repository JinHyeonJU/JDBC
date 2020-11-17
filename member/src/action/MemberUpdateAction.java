package action;

import java.util.Scanner;

import domain.MemberVO;
import service.MemberUpdateService;
import ui.MemberConsoleUtil;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		MemberConsoleUtil util = new MemberConsoleUtil();
		MemberVO updateMember = util.printUpdateMessage(sc);
		
		// MemberUpdateService ��ü ���� �� �޼ҵ� ȣ��
		MemberUpdateService service = new MemberUpdateService();
		// public boolean update(MemberVO updateMember)
		boolean updateFlag = service.update(updateMember);
		
		//���� ��� ����ϱ�
		util.printUpdateSuccessFail(updateFlag);
	}
}
