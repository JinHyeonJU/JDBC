package basic;

public class CheckingAccount extends Account {
	/* CheckingAccount
	�Ӽ� : ���¹�ȣ, �̸�, �ܾ�, <����ī�� ��ȣ> */
	private String cardNo;
	/* ��� : �Ա�, ���, <����ī�� ���� ����> */
	public CheckingAccount(String accountNum, String name, int balance, String cardNo) {
		super(accountNum, name, balance);
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount) throws Exception {
		// ī���ȣ�� �ܾ��� Ȯ���� �� ������ ����
		if(!this.cardNo.equals(cardNo) || super.getBalance() < amount) {
			throw new Exception("ī�� ��ȣ �Ǵ� �ܾ��� Ȯ���� �ּ���.");
		}
		//�ܾ� - ���� = �ܾ׸���
		// �θ� class�� ���� MinusMoney() �޼ҵ� ����
		return minusMoney(amount);
	}
}
