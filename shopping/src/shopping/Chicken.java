package shopping;

public class Chicken extends Product {
	
	String oiisisa;

	public Chicken(String pname, int price, String oiisisa) {
		super(pname, price);
		this.oiisisa = oiisisa;
	}

	@Override
	void printExtra() {
		System.out.println("���ִ� ���� :"+oiisisa);

	}

}
