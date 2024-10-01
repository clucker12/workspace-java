package while_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=0;
		int b=0;
		String c = null;
		int num = 0;
		int total=0;
		while(true) {
			System.out.println("1.계산기");
			System.out.println("2.프로그램 종료");
			num = input.nextInt();
			if(num==1) {
				System.out.print("계산 값 입력 (형식: a 연산자 b):");
				a = input.nextInt();
				c = input.next();
				b = input.nextInt();
				switch(c) {
				case "+":
					total = a+b;
					System.out.println("계산 값 : " + total);
					break;
				case "-":
					total = a-b;
					System.out.println("계산 값 : " + total);
					break;
				case "/":
					if(b==0) {
						System.out.println("나눠지는 수는 0이 될 수 없습니다.");
					}else {
						total = a/b;
						System.out.println("계산 값 : " + total);
						break;
					}
				case "*":
					total = a*b;
					System.out.println("계산 값 : " + total);
					break;
				case "%":
					if(b==0) {
						System.out.println("나눠지는 수는 0이 될 수 없습니다.");
					}else {
						total = a%b;
						System.out.println("계산 값 : " + total);
						break;
					}
				}
			}else if(num==2) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력 하셨습니다");
			}
		}
		
	}
}
