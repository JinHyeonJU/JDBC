package basic;

public class GoodsStock {
	// 속성 : 상품코드(G1536), 재고수량(숫자)
	// 기능 : 재고를 추가, 재고를 감소
	
	private String goodsCode;
	private int goodsNo;
	
	public GoodsStock(String goodsCode, int goodsNo) {
		super();
		this.goodsCode = goodsCode;
		this.goodsNo = goodsNo;
	}
	public void GoodsNoPlus(int amount) {
		goodsNo += amount;
	}
	public int subtractsStock(int amount) {
		return goodsNo -= amount;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}



	public int getGoodsNo() {
		return goodsNo;
	}



	public void setGoodsNo(int goodsNo) {
		this.goodsNo = goodsNo;
	}
}