package basic;

/* Ŭ���� : Ʋ, ���赵, ��ü�� �����ϴµ� ���
 * ��ü : ����, ����
 * 
 * �ν��Ͻ� : � Ŭ�����κ��� ������� <��ü>
 * �ν��Ͻ�ȭ : Ŭ�����κ��� ��ü�� ����� <����>
 * 
 * ��ü >= �ν��Ͻ� ex)å���� ��ü��, å�� Ŭ������ �ν��Ͻ��� 
 * 
 * ��ü ������� : �Ӽ�, ���
 * �Ӽ� : �������, �ʵ�, property
 * ��� : �޼ҵ�, �Լ�
 * [����ϴ� ���]�� �ǰ��� �ڵ�
 */


public class TV { //�� Ŭ������ � ����� ������ ������ ����
	//�Ӽ� : ��������, ����, ä��, ũ��, ����, 
	//��� : �ѱ�, ����, ���� up, down, ä�� ����
	private boolean power;
	private String color;
	private int volume;
	private int channel;
	
	/* ������ - class��� ����/return ����/����������
	 	      �����ڰ� �ƹ��͵� ���� �� �����Ϸ��� �ڵ����� default ������ ����
	 	      �����ڰ� �ϳ��� ������ default �������� */
	
	public TV() {
		
	}
	public TV(boolean power, int volume, int channel) {
		
	}
	void power() { //�ѱ�,����
		power = !power;
	}
	void channelUp() { //ä�� up
		channel++;
	}
	void channelDown() { //ä�� down
		channel--;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	// ���� ä�ΰ��� �����ϴ� �޼ҵ�
	// ������� : ���������� �Ұ��ؼ�
	// channel Ÿ��Ȯ���� intŸ���� return
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
}