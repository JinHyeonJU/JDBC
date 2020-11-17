package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>(); 
		
		//객체 생성&정보 대입
		list.add(new Member(2001, "진현주"));
		list.add(new Member(1998, "김다은"));
		list.add(new Member(1993, "주영우"));
		list.add(new Member(1991, "허 준"));
		list.add(new Member(1995, "김지호"));
		
		//list전체 확인
		for(Member mem:list) {
			System.out.println(mem);
		}
		System.out.println("");
		//get(i) i번째 객체 확인
		System.out.println(list.get(1));
	}
}
