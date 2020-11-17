package pattern;

public class UserVO {
	//userTBL 테이블의 하나의 레코드를 담을 수 있는 형태로 작성
	//컨트롤 + / 하면 드래그 행 주석처리
	
	private int no;
	private String userName;
	private int biryhYear;
	private String addr;
	private String mobile;
	
	//getter, setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBiryhYear() {
		return biryhYear;
	}
	public void setBiryhYear(int biryhYear) {
		this.biryhYear = biryhYear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	//toString
	@Override
	public String toString() {
		return "no=" + no + ", userName=" + userName + ", biryhYear=" + biryhYear + ", addr=" + addr
				+ ", mobile=" + mobile;
	}
}
