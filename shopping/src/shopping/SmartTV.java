package shopping;

public class SmartTV extends Product {
	
	//�ػ�
	private String resolution;
	
		public SmartTV(String pname, int price, String resolution) { //������Ŭ���ҽ�
		super(pname, price); //pname, price ���Ե�
		this.resolution = resolution;
	}



	@Override
	void printExtra() {
		System.out.println("�ػ� ���� :"+resolution);

	}

}
