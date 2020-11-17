package ui;

import java.util.Scanner;

import action.Action;
import action.MemberAddAction;
import action.MemberListAction;
import action.MemberRemoveAction;
import action.MemberUpdateAction;
import controller.MemberController;

public class MemberUI {
	public static void main(String[] args) {
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		MemberController controller = new MemberController();
		do {
			System.out.println("===== ȸ�� ���� ���α׷� =====");
			System.out.println("1. ȸ�����");
			System.out.println("2. ȸ����� ����");
			System.out.println("3. ȸ������ ����");
			System.out.println("4. ȸ������ ����");
			System.out.println("5. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();

			Action action = null;

			switch (menu) {
			case 1:
				action = new MemberAddAction();
				break;
			case 2:
				action = new MemberListAction();
				break;
			case 3:
				action = new MemberUpdateAction();
				break;
			case 4:
				action = new MemberRemoveAction();
				break;
			case 5:
				isStop = true;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				break;
			}
			if (action !=null) {
				controller.processRequest(action, sc);
			}
		} while (!isStop); //isStop�ʱⰪ�� false�̴� �ݴ��� true�� �����Ǹ� ����
	}
}