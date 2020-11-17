package io;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileEx4 {
	public static void main(String[] args) {
		try {
			File temp = new File("c:\\temp");
			File dir = new File("c:\\temp\\dir");
			File file1 = new File("c:\\temp\\file1");
			File file2 = new File("c:\\temp\\file2");
			File file3 = new File(temp, "file3.txt");
			File file4 = new File("c:\\temp\\file4.txt");

			//���丮 ����
			if(!dir.exists()) {
				dir.mkdir();
			}
			//���� ����
			if(!file1.exists()) file1.createNewFile();
			if(!file2.exists()) file2.createNewFile();
			if(!file3.exists()) file3.createNewFile();
			if(!file4.exists()) file4.createNewFile();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.println("=== ��¥ === �ð� === ���� === ũ�� === �̸�");
			System.out.println("======================================");
			
			File contents[] = temp.listFiles();
			for(File f:contents) {
				System.out.println(sdf.format(new Date(f.lastModified())));
				if(f.isDirectory()) {
					System.out.println("\t<DIR>\t\t\t"+f.getName());
				} else {
					System.out.println("\t\t\t"+f.length()+"\t"+f.getName());
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
