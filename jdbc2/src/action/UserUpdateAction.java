package action;

import java.util.Scanner;

import domain.UserVO;
import service.UserUpdateService;
import ui.ConsoleUtil;

public class UserUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		
		//수정할 정보 입력받은 후 서비스에 넘겨서 수정 결과 받기
		ConsoleUtil console = new ConsoleUtil();
		UserVO updateUser = console.printUpdateMassage(sc);
		
		UserUpdateService service = new UserUpdateService();
		boolean updateSuccess = service.userUpdate(updateUser);
		
		if(updateSuccess) {
			console.printUpdateSuccessMessage();
		}else {
			console.printUpdateFailMessage();
		}
	}

}
