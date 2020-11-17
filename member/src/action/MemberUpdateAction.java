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
		
		// MemberUpdateService 객체 생성 후 메소드 호출
		MemberUpdateService service = new MemberUpdateService();
		// public boolean update(MemberVO updateMember)
		boolean updateFlag = service.update(updateMember);
		
		//수정 결과 출력하기
		util.printUpdateSuccessFail(updateFlag);
	}
}
