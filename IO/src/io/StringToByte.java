package io;

import java.io.InputStream;
import java.io.OutputStream;

public class StringToByte {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] b = new byte[100];
		
		try {
			System.out.println("�̸� : ");
			//byte �迭�ȿ� ��� ���ڿ� ��
			int nameBytes = in.read(b);
			
			//-2�� ���� ������ Enter����. (Enter�� �ΰ��� ���� : Carriage Return : 13, Line Feed : 10)
			String name = new String(b, 0, nameBytes-2);
			
			System.out.println("�ϰ� ���� �� : ");
			int commentBytes = in.read(b);
			String comment = new String(b, 0, commentBytes-2);
			
			System.out.println("�Է��� �̸� : "+name);
			System.out.println("�Է��� �ϰ� ���� �� : "+comment);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
