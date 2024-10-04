package 정성호;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("국영수 점수 입력");
		int korea = input.nextInt();
		int math = input.nextInt();
		int english = input.nextInt();
		int sum =(korea + math + english);
		int avg = sum/3;
		if(avg >=60) {
			if(korea<40) {
				System.out.println("국어 불합격");
			}else if(math <40) {
				System.out.println("수학 불합격");
			}else if(english < 40) {
				System.out.println("영어 불합격");
			}else {
				System.out.println("평균 합격");
			}
		}else {
			System.out.println("평균 불합격");
		}
		
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
