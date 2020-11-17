
public class AddWorkMoney extends Money {
	private int addWorkMoney;
	public AddWorkMoney(int addWorkMoney) {
		super();
		this.addWorkMoney = addWorkMoney;
	}

	@Override
	void printExtra() {
		System.out.printf("받은 알바비 : "+addWorkMoney);
	}

}
