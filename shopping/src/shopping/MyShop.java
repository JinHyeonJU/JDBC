package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	//���θ� �̸� 
	private String title;
	//��ٱ���
	ArrayList<Product> carts = new ArrayList<Product>();
	//�����
	private User[] users = new User[2];
	//��� ��ǰ ����
	private Product[] products = new Product[3];
	//Ű���� �Է�
	Scanner scan = new Scanner(System.in);
	//
	private int selUser;
	

	@Override
	public void setTitle(String title) { 
		this.title = title;
		
	}

	@Override
	public void genUser() {
		/*���θ� ����� ���� �� �迭�� ���
		User Ŭ������ü�� �̿�
		�迭 ���� �� �ʱ�ȭ
		User user[] = {};*/
		User user = new User("������", PayType.CARD);
		users[0] = user;
		user = new User("�����", PayType.CASH);
		users[1] = user;
		
	}

	@Override
	public void genProduct() {
		//ctrl+Alt �ع���Ű �ؿ��ٿ� ����
		// ���θ����� �Ǹ��ϴ� ��ǰ ����
		//CellPhone,Chicken,SmartTV
		products[0] = new SmartTV("LGTV", 1300000, "FULL HD");
		products[1] = new Chicken("�Ѹ�Ŭ", 20000, "JMT");
		products[2] = new CellPhone("������X", 400000, "����");
		
	}

	@Override
	public void start() {
		//�����ϴ� �޼ҵ�
		System.out.println(title+" : ����ȭ�� - ��������");
		System.out.println("=======================");
		
		int i = 0;
		for(User u : users) {
			System.out.printf("[%d] %s(%s)\n", i++, u.getName(), u.getPaytype());
			
		}
		System.out.println("[x]�� ��");
		System.out.print("���� : ");
		
		//��������� user ��ȣ�� �Է¹��� �� ��ǰ ��� ����ϱ�
		// 0, 1, x
		
		String input = scan.next();
		switch (input) {
		case "0": case "1":
			System.out.println("### "+input+" ���� ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "x": case"X":
			System.out.println("shop�� �����մϴ�.");
			break;
			default:
				System.out.println("\n�Է°��� Ȯ���� �ּ���\n");
				start();
				break;
		}
	}
	public void productList() {
		//��ǰ ��� ����ϱ�
		System.out.println(title+" : ����ȭ�� - ��������");
		System.out.println("=======================");
		
		int i = 0;
		for(Product p : products) {
			System.out.printf("[%d]", i++);
			p.printDetail();
		}
		System.out.println("[h] ����ȭ��");
		System.out.println("[c] üũ�ƿ�");
		System.out.print("���� : ");
		String input = scan.next();
		
		switch(input) {
		case "h": case "H":
			start();
			break;
		case "c": case"C":
			checkOut();
			break;
		case "1": case "2": case"3":
			System.out.println("## "+input+" ����##");
			//īƮ�����
			carts.add(products[Integer.parseInt(input)]);
			//product[�Է¹޴� input����]
			//�ٽ� ��ǰ��� �����ֱ�
			productList();
		default:
			System.out.println("�Է°��� Ȯ���� �ּ���.");
			productList();
				break;
		}
	}
		public void checkOut() {
			System.out.println(title + " : üũ�ƿ�");
			System.out.println("===================");
			int total = 0; //��ٱ��� �ݾ� �հ�
			int i = 0;
			for (Product p : carts) {
				System.out.printf("[%d] %s(%s)\n", i++, p.getPname(), p.getPrice());	
				total += p.getPrice(); //��ٱ��� ���� �� �հ� ���ϱ�
				}
			System.out.println("===================");
			System.out.printf("������� : \n", users[selUser].getPaytype());
			System.out.println("�հ� : "+total+"�� �Դϴ�");
			System.out.println("[p]����, [q]���� �Ϸ�");
			System.out.println("���� : ");
			String sel = scan.next();
			
			switch(sel) {
			case "p":
				productList(); break;
			case "q":
				System.out.println("## ������ �Ϸ�Ǿ����ϴ�. �����մϴ�. ##");
				System.exit(0); break;
				default :
					System.out.println("�Է°��� Ȯ���� �ּ���");
					checkOut();
					break;
			}
			
		}			
}
