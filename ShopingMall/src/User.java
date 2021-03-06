
public class User {
	//사용자 이름
	private String name;
	
	//결제 유형 - eum
	private PayType payType;
	
	//이름과 결제 정보를 파라미터로 가지는 생성자
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	

}
