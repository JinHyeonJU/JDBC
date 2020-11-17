package basic;

import java.util.Scanner;

public class TvTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//인스턴스(객체) 생성 => 생성자 호출
		//객체를 생성할 때 아무런 인자도 넣지 않는다면 default 생성자 호출
		TV t1 = new TV();
		TV t2 = new TV(true, 11, 153); 	//불러서 사용하기 위해 변수 선언

		t1.channelUp();
		
		// return 타입이 있는 메소드 호출
		//처리방법 1 => 출력문에서 확인하기
		System.out.println(t1.getChannel());
		//처리방법 2 => 넘어오는 값 받기 (프로그램 복잡해지면 이 방법 주로 사용)
		int channel_no= t1.getChannel();
		//처리방법 2 사용이유: 받아서 다른 처리가 가능
		
		// return 타입이 없는 메소드(void) 호출
		// 호출만 가능
		t1.channelUp();
		
		GoodsStock g1 = new GoodsStock();
		System.out.println("상품 코드 입력 : ");
		String gCode = sc.next();
	}
}
