package class_;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num %2 ==0) {
			System.out.println("짝 수");
		}else {
			System.out.println("홀 수");
		}
		
		System.out.println("수 입력");
		num = input.nextInt();
		if(num %3 ==0) {
			System.out.println("3 배 수");
		}else {
			System.out.println("3 배 수 아님!!!");
		}
	}
}
