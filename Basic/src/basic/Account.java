package basic;

public class Account {
	// 속성 : 계좌번호(110-10-1000), 이름, 잔액(정수)
	// 기능 : 입금한다, 출금한다. => 금액을 받아서 처리
	private String accountNum;
	private String name;
	private int balance;

	public Account(String accountNum, String name, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
	}
	public void addMoney(int amount) {

		balance += amount;
	}
	public int minusMoney(int amount) throws Exception {
		if(balance < amount)
			throw new Exception("잔액이 부족합니다.") ;
		
		return balance -= amount;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}





