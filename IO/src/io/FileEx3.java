package io;

import java.io.File;

public class FileEx3 {
	public static void main(String[] args) {
		// 사용자로부터 인자를 받아들여 디렉토리가 맞는지 확인하기
		
		if(args.length!=1) {
			System.out.println("사용법 : java FileEx3 디렉토리명");
			System.exit(0);
		}
		
		File f = new File(args[0]); //=> c:\temp
		
		//f.exists() : 파일 존재 우무 확인
		//f.isDirectory() : 디렉토리인지 확인
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		
		//디렉토리의 파일목록을 File 배열로 리턴
		File[] files = f.listFiles();
		for(int i =0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory()?"["+fileName+"]" : fileName);
		}
	}
}
