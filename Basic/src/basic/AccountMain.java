package basic;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		CheckingAccount check = new CheckingAccount("110-509-621909", "������", 1000000, "12345");
		//�����ϴ±��
		check.addMoney(150000);
		//����ϴ±��
		
		try {
			System.out.println("���� �ܾ� : "+check.minusMoney(400000));
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		//����ī�� ���� ����
		try {
			System.out.println("����ī�� ��� �� �ܾ� : "+check.pay("12345", 500000));	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		System.out.println("1)�Ա� 2)���");
//		int sel = sc.nextInt();
//		switch (sel) {
//		case 1:
//			System.out.println("�Ա��Ͻ� �ܾ��� �Է����ּ��� : ");
//			int amount = sc.nextInt();
//			owner1.addMoney(amount); break;
//		case 2: 
//			System.out.println("����Ͻ� �ܾ��� �Է����ּ��� : ");
//			int amount1 = sc.nextInt();
//			owner1.minusMoney(amount1); break;
//		}
//		System.out.println("���� �ܾ� : "+owner1.getBalance());
//	}
		
		
		
	}
}
