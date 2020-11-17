package exam;

import java.util.ArrayList;
import java.util.List;

/* ● 데이터를 어디에 담을 것인가? 기본현타입, 클래스(객체) 타입
 *
 * 기본형 : int, float, double, char
 * 객체 : Integer, Float, Double, String....
 * 
 * ● 데이터가 많아질때 : 배열, Collection(List, Set), Map
 * 
 * List : ArrayList(주로 쓰임), LinkedList
 * 
 */


public class ArrayListTest1 {
	public static void main(String[] args) {
		//List객체 생성 < > 안은 제네릭타입
		List<String> list = new ArrayList<String>();
		
		//생성된 list에 요소 추가
		list.add("Java0");
		list.add("JDBC1");
		list.add("oracle2");
		list.add("html3");
		
		//요소 확인
		
		//전체 요소 확인
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("");
		//특정 요소 확인
		System.out.println(list.get(1));
		
		
	}
}







