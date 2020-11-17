package ui;

import java.util.List;
import java.util.Scanner;

import domain.UserVO;

//�ַܼκ��� ����ڰ� �Է��� ������ �о���̰ų�
//�ַܼ� �ʿ��� �޽����� ���
public class ConsoleUtil {
	public UserVO getNewUser(Scanner sc) {
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

		return vo;
	}
	//user �Է� ���� �޽���
	public void printAddSuccessMessage(UserVO user) {
		System.out.println(user.getUserName() + "���� �߰� ����"); 
	}
	//user �Է� ���� �޽���
	public void printAddFailMessage(UserVO user) {
		System.out.println(user.getUserName() + "���� �߰� ����");
	}
	//��ü ��ȸ ����ϱ�
	public void printUserList(List<UserVO> list) {

		System.out.println("userTBL ��ü ���");
		for(UserVO vo:list) {
			System.out.println(vo);
		}
	}
	//���� ��ȸ or ����
	public int printUserRow(Scanner sc) {
		System.out.println("��ȸ(����)�� ����� ��ȣ : ");
		int no = sc.nextInt();
		return no;
	}
	public void printUserDetail(UserVO user) {
		System.out.println("====== ��ȸ�� ����ڴ� ������ �����ϴ� =====");
		System.out.println(user);
	}
	//user ���� ���� �޽���
	public void printRemoveSuccessMessage() {
		System.out.println("User ���� ����"); 
	}
	//user ���� ���� �޽���
	public void printRemoveFailMessage() {
		System.out.println("User ���� ����");
	}
	//������ ���� �Է¹���
	public UserVO printUpdateMassage(Scanner sc) {
		System.out.println("=== USER ���� ===");
		System.out.println("������ ȸ����ȣ �Է�");
		int no = sc.nextInt();
		System.out.println("������ �ּ� �Է� :");
		String addr = sc.next();

		UserVO vo = new UserVO();
		vo.setNo(no);
		vo.setAddr(addr);
		return vo;
	}
	public void printUpdateSuccessMessage() {
		System.out.println("ȸ�� ���� ���� ����");
	}
	public void printUpdateFailMessage() {
		System.out.println("ȸ�� ���� ���� ����");
	}
}
