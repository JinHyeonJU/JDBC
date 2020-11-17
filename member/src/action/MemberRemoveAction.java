package action;

import java.util.Scanner;

import service.MemberRemoveService;
import ui.MemberConsoleUtil;

public class MemberRemoveAction implements Action {

	
	@Override
	public void execute(Scanner sc) throws Exception {
		// 삭제할 회원 아이디를 입력하세요 라는 메세지를 보여주는
		// 메소드 호출 => ConsoleUtil에서 작성
		MemberConsoleUtil util = new MemberConsoleUtil();
		int id = util.printRemoveMember(sc);
		//리턴받은 아이디를 Service에게 넘겨서 삭제한 결과 전송받기
		MemberRemoveService service = new MemberRemoveService();
		//삭제결과에 따라 메시지(ConsoleUtil에서 작성) 출력하기
		if (service.member_Remove(id)) {
			util.printRemoveSuccessMessage();
		}else {
			util.printRemoveFailMessage();
		}
		
	}
}
