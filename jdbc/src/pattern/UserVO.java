package pattern;

public class UserVO {
	//userTBL ���̺��� �ϳ��� ���ڵ带 ���� �� �ִ� ���·� �ۼ�
	//��Ʈ�� + / �ϸ� �巡�� �� �ּ�ó��
	
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
