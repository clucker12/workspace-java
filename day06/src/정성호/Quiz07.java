package 정성호;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a=0;
		int sum =0;
		while(true) {
			System.out.println("수 입력");
			a = input.nextInt();
			if(a>10 && a<=20) {
				for(int i =1; i<=a;i++) {
					sum +=i;
				}
				System.out.println(sum);
				break;
			}
		}
	}
}
