package action;

import java.util.Scanner;

import domain.MemberVO;
import service.MemberAddService;
import ui.MemberConsoleUtil;

public class MemberAddAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		/* 사용자로부터 입력받기 - MemberConsoleUtil 의 getAddMember()
		 * getAddMember()메소드를 불러와야되니 객체 무조건 생성 */
		MemberConsoleUtil console = new MemberConsoleUtil();
		MemberVO vo = console.getAddMember(sc);

		/*  입력받은 객체를 Service로 넘겨서 DB처리를 한 후 결과를 전송받아 */
		MemberAddService service = new MemberAddService();
		if (service.addMember(vo)) {  //입력받은 vo 를 넘기기 
			/*  성공한 경우 메세지 출력 - MemberConsoleUtil 의 printAddSuccessMessage() */
			console.printAddSuccessMessage(vo.getName());
		}
	}
}
