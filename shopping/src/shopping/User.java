package shopping;

public class User {
	private String name;
	private PayType paytype;
	
	User(String name, PayType paytype) {
		super();
		this.name = name;
		this.paytype = paytype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPaytype() {
		return paytype;
	}

	public void setPaytype(PayType paytype) {
		this.paytype = paytype;
	}
	
}
