import Employee.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date joinDate1 = new Date(2020, 1, 1);
		Date joinDate2 = new Date(2020, 1, 2);
		Date joinDate3 = new Date(2020, 1, 3);
		Date joinDate4 = new Date(2020, 1, 4);
		Date joinDate5 = new Date(2020, 1, 5);
		RegularEmployee re = new RegularEmployee("����", "�����", "123-4567", joinDate1, 3000000);
		re.displayEmployee();
		double salary = re.payCheck();
		System.out.printf("�޿��� : %.0f��\n", salary);
		
		Employee e = new RegularEmployee("����", "�λ��", "234-5678", joinDate2, 4000000);
		e.displayEmployee();
		
		TemporaryEmployee te = new TemporaryEmployee("���", "������", "345-6789", joinDate3, 1000000);
		te.displayEmployee();
		te.setWorkHours(240);
		salary = te.payCheck();
		System.out.printf("�޿��� : %.0f��\n", salary);
		
		SalesEmployee se = new SalesEmployee("���", "��õ��", "456-7890", joinDate4, 1000000, 0.01);
		se.displayEmployee();
		se.setSales(15000000);
		salary = se.payCheck();
		System.out.printf("�޿��� : %.0f��\n", salary);
		
		RegularEmployee re2 = se;
		salary = re2.payCheck();
		System.out.printf("�޿��� : %.0f��\n", salary);
		
		RegularEmployee re3 = (RegularEmployee)e;
		salary = re3.payCheck();
		System.out.printf("�޿��� : %.0f��\n", salary);
		
		Department dept = new Department();
		dept.addEmployee(re3);
		dept.addEmployee(e);
		dept.addEmployee(te);
		dept.addEmployee(se);
		dept.display();
		
		String str1 = "I love you";
		String str2 = new String("I love you");
		if(str1 == str2)
			System.out.println("==");
		else
			System.out.println("!=");
		if(str1.equals(str2))
			System.out.println("==");
		else
			System.out.println("!="); 
		
		RegularEmployee re4= new RegularEmployee("����", "�����", "123-4567", joinDate5, 3000000);
		re.displayEmployee();
		re4.displayEmployee();
		if(re == re4)
			System.out.println("==");
		else
			System.out.println("!=");
		if(re.equals(re4))
			System.out.println("==");
		else
			System.out.println("!=");

	}

}