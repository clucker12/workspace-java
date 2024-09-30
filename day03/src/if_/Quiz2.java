package if_;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		int a=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("a를 입력하시오");
		a = scn.nextInt();
		if(a ==0) {
			System.out.println("0은 잘못 입력했습니다.");
		}else if(a%3==0) {
			if(a%4==0) {
				System.out.println("3의배수이면서, 4의 배수에도 해당합니다");
			}else {
				System.out.println("3의 배수에만 해당합니다");
			}
		}else if(a%4==0){
			System.out.println("4의 배수에만 해당합니다");
		}else {
			System.out.println("3의배수도, 4의배수도 해당안됩니다");
		}
	}
}
