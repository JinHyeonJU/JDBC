package io;

import java.io.File;

public class FileEx3 {
	public static void main(String[] args) {
		// ����ڷκ��� ���ڸ� �޾Ƶ鿩 ���丮�� �´��� Ȯ���ϱ�
		
		if(args.length!=1) {
			System.out.println("���� : java FileEx3 ���丮��");
			System.exit(0);
		}
		
		File f = new File(args[0]); //=> c:\temp
		
		//f.exists() : ���� ���� �칫 Ȯ��
		//f.isDirectory() : ���丮���� Ȯ��
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0);
		}
		
		//���丮�� ���ϸ���� File �迭�� ����
		File[] files = f.listFiles();
		for(int i =0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory()?"["+fileName+"]" : fileName);
		}
	}
}
