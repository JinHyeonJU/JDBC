package io;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		//���� ��ü ����
		File f1 = new File("c:\\temp\\test1.txt");

		File f2 = new File("c:\\temp","test1.txt");

		File dir = new File("c:\\temp\\");
		File f3 = new File(dir, "test1.txt");
	}
}
