
public abstract class Money {
	private int money;
	
	public void Money(int money) {
		this.money = money;	
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	abstract void printExtra(); {
	}
	void displayMoney() {
		System.out.println("ÇöÀç ÀÜ¾× : "+money);
		printExtra();
	}
}
