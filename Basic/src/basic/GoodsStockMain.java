package basic;

import java.util.Scanner;

public class GoodsStockMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//GoodsStock 5 �� �����ϱ�
		GoodsStock goods1 = new GoodsStock("g1", 100);
		GoodsStock goods2 = new GoodsStock("g2", 10);
		GoodsStock goods3 = new GoodsStock("g3", 200);
		GoodsStock goods4 = new GoodsStock("g4", 30);
		GoodsStock goods5 = new GoodsStock("g5", 350);
		
		//������ ����, ���� ����
		
		goods1.GoodsNoPlus(20);
		System.out.println("���� ��� ���� : "+goods1.subtractsStock(5));
		goods2.GoodsNoPlus(10);
		System.out.println("���� ��� ���� : "+goods2.subtractsStock(10));
		goods3.GoodsNoPlus(30);
		System.out.println("���� ��� ���� : "+goods3.subtractsStock(50));
		goods4.GoodsNoPlus(20);
		System.out.println("���� ��� ���� : "+goods4.subtractsStock(15));
		goods5.GoodsNoPlus(20);
		System.out.println("���� ��� ���� : "+goods5.subtractsStock(5));
		
	}
}









