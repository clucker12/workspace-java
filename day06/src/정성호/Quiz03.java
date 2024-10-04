package 정성호;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력");
		int a = input.nextInt();
		
		if(a%2==0 && a%3==0) {
			System.out.println(a);
		}else if(a%2==0 && a%3!=0){
			System.out.println("3의 배수가 아니다");
		}else if(a%2!=0 && a%3==0){
			System.out.println("2의 배수가 아니다");
		}else {
			System.out.println("둘다 아니다");
		}
		
	}
}
