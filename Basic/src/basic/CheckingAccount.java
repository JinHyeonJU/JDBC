package basic;

public class CheckingAccount extends Account {
	/* CheckingAccount
	속성 : 계좌번호, 이름, 잔액, <직불카드 번호> */
	private String cardNo;
	/* 기능 : 입금, 출금, <직불카드 사용액 지불> */
	public CheckingAccount(String accountNum, String name, int balance, String cardNo) {
		super(accountNum, name, balance);
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount) throws Exception {
		// 카드번호와 잔액을 확인한 후 사용액을 지불
		if(!this.cardNo.equals(cardNo) || super.getBalance() < amount) {
			throw new Exception("카드 번호 또는 잔액을 확인해 주세요.");
		}
		//잔액 - 사용액 = 잔액리턴
		// 부모 class가 가진 MinusMoney() 메소드 재사용
		return minusMoney(amount);
	}
}
