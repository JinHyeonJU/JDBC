package io;

import java.io.InputStream;
import java.io.OutputStream;

public class StringToByte {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] b = new byte[100];
		
		try {
			System.out.println("이름 : ");
			//byte 배열안에 담긴 문자열 수
			int nameBytes = in.read(b);
			
			//-2를 뺴는 이유는 Enter때문. (Enter는 두개의 조합 : Carriage Return : 13, Line Feed : 10)
			String name = new String(b, 0, nameBytes-2);
			
			System.out.println("하고 싶은 말 : ");
			int commentBytes = in.read(b);
			String comment = new String(b, 0, commentBytes-2);
			
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
			
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
