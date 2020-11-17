package ui;

import java.util.List;
import java.util.Scanner;

import domain.MemberVO;

public class MemberConsoleUtil {
	public MemberVO getAddMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("주소: ");
		String addr = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		return new MemberVO(name, addr, nation, email, age);
	}
	public void printAddSuccessMessage(String name) {
		System.out.println(name + "회원 정보 추가 성공");
	}
	//전체 member 출력하기
	public void printMemberList(List<MemberVO> list) {
		System.out.println("\n");
		System.out.println("===== 전체 조회 =====");
		System.out.println("아이디\t이름\t주소\t국가\t이메일\t\t\t나이");
		for(MemberVO vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getNation()+"\t");
			System.out.print(vo.getEmail()+"\t");
			System.out.print(vo.getAge()+"\n");
		}
	}
	//사용자로부터 아이디를 입력받아 return
	public int printRemoveMember(Scanner sc) {
		System.out.println("삭제할 회원 아이디를 입력하세요 : ");
		int id = sc.nextInt();
		return id;
	}
	public void printRemoveSuccessMessage() {
		System.out.println("회원 정보 삭제 성공");
	}
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제 실패");
	}
	
	//수정 메소드
	public MemberVO printUpdateMessage(Scanner sc) {
		System.out.println("===== Member 정보 수정 =====");
		System.out.println("아이디 입력 : ");
		int id = sc.nextInt();
		System.out.println("주소 입력 : ");
		String addr = sc.next();
		System.out.println("이메일 입력 : ");
		String email = sc.next();
		System.out.println("나이 입력: ");
		int age = sc.nextInt();
		
		//입력받은 정보를 MemberVO 담기
		MemberVO updateMember = new MemberVO();
		updateMember.setId(id);
		updateMember.setAddr(addr);
		updateMember.setEmail(email);
		updateMember.setAge(age);
		
		//최종적으로 MemberVO return
		return updateMember;
	}
	public void printUpdateSuccessFail(boolean updateFlag) {
	System.out.println(updateFlag?"수정성공":"수정실패");
	}
}











