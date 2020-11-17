package ui;

import java.util.List;
import java.util.Scanner;

import domain.MemberVO;

public class MemberConsoleUtil {
	public MemberVO getAddMember(Scanner sc) {
		System.out.println("����� ȸ�� ������ �Է��ϼ���");
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("�ּ�: ");
		String addr = sc.next();
		System.out.print("�̸���: ");
		String email = sc.next();
		System.out.print("���� : ");
		String nation = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		return new MemberVO(name, addr, nation, email, age);
	}
	public void printAddSuccessMessage(String name) {
		System.out.println(name + "ȸ�� ���� �߰� ����");
	}
	//��ü member ����ϱ�
	public void printMemberList(List<MemberVO> list) {
		System.out.println("\n");
		System.out.println("===== ��ü ��ȸ =====");
		System.out.println("���̵�\t�̸�\t�ּ�\t����\t�̸���\t\t\t����");
		for(MemberVO vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getNation()+"\t");
			System.out.print(vo.getEmail()+"\t");
			System.out.print(vo.getAge()+"\n");
		}
	}
	//����ڷκ��� ���̵� �Է¹޾� return
	public int printRemoveMember(Scanner sc) {
		System.out.println("������ ȸ�� ���̵� �Է��ϼ��� : ");
		int id = sc.nextInt();
		return id;
	}
	public void printRemoveSuccessMessage() {
		System.out.println("ȸ�� ���� ���� ����");
	}
	public void printRemoveFailMessage() {
		System.out.println("ȸ�� ���� ���� ����");
	}
	
	//���� �޼ҵ�
	public MemberVO printUpdateMessage(Scanner sc) {
		System.out.println("===== Member ���� ���� =====");
		System.out.println("���̵� �Է� : ");
		int id = sc.nextInt();
		System.out.println("�ּ� �Է� : ");
		String addr = sc.next();
		System.out.println("�̸��� �Է� : ");
		String email = sc.next();
		System.out.println("���� �Է�: ");
		int age = sc.nextInt();
		
		//�Է¹��� ������ MemberVO ���
		MemberVO updateMember = new MemberVO();
		updateMember.setId(id);
		updateMember.setAddr(addr);
		updateMember.setEmail(email);
		updateMember.setAge(age);
		
		//���������� MemberVO return
		return updateMember;
	}
	public void printUpdateSuccessFail(boolean updateFlag) {
	System.out.println(updateFlag?"��������":"��������");
	}
}











