package action;

import java.util.List;
import java.util.Scanner;

import domain.MemberVO;
import service.MemberListService;
import ui.MemberConsoleUtil;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//ListService 메소드 호출해서 결과 받기
		MemberListService service = new MemberListService();
		List<MemberVO> memList= service.getList();
		
		//결과로 받은 List를 화면에서 출력하기
		MemberConsoleUtil console = new MemberConsoleUtil();
		console.printMemberList(memList);
	}
}
