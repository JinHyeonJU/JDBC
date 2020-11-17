package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class IOTest {
	public static void main(String[] args) {
		// Ű���忡�� �Է��� �޾Ƶ鿩 ���Ͽ� ����ϴ� ���α׷� �ۼ�
		// ���� : Ű���忡�� q�� �ԷµǱ� ������ ��� �޾Ƶ��̱�
		try(Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("c:\\temp\\user.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			
				System.out.println("���Ͽ� �ۼ��� �����͸� �Է��� �ּ���.");
				System.out.println("���Ḧ ���Ͻø� q�� �Է��� �ּ���.");
				
				String input = "";
				do {
					System.out.print(">> ");
					input = sc.nextLine();
					// ����
					if(!input.equals("q")) {
						bw.write(input);
						bw.newLine();
					}
				} while(!input.equals("q"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
