package action;

import java.util.List;
import java.util.Scanner;

import domain.MemberVO;
import service.MemberListService;
import ui.MemberConsoleUtil;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//ListService �޼ҵ� ȣ���ؼ� ��� �ޱ�
		MemberListService service = new MemberListService();
		List<MemberVO> memList= service.getList();
		
		//����� ���� List�� ȭ�鿡�� ����ϱ�
		MemberConsoleUtil console = new MemberConsoleUtil();
		console.printMemberList(memList);
	}
}
