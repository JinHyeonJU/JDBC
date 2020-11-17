package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOTest2 {
	public static void main(String[] args) {
		//����Ʈ ����� InputStream ����
		InputStream in = System.in;
		//����Ʈ ����� OutputStream ����
		OutputStream out = System.out;

		//�Է� ��Ʈ������ ����Ʈ �迭�� �о����
		byte[] b = new byte[100];
		
		try {
				while(in.read(b)!=-1)
					out.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
