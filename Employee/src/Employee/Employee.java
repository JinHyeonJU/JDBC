package Employee;
import Date;

public class Employee {
	String name;
	String telNum;
	String address;
	Date joinDate;
	
	Employee(String name, String telNum, String address, Date joinDate) {
		this.name = name;
		this.telNum = telNum;
		this.address = address;
		this.joinDate = joinDate;
	}
	
	void displayEmployee() {
		System.out.printf("�̸� : %s, �ּ� : %s, ��ȭ��ȣ : %s, �Ի����� : %s",  
				  name, address, telNum, joinDate);
	}

	public double payCheck()  {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj;
		return (this.name == e.name && this.address == e.address && this.telNum == e.telNum);
	}
}
