package file_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 implements CommonPath{
	public static void main(String[] args) throws Exception {
		System.out.println(CommonPath.PATH);
		System.out.println(PATH);
		
		Scanner input = new Scanner(System.in);
		System.out.println("저장할 파일명 입력");
		String fileName = input.next(); 
		
		File file = new File(PATH + fileName + ".txt");
		if(file.exists()) {
			System.out.println("존재하는 파일 입니다. 수정으로 가세요");
		}else {
			FileOutputStream fos = new FileOutputStream(file);
			System.out.println("출력할 내용 작성");
			String msg = input.next();
			fos.write(msg.getBytes());
			System.out.println("저장 되었습니다.");
			fos.close();
		}
		
		System.out.println("확인할 파일명 입력");
		fileName = input.next();
		File inputFile = new File(PATH + fileName + ".txt");
		if(inputFile.exists()) {
			FileInputStream fis = new FileInputStream(inputFile);
			while(true) {
				int res = fis.read();
				if(res == -1) {
					System.out.println("res => " + res);
					break;
				}
				System.out.println("res : " + (char)res);
			}
		}else {
			System.out.println("해당 파일은 없음!!");
		}
	}
}
