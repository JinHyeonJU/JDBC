package basic;

/* 클래스 : 틀, 설계도, 객체를 생성하는데 사용
 * 객체 : 유형, 무형
 * 
 * 인스턴스 : 어떤 클래스로부터 만들어진 <객체>
 * 인스턴스화 : 클래스로부터 객체를 만드는 <과정>
 * 
 * 객체 >= 인스턴스 ex)책상은 객체다, 책상 클래스의 인스턴스다 
 * 
 * 객체 구성요소 : 속성, 기능
 * 속성 : 멤버변수, 필드, property
 * 기능 : 메소드, 함수
 * [사용하는 방법]에 의거해 코딩
 */


public class TV { //이 클래스로 어떤 기능을 제공할 것인지 생각
	//속성 : 전원상태, 볼륨, 채널, 크기, 색상, 
	//기능 : 켜기, 끄기, 볼륨 up, down, 채널 변경
	private boolean power;
	private String color;
	private int volume;
	private int channel;
	
	/* 생성자 - class명과 동일/return 없음/접근제한자
	 	      생성자가 아무것도 없을 때 컴파일러가 자동으로 default 생성자 생성
	 	      생성자가 하나라도 있으면 default 생성안함 */
	
	public TV() {
		
	}
	public TV(boolean power, int volume, int channel) {
		
	}
	void power() { //켜기,끄기
		power = !power;
	}
	void channelUp() { //채널 up
		channel++;
	}
	void channelDown() { //채널 down
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
	// 현재 채널값을 리턴하는 메소드
	// 사용이유 : 직접접근이 불가해서
	// channel 타입확인후 int타입을 return
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
}