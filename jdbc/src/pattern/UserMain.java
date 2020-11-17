package pattern;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		
		do {
		System.out.println("======= UserTBL =======");
		System.out.println("1. 조회");
		System.out.println("2. 삽입");
		System.out.println("3. 삭제");
		System.out.println("4. 수정");
		System.out.println("5. 프로그램 종료");
		System.out.println("=======================");
		
		System.out.print("번호 입력 :");
		
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			
			break;
		}
		}while(isStop);
		UserDAO dao = new UserDAO(); //객체생성

		
		switch(menu) {
		case 1:
			System.out.println("userTBL 전체 출력");
			List<UserVO> list = dao.getList();
			for(UserVO vo:list) {
				System.out.println(vo);
			}
			break;
		case 2:
			UserVO vo = new UserVO();
			System.out.println("생성할 회원 이름 입력 :");
			System.out.print("이름 : " );
			vo.setUserName(sc.next());
			
			System.out.println("생성할 회원 년도 입력 : ");
			vo.setBiryhYear(sc.nextInt());
			
			System.out.println("생성할 회원 주소 입력 :");
			vo.setAddr(sc.next());
			
			System.out.println("생성할 회원 전화번호 입력(-도 입력해주세요) :");
			vo.setMobile(sc.next());
			
			System.out.println(dao.insertUser(vo)?"생성 성공":"생성 실패");
			boolean flag = dao.insertUser(vo);
			break;
//			System.out.println("생성할 회원 이름 입력 :");
//			String username = sc.next();
//			uservo.setUserName(username);
//			System.out.println("생성할 회원 생년 입력 :");
//			int birthday = sc.nextInt();
//			uservo.setBiryhYear(birthday);
//			System.out.println("생성할 회원 주소 입력 :");
//			String addr = sc.next();
//			uservo.setAddr(addr);
//			System.out.println("생성할 회원 전화번호 입력(-도 입력해주세요) :");
//			String mobile = sc.next();
//			uservo.setMobile(mobile);
//			System.out.println(flag?"생성성공":"생성실패");

		case 3:
			System.out.print("삭제할 회원번호 입력 : ");
			int no = sc.nextInt(); //3
			flag=dao.deleteUser(no);
			System.out.println(flag?"삭제성공":"삭제실패");
			break;
		case 4:
			System.out.println("수정할 회원 정보 입력");
			System.out.println("수정할 회원번호 입력 : ");
			no = sc.nextInt();
			System.out.println("수정할 주소 입력 : ");
			String addr = sc.next();
			flag = dao.updateUser(addr, no);
			System.out.println(flag?"수정성공":"수정실패");
			break;
		}
	}
}
