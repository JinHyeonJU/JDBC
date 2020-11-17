package exam;

public class Member {
	private int id;
	private String name;
	
	//»ý¼ºÀÚ
	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//toString
	@Override
	public String toString() { 
		return "Member [id=" + id + ", name=" + name + "]";
	}
	//getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
