package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//�����̸� ����
		shop.setTitle("���ֹ����");
		//User ����
		shop.genUser();
		//��ǰ ����
		shop.genProduct();
		//���� ����
		shop.start();
	}

}
