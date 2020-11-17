package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOTest2_2 {

	public static void main(String[] args) {
		//아무 파일 선택한 후 소스파일을 읽고
		//라인번호를 추가시켜 화면에 출력하기
		String path = System.getProperty("user.dir");
		System.out.println(path);
		try(FileReader reader = new FileReader(path+"\\src\\io\\FileEX1.java");
				BufferedReader br =new BufferedReader(reader)) {
			String data = null;
			int i = 1;
			while((data=br.readLine())!=null) {
				System.out.println((i++) +" " + data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
