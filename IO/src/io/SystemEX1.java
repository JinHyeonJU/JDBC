package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemEX1 {
	public static void main(String[] args) throws IOException {
		System.out.println("===== �޴� =====");

		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. ����");
		System.out.println("�޴� ���� : ");

		InputStream in = System.in;
		char input = (char)in.read();

		switch (input) {
		case '1':
			System.out.println("���� ��ȸ ����");
			break;
		case '2':
			System.out.println("���� ��� ����");
			break;
		case '3':
			System.out.println("���� �Ա� ����");
			break;
		case '4':
			System.out.println("����  ����");
			break;
		default:
			break;
		}
	}
}
