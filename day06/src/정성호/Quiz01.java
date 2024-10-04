package 정성호;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력");
		int a = input.nextInt();
		
		if(a%2==0) {
			System.out.println(a+"는 짝수입니다");
		}else if(a%2!=0){
			System.out.println(a+"는 홀수입니다");
		}else {
			System.err.println("짝,홀 둘다 아닙니다.");
		}
	}
}
