import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Character Hyeon = new Character("������");
		Monster pinkBin = new Monster("��ũ��");
		
		System.out.println(pinkBin.getName()+"�� ��Ÿ����! �ο���");
		while (pinkBin.getHp() != 0) {	
		Hyeon.attack(pinkBin);
			pinkBin.attack(Hyeon);
		System.out.println("-------------");
		
		if (Hyeon.getHp() < 30)
			Hyeon.drinkP();
		if (Hyeon.getExp() == 150)
			Hyeon.levelUp();
		}
	}
}
