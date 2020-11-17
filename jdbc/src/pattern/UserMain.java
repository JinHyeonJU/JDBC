package pattern;

import java.util.List;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		
		do {
		System.out.println("======= UserTBL =======");
		System.out.println("1. ��ȸ");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. ���α׷� ����");
		System.out.println("=======================");
		
		System.out.print("��ȣ �Է� :");
		
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
		UserDAO dao = new UserDAO(); //��ü����

		
		switch(menu) {
		case 1:
			System.out.println("userTBL ��ü ���");
			List<UserVO> list = dao.getList();
			for(UserVO vo:list) {
				System.out.println(vo);
			}
			break;
		case 2:
			UserVO vo = new UserVO();
			System.out.println("������ ȸ�� �̸� �Է� :");
			System.out.print("�̸� : " );
			vo.setUserName(sc.next());
			
			System.out.println("������ ȸ�� �⵵ �Է� : ");
			vo.setBiryhYear(sc.nextInt());
			
			System.out.println("������ ȸ�� �ּ� �Է� :");
			vo.setAddr(sc.next());
			
			System.out.println("������ ȸ�� ��ȭ��ȣ �Է�(-�� �Է����ּ���) :");
			vo.setMobile(sc.next());
			
			System.out.println(dao.insertUser(vo)?"���� ����":"���� ����");
			boolean flag = dao.insertUser(vo);
			break;
//			System.out.println("������ ȸ�� �̸� �Է� :");
//			String username = sc.next();
//			uservo.setUserName(username);
//			System.out.println("������ ȸ�� ���� �Է� :");
//			int birthday = sc.nextInt();
//			uservo.setBiryhYear(birthday);
//			System.out.println("������ ȸ�� �ּ� �Է� :");
//			String addr = sc.next();
//			uservo.setAddr(addr);
//			System.out.println("������ ȸ�� ��ȭ��ȣ �Է�(-�� �Է����ּ���) :");
//			String mobile = sc.next();
//			uservo.setMobile(mobile);
//			System.out.println(flag?"��������":"��������");

		case 3:
			System.out.print("������ ȸ����ȣ �Է� : ");
			int no = sc.nextInt(); //3
			flag=dao.deleteUser(no);
			System.out.println(flag?"��������":"��������");
			break;
		case 4:
			System.out.println("������ ȸ�� ���� �Է�");
			System.out.println("������ ȸ����ȣ �Է� : ");
			no = sc.nextInt();
			System.out.println("������ �ּ� �Է� : ");
			String addr = sc.next();
			flag = dao.updateUser(addr, no);
			System.out.println(flag?"��������":"��������");
			break;
		}
	}
}
