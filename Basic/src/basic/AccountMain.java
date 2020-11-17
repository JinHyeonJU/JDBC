package basic;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		CheckingAccount check = new CheckingAccount("110-509-621909", "진현주", 1000000, "12345");
		//예금하는기능
		check.addMoney(150000);
		//출금하는기능
		
		try {
			System.out.println("현재 잔액 : "+check.minusMoney(400000));
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		//직불카드 사용액 지불
		try {
			System.out.println("직불카드 사용 후 잔액 : "+check.pay("12345", 500000));	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		System.out.println("1)입금 2)출금");
//		int sel = sc.nextInt();
//		switch (sel) {
//		case 1:
//			System.out.println("입금하실 잔액을 입력해주세요 : ");
//			int amount = sc.nextInt();
//			owner1.addMoney(amount); break;
//		case 2: 
//			System.out.println("출금하실 잔액을 입력해주세요 : ");
//			int amount1 = sc.nextInt();
//			owner1.minusMoney(amount1); break;
//		}
//		System.out.println("남은 잔액 : "+owner1.getBalance());
//	}
		
		
		
	}
}
