package file_;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) 
			throws IOException {
		File path = new File("D:\\핀테크정성호\\java\\test/test.txt");
		FileOutputStream fos = new FileOutputStream(path);
		
		Scanner input = new Scanner(System.in);
		String msg = null;
		
		System.out.println("문자열 입력");
		msg = input.next();
		
		fos.write(msg.getBytes());
		System.out.println("저장되었습니다");
		fos.close();
	}
}
