package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOTest2_2 {

	public static void main(String[] args) {
		//�ƹ� ���� ������ �� �ҽ������� �а�
		//���ι�ȣ�� �߰����� ȭ�鿡 ����ϱ�
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
