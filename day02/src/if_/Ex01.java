package if_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.종료");
		System.out.println(">>> : ");
		num = sc.nextInt();
		
		if(num==1) {
			System.err.println("1.쉬운게임");
		}
		if(num==2){
			System.out.println("2.어려운게임");
		}
		if(num==3)
			System.out.println("3.종료");
	}
}
