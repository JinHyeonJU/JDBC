package basic;

public class Account {
	// �Ӽ� : ���¹�ȣ(110-10-1000), �̸�, �ܾ�(����)
	// ��� : �Ա��Ѵ�, ����Ѵ�. => �ݾ��� �޾Ƽ� ó��
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
			throw new Exception("�ܾ��� �����մϴ�.") ;
		
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





