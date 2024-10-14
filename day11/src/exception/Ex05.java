package exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x=10, y=0;
		try {
			System.out.println(x/2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch 실행");
			return;
		}finally {
			System.out.println("stream 닫음!!!!");
			input.close();			
		}
		
		
	}
}
