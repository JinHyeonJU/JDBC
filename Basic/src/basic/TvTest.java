package basic;

import java.util.Scanner;

public class TvTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ν��Ͻ�(��ü) ���� => ������ ȣ��
		//��ü�� ������ �� �ƹ��� ���ڵ� ���� �ʴ´ٸ� default ������ ȣ��
		TV t1 = new TV();
		TV t2 = new TV(true, 11, 153); 	//�ҷ��� ����ϱ� ���� ���� ����

		t1.channelUp();
		
		// return Ÿ���� �ִ� �޼ҵ� ȣ��
		//ó����� 1 => ��¹����� Ȯ���ϱ�
		System.out.println(t1.getChannel());
		//ó����� 2 => �Ѿ���� �� �ޱ� (���α׷� ���������� �� ��� �ַ� ���)
		int channel_no= t1.getChannel();
		//ó����� 2 �������: �޾Ƽ� �ٸ� ó���� ����
		
		// return Ÿ���� ���� �޼ҵ�(void) ȣ��
		// ȣ�⸸ ����
		t1.channelUp();
		
		GoodsStock g1 = new GoodsStock();
		System.out.println("��ǰ �ڵ� �Է� : ");
		String gCode = sc.next();
	}
}
