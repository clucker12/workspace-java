package 정성호;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두 수 입력");
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = a+b;
		if(sum%2==0 && sum%3==0) {
			System.out.println(sum);
		}else {
			System.out.println("합이 홀수이고 3의 배수가 아님");
		}
	}
}
