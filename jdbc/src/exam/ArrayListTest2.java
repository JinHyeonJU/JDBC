package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>(); 
		
		//��ü ����&���� ����
		list.add(new Member(2001, "������"));
		list.add(new Member(1998, "�����"));
		list.add(new Member(1993, "�ֿ���"));
		list.add(new Member(1991, "�� ��"));
		list.add(new Member(1995, "����ȣ"));
		
		//list��ü Ȯ��
		for(Member mem:list) {
			System.out.println(mem);
		}
		System.out.println("");
		//get(i) i��° ��ü Ȯ��
		System.out.println(list.get(1));
	}
}
